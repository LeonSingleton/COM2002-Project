package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;

public class RegisterPatient extends JFrame {

	private JPanel contentPane;
	private JTextField forenamefield;
	private JTextField surnamefield;
	private JTextField postcodefield;
	private JTextField phonenumberfield;
	private JTextField housefield;
	private JTextField districtfield;
	private JTextField streetfield;
	private JTextField cityfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPatient frame = new RegisterPatient();
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
	public RegisterPatient() {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Register Patient");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 326, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Register a Patient:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 25, 290, 412);
		contentPane.add(panel);
		
		forenamefield = new JTextField();
		forenamefield.setColumns(10);
		forenamefield.setBounds(145, 35, 120, 20);
		panel.add(forenamefield);
		
		surnamefield = new JTextField();
		surnamefield.setColumns(10);
		surnamefield.setBounds(145, 66, 120, 20);
		panel.add(surnamefield);
		
		JLabel label = new JLabel("Forename:");
		label.setBounds(21, 33, 59, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(21, 64, 59, 14);
		panel.add(label_1);
		
		JButton registerbtn = new JButton("Register");
		registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		registerbtn.setBounds(101, 366, 89, 23);
		panel.add(registerbtn);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(21, 94, 59, 14);
		panel.add(lblTitle);
		
		JLabel lblDateOfBirth = new JLabel("Postcode:");
		lblDateOfBirth.setBounds(21, 323, 89, 14);
		panel.add(lblDateOfBirth);

		postcodefield = new JTextField();
		postcodefield.setColumns(10);
		postcodefield.setBounds(145, 320, 120, 20);
		panel.add(postcodefield);
		
		JLabel lblPhoneNo = new JLabel("Phone no:");
		lblPhoneNo.setBounds(21, 131, 59, 14);
		panel.add(lblPhoneNo);
		
		phonenumberfield = new JTextField();
		phonenumberfield.setColumns(10);
		phonenumberfield.setBounds(145, 128, 120, 20);
		panel.add(phonenumberfield);
		
		JComboBox titlefield = new JComboBox();
		titlefield.setModel(new DefaultComboBoxModel(new String[] {"", "Mr", "Mr's", "Miss"}));
		titlefield.setBounds(145, 97, 120, 20);
		panel.add(titlefield);
		
		JLabel lblHouseNo = new JLabel("House no:");
		lblHouseNo.setBounds(21, 195, 59, 14);
		panel.add(lblHouseNo);
		
		housefield = new JTextField();
		housefield.setColumns(10);
		housefield.setBounds(145, 192, 120, 20);
		panel.add(housefield);
		
		JLabel label_3 = new JLabel("Date of Birth:");
		label_3.setBounds(21, 159, 89, 14);
		panel.add(label_3);
		
		JLabel lblDistrict = new JLabel("District:");
		lblDistrict.setBounds(21, 261, 59, 14);
		panel.add(lblDistrict);
		
		districtfield = new JTextField();
		districtfield.setColumns(10);
		districtfield.setBounds(145, 258, 120, 20);
		panel.add(districtfield);
		
		streetfield = new JTextField();
		streetfield.setColumns(10);
		streetfield.setBounds(145, 227, 120, 20);
		panel.add(streetfield);
		
		JLabel lblStreetName = new JLabel("Street Name:");
		lblStreetName.setBounds(21, 225, 89, 14);
		panel.add(lblStreetName);
		
		cityfield = new JTextField();
		cityfield.setColumns(10);
		cityfield.setBounds(145, 289, 120, 20);
		panel.add(cityfield);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(21, 292, 59, 14);
		panel.add(lblCity);
		
		JDateChooser dateofbirthfield = new JDateChooser();
		dateofbirthfield.setBounds(145, 159, 120, 20);
		panel.add(dateofbirthfield);
		setLocationRelativeTo(null);
	}
}
