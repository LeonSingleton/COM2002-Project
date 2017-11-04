package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Appointmentmanage extends JFrame {

	private JPanel contentPane;
	private JTextField forenamefield;
	private JTextField surnamefield;
	private JTable table;
	private JTextField datefield;
	private JTextField starttimefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointmentmanage frame = new Appointmentmanage();
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
	public Appointmentmanage() {
		setResizable(false);
		setTitle("Manage Appointments");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secretaryhome Secretaryhome = new Secretaryhome();   
		        setVisible(false); // Hide current frame
		        Secretaryhome.setVisible(true);
				
			}
		});
		home.setBounds(10, 11, 79, 23);
		contentPane.add(home);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Search For a Patient:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 45, 167, 151);
		contentPane.add(panel);
		
		forenamefield = new JTextField();
		forenamefield.setColumns(10);
		forenamefield.setBounds(75, 47, 86, 20);
		panel.add(forenamefield);
		
		surnamefield = new JTextField();
		surnamefield.setColumns(10);
		surnamefield.setBounds(75, 78, 86, 20);
		panel.add(surnamefield);
		
		JLabel label = new JLabel("Forename:");
		label.setBounds(6, 50, 59, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(6, 81, 59, 14);
		panel.add(label_1);
		
		JButton search = new JButton("Search");
		search.setBounds(37, 117, 89, 23);
		panel.add(search);
		
		table = new JTable();
		table.setBounds(187, 55, 184, 141);
		contentPane.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Book an Appointment:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(413, 45, 172, 205);
		contentPane.add(panel_1);
		
		datefield = new JTextField();
		datefield.setColumns(10);
		datefield.setBounds(75, 47, 86, 20);
		panel_1.add(datefield);
		
		starttimefield = new JTextField();
		starttimefield.setColumns(10);
		starttimefield.setBounds(75, 78, 86, 20);
		panel_1.add(starttimefield);
		
		JLabel label_2 = new JLabel("Date:");
		label_2.setBounds(6, 50, 59, 14);
		panel_1.add(label_2);
		
		JButton appointmentbook = new JButton("Book appointment");
		appointmentbook.setBounds(20, 171, 141, 23);
		panel_1.add(appointmentbook);
		
		JLabel label_3 = new JLabel("Type:");
		label_3.setBounds(6, 106, 59, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Partner:");
		label_4.setBounds(6, 131, 59, 14);
		panel_1.add(label_4);
		
		JComboBox typefield = new JComboBox();
		typefield.setModel(new DefaultComboBoxModel(new String[] {"", "Clean", "Treatment", "Check-Up"}));
		typefield.setBounds(75, 103, 86, 20);
		panel_1.add(typefield);
		
		JLabel label_5 = new JLabel("Start Time");
		label_5.setBounds(6, 81, 59, 14);
		panel_1.add(label_5);
		
		JComboBox partnerfield = new JComboBox();
		partnerfield.setModel(new DefaultComboBoxModel(new String[] {"", "Mr Dentist", "Mr Hygienist"}));
		partnerfield.setBounds(75, 131, 86, 20);
		panel_1.add(partnerfield);
	}

}
