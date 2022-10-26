package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
public class GUI implements ActionListener{
	static JPasswordField pass;
	static JButton button;
	static JLabel res;
	private static void Gui (){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Password : ");
		res = new JLabel();
		res.setBounds(200, 100, 150,80);
		button = new JButton("Login");
		button.setBounds(75, 250, 100, 25);
		button.addActionListener(new GUI());
		pass = new JPasswordField();
		pass.setBounds(130, 200, 250, 25);
		panel.add(button);
		panel.add(res);
		panel.add(pass);
		label.setBounds(60, 200, 80, 25);
		panel.setLayout(null);
		panel.add(label);
		frame.add(panel);
		frame.setTitle("Login");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setResizable(false);
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
			res.setText("<html><font color='green'>Successful Login!</font></html>");
		}else {
			res.setText("<html><font color='red'>Incorrect Password.</font></html>");
		}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}
