import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

public class frameAddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;

	public static int id = 2000200;
	
	private String[] CollegeList = { 
			"CEAS",
			"CBAA",
			"CCE",
			"CON"
		};
	
	private String[] assignuser = { 
			"ADMIN",
			"BORROWER"
		};
	private JComboBox cboCollege;
	private JComboBox cboCourse;
	public static JLabel lblID;
	private JTable tblAddStudent;
	private JComboBox cboassign;
	private JTextField txtUsername;
	private JTextField txtPassword;

	public frameAddStudent() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 539);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD NEW STUDENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(307, 25, 195, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentid = new JLabel("STUDENT ID:");
		lblStudentid.setForeground(new Color(102, 51, 255));
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentid.setBounds(41, 64, 93, 43);
		contentPane.add(lblStudentid);
		
		lblID = new JLabel("");
		lblID.setForeground(new Color(102, 51, 255));
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(145, 64, 93, 43);
		contentPane.add(lblID);
		
		JLabel lblLastname = new JLabel("LASTNAME");
		lblLastname.setForeground(new Color(102, 51, 255));
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastname.setBounds(51, 105, 93, 28);
		contentPane.add(lblLastname);
		
		txtLastName = new JTextField();
		txtLastName.setEnabled(false);
		txtLastName.setBounds(41, 129, 212, 37);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setEnabled(false);
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(295, 129, 207, 37);
		contentPane.add(txtFirstName);
		
		JLabel lblFirstname = new JLabel("FIRSTNAME");
		lblFirstname.setForeground(new Color(102, 51, 255));
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstname.setBounds(303, 105, 93, 28);
		contentPane.add(lblFirstname);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setEnabled(false);
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(536, 129, 200, 37);
		contentPane.add(txtMiddleName);
		
		JLabel lblMiddlename = new JLabel("MIDDLENAME");
		lblMiddlename.setForeground(new Color(102, 51, 255));
		lblMiddlename.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMiddlename.setBounds(545, 105, 93, 28);
		contentPane.add(lblMiddlename);
		
		JLabel lblCollege = new JLabel("COLLEGE");
		lblCollege.setForeground(new Color(102, 51, 255));
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCollege.setBounds(51, 185, 73, 28);
		contentPane.add(lblCollege);
		
		cboCollege = new JComboBox<Object>(CollegeList);
		cboCollege.setSelectedIndex(-1);
		cboCollege.setEnabled(false);
		cboCollege.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Select = cboCollege.getSelectedIndex();
				
				if (Select == 0) { 
					cboCourse.removeAllItems();
					cboCourse.addItem("BSEED"); 
					cboCourse.addItem("BSSED"); 
					cboCourse.addItem("BSPSY"); 
				}else if (Select == 1) { 
					cboCourse.removeAllItems();
					cboCourse.addItem("BSA"); 
					cboCourse.addItem("BSBA");
				}else if (Select == 2) { 
					cboCourse.removeAllItems();
					cboCourse.addItem("BSCS");
					cboCourse.addItem("BSCPE"); 
					cboCourse.addItem("BSECE"); 
					cboCourse.addItem("BSIE"); 
					cboCourse.addItem("BSIT");
				}else if (Select == 3) { 
					cboCourse.removeAllItems();
					cboCourse.addItem("BSN");
					
				 	}
			}
		});
		cboCollege.setBounds(41, 213, 212, 37);
		contentPane.add(cboCollege);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setForeground(new Color(102, 51, 255));
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourse.setBounds(300, 185, 73, 28);
		contentPane.add(lblCourse);
		
		cboCourse = new JComboBox<Object>();
		cboCourse.setSelectedIndex(-1);
		cboCourse.setEnabled(false);
		cboCourse.setBounds(290, 213, 212, 37);
		contentPane.add(cboCourse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 320, 705, 169);
		contentPane.add(scrollPane);
		
		tblAddStudent = new JTable(frameAdmin.modelStudent) {
		public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};
		frameAdmin.modelStudent.setColumnIdentifiers(frameAdmin.columnstudent);
		tblAddStudent.getTableHeader().setResizingAllowed(false);
		tblAddStudent.getTableHeader().setReorderingAllowed(false); 
		scrollPane.setViewportView(tblAddStudent);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtLastName.getText().isEmpty() || txtFirstName.getText().isEmpty() || txtMiddleName.getText().isEmpty()){
					JOptionPane.showMessageDialog(contentPane, "Please Fillup all fields");
					clearfields();
				}else {
					Object[] rowData = new Object [9];
					
					rowData[0] = lblID.getText().toUpperCase();
					rowData[1] = txtLastName.getText().toUpperCase();
					rowData[2] = txtFirstName.getText().toUpperCase();
					rowData[3] = txtMiddleName.getText().toUpperCase();
					rowData[4] = cboCollege.getSelectedItem();
					rowData[5] = cboCourse.getSelectedItem();
					rowData[6] = txtUsername.getText();
					rowData[7] = txtPassword.getText();
					rowData[8] = cboassign.getSelectedItem();
					
					
					
					frameAdmin.modelStudent.addRow(rowData);
					clearfields();
					disabledfields();
				}
			}
		});
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBackground(new Color(51, 51, 255));
		btnAdd.setBorder(null);
		btnAdd.setBounds(160, 500, 89, 28);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameAddStudent.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(271, 500, 89, 28);
		contentPane.add(btnCancel);
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newstudent();
				lblID.setText(String.valueOf(id));
			    id++;
			}
		});
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Arial", Font.BOLD, 12));
		btnNew.setBorder(null);
		btnNew.setBackground(new Color(51, 51, 255));
		btnNew.setBounds(51, 500, 89, 28);
		contentPane.add(btnNew);
		
		JLabel lblAssignAs = new JLabel("ASSIGN AS:");
		lblAssignAs.setForeground(new Color(102, 51, 255));
		lblAssignAs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAssignAs.setBounds(546, 177, 73, 28);
		contentPane.add(lblAssignAs);
		
		cboassign = new JComboBox<Object>(assignuser);
		cboassign.setSelectedIndex(-1);
		cboassign.setBounds(536, 213, 200, 29);
		contentPane.add(cboassign);
		
		txtUsername = new JTextField();
		txtUsername.setEnabled(false);
		txtUsername.setColumns(10);
		txtUsername.setBounds(41, 272, 212, 37);
		contentPane.add(txtUsername);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(new Color(102, 51, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(51, 248, 93, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPasword = new JLabel("PASWORD");
		lblPasword.setForeground(new Color(102, 51, 255));
		lblPasword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPasword.setBounds(303, 248, 93, 28);
		contentPane.add(lblPasword);
		
		txtPassword = new JTextField();
		txtPassword.setEnabled(false);
		txtPassword.setColumns(10);
		txtPassword.setBounds(295, 272, 207, 37);
		contentPane.add(txtPassword);
	}
	private void clearfields() {
		txtLastName.setText("");
		txtFirstName.setText("");
		txtMiddleName.setText("");
		cboCollege.setSelectedItem(-1);
		cboCourse.setSelectedItem(-1);
	}
		private void newstudent() {
			txtLastName.setEnabled(true);
			txtFirstName.setEnabled(true);
			txtFirstName.setEnabled(true);
			txtMiddleName.setEnabled(true);
			cboCollege.setEnabled(true);
			cboCourse.setEnabled(true);
			txtUsername.setEnabled(true);
			txtPassword.setEnabled(true);
	}
		private void disabledfields() {
			txtLastName.setEnabled(false);
			txtFirstName.setEnabled(false);
			txtFirstName.setEnabled(false);
			txtMiddleName.setEnabled(false);
			cboCollege.setEnabled(false);
			cboCourse.setEnabled(false);
			txtUsername.setEnabled(false);
			txtPassword.setEnabled(false);
			
}
}
