import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class frameAdmin extends JFrame {

	private JPanel contentPane;
	
	public static DefaultTableModel modelStudent = new DefaultTableModel();
	public static DefaultTableModel modelCat = new DefaultTableModel();
	public static DefaultTableModel modelBookList = new DefaultTableModel();
	public static DefaultTableModel modelBookStocks = new DefaultTableModel();
	public static DefaultTableModel modelborrow = new DefaultTableModel();
	public static DefaultTableModel modelreturn = new DefaultTableModel();


	//Borrow
	private static Object []borrow1 = {"9342","2000200","SAM CEDRIC","3000","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","20/06/21","22/06/21","250","APPROVED"};
	private static Object []borrow2 = {"9343","2000202","PRINZE JM","3005","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","25/06/21","27/06/21","230","APPROVED"};
	private static Object []borrow3 = {"9344","2000203","ANGELICA HOLY","3004","1090472","9781119788492","Humans in the Making: In the Beginning was Technique, Volume 4","PSYCHOLOGY","Michel J.F. Dubois","27/06/21","29/06/21","350","PENDING"};
	private static Object []borrow4 = {"9345","2000204","NATHAN DELA ROSA","3001","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","01/07/21","03/07/21","250","APPROVED"};

	
	//REturned
	private static Object []return1 = {"9342","2000200","SAM CEDRIC","3000","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","20/06/21","22/06/21","250","APPROVED"};
	private static Object []return2 = {"9343","2000202","PRINZE JM","3005","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","25/06/21","28/06/21","230","PENALIZED","10"};
	private static Object []return3 = {"9344","2000204","NATHAN DELA ROSA","3001","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","01/07/21","03/07/21","250","PENDING"};

	//students
	private static Object []student1 = {"2000200","RAMIREZ","SAM CEDRIC","LOPEZ","CCE","BSIT","sam","sam123","BORROWER"};
	private static Object []student2 = {"2000202","CY","PRINZE JM","SANTOS","CCE","BSCS","jmtorno","jmsantos","BORROWER"};
	private static Object []student3 = {"2000203","DAVID","ANGELICA","HOLY","CEAS","BSEED","angel","holydavid","BORROWER"};


	
	public static String[] columnBookList = {"BOOK ID","ONLINE ISBN","TITLE","CATEGORY","AUTHORS","PUBLISHER YEAR","PRICE","AVAILABLE COPY","STATUS"};
	public static String[] columnstudent = {"STUDENT ID","LASTNAME","FIRSTNAME","MIDDLENAME","COLLEGE","COURSE","USERNAME","PASSWORD","STATUS"};
	public static String[] columncat = {"NO.","BOOK CATEGORY"};
	public static String[] columnStocks = {"STOCK ID","BOOK ID.","ONLINE ISBN","TITLE","CATEGORY","AUTHOR","YEAR PUBLISHED","STATUS"};
	public static String[] columnborrowdetails = {"BORROWER ID.","ACCOUNT ID","NAME","STOCK ID","BOOK ID","ONLINE ISBN","TITLE","CATEGORY","AUTHOR","ISSUE DATE","DUE DATE","PRICE","STATUS"};
	public static String[] columnreturn = {"RETURN ID.","ACCOUNT ID","NAME","STOCK ID","BOOK ID","ONLINE ISBN","TITLE","CATEGORY","AUTHOR","ISSUE DATE","RETURN DATE","PRICE","STATUS","PENALTY CHARGE"};

	
	
	//Images
	private Image img_admin = new ImageIcon(frameAdmin.class.getResource("image/admin.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	private Image img_men = new ImageIcon(frameAdmin.class.getResource("image/men.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_logout = new ImageIcon(frameAdmin.class.getResource("image/logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_exit = new ImageIcon(frameAdmin.class.getResource("image/close.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_find = new ImageIcon(frameAdmin.class.getResource("image/Find.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

	//BooksList
	private static Object []Book1 = {"1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13", "250", "4","AVAILABLE"};	
	private static Object []Book2 = {"1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","230", "4","AVAILABLE"};
	private static Object []Book3 = {"1090467","9780470611739 ","APPLICATION INTEGRATION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Bernard ManouvrierLaurent Ménard","01/01/08","150", "3","AVAILABLE"};
	private static Object []Book4 = {"1090468","9781119004752","AUTOMATIC TEXT SUMMARIZATION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Juan-Manuel Torres-Moreno","24/09/14","140", "5","AVAILABLE"};
	private static Object []Book5 = {"1090469","9781119055228 ","BEYOND CYBER SECURITY","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","James M. KaplanTucker","10/04/15","145", "5","AVAILABLE"};
	private static Object []Book6 = {"1090470","9780470996652","Blackwell Handbook of Childhood Cognitive Development","PSYCHOLOGY","Usha Goswami","01/02/02", "250", "2","AVAILABLE"};
	private static Object []Book7 = {"1090471","9781444323542","Handbook of Jealousy: Theory, Research, and Multidisciplinary Approaches","PSYCHOLOGY","Sybil L. Hart, Maria Legerstee PhD","16/04/10","220", "1","AVAILABLE"};
	private static Object []Book8 = {"1090472","9781119788492 ","Humans in the Making: In the Beginning was Technique, Volume 4","PSYCHOLOGY","Michel J.F. Dubois","30/10/20","350", "3","AVAILABLE"};
	private static Object []Book9 = {"1090473","9780470773307 ","Understanding Developmental Disorders: A Causal Modelling Approach","PSYCHOLOGY","John Morton","01/01/04","255", "5","AVAILABLE"};
	private static Object []Book10 = {"1090474","9781444325461","A History of Autism: Conversations with the Pioneers","PSYCHOLOGY","Adam Feinstein","14/06/10","245", "6","AVAILABLE"};
	
	
	//Available stocks
	private static Object []Stock1 = {"3000","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []Stock2 = {"3001","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []Stock3 = {"3002","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","DAMAGED"};
	private static Object []Stock4 = {"3003","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []Stock5 = {"3004","1090472","9781119788492","Humans in the Making: In the Beginning was Technique, Volume 4","PSYCHOLOGY","Michel J.F. Dubois","30/10/20","GOOD"};
	private static Object []Stock6 = {"3005","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","GOOD"};
	private static Object []Stock7 = {"3006","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","DAMAGED"};
	private static Object []Stock8 = {"3007","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","GOOD"};
	private static Object []Stock9 = {"3008","1090474","9781444325461","A History of Autism: Conversations with the Pioneers","PSYCHOLOGY","Adam Feinstein","14/06/10","GOOD"};
	private static Object []Stock10 = {"3009","1090474","9781444325461","A History of Autism: Conversations with the Pioneers","PSYCHOLOGY","Adam Feinstein","14/06/10","GOOD"};


	
	
	public static JTable tblStudent;
	private JTextField txtSearchStudent;
	public static JTable tblCategories;

	private static Object[] category = {"1","COMPUTER SCIENCE & INFORMATION TECHNOLOGY"};
	private static Object[] category1 = {"2","PSYCHOLOGY"};
	private static Object[] category2 = {"3","ARTS & APPLIED"};
	private static Object[] category3 = {"4","HUMANITIES"};
	private static Object[] category4 = {"5","MATHEMATICS & STATISTICS"};
	private static Object[] category5 = {"6","MEDICINE"};
	
	private JTextField txtSearchCat;
	private JTable tblBookList;
	private JTable tblBookStocks;
	private JTextField txtSearchStocks;
	private JTable tblBorrow;
	private JTable tblreturn;
	private JTextField txtBorrowTransaction;
	private JTextField txtSearchReturn;
	private JTextField txtSearchBook;
	private JButton btnLogin;
	private JButton btnLogout;
	
	
	
	public frameAdmin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1266, 803);
		contentPane = new JPanel();
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(102, 51, 255));
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
		);
		
		JPanel pnlManageAcount = new JPanel();
		pnlManageAcount.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE ADMIN ACCOUNT", null, pnlManageAcount, null);
		
		JPanel pnlProfile = new JPanel();
		pnlProfile.setBackground(Color.WHITE);
		pnlProfile.setBorder(null);
		
		JPanel panel_5 = new JPanel();
		
		JLabel lblNewLabel_4 = new JLabel("BOOKS AVAILABLE");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5 = new JLabel("8");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JPanel panel_5_1 = new JPanel();
		
		JLabel lblNewLabel_4_1 = new JLabel("DAMAGED BOOKS");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_1 = new JLabel("2");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JPanel panel_5_2 = new JPanel();
		
		JLabel lblNewLabel_4_2 = new JLabel("BOOKS AVAILABLE");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_2 = new JLabel("8");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JPanel panel_5_3 = new JPanel();
		
		JLabel lblNewLabel_4_3 = new JLabel("PENALIZED");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_3 = new JLabel("1");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JPanel panel_5_4 = new JPanel();
		
		JLabel lblNewLabel_4_4 = new JLabel("BOOK RETURNED");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_4 = new JLabel("1");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JPanel panel_5_5 = new JPanel();
		
		JLabel lblNewLabel_4_5 = new JLabel("PENDING BORROW REQUEST");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_5_5 = new JLabel("1");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 76));
		GroupLayout gl_pnlManageAcount = new GroupLayout(pnlManageAcount);
		gl_pnlManageAcount.setHorizontalGroup(
			gl_pnlManageAcount.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlManageAcount.createSequentialGroup()
					.addComponent(pnlProfile, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnlManageAcount.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlManageAcount.createSequentialGroup()
							.addGap(30)
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(38)
							.addComponent(panel_5_1, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(43)
							.addComponent(panel_5_2, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(50))
						.addGroup(gl_pnlManageAcount.createSequentialGroup()
							.addGap(31)
							.addComponent(panel_5_5, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(37)
							.addComponent(panel_5_3, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(50)
							.addComponent(panel_5_4, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
							.addGap(43))))
		);
		gl_pnlManageAcount.setVerticalGroup(
			gl_pnlManageAcount.createParallelGroup(Alignment.LEADING)
				.addComponent(pnlProfile, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
				.addGroup(gl_pnlManageAcount.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_pnlManageAcount.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlManageAcount.createSequentialGroup()
							.addGap(1)
							.addComponent(panel_5_2, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_pnlManageAcount.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlManageAcount.createSequentialGroup()
							.addGap(51)
							.addComponent(panel_5_4, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlManageAcount.createSequentialGroup()
							.addGap(48)
							.addComponent(panel_5_5, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(120, Short.MAX_VALUE))
				.addGroup(gl_pnlManageAcount.createSequentialGroup()
					.addGap(40)
					.addComponent(panel_5_1, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(panel_5_3, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
		);
		GroupLayout gl_panel_5_4 = new GroupLayout(panel_5_4);
		gl_panel_5_4.setHorizontalGroup(
			gl_panel_5_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_4.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_4_4, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
				.addGroup(gl_panel_5_4.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNewLabel_5_4, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(64))
		);
		gl_panel_5_4.setVerticalGroup(
			gl_panel_5_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_4.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_4_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_4.setLayout(gl_panel_5_4);
		GroupLayout gl_panel_5_2 = new GroupLayout(panel_5_2);
		gl_panel_5_2.setHorizontalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_4_2, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(109)
					.addComponent(lblNewLabel_5_2, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(71))
		);
		gl_panel_5_2.setVerticalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_2.setLayout(gl_panel_5_2);
		GroupLayout gl_panel_5_1 = new GroupLayout(panel_5_1);
		gl_panel_5_1.setHorizontalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(88)
					.addComponent(lblNewLabel_5_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_panel_5_1.setVerticalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_1.setLayout(gl_panel_5_1);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(88)
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_5_5 = new GroupLayout(panel_5_5);
		gl_panel_5_5.setHorizontalGroup(
			gl_panel_5_5.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_4_5, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
				.addGroup(gl_panel_5_5.createSequentialGroup()
					.addGap(88)
					.addComponent(lblNewLabel_5_5, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_panel_5_5.setVerticalGroup(
			gl_panel_5_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_5.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel_4_5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_5_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_5.setLayout(gl_panel_5_5);
		GroupLayout gl_panel_5_3 = new GroupLayout(panel_5_3);
		gl_panel_5_3.setHorizontalGroup(
			gl_panel_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel_4_3, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(88)
					.addComponent(lblNewLabel_5_3, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_panel_5_3.setVerticalGroup(
			gl_panel_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_3.setLayout(gl_panel_5_3);
		
		JLabel lblAdminIcon = new JLabel("");
		lblAdminIcon.setBounds(59, 58, 138, 110);
		lblAdminIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminIcon.setIcon(new ImageIcon(img_admin));
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setBounds(75, 186, 100, 17);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setEnabled(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
				btnLogin.setEnabled(false);
			}
		});
		btnLogin.setBounds(103, 263, 83, 38);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogin.setBorder(null);
		btnLogin.setBackground(Color.WHITE);
		
		JLabel lblLoginIcon = new JLabel("");
		lblLoginIcon.setBounds(43, 251, 59, 50);
		lblLoginIcon.setIcon(new ImageIcon(img_men));
		pnlProfile.setLayout(null);
		pnlProfile.add(lblNewLabel);
		pnlProfile.add(lblAdminIcon);
		pnlProfile.add(lblLoginIcon);
		pnlProfile.add(btnLogin);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					tabbedPane.setEnabled(false);
					btnLogout.setEnabled(false);
					btnLogin.setEnabled(true);
					
				}
			}
		});
		btnLogout.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(101, 342, 85, 50);
		pnlProfile.add(btnLogout);
		
		JLabel lblLogoutIcon = new JLabel("");
		lblLogoutIcon.setIcon(new ImageIcon(img_logout));
		lblLogoutIcon.setBounds(43, 342, 59, 50);
		pnlProfile.add(lblLogoutIcon);
		
		JLabel lblProfile = new JLabel("PROFILE");
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setFont(new Font("Arial", Font.BOLD, 16));
		lblProfile.setBounds(75, 23, 100, 17);
		pnlProfile.add(lblProfile);
		
		JLabel lblLogoutIcon_1 = new JLabel("");
		lblLogoutIcon_1.setIcon(new ImageIcon(img_exit));
		lblLogoutIcon_1.setBounds(43, 429, 59, 50);
		pnlProfile.add(lblLogoutIcon_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameAdmin.this.dispose();
				}
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 16));
		btnExit.setBorder(null);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(101, 429, 85, 50);
		pnlProfile.add(btnExit);
		pnlManageAcount.setLayout(gl_pnlManageAcount);
		
		JPanel pnlManageUser = new JPanel();
		pnlManageUser.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE STUDENT RECORD", null, pnlManageUser, null);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT LIST");
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		txtSearchStudent = new JTextField();
		txtSearchStudent.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String student = txtSearchStudent.getText();
				
					search(student);
			}
		});
		txtSearchStudent.setColumns(10);
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameAddStudent addstudent = new frameAddStudent();
				addstudent.setVisible(true);
				
			}
		});
		btnNew.setBorder(null);
		btnNew.setForeground(new Color(255, 255, 255));
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNew.setBackground(new Color(51, 51, 255));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameUpdateStudent updatestudent = new frameUpdateStudent();
				updatestudent.setVisible(true);
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBorder(null);
		btnUpdate.setBackground(new Color(51, 51, 255));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameDeleteStudent deletestudent = new frameDeleteStudent();
				deletestudent.setVisible(true);
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBorder(null);
		btnDelete.setBackground(new Color(51, 51, 255));
		
		JLabel lblSearchIcon = new JLabel("");
		lblSearchIcon.setIcon(new ImageIcon(img_find));
		GroupLayout gl_pnlManageUser = new GroupLayout(pnlManageUser);
		gl_pnlManageUser.setHorizontalGroup(
			gl_pnlManageUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlManageUser.createSequentialGroup()
					.addGap(84)
					.addComponent(lblSearchIcon, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtSearchStudent, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(154)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(437))
				.addGroup(gl_pnlManageUser.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_pnlManageUser.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlManageUser.createSequentialGroup()
							.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(703, Short.MAX_VALUE))
				.addGroup(gl_pnlManageUser.createSequentialGroup()
					.addGap(45)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
					.addGap(54))
		);
		gl_pnlManageUser.setVerticalGroup(
			gl_pnlManageUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlManageUser.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_pnlManageUser.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlManageUser.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtSearchStudent, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSearchIcon, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addGroup(gl_pnlManageUser.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlManageUser.createSequentialGroup()
							.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		tblStudent = new JTable(modelStudent) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
				}
			};
		tblStudent.setBackground(new Color(255, 255, 204));
		tblStudent.setFont(new Font("Arial", Font.PLAIN, 12));
		modelStudent.setColumnIdentifiers(columnstudent);
		students();
		tblStudent.getTableHeader().setResizingAllowed(false);
		tblStudent.getTableHeader().setReorderingAllowed(false); 
		scrollPane.setViewportView(tblStudent);
		pnlManageUser.setLayout(gl_pnlManageUser);
		
		JPanel pnlCategorymanagement = new JPanel();
		pnlCategorymanagement.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE BOOK CATEGORY", null, pnlCategorymanagement, null);
		
		JLabel lblNewLabel_1_1 = new JLabel("BOOK CATEGORY");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton btnNewCategory = new JButton("NEW");
		btnNewCategory.setForeground(new Color(255, 255, 255));
		btnNewCategory.setBackground(new Color(51, 51, 255));
		btnNewCategory.setBorder(null);
		btnNewCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameAddBookCategory addcat = new frameAddBookCategory();
				addcat.setVisible(true);
			}
		});
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameUpdateCategory updatecategory = new frameUpdateCategory();
				updatecategory.setVisible(true);
			}
		});
		btnUpdate_1.setForeground(Color.WHITE);
		btnUpdate_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate_1.setBorder(null);
		btnUpdate_1.setBackground(new Color(51, 51, 255));
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameDeleteCategory deletecategory = new frameDeleteCategory();
				deletecategory.setVisible(true);
			}
		});
		btnDelete_1.setForeground(Color.WHITE);
		btnDelete_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete_1.setBorder(null);
		btnDelete_1.setBackground(new Color(51, 51, 255));
		
		txtSearchCat = new JTextField();
		txtSearchCat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String category = txtSearchCat.getText();
				
					searchcat(category);
			}
		});
		txtSearchCat.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SEARCH");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_pnlCategorymanagement = new GroupLayout(pnlCategorymanagement);
		gl_pnlCategorymanagement.setHorizontalGroup(
			gl_pnlCategorymanagement.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
					.addGap(151)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtSearchCat, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(77)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(423))
				.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
					.addGap(164)
					.addComponent(btnNewCategory, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(btnUpdate_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnDelete_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(477, Short.MAX_VALUE))
				.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
					.addGap(44)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
					.addGap(47))
		);
		gl_pnlCategorymanagement.setVerticalGroup(
			gl_pnlCategorymanagement.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
					.addGroup(gl_pnlCategorymanagement.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCategorymanagement.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_pnlCategorymanagement.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSearchCat, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_pnlCategorymanagement.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewCategory, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(43))
		);
		
		tblCategories = new JTable(modelCat) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
				}
			};	
		tblCategories.setBackground(new Color(255, 255, 204));
		tblCategories.setFont(new Font("Arial", Font.PLAIN, 12));
		modelCat.setColumnIdentifiers(columncat);
		categories();
		tblCategories.getTableHeader().setResizingAllowed(false);
		tblCategories.getTableHeader().setReorderingAllowed(false); 
		scrollPane_1.setViewportView(tblCategories);
		pnlCategorymanagement.setLayout(gl_pnlCategorymanagement);
		
		JPanel pnlBookInformation = new JPanel();
		pnlBookInformation.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE BOOK INFORMATION", null, pnlBookInformation, null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("BOOK MANAGEMENT");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JButton btnNewButton = new JButton("NEW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameAddBook addbook = new frameAddBook();
				addbook.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBorder(null);
		
		JButton btnUpdate_2 = new JButton("UPDATE");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameUpdateBook updatebook = new frameUpdateBook();
				updatebook.setVisible(true);
			}
		});
		btnUpdate_2.setForeground(Color.WHITE);
		btnUpdate_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdate_2.setBorder(null);
		btnUpdate_2.setBackground(new Color(51, 51, 255));
		
		JButton btnDelete_2 = new JButton("DELETE");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameDeleteBook deletebook = new frameDeleteBook();
				deletebook.setVisible(true);
			}
		});
		btnDelete_2.setForeground(Color.WHITE);
		btnDelete_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete_2.setBorder(null);
		btnDelete_2.setBackground(new Color(51, 51, 255));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("SEARCH.");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtSearchBook = new JTextField();
		txtSearchBook.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String book = txtSearchBook.getText();
				
					searchbook(book);
				
			}
		});
		txtSearchBook.setColumns(10);
		GroupLayout gl_pnlBookInformation = new GroupLayout(pnlBookInformation);
		gl_pnlBookInformation.setHorizontalGroup(
			gl_pnlBookInformation.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlBookInformation.createSequentialGroup()
					.addGap(152)
					.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtSearchBook, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(lblNewLabel_1_1_1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
					.addGap(414))
				.addGroup(gl_pnlBookInformation.createSequentialGroup()
					.addGap(142)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(btnUpdate_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(btnDelete_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(619, Short.MAX_VALUE))
				.addGroup(gl_pnlBookInformation.createSequentialGroup()
					.addGap(38)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
					.addGap(36))
		);
		gl_pnlBookInformation.setVerticalGroup(
			gl_pnlBookInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlBookInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlBookInformation.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlBookInformation.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtSearchBook, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_pnlBookInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		
		tblBookList = new JTable(modelBookList) {
		public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};	
		tblBookList.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		tblBookList.setBackground(new Color(255, 255, 204));
		tblBookList.setFont(new Font("Arial", Font.PLAIN, 12));
		modelBookList.setColumnIdentifiers(columnBookList);
		booklist();
		tblBookList.getTableHeader().setResizingAllowed(false);
		tblBookList.getTableHeader().setReorderingAllowed(false); 
		scrollPane_2.setViewportView(tblBookList);
		pnlBookInformation.setLayout(gl_pnlBookInformation);
		
		JPanel pnlBookInvetory = new JPanel();
		pnlBookInvetory.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("BOOK INVENTORY", null, pnlBookInvetory, null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("BOOK STOCKS SECTION");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JButton btnAdd = new JButton("ADD STOCKS");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameAddBookStocks addstocks = new frameAddBookStocks();
				addstocks.setVisible(true);
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBorder(null);
		btnAdd.setBackground(new Color(51, 51, 255));
		
		JButton btnUpdateStocks = new JButton("UPDATE STOCKS");
		btnUpdateStocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameUpdateStocks updatestocks = new frameUpdateStocks();
				updatestocks.setVisible(true);
			}
		});
		btnUpdateStocks.setForeground(Color.WHITE);
		btnUpdateStocks.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdateStocks.setBorder(null);
		btnUpdateStocks.setBackground(new Color(51, 51, 255));
		
		txtSearchStocks = new JTextField();
		txtSearchStocks.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String stock = txtSearchStocks.getText();
				
					searchstock(stock);
			}
		});
		txtSearchStocks.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("SEARCH STOCK NO.");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_pnlBookInvetory = new GroupLayout(pnlBookInvetory);
		gl_pnlBookInvetory.setHorizontalGroup(
			gl_pnlBookInvetory.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlBookInvetory.createSequentialGroup()
					.addGap(78)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtSearchStocks, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(100)
					.addComponent(lblNewLabel_1_1_1_1, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(410))
				.addGroup(gl_pnlBookInvetory.createSequentialGroup()
					.addGap(34)
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
					.addGap(41))
				.addGroup(gl_pnlBookInvetory.createSequentialGroup()
					.addGap(154)
					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(btnUpdateStocks, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(488, Short.MAX_VALUE))
		);
		gl_pnlBookInvetory.setVerticalGroup(
			gl_pnlBookInvetory.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlBookInvetory.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlBookInvetory.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlBookInvetory.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtSearchStocks, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_pnlBookInvetory.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdateStocks, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		
		tblBookStocks = new JTable(modelBookStocks) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblBookStocks.setBorder(new MatteBorder(2, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		tblBookStocks.setBackground(new Color(255, 255, 204));
		tblBookStocks.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tblBookStocks.getTableHeader().setResizingAllowed(false);
		tblBookStocks.getTableHeader().setReorderingAllowed(false); 
		tblBookStocks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelBookStocks.setColumnIdentifiers(columnStocks);
		bookstocks();
		scrollPane_3.setViewportView(tblBookStocks);
		pnlBookInvetory.setLayout(gl_pnlBookInvetory);
		
		JPanel pnlManageBookAndReurnTransactions = new JPanel();
		pnlManageBookAndReurnTransactions.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE BORROWING & RETURN", null, pnlManageBookAndReurnTransactions, null);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_pnlManageBookAndReurnTransactions = new GroupLayout(pnlManageBookAndReurnTransactions);
		gl_pnlManageBookAndReurnTransactions.setHorizontalGroup(
			gl_pnlManageBookAndReurnTransactions.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlManageBookAndReurnTransactions.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlManageBookAndReurnTransactions.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlManageBookAndReurnTransactions.setVerticalGroup(
			gl_pnlManageBookAndReurnTransactions.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlManageBookAndReurnTransactions.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("RETURN TRANSACTIONS");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane scrollPane_5 = new JScrollPane();
		
		JButton btnApproveReturnRequest = new JButton("APPROVE RETURN REQUEST");
		btnApproveReturnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameReturnProcess returnprocess = new frameReturnProcess();
				returnprocess.setVisible(true);
			}
		});
		btnApproveReturnRequest.setForeground(Color.WHITE);
		btnApproveReturnRequest.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApproveReturnRequest.setBorder(null);
		btnApproveReturnRequest.setBackground(new Color(51, 51, 255));
		
		JLabel lblNewLabel_3_1 = new JLabel("SEARCH ID");
		lblNewLabel_3_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtSearchReturn = new JTextField();
		txtSearchReturn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String returnbook = txtSearchReturn.getText();
				
					searchreturn(returnbook);
			}
		});
		txtSearchReturn.setColumns(10);
		
		JLabel lblPenaltyCharged = new JLabel("");
		lblPenaltyCharged.setForeground(new Color(102, 51, 255));
		lblPenaltyCharged.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblPenaltyCharge = new JLabel("PENALTY COLLECTED");
		lblPenaltyCharge.setForeground(new Color(102, 51, 255));
		lblPenaltyCharge.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(84)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtSearchReturn, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(153)
					.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
					.addGap(409))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(172)
					.addComponent(btnApproveReturnRequest, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addGap(84)
					.addComponent(lblPenaltyCharge, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPenaltyCharged, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(502, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtSearchReturn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnApproveReturnRequest, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPenaltyCharged, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPenaltyCharge, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		tblreturn = new JTable(modelreturn) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};			
		tblreturn.getTableHeader().setResizingAllowed(false);
		tblreturn.getTableHeader().setReorderingAllowed(false); 
		tblreturn.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelreturn.setColumnIdentifiers(columnreturn);
		returndetails();
		tblreturn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tblreturn.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		tblreturn.setBackground(new Color(255, 255, 204));
		scrollPane_5.setViewportView(tblreturn);
		panel_1.setLayout(gl_panel_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("BORROWING TRANSACTION");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JButton btnApprove = new JButton("APPROVE BORROW REQUEST");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameApproveBorrow approveborrow = new frameApproveBorrow();
				approveborrow.setVisible(true);
			}
		});
		btnApprove.setForeground(Color.WHITE);
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApprove.setBorder(null);
		btnApprove.setBackground(new Color(51, 51, 255));
		
		txtBorrowTransaction = new JTextField();
		txtBorrowTransaction.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String borrow = txtBorrowTransaction.getText();
				
					searchborrow(borrow);
				
			}
		});
		txtBorrowTransaction.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SEARCH ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(102, 51, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(67)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtBorrowTransaction, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(251)
					.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(407))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(174)
					.addComponent(btnApprove, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(738, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBorrowTransaction, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnApprove, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		tblBorrow = new JTable(modelborrow) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};		
		tblBorrow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tblBorrow.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		tblBorrow.setBackground(new Color(255, 255, 204));
		tblBorrow.getTableHeader().setResizingAllowed(false);
		tblBorrow.getTableHeader().setReorderingAllowed(false); 
		tblBorrow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelborrow.setColumnIdentifiers(columnborrowdetails);
		borrow();
		scrollPane_4.setViewportView(tblBorrow);
		panel.setLayout(gl_panel);
		pnlManageBookAndReurnTransactions.setLayout(gl_pnlManageBookAndReurnTransactions);
		contentPane.setLayout(gl_contentPane);
	}

		private void search(String student) {
	
			TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelStudent);
				tblStudent.setRowSorter(sorter);
				sorter.setRowFilter(RowFilter.regexFilter(student));
}
		private void categories() {
			modelCat.addRow(category);
			modelCat.addRow(category1);
			modelCat.addRow(category2);
			modelCat.addRow(category3);
			modelCat.addRow(category4);
			modelCat.addRow(category5);
		}

			private void searchcat(String category) {
				
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelCat);
					tblCategories.setRowSorter(sorter);
					sorter.setRowFilter(RowFilter.regexFilter(category));
			}
			public static void booklist() {
				modelBookList.addRow(Book1);
				modelBookList.addRow(Book2);
				modelBookList.addRow(Book3);
				modelBookList.addRow(Book4);
				modelBookList.addRow(Book5);
				modelBookList.addRow(Book6);
				modelBookList.addRow(Book7);
				modelBookList.addRow(Book8);
				modelBookList.addRow(Book9);
				modelBookList.addRow(Book10);
			}
			private void bookstocks() {
				modelBookStocks.addRow(Stock1);
				modelBookStocks.addRow(Stock2);
				modelBookStocks.addRow(Stock3);
				modelBookStocks.addRow(Stock4);
				modelBookStocks.addRow(Stock5);
				modelBookStocks.addRow(Stock6);
				modelBookStocks.addRow(Stock7);
				modelBookStocks.addRow(Stock8);
				modelBookStocks.addRow(Stock9);
				modelBookStocks.addRow(Stock10);

			}
			private void students() {
				modelStudent.addRow(student1);
				modelStudent.addRow(student2);
				modelStudent.addRow(student3);

			}
			public static void borrow() {
				modelborrow.addRow(borrow1);
				modelborrow.addRow(borrow2);
				modelborrow.addRow(borrow3);
				modelborrow.addRow(borrow4);

			}
			public static void returndetails() {
				modelreturn.addRow(return1);
				modelreturn.addRow(return2);
				modelreturn.addRow(return3);


			}
			private void searchbook(String books) {
				
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelBookList);
					tblBookList.setRowSorter(sorter);
					sorter.setRowFilter(RowFilter.regexFilter(books));
			}
			

			private void searchstock(String stocks) {
				
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelBookStocks);
					tblBookStocks.setRowSorter(sorter);
					sorter.setRowFilter(RowFilter.regexFilter(stocks));
			}
			private void searchborrow(String borrow) {
				
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelborrow);
					tblBorrow.setRowSorter(sorter);
					sorter.setRowFilter(RowFilter.regexFilter(borrow));
		
			}
			private void searchreturn(String returnbook) {
				
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelreturn);
					tblreturn.setRowSorter(sorter);
					sorter.setRowFilter(RowFilter.regexFilter(returnbook));
	}
}