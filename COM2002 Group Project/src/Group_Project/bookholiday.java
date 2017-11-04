package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;

public class bookholiday extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookholiday frame = new bookholiday();
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
	public bookholiday() {
		setResizable(false);
		setTitle("Book a Holiday");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 244);
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
		panel.setBorder(new TitledBorder(null, "Select a plan:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 45, 320, 159);
		contentPane.add(panel);
		
		JLabel lblSelectEmployee = new JLabel("Select Employee:");
		lblSelectEmployee.setBounds(10, 27, 103, 14);
		panel.add(lblSelectEmployee);
		
		JLabel lblStartDate = new JLabel("Start Date:");
		lblStartDate.setBounds(10, 58, 136, 14);
		panel.add(lblStartDate);
		
		JButton btnBookHoldiay = new JButton("Book Holdiay");
		btnBookHoldiay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBookHoldiay.setBounds(99, 126, 116, 23);
		panel.add(btnBookHoldiay);
		
		JLabel lblEndDate = new JLabel("End Date:");
		lblEndDate.setBounds(10, 89, 116, 14);
		panel.add(lblEndDate);
		
		JComboBox employeefield = new JComboBox();
		employeefield.setModel(new DefaultComboBoxModel(new String[] {"", "Mr Dentist", "Mr Hygienist"}));
		employeefield.setBounds(156, 24, 129, 20);
		panel.add(employeefield);
		
		JDateChooser startdatefield = new JDateChooser();
		startdatefield.setBounds(156, 58, 129, 20);
		panel.add(startdatefield);
		
		JDateChooser enddatefield = new JDateChooser();
		enddatefield.setBounds(156, 89, 129, 20);
		panel.add(enddatefield);
	}
}
