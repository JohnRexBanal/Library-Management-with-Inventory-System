import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	private Image img_student = new ImageIcon(StudentLogin.class.getResource("image/student.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	private JLabel lblLoginMessage;

	


	public StudentLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 421);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.BLACK, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnltxtUsername = new JPanel();
		pnltxtUsername.setLayout(null);
		pnltxtUsername.setBackground(Color.WHITE);
		pnltxtUsername.setBounds(159, 144, 295, 54);
		contentPane.add(pnltxtUsername);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
					}
			}
		});
		txtUsername.setText("Username");
		txtUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBounds(58, 11, 203, 32);
		pnltxtUsername.add(txtUsername);
		
		JPanel pnltxtPassword = new JPanel();
		pnltxtPassword.setLayout(null);
		pnltxtPassword.setBackground(Color.WHITE);
		pnltxtPassword.setBounds(159, 209, 295, 54);
		contentPane.add(pnltxtPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
						}
					}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
				
			}
		});
		txtPassword.setIgnoreRepaint(true);
		txtPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setText("Password");
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPassword.setBorder(null);
		txtPassword.setBounds(60, 11, 201, 32);
		pnltxtPassword.add(txtPassword);
		
		JCheckBox chckShowpass = new JCheckBox("SHOW PASSWORD");
		chckShowpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckShowpass.isSelected()) {
					txtPassword.setEchoChar((char)0);
				}
				else {
					txtPassword.setEchoChar('●');
				}
			}
		});
		chckShowpass.setBackground(Color.LIGHT_GRAY);
		chckShowpass.setBounds(460, 225, 117, 23);
		contentPane.add(chckShowpass);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtUsername.getText().equals("Nathan") && txtPassword.getText().equals("nathan")) {
					frameBorrower student = new frameBorrower();
					student.setVisible(true);
					dispose();
			}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("USERNAME") ||
						txtPassword.getText().equals("") || txtPassword.getText().equals("PASSWORD")) {
						lblLoginMessage.setText("Please input all the field");
						
				}
				else {
					lblLoginMessage.setText("Username and Password didn't match");
					
					}
				if(txtUsername.getText().equals("sam") && txtPassword.getText().equals("sam123")) {
					frameBorrower student = new frameBorrower();
					student.setVisible(true);
					dispose();
			}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("USERNAME") ||
						txtPassword.getText().equals("") || txtPassword.getText().equals("PASSWORD")) {
						lblLoginMessage.setText("Please input all the field");
						
				}
				else {
					lblLoginMessage.setText("Username and Password didn't match");
					
					}
				if(txtUsername.getText().equals("jmtorno") && txtPassword.getText().equals("jmsantos")) {
					frameBorrower student = new frameBorrower();
					student.setVisible(true);
					dispose();
			}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("USERNAME") ||
						txtPassword.getText().equals("") || txtPassword.getText().equals("PASSWORD")) {
						lblLoginMessage.setText("Please input all the field");
						
				}
				else {
					lblLoginMessage.setText("Username and Password didn't match");
					
					}
				if(txtUsername.getText().equals("angel") && txtPassword.getText().equals("holydavid")) {
					frameBorrower student = new frameBorrower();
					student.setVisible(true);
					dispose();
			}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("USERNAME") ||
						txtPassword.getText().equals("") || txtPassword.getText().equals("PASSWORD")) {
						lblLoginMessage.setText("Please input all the field");
						
				}
				else {
					lblLoginMessage.setText("Username and Password didn't match");
					
					}


				}
		});
		pnlBtnLogin.setLayout(null);
		pnlBtnLogin.setBorder(null);
		pnlBtnLogin.setBackground(new Color(51, 51, 255));
		pnlBtnLogin.setBounds(226, 319, 148, 42);
		contentPane.add(pnlBtnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblLogin.setBounds(41, 11, 64, 20);
		pnlBtnLogin.add(lblLogin);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					StudentLogin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Arial", Font.BOLD, 16));
		lblX.setBounds(580, 0, 61, 35);
		contentPane.add(lblX);
		
		JLabel lblStudentIcon = new JLabel("");
		lblStudentIcon.setIcon(new ImageIcon(img_student));
		lblStudentIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentIcon.setBounds(226, 22, 148, 87);
		contentPane.add(lblStudentIcon);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setFont(new Font("Arial", Font.BOLD, 12));
		lblStudent.setBounds(261, 120, 77, 28);
		contentPane.add(lblStudent);
		
		lblLoginMessage = new JLabel("");
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(180, 274, 253, 22);
		contentPane.add(lblLoginMessage);
	}

}
