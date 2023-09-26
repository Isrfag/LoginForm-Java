package Controller;
import java.awt.event.*;
import View.*;
import Model.*;
public class RegisterEvent implements ActionListener {

	public RegisterEvent(App_Frame theFrame) {
		
		this.theFrame=theFrame;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String UserData[]=new String[6];
		
		UserData[0]=theFrame.userHandle.getText();
		UserData[1]=theFrame.userEmail.getText();
		UserData[2]=theFrame.userName.getText();
		UserData[3]=theFrame.userLast.getText();
		String decryptPass=new String(theFrame.userPass.getPassword()); //Si no se hace esto no se puede ver la contraseña
		UserData[4]=decryptPass;
		UserData[5]=theFrame.userPhone.getText();
		
		//CREAMOS EL STATEMENT PQ LA CONEXIÓN YA ESTÁ HECHA.
		
		myquery=new ExecuteQuery();
		
		myquery.execute(UserData);
		
	}
	
	App_Frame theFrame;
	ExecuteQuery myquery;
	
	
	

}
