package Exe;
import javax.swing.*;

import View.*;
public class execute_Form {

	public static void main (String[] args) {
		
		App_Frame theframe =new App_Frame();
		
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		theframe.setVisible(true);
		
		theframe.setResizable(false);
		
		ImageIcon birdIcon=new ImageIcon("D:\\Eclipse\\worldspace\\LoginForm\\src\\View\\logo-de-twitter.jpg");
		theframe.setIconImage(birdIcon.getImage());
		
	}
	
	
}
