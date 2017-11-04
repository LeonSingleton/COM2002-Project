package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalenderView extends JFrame {

	private JPanel contentPane;
	private JTextField startdatefield;
	private JTextField enddatefield;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalenderView frame = new CalenderView();
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
	public CalenderView() {
		setResizable(false);
		setTitle("View Calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		home.setBounds(10, 11, 74, 23);
		contentPane.add(home);
		
		JLabel label = new JLabel("Select Start Date:");
		label.setBounds(10, 38, 101, 14);
		contentPane.add(label);
		
		startdatefield = new JTextField();
		startdatefield.setColumns(10);
		startdatefield.setBounds(120, 35, 86, 20);
		contentPane.add(startdatefield);
		
		enddatefield = new JTextField();
		enddatefield.setColumns(10);
		enddatefield.setBounds(121, 61, 86, 20);
		contentPane.add(enddatefield);
		
		JLabel label_1 = new JLabel("Select End Date:");
		label_1.setBounds(10, 64, 101, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Dentist:");
		label_2.setBounds(16, 92, 46, 14);
		contentPane.add(label_2);
		
		table = new JTable();
		table.setEnabled(false);
		table.setBounds(16, 117, 168, 115);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(236, 117, 156, 115);
		contentPane.add(table_1);
		
		JLabel label_3 = new JLabel("Hygienist:");
		label_3.setBounds(236, 92, 60, 14);
		contentPane.add(label_3);
		
		JButton display = new JButton("Display ");
		display.setBounds(255, 55, 89, 23);
		contentPane.add(display);
	}

}
