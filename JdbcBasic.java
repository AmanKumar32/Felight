package jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBasic {
	static  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static  String DB_URL = "jdbc:mysql://192.168.1.18:3306/aman";
	static  String USER = "felight";
	static  String PASSWORD = "felightrocks";

	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			Class.forName(JDBC_DRIVER); // Register Drive
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD); //Open Connection
			statement = con.createStatement();//Select Query
			rs = statement.executeQuery("select * from emplyoee");
			//statement.executeUpdate("insert into emplyoee (id,name,gender,city)values(1008,'parteek','M','Mangalore')");
			while(rs.next()){
			System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getString("email_address"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
