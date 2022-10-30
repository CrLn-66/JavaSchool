package forms;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField sname;
	private JTextField username;
	private JPasswordField pass;
	private JTextField section;
	private JTextField grade;
	/**
	 * Create the frame.
	 */
	
	public Register() {
		setResizable(false);
		init();
	}
	
	public void init() {
		setVisible(false);
		contentPane = new JPanel();
		setBackground(new Color(240, 242, 245));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 444);
		contentPane.setBackground(new Color(240, 242, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Benbook");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 30));
		lblNewLabel.setBounds(123, 12, 188, 39);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(12, 65, 410, 328);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Create a new account");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(89, 12, 234, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("It’s quick and easy.");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(153, 42, 112, 24);
		panel.add(lblNewLabel_1_1);
		
		fname = new JTextField();
		fname.setBounds(89, 68, 120, 29);
		panel.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name :");
		lblNewLabel_2.setBounds(0, 74, 73, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name :");
		lblNewLabel_2_1.setBounds(0, 119, 85, 16);
		panel.add(lblNewLabel_2_1);
		
		sname = new JTextField();
		sname.setColumns(10);
		sname.setBounds(89, 113, 120, 29);
		panel.add(sname);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Username :");
		lblNewLabel_2_1_1.setBounds(0, 163, 85, 16);
		panel.add(lblNewLabel_2_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(89, 157, 120, 29);
		panel.add(username);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Password :");
		lblNewLabel_2_1_1_1.setBounds(0, 208, 85, 16);
		panel.add(lblNewLabel_2_1_1_1);
		
		pass = new JPasswordField();
		pass.setBounds(89, 202, 120, 28);
		panel.add(pass);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Birthday :");
		lblNewLabel_2_1_1_1_1.setBounds(0, 250, 85, 16);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		DatePicker bday = new DatePicker();
		bday.setBounds(89, 247, 152, 24);
		panel.add(bday);
		JLabel lblNewLabel_2_2 = new JLabel("Section : ");
		lblNewLabel_2_2.setBounds(216, 74, 73, 16);
		panel.add(lblNewLabel_2_2);
		
		section = new JTextField();
		section.setColumns(10);
		section.setBounds(278, 68, 120, 29);
		panel.add(section);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Sex : ");
		lblNewLabel_2_2_1.setBounds(216, 163, 73, 16);
		panel.add(lblNewLabel_2_2_1);
		
		JComboBox sex = new JComboBox();
		sex.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE"}));
		sex.setBounds(278, 159, 120, 25);
		panel.add(sex);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Grade : ");
		lblNewLabel_2_2_1_1.setBounds(216, 119, 73, 16);
		panel.add(lblNewLabel_2_2_1_1);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(278, 117, 120, 29);
		panel.add(grade);
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				User user = new User();
				user.setFirstName(fname.getText());
				user.setLastName(sname.getText());
				user.setBirthday(bday.getDateStringOrEmptyString());
				user.setPassword(new String(pass.getPassword()));
				user.setUserName(username.getText());
				user.setGradeLevel(grade.getText());
				user.setSection(section.getText());
				user.setSex(sex.getSelectedItem().toString());
				if(Cred.signup(username.getText(), user) == 0) {
					JOptionPane.showMessageDialog(contentPane, "Successfully Registered!");
				}else{
					JOptionPane.showInternalMessageDialog(contentPane, "Error!, User already registered.");
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(12, 290, 152, 26);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Already have an account?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Login().setVisible(true);
			}
		});
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_3.setForeground(new Color(49, 152, 202));
		lblNewLabel_3.setBounds(170, 296, 137, 16);
		panel.add(lblNewLabel_3);
		
		
	}
}
