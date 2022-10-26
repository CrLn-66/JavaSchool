package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	static JLabel label;
	static JLabel pass;
	static JButton button;
	private static void Gui() {
		JFrame frame = new JFrame("Password Generator");
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		label = new JLabel("Password : ");
		pass = new JLabel("");
		pass.setBounds(100, 100, 100, 100);
		label.setBounds(30, 100, 100, 100);
		button = new JButton("Generate");
		button.setBounds(30, 200, 100, 30);
		panel.add(pass);
		button.addActionListener(new GUI());
		panel.add(button);
		panel.setLayout(null);
		panel.add(label);
		frame.add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pass.setText(PasswordGenerator.generatePassword(30));
	}
}
