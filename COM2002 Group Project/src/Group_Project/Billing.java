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
import javax.swing.JTable;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField forenamefield;
	private JTextField surnamefield;
	private JTable table;
	private JTextField totalfield;
	private JTextField totalafterfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setTitle("Billing");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		panel.setBounds(10, 46, 167, 151);
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
		
		JButton paybill = new JButton("Pay Bill");
		paybill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secretaryhome Secretaryhome = new Secretaryhome();   
		        setVisible(false); // Hide current frame
		        Secretaryhome.setVisible(true);
			}
		});
		paybill.setBounds(323, 261, 89, 23);
		contentPane.add(paybill);
		
		table = new JTable();
		table.setBounds(187, 46, 233, 151);
		contentPane.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 222, 276, 88);
		panel_1.setBorder(new TitledBorder(null, "Costs:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAbsolouteTotal = new JLabel("Absoloute Total:");
		lblAbsolouteTotal.setBounds(10, 30, 112, 14);
		panel_1.add(lblAbsolouteTotal);
		
		JLabel lblTotalAfterPlan = new JLabel("Total after plan deductions:");
		lblTotalAfterPlan.setBounds(10, 60, 157, 14);
		panel_1.add(lblTotalAfterPlan);
		
		totalfield = new JTextField();
		totalfield.setBounds(176, 27, 86, 20);
		panel_1.add(totalfield);
		totalfield.setColumns(10);
		
		totalafterfield = new JTextField();
		totalafterfield.setBounds(176, 57, 86, 20);
		panel_1.add(totalafterfield);
		totalafterfield.setColumns(10);
		setLocationRelativeTo(null);
	}

}
