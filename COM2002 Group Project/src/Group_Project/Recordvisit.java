package Group_Project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Recordvisit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recordvisit frame = new Recordvisit();
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
	public Recordvisit() {
		setTitle("Record a visit");
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 398, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dental Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 372, 108);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxSmallFilling = new JCheckBox("Small filling \u00A370");
		chckbxSmallFilling.setBounds(6, 16, 144, 23);
		panel.add(chckbxSmallFilling);
		
		JCheckBox chckbxMediumFilling = new JCheckBox("Medium filling \u00A390");
		chckbxMediumFilling.setBounds(6, 47, 144, 23);
		panel.add(chckbxMediumFilling);
		
		JCheckBox chckbxLargeFilling = new JCheckBox("Large filling \u00A3110");
		chckbxLargeFilling.setBounds(6, 78, 144, 23);
		panel.add(chckbxLargeFilling);
		
		JCheckBox chckbxRootCanalAnterior = new JCheckBox("Root Canal \u00A3300");
		chckbxRootCanalAnterior.setBounds(175, 16, 147, 23);
		panel.add(chckbxRootCanalAnterior);
		
		JCheckBox chckbxCrown = new JCheckBox("Crown \u00A3450");
		chckbxCrown.setBounds(175, 47, 147, 23);
		panel.add(chckbxCrown);
		
		JCheckBox chckbxExttraction = new JCheckBox("Extraction \u00A3100");
		chckbxExttraction.setBounds(175, 78, 147, 23);
		panel.add(chckbxExttraction);
		
		JButton btnRecordVisit = new JButton("Record Visit");
		btnRecordVisit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRecordVisit.setBounds(125, 219, 105, 23);
		contentPane.add(btnRecordVisit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Hygiene Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 130, 372, 78);
		contentPane.add(panel_1);
		
		JCheckBox chckbxSimpleScale = new JCheckBox("Simple Scale \u00A330");
		chckbxSimpleScale.setBounds(6, 16, 166, 23);
		panel_1.add(chckbxSimpleScale);
		
		JCheckBox chckbxScaleAndPolish = new JCheckBox("Scale and Polish \u00A360");
		chckbxScaleAndPolish.setBounds(6, 47, 166, 23);
		panel_1.add(chckbxScaleAndPolish);
		
		JCheckBox chckbxAdvancedScale = new JCheckBox("Advanced Scale \u00A350");
		chckbxAdvancedScale.setBounds(174, 16, 192, 23);
		panel_1.add(chckbxAdvancedScale);
		
		JCheckBox chckbxFullPeriodonctalClean = new JCheckBox("Full periodonctal clean \u00A3150");
		chckbxFullPeriodonctalClean.setBounds(174, 47, 192, 23);
		panel_1.add(chckbxFullPeriodonctalClean);
	}

}
