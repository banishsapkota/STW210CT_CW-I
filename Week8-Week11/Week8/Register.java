package Week8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtRegister;
	private JTextField txtRegister_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FirstName:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel.setBounds(85, 120, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LastName:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(85, 162, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("UserName:");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(85, 204, 132, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(85, 245, 132, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(85, 288, 132, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone:");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(85, 330, 132, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(205, 116, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 158, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 200, 181, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 241, 181, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 284, 181, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(205, 326, 181, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton.setBounds(205, 364, 64, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_1.setBounds(282, 364, 95, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Gender:");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Cambria", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(85, 366, 69, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("X");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(454, 10, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		txtRegister = new JTextField();
		txtRegister.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtRegister.setForeground(new Color(255, 255, 255));
		txtRegister.setBackground(new Color(255, 69, 0));
		txtRegister.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegister.setText("Register");
		txtRegister.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtRegister.setBounds(85, 409, 301, 33);
		contentPane.add(txtRegister);
		txtRegister.setColumns(10);
		
		txtRegister_2 = new JTextField();
		txtRegister_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		txtRegister_2.setForeground(new Color(255, 255, 255));
		txtRegister_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegister_2.setText("Register");
		txtRegister_2.setBackground(new Color(128, 128, 128));
		txtRegister_2.setBounds(0, 0, 500, 54);
		contentPane.add(txtRegister_2);
		txtRegister_2.setColumns(10);
		setUndecorated(true);
	}
}
