package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Secretaryhome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secretaryhome frame = new Secretaryhome();
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
	public Secretaryhome() {
		setResizable(false);
		setTitle("Secreatry Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton viewcalendar = new JButton("View Calendar");
		viewcalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalenderView CalenderView = new CalenderView();   
		        setVisible(false); // Hide current frame
		        CalenderView.setVisible(true);
			}
		});
		viewcalendar.setBounds(10, 112, 123, 42);
		contentPane.add(viewcalendar);
		
		JButton manageappointments = new JButton("Manage Appointments");
		manageappointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Appointmentmanage Appointmentmanage = new Appointmentmanage();   
		        setVisible(false); // Hide current frame
		        Appointmentmanage.setVisible(true);
				
			}
		});
		manageappointments.setBounds(143, 112, 167, 40);
		contentPane.add(manageappointments);
		
		JButton managepatient = new JButton("Manage Patient");
		managepatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patientmanage Patientmanage = new Patientmanage();   
		        setVisible(false); // Hide current frame
		        Patientmanage.setVisible(true);
			}
		});
		managepatient.setBounds(315, 115, 130, 37);
		contentPane.add(managepatient);
		
		JButton bookholiday = new JButton("Book Holiday");
		bookholiday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookholiday bookholiday = new bookholiday();   
		        setVisible(false); // Hide current frame
		        bookholiday.setVisible(true);
			}
		});
		bookholiday.setBounds(455, 115, 118, 37);
		contentPane.add(bookholiday);
		
		JButton billing = new JButton("Billing");
		billing.setBounds(576, 115, 124, 37);
		contentPane.add(billing);
		
		JLabel label = new JLabel("Welcome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(287, 23, 278, 37);
		contentPane.add(label);
		
		JButton dentist = new JButton("Dentist");
		dentist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dentisthygienist dentist = new dentisthygienist("Dentist");   
		        setVisible(false); // Hide current frame
		        dentist.setVisible(true);
			}
		});
		dentist.setBounds(183, 189, 97, 25);
		contentPane.add(dentist);
		
		JButton hygienist = new JButton("Hygienist");
		hygienist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dentisthygienist hygienist = new dentisthygienist("Hygienist");   
		        setVisible(false); // Hide current frame
		        hygienist.setVisible(true);
			}
		});
		hygienist.setBounds(415, 189, 97, 25);
		contentPane.add(hygienist);
	}
}
