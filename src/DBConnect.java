import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static Connection getConnection() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mini";
            String user = "User";   
            String password = "Password";
	    return DriverManager.getConnection(url,user,password);   
    }
}
