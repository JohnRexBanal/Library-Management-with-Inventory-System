import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class LoginForm extends JFrame {

	private JPanel contentPane;

	private Image img_admin = new ImageIcon(LoginForm.class.getResource("image/admin.png")).getImage().getScaledInstance(195, 195, Image.SCALE_SMOOTH);
	private Image img_student = new ImageIcon(LoginForm.class.getResource("image/student.png")).getImage().getScaledInstance(195, 195, Image.SCALE_SMOOTH);

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LoginForm() {
		setUndecorated(true);
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminLogo = new JLabel("");
		lblAdminLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin log = new AdminLogin();
				log.setVisible(true);
				dispose();
			}
		});
		lblAdminLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogo.setBounds(40, 122, 271, 244);
		lblAdminLogo.setIcon(new ImageIcon(img_admin));
		contentPane.add(lblAdminLogo);
		
		JLabel lblStudentLogo = new JLabel("");
		lblStudentLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentLogin student = new StudentLogin();
				student.setVisible(true);
				dispose();
			}
		});
		lblStudentLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentLogo.setBounds(386, 122, 271, 244);
		lblStudentLogo.setIcon(new ImageIcon(img_student));
		contentPane.add(lblStudentLogo);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setFont(new Font("Arial", Font.BOLD, 14));
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(89, 377, 169, 38);
		contentPane.add(lblAdmin);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudent.setBounds(449, 377, 169, 38);
		contentPane.add(lblStudent);
		
		JLabel lblNewLabel = new JLabel("LOGIN AS");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(89, 54, 529, 61);
		contentPane.add(lblNewLabel);
	}
}
