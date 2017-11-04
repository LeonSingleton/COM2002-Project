package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;

public class dentisthygienist extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dentisthygienist frame = new dentisthygienist();
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
	public dentisthygienist() {
		setResizable(false);
		setTitle("My Appointments");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTodaysAppointments = new JLabel("Todays Appointments:");
		lblTodaysAppointments.setBounds(32, 21, 143, 23);
		contentPane.add(lblTodaysAppointments);
		
		table = new JTable();
		table.setBounds(32, 55, 145, 74);
		contentPane.add(table);
		
		JLabel lblNextAppointment = new JLabel("Next Appointment:");
		lblNextAppointment.setBounds(227, 21, 143, 23);
		contentPane.add(lblNextAppointment);
		
		table_1 = new JTable();
		table_1.setBounds(227, 55, 145, 74);
		contentPane.add(table_1);
		
		JLabel lblWillBeAble = new JLabel("will be able to select a appointment and record it as visit");
		lblWillBeAble.setBounds(32, 168, 319, 23);
		contentPane.add(lblWillBeAble);
		setLocationRelativeTo(null);
	}

}
