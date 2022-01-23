package empReg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Image;

import com.toedter.components.JSpinField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class empReg extends JFrame {

	private JPanel contentPane;
	private JTextField uName;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	private JPasswordField pwd;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					empReg frame = new empReg();
//					frame.setUndecorated(true);
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
	public empReg() {
		setTitle("Registration\r\n");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 652);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("SignUp");
		button.setFont(new Font("Dialog", Font.PLAIN, 17));
		button.setForeground(SystemColor.text);
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(559, 535, 133, 33);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 284, 623);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/lBg.jpg")));
		lblNewLabel_3.setBounds(10, 0, 264, 623);
		panel.add(lblNewLabel_3);
		
		uName = new JTextField();
		uName.setBackground(Color.WHITE);
		uName.setForeground(SystemColor.textInactiveText);
		uName.setBounds(317, 156, 209, 26);
		contentPane.add(uName);
		uName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(317, 181, 209, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(316, 132, 70, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.textInactiveText);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(609, 156, 209, 26);
		contentPane.add(textField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(609, 180, 209, 2);
		contentPane.add(separator_1);
		
		JLabel lblFathersName = new JLabel("Full Name");
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName.setBounds(608, 131, 102, 20);
		contentPane.add(lblFathersName);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(317, 307, 209, 2);
		contentPane.add(separator_2);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(316, 258, 89, 20);
		contentPane.add(lblDateOfBirth);
		
		textField_2 = new JTextField();
		textField_2.setForeground(SystemColor.textInactiveText);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(318, 217, 209, 26);
		contentPane.add(textField_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(318, 242, 209, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblFathersName_1 = new JLabel("Father's Name");
		lblFathersName_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_1.setBounds(317, 193, 102, 20);
		contentPane.add(lblFathersName_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(316, 283, 209, 26);
		contentPane.add(dateChooser);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(609, 241, 209, 2);
		contentPane.add(separator_3);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(609, 193, 70, 20);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setForeground(SystemColor.textInactiveText);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(609, 283, 209, 26);
		contentPane.add(textField_3);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(609, 308, 209, 2);
		contentPane.add(separator_1_2);
		
		JLabel lblFathersName_2 = new JLabel("City");
		lblFathersName_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_2.setBounds(608, 259, 102, 20);
		contentPane.add(lblFathersName_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(609, 219, 209, 22);
		contentPane.add(comboBox);
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.addItem("Transgender");
		comboBox.addItem("Others");
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.textInactiveText);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(609, 346, 209, 26);
		contentPane.add(textField_1);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(609, 371, 209, 2);
		contentPane.add(separator_1_2_1);
		
		JLabel lblFathersName_2_1 = new JLabel("Email");
		lblFathersName_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_2_1.setBounds(608, 322, 102, 20);
		contentPane.add(lblFathersName_2_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(SystemColor.textInactiveText);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(318, 345, 209, 26);
		contentPane.add(textField_4);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(318, 370, 209, 2);
		contentPane.add(separator_1_2_2);
		
		JLabel lblFathersName_2_2 = new JLabel("Phone No.");
		lblFathersName_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_2_2.setBounds(317, 321, 102, 20);
		contentPane.add(lblFathersName_2_2);
		
		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(610, 433, 176, 1);
		contentPane.add(separator_1_2_3);
		
		JLabel lblFathersName_2_3 = new JLabel("Confirm Password");
		lblFathersName_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_2_3.setBounds(609, 383, 127, 20);
		contentPane.add(lblFathersName_2_3);
		
		pwd = new JPasswordField();
		pwd.setBounds(609, 408, 176, 26);
		contentPane.add(pwd);
		
		 lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwd.setEchoChar((char)0);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(true);
			}
		});
	lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/eye.png")));
		lblNewLabel_1.setBounds(795, 414, 23, 14);
		contentPane.add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwd.setEchoChar('*');
				lblNewLabel_2.setVisible(false);
				lblNewLabel_1.setVisible(true);
			}
		});
	
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/Hshow.png")));
		lblNewLabel_2.setBounds(795, 414, 23, 14);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1_2_3_1 = new JSeparator();
		separator_1_2_3_1.setBounds(318, 432, 176, 1);
		contentPane.add(separator_1_2_3_1);
		
		JLabel lblFathersName_2_3_1 = new JLabel("Password");
		lblFathersName_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName_2_3_1.setBounds(317, 382, 102, 20);
		contentPane.add(lblFathersName_2_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 407, 209, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Registration");
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
		lblNewLabel_4.setBounds(453, 31, 300, 59);
		contentPane.add(lblNewLabel_4);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(279, 0, 777, 25);
		contentPane.add(panel_1);
		
	}
}
