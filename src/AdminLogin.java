import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	private Image img_admin = new ImageIcon(frameAdmin.class.getResource("image/admin.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	private JLabel lblLoginMessage;
	private JPanel pnlBtnLogin;
	private JLabel lblLogin;

	
	public AdminLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JPanel pnltxtUsername = new JPanel();
		pnltxtUsername.setBackground(Color.WHITE);
		pnltxtUsername.setBounds(173, 144, 295, 54);
		contentPane.add(pnltxtUsername);
		pnltxtUsername.setLayout(null);
		
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
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		txtUsername.setText("Username");
		txtUsername.setBorder(null);
		txtUsername.setBounds(58, 11, 203, 32);
		pnltxtUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel pnltxtPassword = new JPanel();
		pnltxtPassword.setBackground(Color.WHITE);
		pnltxtPassword.setBounds(173, 209, 295, 54);
		contentPane.add(pnltxtPassword);
		pnltxtPassword.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent args0) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
			}
				else {
					txtPassword.selectAll();
					}
				}
			@Override
			public void focusLost(FocusEvent args0) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
				
			}
		});
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setText("Password");
		txtPassword.setEchoChar((char)0);
		txtPassword.setIgnoreRepaint(true);
		txtPassword.setBorder(null);
		txtPassword.setBounds(60, 11, 201, 32);
		pnltxtPassword.add(txtPassword);
		
		pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")) {
					frameAdmin admin = new frameAdmin();
					admin.setVisible(true);
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
				
		pnlBtnLogin.setBackground(new Color(51, 51, 255));
		pnlBtnLogin.setBorder(null);
		pnlBtnLogin.setBounds(240, 335, 148, 42);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBackground(new Color(51, 51, 255));
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(41, 11, 64, 20);
		pnlBtnLogin.add(lblLogin);
		
		JLabel lblAdminIcon = new JLabel("");
		lblAdminIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminIcon.setBounds(240, 22, 148, 87);
		lblAdminIcon.setIcon(new ImageIcon(img_admin));
		contentPane.add(lblAdminIcon);
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(275, 120, 77, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdminLogin.this.dispose();
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
		lblX.setBounds(583, 0, 61, 35);
		contentPane.add(lblX);
		
		lblLoginMessage = new JLabel("");
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(195, 302, 253, 22);
		contentPane.add(lblLoginMessage);
		
		JCheckBox chckShowpass = new JCheckBox("SHOW PASSWORD");
		chckShowpass.setForeground(new Color(102, 51, 255));
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
		chckShowpass.setBounds(266, 272, 117, 23);
		contentPane.add(chckShowpass);
	}
}
