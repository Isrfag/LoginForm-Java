package Model;
import java.sql.*;
public class App_Conection {

	public App_Conection() {
		
	}
	
	public Connection giveConection(){
		
		try {
			
			AppConnection=DriverManager.getConnection("jdbc:mysql://localhost:3307/twitter_db","root","");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return AppConnection;
	}
	
	public Connection AppConnection;
}
