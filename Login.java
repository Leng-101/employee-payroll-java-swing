package EmployeePayroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nameEmployee;
	private JPasswordField passOfEmply;
	private JButton btnLogin;
	
	
	PayrollSystem frame2 = new PayrollSystem();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 363);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelPayrollSys = new JLabel("ADMIN LOGIN");
		labelPayrollSys.setForeground(new Color(0, 0, 0));
		labelPayrollSys.setFont(new Font("Rockwell", Font.BOLD, 31));
		labelPayrollSys.setHorizontalAlignment(SwingConstants.CENTER);
		labelPayrollSys.setBounds(10, 11, 298, 85);
		contentPane.add(labelPayrollSys);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel1.setBackground(new Color(255, 250, 250));
		panel1.setBounds(20, 89, 486, 150);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		nameEmployee = new JTextField("Admin Name");
		nameEmployee.setBounds(21, 24, 446, 46);
		panel1.add(nameEmployee);
		nameEmployee.setBackground(new Color(255, 255, 255));
		nameEmployee.setForeground(new Color(0, 0, 0));
		nameEmployee.setCaretColor(new Color(57, 6, 111));
		nameEmployee.setFont(new Font("Arial", Font.PLAIN, 18));
		nameEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		nameEmployee.setColumns(10);
		
		passOfEmply = new JPasswordField("Password");
		passOfEmply.setBounds(21, 81, 446, 46);
		panel1.add(passOfEmply);
		passOfEmply.setBackground(new Color(255, 255, 255));
		passOfEmply.setFont(new Font("Arial", Font.PLAIN, 18));
		passOfEmply.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(102, 205, 170));
		btnLogin.setFont(new Font("Georgia", Font.BOLD, 18));
		btnLogin.setFocusable(false);
		btnLogin.addActionListener(this);
		btnLogin.setIcon(null);
		btnLogin.setBounds(159, 259, 215, 38);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rache\\Downloads\\user (1).png"));
		lblNewLabel.setBounds(287, 11, 64, 85);
		contentPane.add(lblNewLabel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String nameList[] = {"Renalyn Almodiel","Rachel Almodiel"};
		String passList = "12345";
	
		
			if(e.getSource() == btnLogin) {
				
		      if(nameEmployee.getText().equals(nameList[0]))   {   
		      	new PayrollSystem().setVisible(true);
		     
		      contentPane.setVisible(false);
		      dispose(); 
		
		      

		    if(!nameEmployee.getText().equals(nameList[0])) {
		    	  JOptionPane.showMessageDialog(null, "Admin Error",
		    		      "Alert", JOptionPane.ERROR_MESSAGE);
		    	  
		    
		    	  	
		    	  

		      
			}
			

		
			}
	
		       
		      }

		      
					}
		      
					
}
			

	
		
			


