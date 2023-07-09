package SwingBasic;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Swing1 {
	public static void main(String[] args) {    
        JFrame frame = new JFrame("Giao diện đầu tiên của tui");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();    
        JPanel panel2 = new JPanel();
        frame.add(panel2);
        frame.add(panel);
        FormSignIn(panel);
        FormResgiter(panel);
        //placeComponents(panel);
        
        // Setting the frame visibility to true
        frame.setVisible(true);
    }
	private static void ButtonEvent(JFrame frame)
	{
		
		JButton buttonClick = new JButton("click",new ImageIcon("b.jpg"));
        buttonClick.setBounds(100,50,100,30);
        frame.add(buttonClick);
        
        JLabel nofiJLabel = new JLabel("", JLabel.CENTER);
        frame.add(nofiJLabel);
        
        /*buttonClick.addActionListener(new ActionListener(){
        	public void actionResultClick(ActionEvent e)
        	{
        		nofiJLabel.setText("oK");
        	}
        });*/
        
	}
	private static void FormResgiter(JPanel panel)
	{
		JLabel tenDangKi = new JLabel("Ten Dang Ki");
		tenDangKi.setBounds(100,120,130,130);
		panel.add(tenDangKi);
		
				
	}
	private static void FormSignIn(JPanel panel)
	{
		panel.setLayout(null);
		
		JLabel userLabel= new JLabel("Ten dang nhap");
		userLabel.setBounds(10,20,100,25);
		panel.add(userLabel);
		
		JTextField userField = new JTextField(20);
		userField.setBounds(100,20,165,25);
		panel.add(userField);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		
		//JTextField passwordField = new JTextField(20);
		JPasswordField passwordField = new JPasswordField(20);
		passwordField.setBounds(100,50,165,25);
		panel.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(100,90,80,25);
		panel.add(loginButton);
		
	}
	private static void placeComponents(JPanel panel) {

      
        panel.setLayout(null);

        // Creating JLabel
        JLabel userLabel = new JLabel("User");
        
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

  
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(100, 90, 80, 25);
        panel.add(loginButton);
    }
}
