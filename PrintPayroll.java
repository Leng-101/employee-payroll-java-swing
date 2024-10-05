package EmployeePayroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class PrintPayroll extends JFrame {

	private JPanel contentPane;
	public JLabel nameTxt;
	JLabel idEmpTxt;
	JLabel posTxt;
	JLabel hpTxt;
	JLabel ssTxt;
	JLabel penTxt;
	JLabel totalDecTxt;
	JLabel salaryTxt;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintPayroll frame = new PrintPayroll();
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
	public PrintPayroll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 584);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleTxt = new JLabel("Payroll Receipt");
		titleTxt.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		titleTxt.setHorizontalAlignment(SwingConstants.CENTER);
		titleTxt.setBounds(10, 23, 243, 48);
		contentPane.add(titleTxt);
		
		JLabel iconLabel = new JLabel("");
		iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		iconLabel.setIcon(new ImageIcon("C:\\Users\\rache\\Downloads\\bill (1).png"));
		iconLabel.setBounds(218, 22, 59, 59);
		contentPane.add(iconLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 82, 397, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nameOfEmpLbl = new JLabel("Name of Employee : ");
		nameOfEmpLbl.setForeground(new Color(220, 20, 60));
		nameOfEmpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		nameOfEmpLbl.setBounds(10, 50, 149, 28);
		panel.add(nameOfEmpLbl);
		
		nameTxt = new JLabel("");
		nameTxt.setBackground(new Color(211, 211, 211));
		nameTxt.setHorizontalAlignment(SwingConstants.CENTER);
		nameTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		nameTxt.setBounds(150, 52, 226, 28);
		panel.add(nameTxt);
		
		JLabel lblEmployeeId = new JLabel("Employee ID :");
		lblEmployeeId.setForeground(new Color(220, 20, 60));
		lblEmployeeId.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmployeeId.setBounds(10, 11, 137, 28);
		panel.add(lblEmployeeId);
		
		idEmpTxt = new JLabel("");
		idEmpTxt.setHorizontalAlignment(SwingConstants.CENTER);
		idEmpTxt.setFont(new Font("Consolas", Font.PLAIN, 14));
		idEmpTxt.setBackground(new Color(211, 211, 211));
		idEmpTxt.setBounds(150, 13, 226, 28);
		panel.add(idEmpTxt);
		
		JLabel lblPosition = new JLabel("Position : ");
		lblPosition.setForeground(new Color(220, 20, 60));
		lblPosition.setFont(new Font("Arial", Font.BOLD, 14));
		lblPosition.setBounds(10, 89, 137, 28);
		panel.add(lblPosition);
		
		posTxt = new JLabel("");
		posTxt.setHorizontalAlignment(SwingConstants.CENTER);
		posTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		posTxt.setBackground(new Color(211, 211, 211));
		posTxt.setBounds(150, 89, 226, 28);
		panel.add(posTxt);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(397, 165, -386, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(128, 128, 128));
		separator_1.setBounds(0, 128, 397, 28);
		panel.add(separator_1);
		
		JLabel lblDeductions = new JLabel("Deductions :");
		lblDeductions.setForeground(new Color(0, 0, 0));
		lblDeductions.setFont(new Font("Arial", Font.BOLD, 16));
		lblDeductions.setBounds(10, 147, 149, 28);
		panel.add(lblDeductions);
		
		JLabel lblHealthPlan = new JLabel("Health Plan :");
		lblHealthPlan.setForeground(new Color(220, 20, 60));
		lblHealthPlan.setFont(new Font("Arial", Font.BOLD, 14));
		lblHealthPlan.setBounds(10, 186, 137, 28);
		panel.add(lblHealthPlan);
		
		JLabel lblSss = new JLabel("SSS :");
		lblSss.setForeground(new Color(220, 20, 60));
		lblSss.setFont(new Font("Arial", Font.BOLD, 14));
		lblSss.setBounds(10, 226, 137, 28);
		panel.add(lblSss);
		
		JLabel lblPension = new JLabel("Pension :");
		lblPension.setForeground(new Color(220, 20, 60));
		lblPension.setFont(new Font("Arial", Font.BOLD, 14));
		lblPension.setBounds(10, 265, 137, 28);
		panel.add(lblPension);
		
		hpTxt = new JLabel("");
		hpTxt.setHorizontalAlignment(SwingConstants.CENTER);
		hpTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		hpTxt.setBackground(new Color(211, 211, 211));
		hpTxt.setBounds(150, 186, 226, 28);
		panel.add(hpTxt);
		
		ssTxt = new JLabel("");
		ssTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ssTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		ssTxt.setBackground(new Color(211, 211, 211));
		ssTxt.setBounds(150, 226, 226, 28);
		panel.add(ssTxt);
		
		penTxt = new JLabel("");
		penTxt.setHorizontalAlignment(SwingConstants.CENTER);
		penTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		penTxt.setBackground(new Color(211, 211, 211));
		penTxt.setBounds(150, 265, 226, 28);
		panel.add(penTxt);
		
		JLabel lblTotal = new JLabel("Total =");
		lblTotal.setForeground(new Color(220, 20, 60));
		lblTotal.setFont(new Font("Arial", Font.BOLD, 14));
		lblTotal.setBounds(88, 304, 59, 28);
		panel.add(lblTotal);
		
		totalDecTxt = new JLabel("");
		totalDecTxt.setHorizontalAlignment(SwingConstants.CENTER);
		totalDecTxt.setFont(new Font("Consolas", Font.PLAIN, 16));
		totalDecTxt.setBackground(new Color(211, 211, 211));
		totalDecTxt.setBounds(150, 304, 226, 28);
		panel.add(totalDecTxt);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.GRAY);
		separator_1_1.setBounds(0, 343, 397, 28);
		panel.add(separator_1_1);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setForeground(new Color(220, 20, 60));
		lblSalary.setFont(new Font("Arial", Font.BOLD, 14));
		lblSalary.setBounds(10, 366, 59, 28);
		panel.add(lblSalary);
		
		salaryTxt = new JLabel("");
		salaryTxt.setHorizontalAlignment(SwingConstants.CENTER);
		salaryTxt.setFont(new Font("Consolas", Font.PLAIN, 18));
		salaryTxt.setBackground(new Color(211, 211, 211));
		salaryTxt.setBounds(79, 366, 226, 28);
		panel.add(salaryTxt);
		
		
		

	}
}
