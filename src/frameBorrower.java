

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frameBorrower extends JFrame {

	private JPanel contentPane;
	private JTable tblViewBooks;
	private JTextField txtSearch;
	
	private String[] approve = {
			"LATE",
			"ON TIME",
			
	};
	
	private static Object []avail1 = {"3000","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []avail2 = {"3001","1090466","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []avail3 = {"3003","1090465","9781118761915","3D VIDEO: FROM CAPTURE TO DIFUSSION","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","Laurent LucasCéline LoscosYannick Remion","11/10/13","GOOD"};
	private static Object []avail4 = {"3004","1090472","9781119788492","Humans in the Making: In the Beginning was Technique, Volume 4","PSYCHOLOGY","Michel J.F. Dubois","30/10/20","GOOD"};
	private static Object []avail5 = {"3005","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","GOOD"};
	private static Object []avail6 = {"3007","1090466","9781118180822","ADVANCED INTERNET PROTOCOLS","COMPUTER SCIENCE & INFORMATION TECHNOLOGY","EIJI OKIROBERTO ROJAS","20/03/12","GOOD"};
	private static Object []avail7 = {"3008","1090474","9781444325461","A History of Autism: Conversations with the Pioneers","PSYCHOLOGY","Adam Feinstein","14/06/10","GOOD"};
	private static Object []avail8 = {"3009","1090474","9781444325461","A History of Autism: Conversations with the Pioneers","PSYCHOLOGY","Adam Feinstein","14/06/10","GOOD"};
	
	public static DefaultTableModel modelavailble = new DefaultTableModel();
	public static String[] columnavailable = {"STOCK ID","BOOK ID.","ONLINE ISBN","TITLE","CATEGORY","AUTHOR","YEAR PUBLISHED","STATUS"};

	private int rid = 9345;
	private int id = 9346;
	private String[] BookCat = {
			"COMPUTER SCIENCE & INFORMATION TECHNOLOGY",
			"PSYCHOLOGY",
	};
	private JTextField txtAccountID;
	private JTextField txtName;
	private JComboBox cboID;
	private JComboBox cboCat;
	private JLabel lblBorrowID;
	private JLabel lblBookID;
	private JLabel lblTitle;
	private JLabel lblISBN;
	private JLabel lblAuthor;
	private JPanel panel;
	private JLabel lblPrice;
	private JDateChooser dateDue;
	private JDateChooser dateIssue;
	private JLabel lblStatus;
	private JTable tblBorrow;
	private JButton btnProcess;
	private JTextArea txtASummary;
	private JTable tblReturn;
	
	
	private Image img_logout = new ImageIcon(frameAdmin.class.getResource("image/logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_login2 = new ImageIcon(frameAdmin.class.getResource("image/login2.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_student = new ImageIcon(frameAdmin.class.getResource("image/student.png")).getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
	private Image img_lock = new ImageIcon(frameAdmin.class.getResource("image/lock.png")).getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
	private Image img_exit = new ImageIcon(frameAdmin.class.getResource("image/close.png")).getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
	private JTextField txtStudentID;
	private JTextField txtStudentName;
	private JTextField txtBookCategory;
	private JTextField txtBookStockID;
	private JTextField txtBooksID;
	private JTextField txtBookTItle;
	private JTextField txtONLINEISBN;
	private JTextField txtAuthors;
	private JTextField txtPrices;
	private JComboBox cbotype;
	private JTable tblbookreturn;
	private JLabel lblReturnID;
	private JLabel lblFee;
	private JButton btnNewReturn;
	private JDateChooser dateDueR;
	private JDateChooser dateIssueR;

	
	
	
	
	public frameBorrower() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 803);
		contentPane = new JPanel();
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 12));
		tabbedPane.setForeground(new Color(102, 51, 255));
		tabbedPane.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
		);
		
		JPanel pnlManageAccount = new JPanel();
		pnlManageAccount.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("MANAGE STUDENT ACCOUNT", null, pnlManageAccount, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_5_1 = new JPanel();
		
		JPanel panel_5_2 = new JPanel();
		
		JPanel panel_5_3 = new JPanel();
		GroupLayout gl_pnlManageAccount = new GroupLayout(pnlManageAccount);
		gl_pnlManageAccount.setHorizontalGroup(
			gl_pnlManageAccount.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlManageAccount.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_pnlManageAccount.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(panel_5_2, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
					.addGap(37)
					.addGroup(gl_pnlManageAccount.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(panel_5_3, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
					.addGap(30))
		);
		gl_pnlManageAccount.setVerticalGroup(
			gl_pnlManageAccount.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
				.addGroup(gl_pnlManageAccount.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addGroup(gl_pnlManageAccount.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5_1, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_pnlManageAccount.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5_2, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5_3, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
					.addGap(51))
		);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("PENDING TRANSACTIONS");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("0");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 76));
		GroupLayout gl_panel_5_3 = new GroupLayout(panel_5_3);
		gl_panel_5_3.setHorizontalGroup(
			gl_panel_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(45)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(134)
					.addComponent(lblNewLabel_5_1_1_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(104))
		);
		gl_panel_5_3.setVerticalGroup(
			gl_panel_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_3.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_3.setLayout(gl_panel_5_3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("0");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 76));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("BORROWED BOOKS");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel_5_2 = new GroupLayout(panel_5_2);
		gl_panel_5_2.setHorizontalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_4_1_1, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
					.addGap(37))
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(123)
					.addComponent(lblNewLabel_5_1_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(115))
		);
		gl_panel_5_2.setVerticalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_2.setLayout(gl_panel_5_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("BOOK RETURNED");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5_1 = new JLabel("0");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 76));
		GroupLayout gl_panel_5_1 = new GroupLayout(panel_5_1);
		gl_panel_5_1.setHorizontalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
					.addGap(28))
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(132)
					.addComponent(lblNewLabel_5_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(106))
		);
		gl_panel_5_1.setVerticalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5_1.setLayout(gl_panel_5_1);
		
		JLabel lblNewLabel_4 = new JLabel("BOOKS AVAILABLE");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_5 = new JLabel("8");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 76));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
					.addGap(37))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(122))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel lblStudentICon = new JLabel("");
		lblStudentICon.setBounds(67, 82, 214, 135);
		lblStudentICon.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentICon.setIcon(new ImageIcon(img_student));
		
		JLabel lblNewLabel = new JLabel("PROFILE");
		lblNewLabel.setBounds(109, 52, 136, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setBounds(112, 223, 126, 24);
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(56, 323, 61, 60);
		lblLogin.setIcon(new ImageIcon(img_login2));
		
		JLabel lblLogot = new JLabel("");
		lblLogot.setBounds(48, 401, 69, 57);
		lblLogot.setIcon(new ImageIcon(img_logout));
		
		JLabel lblchangepass = new JLabel("");
		lblchangepass.setBounds(279, 515, 77, 57);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentLogin login = new StudentLogin();
				login.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(159, 339, 86, 27);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					tabbedPane.setEnabled(false);
					btnLogout.setEnabled(false);
					btnNewButton.setEnabled(true);
					
				}
			}
		});
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(159, 415, 86, 27);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogout.setBorder(null);
		
		JLabel lblExit = new JLabel("");
		lblExit.setBounds(55, 515, 69, 57);
		lblExit.setIcon(new ImageIcon(img_exit));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.setLayout(null);
		panel_3.add(lblLogin);
		panel_3.add(lblLogot);
		panel_3.add(lblExit);
		panel_3.add(lblchangepass);
		panel_3.add(btnLogout);
		panel_3.add(btnNewButton);
		panel_3.add(lblStudentICon);
		panel_3.add(lblNewLabel);
		panel_3.add(lblStudent);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameBorrower.this.dispose();
				}
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBorder(null);
		btnExit.setBounds(147, 528, 134, 27);
		panel_3.add(btnExit);
		pnlManageAccount.setLayout(gl_pnlManageAccount);
		
		JPanel pnlView = new JPanel();
		pnlView.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("VIEW AVAILABLE BOOKS", null, pnlView, null);
		
		JLabel lblAvailBooks = new JLabel("AVAILABLE BOOKS");
		lblAvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailBooks.setForeground(new Color(102, 51, 255));
		lblAvailBooks.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBackground(new Color(255, 255, 204));
		
		JLabel lblSearch = new JLabel("SEARCH");
		lblSearch.setForeground(new Color(51, 51, 255));
		lblSearch.setFont(new Font("Arial", Font.PLAIN, 12));
		
		txtSearch = new JTextField();
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String query = txtSearch.getText();
				
				filter(query);
			}
		});
		txtSearch.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		txtSearch.setColumns(10);
		GroupLayout gl_pnlView = new GroupLayout(pnlView);
		gl_pnlView.setHorizontalGroup(
			gl_pnlView.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlView.createSequentialGroup()
					.addGap(63)
					.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(203)
					.addComponent(lblAvailBooks, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addGap(458))
				.addGroup(gl_pnlView.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnlView.setVerticalGroup(
			gl_pnlView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlView.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_pnlView.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlView.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlView.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblAvailBooks, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 677, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		
		tblViewBooks = new JTable(modelavailble) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblViewBooks.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		tblViewBooks.setBackground(new Color(255, 255, 204));
		tblViewBooks.getTableHeader().setResizingAllowed(false);
		tblViewBooks.getTableHeader().setReorderingAllowed(false); 
		tblViewBooks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelavailble.setColumnIdentifiers(columnavailable);
		available();
		scrollPane.setViewportView(tblViewBooks);
		pnlView.setLayout(gl_pnlView);
		
		JPanel pnlIssueBook = new JPanel();
		pnlIssueBook.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("ISSUE BOOK", null, pnlIssueBook, null);
		
		panel = new JPanel();
		
		txtASummary = new JTextArea();
		txtASummary.setDisabledTextColor(new Color(0, 0, 0));
		txtASummary.setEditable(false);
		
		JLabel lblNewLabel_2_1 = new JLabel("BORROW DETAILS");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_pnlIssueBook = new GroupLayout(pnlIssueBook);
		gl_pnlIssueBook.setHorizontalGroup(
			gl_pnlIssueBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlIssueBook.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnlIssueBook.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlIssueBook.createSequentialGroup()
							.addGap(24)
							.addComponent(txtASummary, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_pnlIssueBook.createSequentialGroup()
							.addGap(158)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE)
							.addGap(122))))
		);
		gl_pnlIssueBook.setVerticalGroup(
			gl_pnlIssueBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlIssueBook.createSequentialGroup()
					.addGroup(gl_pnlIssueBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlIssueBook.createSequentialGroup()
							.addGap(26)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
						.addGroup(gl_pnlIssueBook.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtASummary, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
							.addGap(98)))
					.addContainerGap())
		);
		
		JLabel lblNewLabel_2 = new JLabel("ISSUE BOOK");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("BORROW ID:");
		lblNewLabel_3.setForeground(new Color(102, 51, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblBorrowID = new JLabel("");
		lblBorrowID.setForeground(new Color(102, 51, 255));
		lblBorrowID.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1 = new JLabel("STUDENT  ID:");
		lblNewLabel_3_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtAccountID = new JTextField();
		txtAccountID.setEnabled(false);
		txtAccountID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setEnabled(false);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("STUDENT NAME:");
		lblNewLabel_3_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("CATEGORY:");
		lblNewLabel_3_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		cboCat = new JComboBox<Object>(BookCat);
		cboCat.setEnabled(false);
		cboCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Select = cboCat.getSelectedIndex();
					if(Select == 0) {
						cboID.removeAllItems();
						cboID.addItem("3000");
						cboID.addItem("3001");
						cboID.addItem("3003");
						cboID.addItem("3005");
						cboID.addItem("3007");

					}else if (Select == 1) {
						cboID.removeAllItems();
						cboID.addItem("3004");
						cboID.addItem("3008");
						cboID.addItem("3009");


				}
			}
		});
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("STOCK ID:");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		cboID = new JComboBox();
		cboID.setEnabled(false);
		cboID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cboID.getSelectedItem() == "3000") {
					lblBookID.setText("1090465");
					lblTitle.setText("3D VIDEO: FROM CAPTURE TO DIFUSSION");
					lblISBN.setText("9781118761915");
					lblAuthor.setText("Laurent LucasCéline LoscosYannick Remion");
					lblPrice.setText("250");
					lblStatus.setText("PENDING");
				}else if(cboID.getSelectedItem() == "3001") {
					lblBookID.setText("1090465");
					lblTitle.setText("3D VIDEO: FROM CAPTURE TO DIFUSSION");
					lblISBN.setText("9781118761915");
					lblAuthor.setText("Laurent LucasCéline LoscosYannick Remion");
					lblPrice.setText("250");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3003") {
					lblBookID.setText("1090465");
					lblTitle.setText("3D VIDEO: FROM CAPTURE TO DIFUSSION");
					lblISBN.setText("9781118761915");
					lblAuthor.setText("Laurent LucasCéline LoscosYannick Remion");
					lblPrice.setText("250");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3005") {
					lblBookID.setText("1090466");
					lblTitle.setText("ADVANCED INTERNET PROTOCOLS");
					lblISBN.setText("9781118180822");
					lblAuthor.setText("EIJI OKIROBERTO ROJAS");
					lblPrice.setText("230");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3007") {
					lblBookID.setText("1090466");
					lblTitle.setText("ADVANCED INTERNET PROTOCOLS");
					lblISBN.setText("9781118180822");
					lblAuthor.setText("EIJI OKIROBERTO ROJAS");
					lblPrice.setText("230");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3004") {
					lblBookID.setText("1090472");
					lblTitle.setText("Humans in the Making: In the Beginning was Technique, Volume 4");
					lblISBN.setText("9781119788492");
					lblAuthor.setText("Michel J.F. Dubois");
					lblPrice.setText("350");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3008") {
					lblBookID.setText("1090474");
					lblTitle.setText("A History of Autism: Conversations with the Pioneers");
					lblISBN.setText("9781444325461");
					lblAuthor.setText("Michel J.F. Dubois");
					lblPrice.setText("245");
					lblStatus.setText("PENDING");	
				}else if(cboID.getSelectedItem() == "3009") {
					lblBookID.setText("1090474");
					lblTitle.setText("A History of Autism: Conversations with the Pioneers");
					lblISBN.setText("9781444325461");
					lblAuthor.setText("Michel J.F. Dubois");
					lblPrice.setText("245");
					lblStatus.setText("PENDING");	
				}
			}
		});
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("BOOK ID:");
		lblNewLabel_3_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblBookID = new JLabel("");
		lblBookID.setForeground(new Color(102, 51, 255));
		lblBookID.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("BOOK TITLE");
		lblNewLabel_3_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblTitle = new JLabel("");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("ONLINE ISBN:");
		lblNewLabel_3_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblISBN = new JLabel("");
		lblISBN.setForeground(new Color(102, 51, 255));
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("AUTHOR:");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblAuthor = new JLabel("");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1 = new JLabel("PRICE:");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblPrice = new JLabel("");
		lblPrice.setForeground(new Color(102, 51, 255));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1_1 = new JLabel("ISSUE DATE:");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		dateIssue = new JDateChooser();
		dateIssue.getCalendarButton().setEnabled(false);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("DUE DATE:");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		dateDue = new JDateChooser();
		dateDue.getCalendarButton().setEnabled(false);
		
		btnProcess = new JButton("PROCESS");
		btnProcess.setEnabled(false);
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String selectedDate =  dateFormat.format(dateIssue.getDate());
					
				   DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
					String selectedDate1 =  dateFormat1.format(dateDue.getDate());
					Object[] rowData = new Object[13];
					rowData[0] = lblBorrowID.getText();
					rowData[1] = txtAccountID.getText();
					rowData[2] = txtName.getText();
					rowData[3] = cboID.getSelectedItem();
					rowData[4] = lblBookID.getText();
					rowData[5] = lblISBN.getText();
					rowData[6] = lblTitle.getText();
					rowData[7] = cboCat.getSelectedItem();
					rowData[8] = lblAuthor.getText();
					rowData[9] = selectedDate;
					rowData[10] = selectedDate1;
					rowData[11] = lblPrice.getText();
					rowData[12] = lblStatus.getText();
					
					frameAdmin.modelborrow.addRow(rowData);
					
					btnProcess.setEnabled(false);
					txtAccountID.setEnabled(false);
					txtName.setEnabled(false);
					cboID.setEnabled(false);
					cboCat.setEnabled(false);
					dateDue.getCalendarButton().setEnabled(false);
					dateIssue.getCalendarButton().setEnabled(false);

					txtASummary.setText("\t\t\tWELCOME TO E-LIBRARY" + "\n\nBORROW ID:\t" + lblBorrowID.getText() + "\n\nACCOUNT ID:\t" + txtAccountID.getText() + "\n\nBORROWER NAME:\t" + txtName.getText() + "\n\nSTOCK ID:\t" + cboID.getSelectedItem()
							+ "\n\nBOOK ID:\t" + lblBookID.getText() + "\n\nONLINE ISBN:\t" + lblISBN.getText() + "\n\nTITLE:\t" + lblTitle.getText() + "\n\nCATEGORY:\t" + cboCat.getSelectedItem() + "\n\nISSUE DATE:\t" + selectedDate + "\nnDUE DATE:\t" + selectedDate1 +
							   "\n\nSTATUS:\t"+ lblStatus.getText() + "\n\n=================================================================================================" + "\n\n\nPRICE:\t"  + lblPrice.getText());
					JOptionPane.showMessageDialog(contentPane, "BORROW REQUEST HAS BEEN SUCCESSFLULY PROCESSED!");
					JOptionPane.showMessageDialog(contentPane, "PLEASE WAIT FOR THE ADMIN TO APPROVE YOU REQUEST", "MESSAGE", JOptionPane.INFORMATION_MESSAGE );
			}
		});
		btnProcess.setBackground(new Color(51, 51, 255));
		btnProcess.setBorder(null);
		btnProcess.setForeground(new Color(255, 255, 255));
		btnProcess.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBorder(null);
		btnClear.setBackground(new Color(51, 51, 255));
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_2 = new JLabel("BORROW STATUS:");
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblStatus = new JLabel("");
		lblStatus.setForeground(new Color(102, 51, 255));
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled();
				lblBorrowID.setText(String.valueOf(id));
				id++;
				
			}
		});
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNew.setBorder(null);
		btnNew.setBackground(new Color(51, 51, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(218)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addGap(231))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(dateIssue, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addGap(35)
								.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(dateDue, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
									.addGap(385))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblISBN, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(6)
														.addComponent(lblAuthor, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel_3_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblBookID, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(cboID, 0, 361, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(cboCat, 0, 0, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtAccountID, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblBorrowID, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
										.addGap(180)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(365))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(330)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnProcess, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(167, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBorrowID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addGap(18, 18, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(cboCat, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(cboID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_3_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblISBN, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAuthor, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(dateIssue, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(dateDue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_1_1_1_1_1_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnProcess, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addGap(31))
		);
		panel.setLayout(gl_panel);
		pnlIssueBook.setLayout(gl_pnlIssueBook);
		
		JPanel pnlReturn = new JPanel();
		pnlReturn.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("RETURN BOOK", null, pnlReturn, null);
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		GroupLayout gl_pnlReturn = new GroupLayout(pnlReturn);
		gl_pnlReturn.setHorizontalGroup(
			gl_pnlReturn.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlReturn.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_pnlReturn.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1098, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlReturn.setVerticalGroup(
			gl_pnlReturn.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlReturn.createSequentialGroup()
					.addGap(59)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(20))
		);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(26)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(25)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		
		tblbookreturn = new JTable(frameAdmin.modelreturn) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
				}
			};

		frameAdmin.modelreturn.setColumnIdentifiers(frameAdmin.columnreturn);
		
		tblbookreturn.getTableHeader().setResizingAllowed(false);
		tblbookreturn.getTableHeader().setReorderingAllowed(false); 
		scrollPane_2.setViewportView(tblbookreturn);
		panel_4.setLayout(gl_panel_4);
		
		JLabel lblReturn = new JLabel("RETURN BOOK");
		lblReturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturn.setForeground(new Color(102, 51, 255));
		lblReturn.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblNewLabel_3_2 = new JLabel("RETURN ID:");
		lblNewLabel_3_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblReturnID = new JLabel("");
		lblReturnID.setForeground(new Color(102, 51, 255));
		lblReturnID.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_2 = new JLabel("STUDENT  ID:");
		lblNewLabel_3_1_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtStudentID = new JTextField();
		txtStudentID.setEnabled(false);
		txtStudentID.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("STUDENT NAME:");
		lblNewLabel_3_1_1_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtStudentName = new JTextField();
		txtStudentName.setEnabled(false);
		txtStudentName.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("CATEGORY:");
		lblNewLabel_3_1_1_2_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_2_1_1 = new JLabel("STOCK ID:");
		lblNewLabel_3_1_1_2_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_2_1_1_1 = new JLabel("BOOK ID:");
		lblNewLabel_3_1_1_2_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtBookCategory = new JTextField();
		txtBookCategory.setEnabled(false);
		txtBookCategory.setColumns(10);
		
		txtBookStockID = new JTextField();
		txtBookStockID.setEnabled(false);
		txtBookStockID.setColumns(10);
		
		txtBooksID = new JTextField();
		txtBooksID.setEnabled(false);
		txtBooksID.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1 = new JLabel("BOOK TITLE:");
		lblNewLabel_3_1_1_2_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtBookTItle = new JTextField();
		txtBookTItle.setEnabled(false);
		txtBookTItle.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1 = new JLabel("ONLINE ISBN:");
		lblNewLabel_3_1_1_2_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtONLINEISBN = new JTextField();
		txtONLINEISBN.setEnabled(false);
		txtONLINEISBN.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1 = new JLabel("AUTHOR:");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtAuthors = new JTextField();
		txtAuthors.setEnabled(false);
		txtAuthors.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1_1 = new JLabel("PRICE");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtPrices = new JTextField();
		txtPrices.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1 = new JLabel("ISSUE DATE:");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_1 = new JLabel("DATE RETURNED");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2 = new JLabel("TYPE OF RETURN:");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		cbotype = new JComboBox<Object>(approve);
		cbotype.setSelectedIndex(-1);
		cbotype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbotype.getSelectedItem() == "LATE") {
					lblFee.setText("10");
				}else if (cbotype.getSelectedItem() == "ON TIME") {
					lblFee.setText("");
				}
			}
		});
			
		
		JLabel lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2_1 = new JLabel("PENALTY FEE:");
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblFee = new JLabel("");
		lblFee.setForeground(new Color(102, 51, 255));
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton_1 = new JButton("RETURN BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String selectedissue =  dateFormat.format(dateIssueR.getDate());
					
			DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
					String selectedR =  dateFormat1.format(dateDueR.getDate());
				
				
				Object[] rowData = new Object[14];
				rowData[0] = lblReturnID.getText();
				rowData[1] = txtStudentID.getText();
				rowData[2] = txtStudentName.getText();
				rowData[3] = txtBookStockID.getText();
				rowData[4] = txtBooksID.getText();
				rowData[5] = txtONLINEISBN.getText();
				rowData[6] = txtBookTItle.getText();
				rowData[7] = txtBookCategory.getText();
				rowData[8] = txtAuthors.getText();
				rowData[9] = selectedissue;
				rowData[10] = selectedR;
				rowData[11] = txtPrices.getText();
				rowData[12] = cbotype.getSelectedItem();
				rowData[13] = lblFee.getText();
				frameAdmin.modelreturn.addRow(rowData);
				
				clearReturn();
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(51, 51, 255));
		btnNewButton_1.setBorder(null);
		
		btnNewReturn = new JButton("NEW");
		btnNewReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				active();
				lblReturnID.setText(String.valueOf(rid));
				rid++;
				
				
			}
		});
		btnNewReturn.setForeground(Color.WHITE);
		btnNewReturn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewReturn.setBorder(null);
		btnNewReturn.setBackground(new Color(51, 51, 255));
		
		dateIssueR = new JDateChooser();
		dateIssueR.getCalendarButton().setEnabled(false);
		
		dateDueR = new JDateChooser();
		dateDueR.getCalendarButton().setEnabled(false);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(475)
					.addComponent(lblReturn, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addGap(427))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblReturnID, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(txtStudentID, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(txtStudentName, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_2.createSequentialGroup()
										.addComponent(lblNewLabel_3_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtBookStockID, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_2.createSequentialGroup()
										.addComponent(lblNewLabel_3_1_1_2_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtBookCategory, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))))
							.addGap(40)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateIssueR, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateDueR, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPrices, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtAuthors, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtONLINEISBN, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cbotype, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_3_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtBooksID, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)))
					.addGap(33))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel_3_1_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtBookTItle, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(614, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(91)
					.addComponent(btnNewReturn, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(665, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtONLINEISBN, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblReturn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblReturnID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGap(7)
											.addComponent(lblNewLabel_3_1_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtStudentID, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
					.addGap(12)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_3_1_1_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGap(1)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtStudentName, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
						.addComponent(txtAuthors, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_1_1_2_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBookCategory, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBookStockID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBooksID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_1_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBookTItle, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtPrices, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(dateIssueR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
									.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
									.addComponent(dateDueR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbotype, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1_1_2_1_1_1_1_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
					.addGap(16)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewReturn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		pnlReturn.setLayout(gl_pnlReturn);
		
		JPanel pnlViewTransaction = new JPanel();
		pnlViewTransaction.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("VIEW TRANSACTIONS", null, pnlViewTransaction, null);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("TRANSACTION HISTORY");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JPanel panel_1_1 = new JPanel();
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RETURN DETAILS");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGap(30)
					.addComponent(scrollPane_1_1, GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGap(426)
					.addComponent(lblNewLabel_1_1_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(428))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		tblReturn = new JTable(frameAdmin.modelreturn) {
		public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};	
		tblReturn.setBackground(new Color(255, 255, 204));
		frameAdmin.modelreturn.setColumnIdentifiers(frameAdmin.columnreturn);
		frameAdmin.returndetails();
		tblReturn.getTableHeader().setResizingAllowed(false);
		tblReturn.getTableHeader().setReorderingAllowed(false); 
		scrollPane_1_1.setViewportView(tblReturn);
		panel_1_1.setLayout(gl_panel_1_1);
		GroupLayout gl_pnlViewTransaction = new GroupLayout(pnlViewTransaction);
		gl_pnlViewTransaction.setHorizontalGroup(
			gl_pnlViewTransaction.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlViewTransaction.createSequentialGroup()
					.addGap(451)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(431))
				.addGroup(gl_pnlViewTransaction.createSequentialGroup()
					.addGap(18)
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_pnlViewTransaction.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
					.addGap(18))
		);
		gl_pnlViewTransaction.setVerticalGroup(
			gl_pnlViewTransaction.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlViewTransaction.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
					.addGap(28))
		);
		
		JLabel lblNewLabel_1_1 = new JLabel("BORROW DETAILS");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(438)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addGap(416))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(30)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
					.addGap(22))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		tblBorrow = new JTable(frameAdmin.modelborrow) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};		
		tblBorrow.setBackground(new Color(255, 255, 204));
		tblBorrow.getTableHeader().setResizingAllowed(false);
		tblBorrow.getTableHeader().setReorderingAllowed(false); 
		tblBorrow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelborrow.setColumnIdentifiers(frameAdmin.columnborrowdetails);
		frameAdmin.borrow();
		scrollPane_1.setViewportView(tblBorrow);
		panel_1.setLayout(gl_panel_1);
		pnlViewTransaction.setLayout(gl_pnlViewTransaction);
		contentPane.setLayout(gl_contentPane);
	}
		private void filter(String query) {
		
			TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(frameAdmin.modelBookList);
				tblViewBooks.setRowSorter(sorter);
				sorter.setRowFilter(RowFilter.regexFilter(query));
	}
		private void available() {
			modelavailble.addRow(avail1);
			modelavailble.addRow(avail2);
			modelavailble.addRow(avail4);
			modelavailble.addRow(avail5);
			modelavailble.addRow(avail6);
			modelavailble.addRow(avail7);
			modelavailble.addRow(avail8);


			
		}
		private void enabled() {
			btnProcess.setEnabled(true);
			txtAccountID.setEnabled(true);
			txtName.setEnabled(true);
			cboID.setEnabled(true);
			cboCat.setEnabled(true);
			dateDue.getCalendarButton().setEnabled(true);
			dateIssue.getCalendarButton().setEnabled(true);

		}
		private void clear() {
			lblBorrowID.setText("");
			txtAccountID.setText("");
			txtName.setText("");
			cboID.setSelectedIndex(-1);
			lblBookID.setText("");
			lblISBN.setText("");
			lblTitle.setText("");
			cboCat.setSelectedIndex(-1);
			lblAuthor.setText("");
			lblPrice.setText("");
			lblStatus.setText("");
			txtASummary.setText("");
		}
		private void active() {
			lblReturnID.setEnabled(true);
			txtStudentID.setEnabled(true);
			txtStudentName.setEnabled(true);
			txtBookStockID.setEnabled(true);
			txtBooksID.setEnabled(true);
			txtONLINEISBN.setEnabled(true);
			txtBookTItle.setEnabled(true);
			txtBookCategory.setEnabled(true);
			txtAuthors.setEnabled(true);
			dateIssueR.getCalendarButton().setEnabled(true);
			dateDueR.getCalendarButton().setEnabled(true);
		}
		private void clearReturn() {
			lblReturnID.setText("");
			txtStudentID.setText("");
			txtStudentName.setText("");
			txtBookStockID.setText("");
			txtBooksID.setText("");
			txtONLINEISBN.setText("");
			txtBookTItle.setText("");
			txtBookCategory.setText("");
			txtAuthors.setText("");
			lblFee.setText("");
			cbotype.setSelectedIndex(-1);
			
		}
}
