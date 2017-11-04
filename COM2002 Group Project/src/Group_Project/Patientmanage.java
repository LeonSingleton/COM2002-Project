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
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Patientmanage extends JFrame {

	private JPanel contentPane;
	private JTextField forenamefield;
	private JTextField surnamefield;
	private JTable table;
	private JTable table_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patientmanage frame = new Patientmanage();
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
	public Patientmanage() {
		setTitle("Patient Management");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secretaryhome Secretaryhome = new Secretaryhome();   
		        setVisible(false); // Hide current frame
		        Secretaryhome.setVisible(true);
			}
		});
		homebtn.setBounds(10, 11, 79, 23);
		contentPane.add(homebtn);
		
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
		
		JButton searchbtn = new JButton("Search");
		searchbtn.setBounds(37, 117, 89, 23);
		panel.add(searchbtn);
		
		JButton registerbtn = new JButton("Register New Patient");
		registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterPatient RegisterPatient = new RegisterPatient();  
		        RegisterPatient.setVisible(true);
			}
		});
		registerbtn.setBounds(10, 208, 167, 23);
		contentPane.add(registerbtn);
		
		JLabel lblCurrentInformation = new JLabel("Current Information:");
		lblCurrentInformation.setBounds(197, 45, 148, 14);
		contentPane.add(lblCurrentInformation);
		
		table = new JTable();
		table.setBounds(197, 70, 167, 161);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(374, 70, 167, 161);
		contentPane.add(table_1);
		
		JLabel lblCurrentPlanInformation = new JLabel("Current Plan Information:");
		lblCurrentPlanInformation.setBounds(380, 45, 148, 14);
		contentPane.add(lblCurrentPlanInformation);
		
		JButton cancelplanbtn = new JButton("Cancel Plan");
		cancelplanbtn.setBounds(380, 267, 167, 23);
		contentPane.add(cancelplanbtn);
		
		JButton addplanbtn = new JButton("Add Healthcare Plan");
		addplanbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Healthcaresubscribe Healthcaresubscribe = new Healthcaresubscribe();  
				Healthcaresubscribe.setVisible(true);
			}
		});
		addplanbtn.setBounds(197, 267, 167, 23);
		contentPane.add(addplanbtn);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
