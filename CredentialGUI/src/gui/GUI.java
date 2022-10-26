package gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
public class GUI extends Canvas implements ActionListener{
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Toolkit t = Toolkit.getDefaultToolkit();
		Image im = t.getImage("C:\\\\Users\\\\Abrasaldo\\\\eclipse-workspace\\\\CredentialGUI\\\\src\\\\gui\\\\ca.jpg");
		g.drawImage(im, 100,30,this);  
	}
	
	static JPasswordField pass;
	static JButton button;
	static JLabel res;
	static JLabel name;
	static JLabel section;
	static JLabel age;
	private static void Gui (){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Password : ");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Abrasaldo\\eclipse-workspace\\CredentialGUI\\src\\gui\\as.jpg");
		frame.setIconImage(icon);
		name = new JLabel("");
		section = new JLabel("");
		age = new JLabel("");
		name.setBounds(20, 320, 200, 10);
		section.setBounds(20, 350, 100, 10);
		age.setBounds(20, 380, 100, 15);
		GUI gui = new GUI();
		gui.setSize(200, 200);
		panel.add(gui);
		panel.add(name);
		panel.add(section);
		panel.add(age);
		res = new JLabel();
		res.setBounds(200, 100, 150,80);
		button = new JButton("<html><font color='black'>Log In</font></html>");
		button.setBounds(200, 230, 100, 25);
		button.setBackground(Color.WHITE);
		panel.setBackground(Color.GREEN);
		button.addActionListener(new GUI());
		pass = new JPasswordField();
		pass.setBounds(130, 200, 250, 25);
		panel.add(button);
		panel.add(res);
		panel.add(pass);
		JLabel labels = new JLabel("Created By : BNDCT");
		labels.setBounds(350, 440, 200, 20);
		panel.add(labels);
		label.setBounds(60, 200, 80, 25);
		panel.setLayout(null);
		panel.add(label);
		frame.add(panel);
		frame.setTitle("Login");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setIconImage(icon);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
		if(User.login(new String(pass.getPassword()))) {
			res.setText("<html><font color='white' face='Times New Roman'>Successful Login!</font></html>");
			name.setText("<html><font color='blue' face='WildWest'>Name : Benedict V. Abrasaldo Jr.</font></html>");
			section.setText("<html><font color='blue' face='WildWest'>Section : Flexible</font></html>");
			age.setText("<html><font color='blue' face='WildWest'>Age : 16</font></html>");
			
		}else {
			res.setText("<html><font color='red'>Incorrect Password.</font></html>");
		}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}
