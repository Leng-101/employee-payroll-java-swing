package EmployeePayroll;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class PayrollSystem extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField idNumTxt;
	private JTextField nametxt;
	private JTextField posTxt;
	private JTextField noDaysTxt;
	private JTextField ratePerHourTxt;
	private JTextField sssTxt;
	private JTextField pensionTxt;
	private JTextField healthPlanTxt;
	private JButton calcuBtn;
	private JLabel totalNetpay;
	private JButton saveBtn;
	private JButton printBtn;
	
	String netpay2;
	int deduction;


	public JTextField getIdNumTxt() {
		return idNumTxt;
	}


	public void setIdNumTxt(JTextField idNumTxt) {
		this.idNumTxt = idNumTxt;
	}


	public JTextField getNametxt() {
		return nametxt;
	}


	public void setNametxt(JTextField nametxt) {
		this.nametxt = nametxt;
	}


	public JTextField getPosTxt() {
		return posTxt;
	}


	public void setPosTxt(JTextField posTxt) {
		this.posTxt = posTxt;
	}


	public JTextField getNoDaysTxt() {
		return noDaysTxt;
	}


	public void setNoDaysTxt(JTextField noDaysTxt) {
		this.noDaysTxt = noDaysTxt;
	}


	public JTextField getRatePerHourTxt() {
		return ratePerHourTxt;
	}


	public void setRatePerHourTxt(JTextField ratePerHourTxt) {
		this.ratePerHourTxt = ratePerHourTxt;
	}


	public JTextField getSssTxt() {
		return sssTxt;
	}


	public void setSssTxt(JTextField sssTxt) {
		this.sssTxt = sssTxt;
	}


	public JTextField getPensionTxt() {
		return pensionTxt;
	}


	public void setPensionTxt(JTextField pensionTxt) {
		this.pensionTxt = pensionTxt;
	}


	public JTextField getHealthPlanTxt() {
		return healthPlanTxt;
	}


	public void setHealthPlanTxt(JTextField healthPlanTxt) {
		this.healthPlanTxt = healthPlanTxt;
	}


	public JLabel getTotalNetpay() {
		return totalNetpay;
	}


	public void setTotalNetpay(JLabel totalNetpay) {
		this.totalNetpay = totalNetpay;
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollSystem frame = new PayrollSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public PayrollSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 761);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Payroll Of Employee");
		title.setForeground(new Color(51, 51, 51));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 35));
		title.setBounds(145, 26, 380, 74);
		contentPane.add(title);
		
		JLabel idNumLbl = new JLabel("ID Number :");
		idNumLbl.setFont(new Font("Arial", Font.BOLD, 22));
		idNumLbl.setBounds(25, 154, 128, 30);
		contentPane.add(idNumLbl);
		
		idNumTxt = new JTextField();
		idNumTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		idNumTxt.setBounds(163, 154, 216, 30);
		contentPane.add(idNumTxt);
		idNumTxt.setColumns(10);
		
		JLabel iconLabel = new JLabel("");
		iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		iconLabel.setIcon(new ImageIcon("C:\\Users\\rache\\Downloads\\productivity.png"));
		iconLabel.setBounds(519, 26, 85, 64);
		contentPane.add(iconLabel);
		
		JLabel lblNewLabel = new JLabel("Full Name :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setBounds(25, 195, 128, 30);
		contentPane.add(lblNewLabel);
		
		nametxt = new JTextField();
		nametxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		nametxt.setColumns(10);
		nametxt.setBounds(163, 195, 362, 30);
		contentPane.add(nametxt);
		
		JPanel panel = new JPanel();
		panel.setBounds(580, 132, 156, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\rache\\Downloads\\businesswoman (2).png"));
		lblNewLabel_2.setBounds(0, 0, 156, 135);
		panel.add(lblNewLabel_2);
		
		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setFont(new Font("Arial", Font.BOLD, 22));
		lblPosition.setBounds(25, 236, 128, 30);
		contentPane.add(lblPosition);
		
		posTxt = new JTextField();
		posTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		posTxt.setColumns(10);
		posTxt.setBounds(163, 236, 216, 30);
		contentPane.add(posTxt);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 102, 102));
		separator.setBackground(new Color(102, 102, 102));
		separator.setBounds(0, 299, 773, 2);
		contentPane.add(separator);
		
		JLabel lblNoOfDays = new JLabel("No. Of Days :");
		lblNoOfDays.setFont(new Font("Arial", Font.BOLD, 22));
		lblNoOfDays.setBounds(25, 333, 140, 30);
		contentPane.add(lblNoOfDays);
		
		noDaysTxt = new JTextField();
		noDaysTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		noDaysTxt.setColumns(10);
		noDaysTxt.setBounds(175, 333, 111, 30);
		contentPane.add(noDaysTxt);
		
		JLabel lblRatePerHour = new JLabel("Rate Per Hour :");
		lblRatePerHour.setFont(new Font("Arial", Font.BOLD, 22));
		lblRatePerHour.setBounds(407, 333, 167, 30);
		contentPane.add(lblRatePerHour);
		
		ratePerHourTxt = new JTextField();
		ratePerHourTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		ratePerHourTxt.setColumns(10);
		ratePerHourTxt.setBounds(580, 333, 111, 30);
		contentPane.add(ratePerHourTxt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(102, 102, 102));
		separator_1.setBackground(new Color(102, 102, 102));
		separator_1.setBounds(0, 395, 773, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Deduction");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 414, 117, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblHealthPlan = new JLabel("Health Plan :");
		lblHealthPlan.setFont(new Font("Arial", Font.BOLD, 22));
		lblHealthPlan.setBounds(25, 455, 140, 30);
		contentPane.add(lblHealthPlan);
		
		JLabel socialSecLbl = new JLabel("SSS :");
		socialSecLbl.setFont(new Font("Arial", Font.BOLD, 22));
		socialSecLbl.setBounds(296, 455, 70, 30);
		contentPane.add(socialSecLbl);
		
		sssTxt = new JTextField();
		sssTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		sssTxt.setColumns(10);
		sssTxt.setBounds(365, 458, 111, 30);
		contentPane.add(sssTxt);
		
		JLabel lblPension = new JLabel("Pension :");
		lblPension.setFont(new Font("Arial", Font.BOLD, 22));
		lblPension.setBounds(502, 455, 102, 30);
		contentPane.add(lblPension);
		
		pensionTxt = new JTextField();
		pensionTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		pensionTxt.setColumns(10);
		pensionTxt.setBounds(611, 458, 111, 30);
		contentPane.add(pensionTxt);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(102, 102, 102));
		separator_1_1.setBackground(new Color(102, 102, 102));
		separator_1_1.setBounds(0, 585, 773, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblNetpay = new JLabel("Netpay :");
		lblNetpay.setFont(new Font("Arial", Font.BOLD, 22));
		lblNetpay.setBounds(24, 611, 102, 30);
		contentPane.add(lblNetpay);
		
		JPanel panelForNetpay = new JPanel();
		panelForNetpay.setBounds(124, 611, 216, 40);
		contentPane.add(panelForNetpay);
		panelForNetpay.setLayout(null);
		
		totalNetpay = new JLabel("");
		totalNetpay.setBounds(0, 0, 216, 40);
		panelForNetpay.add(totalNetpay);
		totalNetpay.setFont(new Font("Calibri", Font.PLAIN, 24));
		totalNetpay.setHorizontalAlignment(SwingConstants.CENTER);
		
		healthPlanTxt = new JTextField();
		healthPlanTxt.setFont(new Font("Verdana", Font.PLAIN, 18));
		healthPlanTxt.setColumns(10);
		healthPlanTxt.setBounds(163, 458, 111, 30);
		contentPane.add(healthPlanTxt);
		
		calcuBtn = new JButton("Calculate");
		calcuBtn.setFocusable(false);
		calcuBtn.addActionListener(this); //ActionListener
		calcuBtn.setBackground(new Color(255, 218, 185));
		calcuBtn.setFont(new Font("Maiandra GD", Font.BOLD, 18));
		calcuBtn.setBounds(282, 530, 180, 40);
		contentPane.add(calcuBtn);
		
		saveBtn = new JButton("Save");
		saveBtn.addActionListener(this);
		saveBtn.setFocusable(false);
		saveBtn.setBackground(new Color(255, 102, 102));
		saveBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		saveBtn.setBounds(688, 676, 78, 30);
		contentPane.add(saveBtn);
		
		printBtn = new JButton("Print");
		printBtn.addActionListener(this);
		printBtn.setFocusable(false);
		printBtn.setBackground(new Color(153, 204, 204));
		printBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		printBtn.setBounds(600, 676, 78, 30);
		contentPane.add(printBtn);
		contentPane.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == calcuBtn) {
		
		//Convert String to Integer
	    int rate = Integer.valueOf(ratePerHourTxt.getText());
	    int numDays = Integer.valueOf(noDaysTxt.getText());    
	    int deducSSS = Integer.valueOf(sssTxt.getText());
	    int deducPen = Integer.valueOf(pensionTxt.getText());
	    int deducHp = Integer.valueOf(healthPlanTxt.getText());	
	    
	    //Netpay
	    int product = rate * numDays;
	    deduction = deducSSS + deducPen + deducHp;
	    int netpay = product - deduction;
	    
	    netpay2 = String.valueOf(netpay);
	    
	    totalNetpay.setText("₱" + netpay2);
			
		}
		
		else if(e.getSource() == saveBtn) {
			 JOptionPane.showMessageDialog(null, "Save Successfully",
				      "Saved", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		else if(e.getSource() == printBtn) {		
		PrintPayroll pay = new PrintPayroll();
		
		String convDeduc = String.valueOf(deduction);
		
		//Get the value in the textfields
		pay.idEmpTxt.setText(idNumTxt.getText());
		pay.nameTxt.setText(nametxt.getText());
		
		pay.posTxt.setText(posTxt.getText());
		
		pay.hpTxt.setText(healthPlanTxt.getText());
		pay.penTxt.setText(pensionTxt.getText());
		pay.ssTxt.setText(sssTxt.getText());
		pay.totalDecTxt.setText("₱" + convDeduc);
		pay.salaryTxt.setText("₱" + netpay2);
		
		
		pay.setVisible(true);

		contentPane.setVisible(false);
		dispose(); 
		      
		      
			
			
		}
		
		
	}

}


	
