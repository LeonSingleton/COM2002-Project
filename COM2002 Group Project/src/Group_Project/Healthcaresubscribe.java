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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Healthcaresubscribe extends JFrame {

	private JPanel contentPane;
	private JTextField treatmentsfield;
	private JTextField checkupsfield;
	private JTextField cleansfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Healthcaresubscribe frame = new Healthcaresubscribe();
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
	public Healthcaresubscribe() {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Subscribe to a Healthcare Plan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Select a plan:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(26, 11, 320, 192);
		contentPane.add(panel);
		
		treatmentsfield = new JTextField();
		treatmentsfield.setColumns(10);
		treatmentsfield.setBounds(159, 52, 126, 20);
		panel.add(treatmentsfield);
		
		JLabel lblPlanType = new JLabel("Plan type:");
		lblPlanType.setBounds(10, 27, 59, 14);
		panel.add(lblPlanType);
		
		JLabel lblTreatmentsCovered = new JLabel("Treatments Covered:");
		lblTreatmentsCovered.setBounds(10, 58, 136, 14);
		panel.add(lblTreatmentsCovered);
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSubscribe.setBounds(92, 158, 102, 23);
		panel.add(btnSubscribe);
		
		JLabel lblCheckupsCovered = new JLabel("Check-ups Covered:");
		lblCheckupsCovered.setBounds(10, 89, 116, 14);
		panel.add(lblCheckupsCovered);
		
		checkupsfield = new JTextField();
		checkupsfield.setColumns(10);
		checkupsfield.setBounds(159, 83, 126, 20);
		panel.add(checkupsfield);
		
		JLabel lblCleansCovered = new JLabel("Cleans Covered:");
		lblCleansCovered.setBounds(10, 119, 116, 14);
		panel.add(lblCleansCovered);
		
		cleansfield = new JTextField();
		cleansfield.setColumns(10);
		cleansfield.setBounds(159, 113, 126, 20);
		panel.add(cleansfield);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "NHS free plan", "Maintenance plan", "Oral Health plan", "Dental Repair plan"}));
		comboBox.setBounds(159, 24, 126, 20);
		panel.add(comboBox);
		setLocationRelativeTo(null);
	}

}
