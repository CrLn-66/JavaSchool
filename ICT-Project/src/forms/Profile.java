package forms;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		
		JLabel welcome = new JLabel("Welcome! "+user.getUserName());
		welcome.setFont(new Font("Sitka Display", Font.PLAIN, 23));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setBounds(12, 214, 414, 54);
		contentPane.add(welcome);
		
		JLabel birthday = new JLabel(user.getBirthday());
		birthday.setBounds(78, 139, 99, 25);
		contentPane.add(birthday);
		
		JLabel lblNewLabel = new JLabel("Birthday : ");
		lblNewLabel.setBounds(10, 141, 58, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSection = new JLabel("Grade : ");
		lblSection.setBounds(21, 161, 58, 20);
		contentPane.add(lblSection);
		
		JLabel lblFlexible = new JLabel(user.getGradeLevel());
		lblFlexible.setBounds(78, 159, 99, 25);
		contentPane.add(lblFlexible);
		
		JLabel lblSection_1 = new JLabel(" Section : ");
		lblSection_1.setBounds(10, 182, 84, 20);
		contentPane.add(lblSection_1);
		
		JLabel lblFlexible_2 = new JLabel(user.getSection());
		lblFlexible_2.setBounds(78, 180, 99, 25);
		contentPane.add(lblFlexible_2);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setBounds(21, 117, 58, 20);
		contentPane.add(lblName);
		
		JLabel name = new JLabel((String)"<html>"+ user.getFirstName()+" "+user.getLastName()+"</html>");
		name.setBounds(78, 115, 162, 25);
		contentPane.add(name);
		
		JLabel lblSection_1_1 = new JLabel("Sex : ");
		lblSection_1_1.setBounds(31, 203, 84, 20);
		contentPane.add(lblSection_1_1);
		
		JLabel lblFlexible_2_1 = new JLabel(user.getSex());
		lblFlexible_2_1.setBounds(78, 201, 99, 25);
		contentPane.add(lblFlexible_2_1);
		JLabel canvas = new JLabel("");
		canvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image image =new ImageIcon(user.getProfile().toString()).getImage();
		canvas.setIcon(new ImageIcon(image));
		canvas.setBounds(160, 0, 100, 100);
		contentPane.add(canvas);
	}
}
