package forms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Login() {
		init();
	}
	public void init() {
		setVisible(false);
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(416, 274);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 242, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Benbook");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		Font fonts = null;
		Font fonts1 = null;
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Abrasaldo\\eclipse-workspace\\ICT-Project\\src\\forms\\FreeSans.ttf"));
			fonts = font.deriveFont(Font.BOLD, 30f);
			fonts1 = font.deriveFont(12f);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel.setFont(fonts);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(102, 13, 188, 39);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(21, 57, 357, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Log Into Benbook");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(107, 11, 135, 21);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(86, 44, 202, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username : ");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 43, 135, 21);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password : ");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 85, 135, 21);
		panel.add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 87, 202, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				User us = (User) Cred.login(textField.getText(), new String(passwordField.getPassword()));
				if(us == null) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect Username/Password.");
				}else {
				JOptionPane.showMessageDialog(contentPane, "Successfully Logged In! "+us.getFirstName());
				setVisible(false);
				new Profile(us).setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(86, 112, 202, 26);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot Password? ·");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(contentPane, "This is underdevelopment.");
			}
		});
		lblNewLabel_2.setForeground(new Color(41, 107, 207));
		lblNewLabel_2.setBounds(86, 139, 112, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sign up for Benbook");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Register().setVisible(true);
			}
		});
		lblNewLabel_2_1.setForeground(new Color(41, 107, 207));
		lblNewLabel_2_1.setBounds(199, 139, 124, 16);
		panel.add(lblNewLabel_2_1);
	}
}
