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
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameUpdateStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTable tblUpdate;
	private JComboBox<Object> cboCollege;
	private JComboBox<Object> cboCourse;
	
	private String[] CollegeList = { 
			"CEAS",
			"CBAA",
			"CCE",
			"CON"
		};


	public frameUpdateStudent() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE STUDENT RECORDS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(228, 22, 302, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastname = new JLabel("LASTNAME");
		lblLastname.setForeground(new Color(102, 51, 255));
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastname.setBounds(48, 101, 93, 28);
		contentPane.add(lblLastname);
		
		txtLastName = new JTextField();
		txtLastName.setEnabled(false);
		txtLastName.setColumns(10);
		txtLastName.setBounds(38, 125, 212, 37);
		contentPane.add(txtLastName);
		
		JLabel lblFirstname = new JLabel("FIRSTNAME");
		lblFirstname.setForeground(new Color(102, 51, 255));
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstname.setBounds(300, 101, 93, 28);
		contentPane.add(lblFirstname);
		
		txtFirstName = new JTextField();
		txtFirstName.setEnabled(false);
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(292, 125, 207, 37);
		contentPane.add(txtFirstName);
		
		JLabel lblMiddlename = new JLabel("MIDDLENAME");
		lblMiddlename.setForeground(new Color(102, 51, 255));
		lblMiddlename.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMiddlename.setBounds(542, 101, 93, 28);
		contentPane.add(lblMiddlename);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setEnabled(false);
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(533, 125, 200, 37);
		contentPane.add(txtMiddleName);
		
		JLabel lblCollege = new JLabel("COLLEGE");
		lblCollege.setForeground(new Color(102, 51, 255));
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCollege.setBounds(48, 181, 73, 28);
		contentPane.add(lblCollege);
		
		cboCollege = new JComboBox<Object>(CollegeList);
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
		cboCollege.setSelectedIndex(-1);
		cboCollege.setEnabled(false);
		cboCollege.setBounds(38, 209, 212, 37);
		contentPane.add(cboCollege);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setForeground(new Color(102, 51, 255));
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourse.setBounds(297, 181, 73, 28);
		contentPane.add(lblCourse);
		
		cboCourse = new JComboBox<Object>();
		cboCourse.setSelectedIndex(-1);
		cboCourse.setEnabled(false);
		cboCourse.setBounds(287, 209, 212, 37);
		contentPane.add(cboCourse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 268, 705, 169);
		contentPane.add(scrollPane);
		
		tblUpdate = new JTable(frameAdmin.modelStudent) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblUpdate.getSelectedRow();
				txtLastName.setText( frameAdmin.modelStudent.getValueAt(selectedRow, 1).toString());
				txtFirstName.setText(  frameAdmin.modelStudent.getValueAt(selectedRow, 2).toString());
				txtMiddleName.setText(  frameAdmin.modelStudent.getValueAt(selectedRow, 3).toString());
				cboCollege.setSelectedItem(frameAdmin.modelStudent.getValueAt(selectedRow, 4).toString());
				cboCourse.setSelectedItem(frameAdmin.modelStudent.getValueAt(selectedRow, 5).toString());
			}
		});
		
		tblUpdate.getTableHeader().setResizingAllowed(false);
		tblUpdate.getTableHeader().setReorderingAllowed(false); 
		tblUpdate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelStudent.setColumnIdentifiers(frameAdmin.columnstudent);
		scrollPane.setViewportView(tblUpdate);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newstudent();
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdate.setBorder(null);
		btnUpdate.setBackground(new Color(51, 51, 255));
		btnUpdate.setBounds(48, 448, 89, 28);
		contentPane.add(btnUpdate);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updaterow();
				clearfields();
				disabledfields();
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(51, 51, 255));
		btnSave.setBounds(157, 448, 89, 28);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameUpdateStudent.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(268, 448, 89, 28);
		contentPane.add(btnCancel);
	}

		private void updaterow() {
			int selectedRow = tblUpdate.getSelectedRow();
			frameAdmin.modelStudent.setValueAt(txtLastName.getText(), selectedRow,1);
			frameAdmin.modelStudent.setValueAt(txtFirstName.getText(), selectedRow,2);
			frameAdmin.modelStudent.setValueAt(txtMiddleName.getText(), selectedRow,3);
			frameAdmin.modelStudent.setValueAt(cboCollege.getSelectedItem(), selectedRow,4);
			frameAdmin.modelStudent.setValueAt(cboCourse.getSelectedItem(), selectedRow,5);
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
			tblUpdate.setEnabled(true);
}
		private void disabledfields() {
			txtLastName.setEnabled(false);
			txtFirstName.setEnabled(false);
			txtFirstName.setEnabled(false);
			txtMiddleName.setEnabled(false);
			cboCollege.setEnabled(false);
			cboCourse.setEnabled(false);
			tblUpdate.setEnabled(true);

		}
}
