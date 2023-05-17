import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameApproveBorrow extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccount;
	private JTextField txtName;
	private JTextField txtStockID;
	private JTextField txtBookID;
	private JTextField txtISBN;
	private JTextField txtTitle;
	private JTextField txtCategory;
	private JTextField txtIssueDate;
	private JTextField txtDue;
	private JTextField txtPrice;
	private JTable tblApprove;
	private JComboBox cboApprove;
	private JTextField txtAuthor;

	private String[] approve = {
			"APPROVED",
			"PENDING",
	};
	private JLabel lblBorrowID;

	public frameApproveBorrow() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 500);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("APPROVE BORROW REQUEST");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(333, 11, 340, 36);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("BORROWER ID:");
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(44, 58, 97, 36);
		contentPane.add(lblNewLabel);
		
		lblBorrowID = new JLabel("");
		lblBorrowID.setForeground(new Color(102, 51, 255));
		lblBorrowID.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBorrowID.setBounds(151, 58, 97, 36);
		contentPane.add(lblBorrowID);
		
		JLabel lblAccountId = new JLabel("ACCOUNT ID");
		lblAccountId.setForeground(new Color(102, 51, 255));
		lblAccountId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccountId.setBounds(54, 105, 97, 25);
		contentPane.add(lblAccountId);
		
		txtAccount = new JTextField();
		txtAccount.setEditable(false);
		txtAccount.setBounds(41, 125, 234, 36);
		contentPane.add(txtAccount);
		txtAccount.setColumns(10);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setColumns(10);
		txtName.setBounds(41, 185, 234, 36);
		contentPane.add(txtName);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(102, 51, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(54, 165, 97, 25);
		contentPane.add(lblName);
		
		txtStockID = new JTextField();
		txtStockID.setEditable(false);
		txtStockID.setColumns(10);
		txtStockID.setBounds(41, 241, 234, 36);
		contentPane.add(txtStockID);
		
		JLabel lblStockId = new JLabel("STOCK ID");
		lblStockId.setForeground(new Color(102, 51, 255));
		lblStockId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStockId.setBounds(54, 221, 87, 25);
		contentPane.add(lblStockId);
		
		JLabel lblBookId = new JLabel("BOOK ID");
		lblBookId.setForeground(new Color(102, 51, 255));
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBookId.setBounds(54, 279, 87, 25);
		contentPane.add(lblBookId);
		
		txtBookID = new JTextField();
		txtBookID.setEditable(false);
		txtBookID.setColumns(10);
		txtBookID.setBounds(41, 299, 234, 36);
		contentPane.add(txtBookID);
		
		JLabel lblOnlineIsbn = new JLabel("ONLINE ISBN");
		lblOnlineIsbn.setForeground(new Color(102, 51, 255));
		lblOnlineIsbn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnlineIsbn.setBounds(57, 336, 87, 25);
		contentPane.add(lblOnlineIsbn);
		
		txtISBN = new JTextField();
		txtISBN.setEditable(false);
		txtISBN.setColumns(10);
		txtISBN.setBounds(44, 356, 234, 36);
		contentPane.add(txtISBN);
		
		JLabel lblTitle = new JLabel("TITLE");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setBounds(313, 105, 87, 25);
		contentPane.add(lblTitle);
		
		txtTitle = new JTextField();
		txtTitle.setEditable(false);
		txtTitle.setColumns(10);
		txtTitle.setBounds(300, 125, 300, 36);
		contentPane.add(txtTitle);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCategory.setBounds(313, 165, 87, 25);
		contentPane.add(lblCategory);
		
		txtCategory = new JTextField();
		txtCategory.setEditable(false);
		txtCategory.setColumns(10);
		txtCategory.setBounds(300, 185, 300, 36);
		contentPane.add(txtCategory);
		
		JLabel lblIssueDate = new JLabel("ISSUE DATE");
		lblIssueDate.setForeground(new Color(102, 51, 255));
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIssueDate.setBounds(313, 278, 87, 25);
		contentPane.add(lblIssueDate);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setEditable(false);
		txtIssueDate.setColumns(10);
		txtIssueDate.setBounds(300, 298, 97, 36);
		contentPane.add(txtIssueDate);
		
		JLabel lblDueDate = new JLabel("DUE DATE");
		lblDueDate.setForeground(new Color(102, 51, 255));
		lblDueDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDueDate.setBounds(471, 278, 87, 25);
		contentPane.add(lblDueDate);
		
		txtDue = new JTextField();
		txtDue.setEditable(false);
		txtDue.setColumns(10);
		txtDue.setBounds(458, 298, 97, 36);
		contentPane.add(txtDue);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setForeground(new Color(102, 51, 255));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(313, 336, 87, 25);
		contentPane.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setColumns(10);
		txtPrice.setBounds(300, 356, 234, 36);
		contentPane.add(txtPrice);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(626, 100, 718, 302);
		contentPane.add(scrollPane);
		
		tblApprove = new JTable(frameAdmin.modelborrow) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblApprove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblApprove.getSelectedRow();
					lblBorrowID.setText( frameAdmin.modelborrow.getValueAt(selectedRow, 0).toString());
					txtAccount.setText(  frameAdmin.modelborrow.getValueAt(selectedRow, 1).toString());
					txtName.setText(  frameAdmin.modelborrow.getValueAt(selectedRow, 2).toString());
					txtStockID.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 3).toString());
					txtBookID.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 4).toString());
					txtISBN.setText(frameAdmin.modelborrow.getValueAt(selectedRow,5).toString());
					txtTitle.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 6).toString());
					txtCategory.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 7).toString());
					txtAuthor.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 8).toString());
					txtIssueDate.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 9).toString());
					txtDue.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 10).toString());
					txtPrice.setText(frameAdmin.modelborrow.getValueAt(selectedRow, 11).toString());
					cboApprove.setSelectedItem(frameAdmin.modelborrow.getValueAt(selectedRow, 12).toString());
				


			}
		});
		tblApprove.getTableHeader().setResizingAllowed(false);
		tblApprove.getTableHeader().setReorderingAllowed(false); 
		tblApprove.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelborrow.setColumnIdentifiers(frameAdmin.columnborrowdetails);
		scrollPane.setViewportView(tblApprove);
		
		JLabel lblPendingRequest = new JLabel("PENDING REQUEST");
		lblPendingRequest.setForeground(new Color(102, 51, 255));
		lblPendingRequest.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPendingRequest.setBounds(644, 74, 183, 25);
		contentPane.add(lblPendingRequest);
		
		JButton btnApprove = new JButton("APPROVE");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
				clear();
				JOptionPane.showMessageDialog(contentPane, "REQUEST HAS BEEN APPROVED!");
			}
		});
		btnApprove.setForeground(Color.WHITE);
		btnApprove.setFont(new Font("Arial", Font.BOLD, 12));
		btnApprove.setBorder(null);
		btnApprove.setBackground(new Color(51, 51, 255));
		btnApprove.setBounds(163, 434, 147, 38);
		contentPane.add(btnApprove);
		
		cboApprove = new JComboBox<Object>(approve);
		cboApprove.setBounds(348, 435, 210, 36);
		contentPane.add(cboApprove);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setForeground(new Color(102, 51, 255));
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setBounds(362, 414, 87, 25);
		contentPane.add(lblStatus);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAuthor.setBounds(313, 221, 87, 25);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(300, 241, 300, 36);
		contentPane.add(txtAuthor);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameApproveBorrow.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(588, 434, 147, 38);
		contentPane.add(btnCancel);
	}

		private void update() {
			int selectedRow = tblApprove.getSelectedRow();
				frameAdmin.modelborrow.setValueAt(lblBorrowID.getText(), selectedRow,0);
				frameAdmin.modelborrow.setValueAt(txtAccount.getText(), selectedRow,1);
				frameAdmin.modelborrow.setValueAt(txtName.getText(), selectedRow,2);
				frameAdmin.modelborrow.setValueAt(txtStockID.getText(), selectedRow,3);
				frameAdmin.modelborrow.setValueAt(txtBookID.getText(), selectedRow,4);
				frameAdmin.modelborrow.setValueAt(txtISBN.getText(), selectedRow,5);
				frameAdmin.modelborrow.setValueAt(txtTitle.getText(), selectedRow,6);
				frameAdmin.modelborrow.setValueAt(txtCategory.getText(), selectedRow,7);
				frameAdmin.modelborrow.setValueAt(txtAuthor.getText(), selectedRow,8);
				frameAdmin.modelborrow.setValueAt(txtIssueDate.getText(), selectedRow,9);
				frameAdmin.modelborrow.setValueAt(txtDue.getText(), selectedRow,10);
				frameAdmin.modelborrow.setValueAt(txtPrice.getText(), selectedRow,11);	
				frameAdmin.modelborrow.setValueAt(cboApprove.getSelectedItem(), selectedRow,12);
		}
		private void clear() {
			lblBorrowID.setText("");
			txtAccount.setText("");
			txtName.setText("");
			txtStockID.setText("");
			txtBookID.setText("");
			txtISBN.setText("");
			txtTitle.setText("");
			txtCategory.setText("");
			txtAuthor.setText("");
			txtIssueDate.setText("");
			txtDue.setText("");
			txtPrice.setText("");
			cboApprove.setSelectedIndex(-1);
			
			
			
			
			
			
			
			
			
		}
	}
