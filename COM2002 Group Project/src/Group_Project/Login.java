package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Usernamefield;
	private JTextField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Username:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(29, 30, 81, 23);
		contentPane.add(label);
		
		Usernamefield = new JTextField();
		Usernamefield.setColumns(10);
		Usernamefield.setBounds(135, 33, 116, 20);
		contentPane.add(Usernamefield);
		
		PasswordField = new JTextField();
		PasswordField.setColumns(10);
		PasswordField.setBounds(135, 75, 116, 20);
		contentPane.add(PasswordField);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(29, 75, 81, 23);
		contentPane.add(label_1);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secretaryhome Secretaryhome = new Secretaryhome();   
		        setVisible(false); // Hide current frame
		        Secretaryhome.setVisible(true);
				
			}
		});
		login.setForeground(Color.GRAY);
		login.setBackground(Color.LIGHT_GRAY);
		login.setBounds(81, 111, 103, 23);
		contentPane.add(login);
	}

}
