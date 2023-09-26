package Model;
import java.sql.*;
public class ExecuteQuery {
	
	public ExecuteQuery() {
		
		myConnection=new App_Conection();
	}
	
	public void execute(String[] Datos) {
		
		this.Datos=Datos;
		
		Connection connect=myConnection.giveConection();
		
		try{
			
			sendall=connect.prepareStatement(SQLQuery);
			
			for(int i=0;i<Datos.length;i++) {
				
				sendall.setString(i+1, Datos[i]);
			
			}
			int VAMO=sendall.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		
		
	}
	
	private App_Conection myConnection;
	private String[] Datos;
	private PreparedStatement sendall;
	
	private static final String SQLQuery="INSERT INTO USERS(USER_HANDLE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,PASSWORD,PHONENUMBER)VALUES(?,?,?,?,?,?)";
}
