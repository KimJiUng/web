import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	private PreparedStatement ps;
	private Connection con;
	private ResultSet rs;
	
	
	public UserDao() { 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web?serverTimezone=UTC","root","1234");
		} catch(Exception e) {
			System.out.println("DAO DB error :" + e);
		}
	}
	
}