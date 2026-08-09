import java.sql.*;

public class StudentJDBC
{
    static final String URL =
        "jdbc:mysql://localhost:3306/studentdb";

    static final String USER = "javauser";

    static final String PASSWORD = "Java@12";

    public static void main(String args[])
    {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(URL,USER,PASSWORD);

            Statement stmt = con.createStatement();

            // Insert Records

            stmt.executeUpdate(
                    "insert into student values(101,'John','Chennai')");

            stmt.executeUpdate(
                    "insert into student values(102,'David','Bangalore')");

            stmt.executeUpdate(
                    "insert into student values(103,'Mary','Hyderabad')");

            System.out.println("Records Inserted");

            // Display

            System.out.println("\nStudent Records");

            ResultSet rs =
                    stmt.executeQuery("select * from student");

            while(rs.next())
            {
                System.out.println(
                        rs.getInt("rollno")+" "
                        +rs.getString("name")+" "
                        +rs.getString("address"));
            }

            // Update

            stmt.executeUpdate(
                    "update student set address='Delhi' where rollno=102");

            System.out.println("\nRecord Updated");

            // Delete

            stmt.executeUpdate(
                    "delete from student where rollno=103");

            System.out.println("Record Deleted");

            // Display Again

            System.out.println("\nFinal Records");

            rs = stmt.executeQuery("select * from student");

            while(rs.next())
            {
                System.out.println(
                        rs.getInt("rollno")+" "
                        +rs.getString("name")+" "
                        +rs.getString("address"));
            }

            rs.close();
            stmt.close();
            con.close();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
