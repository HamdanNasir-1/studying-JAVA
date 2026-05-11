import java.sql.*;

public class JDBC{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "HamdanNasirAl@123";

        try {
            // 1. connect sql
            Connection con = DriverManager.getConnection(url,user,password);

            // 2. Statement
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student");

            // 3. Execute query
            ResultSet rs = ps.executeQuery("SELECT * FROM students");
            
            // 4. Process Result
            while(rs.next()){
                System.out.println(rs.getInt("id :")+" "+
                                   rs.getString("name :")+" "+
                                   rs.getInt("age :"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}