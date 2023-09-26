package View;
import javax.swing.*;
import java.awt.BorderLayout;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
//CREAMOS MARCO
public class App_Frame extends JFrame{

	public App_Frame() {
		
		// --------------- Atributos del Marco -----------------------------------------------------------
		
		setBounds(500,300,400,400);
		setTitle("Formulario de Registro");
		setLayout(new BorderLayout());
	
		
		// ---------------Creamos el header con el titulo ------------------------------------------
		
		JPanel Header=new JPanel();
		Header.setLayout(new FlowLayout());
		
		//Título
		Title=new JLabel("Registro en Twitter");
		Title.setFont(new Font("Times",Font.BOLD,20));
		Title.setForeground(new Color(242,242,242));
		
		//Imagen 
		birdIcon=new ImageIcon("D:\\Eclipse\\worldspace\\LoginForm\\src\\View\\logo-de-twitter.jpg");
		Image trans=birdIcon.getImage();
		Image finalBird=trans.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon birdIconFinal=new ImageIcon(finalBird);
		birdLabel=new JLabel(birdIconFinal); 
		
		//Añadir todo al header
		Header.setBackground(new Color(60,169,196));
		Header.setBounds(200, 200, 1000, 1000);
		Header.add(Title);
		Header.add(birdLabel);
		
		add(Header,BorderLayout.NORTH);
		
		
		// ----------------- Ahora creamos la Lámina donde estará el Formulario --------------------------------------------------
		
		JPanel myForm=new JPanel();
		myForm.setBackground(new Color(60,169,196));
		myForm.setLayout(new GridLayout(6,2));
		
		//Empezamos a instanciar los TextField Y JLabel.
		
		labelName=new JLabel(" Nombre:",SwingConstants.CENTER);
		labelName.setForeground(new Color(242,242,242));
		userName=new JTextField();
		userName.setSize(800,200);
		
		labelLast=new JLabel(" Apellidos:",SwingConstants.CENTER);
		labelLast.setForeground(new Color(242,242,242));
		userLast=new JTextField();
		userLast.setPreferredSize(new Dimension(200,24));
		
		labelHandle=new JLabel(" Nombre de Usuario:",SwingConstants.CENTER);
		labelHandle.setForeground(new Color(242,242,242));
		userHandle=new JTextField();
		userHandle.setPreferredSize(new Dimension(200,24));
		
		labelEmail=new JLabel(" Email:",SwingConstants.CENTER);
		labelEmail.setForeground(new Color(242,242,242));
		userEmail=new JTextField();
		userEmail.setPreferredSize(new Dimension(200,240));
		
		labelPass=new JLabel(" Contraseña:",SwingConstants.CENTER);
		labelPass.setForeground(new Color(242,242,242));
		userPass=new JPasswordField();
		userPass.setPreferredSize(new Dimension(200,24));
		
		labelPhone=new JLabel(" Número de teléfono:",SwingConstants.CENTER);
		labelPhone.setForeground(new Color(242,242,242));
		userPhone=new JTextField();
		
		
		
		add(myForm,BorderLayout.CENTER);
		myForm.add(labelHandle);
		myForm.add(userHandle);
		myForm.add(labelEmail);
		myForm.add(userEmail);
		myForm.add(labelName);
		myForm.add(userName);
		myForm.add(labelLast);
		myForm.add(userLast);
		myForm.add(labelPass);
		myForm.add(userPass);
		myForm.add(labelPhone);
		myForm.add(userPhone);
		
		
		
		
		
		// ----------------- CREAMOS EL BOTÓN QUE MANDA LOS DATOS ---------------------------------------
		
		
		//HAcemos una lamina para que el boton no ocupe todo el Southlayout
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(new Color(60,169,196));
		
		registerbtn=new JButton("Registrarse");
		registerbtn.setPreferredSize(new Dimension(150,40));
		registerbtn.setBackground(new Color(224,238,242));
		registerbtn.setForeground(new Color(41,117,137));
		
		//Botón a la escucha.
		registerbtn.addActionListener(new RegisterEvent(this)); //Se le de pasar el marco como parámetro
		
		buttonPanel.add(registerbtn);
		add(buttonPanel,BorderLayout.SOUTH);
		
	}
	
	public JTextField userHandle,userEmail,userName,userLast,userPhone;
	public JPasswordField userPass;
	private JLabel Title,birdLabel,labelHandle,labelPass,labelEmail,labelName,labelLast,labelPhone;
	public ImageIcon birdIcon;
	public JButton registerbtn;
	
}
