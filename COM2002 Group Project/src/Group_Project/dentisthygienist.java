package Group_Project;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class dentisthygienist extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static DefaultTableModel buildTableModel(String user)
	        throws SQLException {

		Statement stmt = null;
		try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team009", "team009", "9e81b723")){
			stmt = con.createStatement();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String today = dateFormat.format(date);
			
			PreparedStatement pstmt = con.prepareStatement("select * from Appointment NATURAL JOIN Patient WHERE partner=? AND appointmentDate=? ORDER BY startTime ASC");
			pstmt.setObject(1,user);
			pstmt.setObject(2,today);
			ResultSet rs = pstmt.executeQuery();
			// names of columns
			Vector<String> columnNames = new Vector<String>(); 
			columnNames.add("Patient Forename");
			columnNames.add("Patient Surname");
			columnNames.add("Start Time");
			columnNames.add("End Time");
			
			// data of the table
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			while (rs.next()) {
				Vector<Object> vector = new Vector<Object>();
				vector.add(rs.getObject("forename"));
				vector.add(rs.getObject("surname"));
				vector.add(rs.getObject("startTime"));
				vector.add(rs.getObject("endTime"));				
				data.add(vector);
			}
			return new DefaultTableModel(data, columnNames);
		}	
		
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					dentisthygienist frame = new dentisthygienist("Hygienist");
					frame.setVisible(true);
				
			}
		});
	
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public dentisthygienist(String user){
		setResizable(false);
		setTitle("My Appointments");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTodaysAppointments = new JLabel("Todays Appointments:");
		lblTodaysAppointments.setBounds(32, 21, 143, 23);
		contentPane.add(lblTodaysAppointments);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 54, 423, 300);
		contentPane.add(scrollPane);

		// It creates and displays the table
		JTable todayApptTable;
		try {
			todayApptTable = new JTable(buildTableModel(user));
			scrollPane.setViewportView(todayApptTable);
			setLocationRelativeTo(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	    		
		
		JLabel lblNextAppointment = new JLabel("Next Appointment:");
		lblNextAppointment.setBounds(488, 21, 143, 23);
		contentPane.add(lblNextAppointment);
		
		table_1 = new JTable();
		table_1.setBounds(486, 55, 145, 74);
		contentPane.add(table_1);
					
					
	}
}
