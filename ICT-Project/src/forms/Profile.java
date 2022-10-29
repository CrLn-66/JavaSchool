package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Profile(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Welcome! "+user.getFirstName()+" "+user.getLastName());
		name.setFont(new Font("Sitka Display", Font.PLAIN, 23));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(10, 29, 414, 54);
		contentPane.add(name);
		
		JLabel birthday = new JLabel(user.getBirthday());
		birthday.setBounds(78, 94, 99, 25);
		contentPane.add(birthday);
		
		JLabel lblNewLabel = new JLabel("Birthday : ");
		lblNewLabel.setBounds(10, 96, 58, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSection = new JLabel("Grade : ");
		lblSection.setBounds(10, 127, 58, 20);
		contentPane.add(lblSection);
		
		JLabel lblFlexible = new JLabel("11");
		lblFlexible.setBounds(78, 125, 99, 25);
		contentPane.add(lblFlexible);
		
		JLabel lblSection_1 = new JLabel("Section : ");
		lblSection_1.setBounds(10, 153, 58, 20);
		contentPane.add(lblSection_1);
		
		JLabel lblFlexible_2 = new JLabel("Flexible");
		lblFlexible_2.setBounds(78, 148, 99, 25);
		contentPane.add(lblFlexible_2);
		
		JLabel lblSection_1_1 = new JLabel("Teacher : ");
		lblSection_1_1.setBounds(10, 184, 58, 20);
		contentPane.add(lblSection_1_1);
		
		JLabel lblFlexible_2_1 = new JLabel("Sr. Rhod");
		lblFlexible_2_1.setBounds(78, 182, 99, 25);
		contentPane.add(lblFlexible_2_1);
	}
}
