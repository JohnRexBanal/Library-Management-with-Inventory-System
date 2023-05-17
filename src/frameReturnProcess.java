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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frameReturnProcess extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountID;
	private JTextField txtTitle;
	private JTextField txtName;
	private JTextField txtCategory;
	private JTextField txtStockID;
	private JTextField txtAuthor;
	private JTextField txtBookID;
	private JTextField txtDue;
	private JTextField txtIssueDate;
	private JTextField txtISBN;
	private JTextField txtPrice;
	public static JLabel lblPenaltyCharged;
	private JLabel lblReturnID;
	private JTable tblReturn;
	private JComboBox<Object> cboApprove;

	private String[] approve = {
			"APPROVED",
			"PENDING",
			"PENALIZED"
	};
	
	public frameReturnProcess() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 500);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("APPROVE RETURN REQUEST");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(525, 11, 340, 36);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		lblReturnID = new JLabel("");
		lblReturnID.setForeground(new Color(102, 51, 255));
		lblReturnID.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReturnID.setBounds(138, 58, 87, 36);
		contentPane.add(lblReturnID);
		
		JLabel lblReturnId = new JLabel("RETURN ID:");
		lblReturnId.setForeground(new Color(102, 51, 255));
		lblReturnId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReturnId.setBounds(31, 58, 97, 36);
		contentPane.add(lblReturnId);
		
		JLabel lblAccountId = new JLabel("ACCOUNT ID");
		lblAccountId.setForeground(new Color(102, 51, 255));
		lblAccountId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccountId.setBounds(41, 105, 97, 25);
		contentPane.add(lblAccountId);
		
		txtAccountID = new JTextField();
		txtAccountID.setEditable(false);
		txtAccountID.setColumns(10);
		txtAccountID.setBounds(28, 125, 196, 36);
		contentPane.add(txtAccountID);
		
		JLabel lblTitle = new JLabel("TITLE");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setBounds(270, 105, 87, 25);
		contentPane.add(lblTitle);
		
		txtTitle = new JTextField();
		txtTitle.setEditable(false);
		txtTitle.setColumns(10);
		txtTitle.setBounds(257, 125, 300, 36);
		contentPane.add(txtTitle);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(102, 51, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(41, 165, 97, 25);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setColumns(10);
		txtName.setBounds(28, 185, 196, 36);
		contentPane.add(txtName);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCategory.setBounds(270, 165, 87, 25);
		contentPane.add(lblCategory);
		
		txtCategory = new JTextField();
		txtCategory.setEditable(false);
		txtCategory.setColumns(10);
		txtCategory.setBounds(257, 185, 300, 36);
		contentPane.add(txtCategory);
		
		JLabel lblStockId = new JLabel("STOCK ID");
		lblStockId.setForeground(new Color(102, 51, 255));
		lblStockId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStockId.setBounds(41, 221, 87, 25);
		contentPane.add(lblStockId);
		
		txtStockID = new JTextField();
		txtStockID.setEditable(false);
		txtStockID.setColumns(10);
		txtStockID.setBounds(28, 241, 196, 36);
		contentPane.add(txtStockID);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAuthor.setBounds(270, 221, 87, 25);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(257, 241, 300, 36);
		contentPane.add(txtAuthor);
		
		JLabel lblBookId = new JLabel("BOOK ID");
		lblBookId.setForeground(new Color(102, 51, 255));
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBookId.setBounds(41, 279, 87, 25);
		contentPane.add(lblBookId);
		
		txtBookID = new JTextField();
		txtBookID.setEditable(false);
		txtBookID.setColumns(10);
		txtBookID.setBounds(28, 299, 196, 36);
		contentPane.add(txtBookID);
		
		JLabel lblIssueDate = new JLabel("ISSUE DATE");
		lblIssueDate.setForeground(new Color(102, 51, 255));
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIssueDate.setBounds(270, 278, 87, 25);
		contentPane.add(lblIssueDate);
		
		JLabel lblDueDate = new JLabel("RETURN DATE");
		lblDueDate.setForeground(new Color(102, 51, 255));
		lblDueDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDueDate.setBounds(425, 279, 87, 25);
		contentPane.add(lblDueDate);
		
		txtDue = new JTextField();
		txtDue.setEditable(false);
		txtDue.setColumns(10);
		txtDue.setBounds(415, 298, 97, 36);
		contentPane.add(txtDue);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setEditable(false);
		txtIssueDate.setColumns(10);
		txtIssueDate.setBounds(257, 298, 97, 36);
		contentPane.add(txtIssueDate);
		
		JLabel lblOnlineIsbn = new JLabel("ONLINE ISBN");
		lblOnlineIsbn.setForeground(new Color(102, 51, 255));
		lblOnlineIsbn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnlineIsbn.setBounds(44, 336, 87, 25);
		contentPane.add(lblOnlineIsbn);
		
		txtISBN = new JTextField();
		txtISBN.setEditable(false);
		txtISBN.setColumns(10);
		txtISBN.setBounds(31, 356, 193, 36);
		contentPane.add(txtISBN);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setForeground(new Color(102, 51, 255));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(270, 336, 87, 25);
		contentPane.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setColumns(10);
		txtPrice.setBounds(257, 356, 97, 36);
		contentPane.add(txtPrice);
		
		JLabel lblPenaltyCharge = new JLabel("PENALTY CHARGE:");
		lblPenaltyCharge.setForeground(new Color(102, 51, 255));
		lblPenaltyCharge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPenaltyCharge.setBounds(244, 64, 123, 25);
		contentPane.add(lblPenaltyCharge);
		
		lblPenaltyCharged = new JLabel("");
		lblPenaltyCharged.setForeground(new Color(102, 51, 255));
		lblPenaltyCharged.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPenaltyCharged.setBounds(363, 64, 123, 25);
		contentPane.add(lblPenaltyCharged);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(584, 104, 752, 302);
		contentPane.add(scrollPane);
		
		tblReturn = new JTable(frameAdmin.modelreturn) {
		public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};	
		tblReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblReturn.getSelectedRow();
					lblReturnID.setText( frameAdmin.modelreturn.getValueAt(selectedRow, 0).toString());
					txtAccountID.setText(  frameAdmin.modelreturn.getValueAt(selectedRow, 1).toString());
					txtName.setText(  frameAdmin.modelreturn.getValueAt(selectedRow, 2).toString());
					txtStockID.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 3).toString());
					txtBookID.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 4).toString());
					txtISBN.setText(frameAdmin.modelreturn.getValueAt(selectedRow,5).toString());
					txtTitle.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 6).toString());
					txtCategory.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 7).toString());
					txtAuthor.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 8).toString());
					txtIssueDate.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 9).toString());
					txtDue.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 10).toString());
					txtPrice.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 11).toString());
					cboApprove.setSelectedItem(frameAdmin.modelreturn.getValueAt(selectedRow, 12).toString());
					lblPenaltyCharged.setText(frameAdmin.modelreturn.getValueAt(selectedRow, 13).toString());

			}
		});
		frameAdmin.modelreturn.setColumnIdentifiers(frameAdmin.columnreturn);
		tblReturn.getTableHeader().setResizingAllowed(false);
		tblReturn.getTableHeader().setReorderingAllowed(false); 
		scrollPane.setViewportView(tblReturn);
		
		JLabel lblPendingRequest = new JLabel("PENDING REQUEST");
		lblPendingRequest.setForeground(new Color(102, 51, 255));
		lblPendingRequest.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPendingRequest.setBounds(636, 78, 183, 25);
		contentPane.add(lblPendingRequest);
		
		JButton btnNewButton = new JButton("PROCESS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
				clear();
				 JOptionPane.showMessageDialog(contentPane, "RETURN PROCESS HAS BEEN APPROVED!");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(78, 434, 123, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setForeground(new Color(102, 51, 255));
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setBounds(239, 413, 87, 25);
		contentPane.add(lblStatus);
		
		cboApprove = new JComboBox<Object>(approve);
		cboApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cboApprove.getSelectedItem() == "PENALIZED") {
					lblPenaltyCharged.setText("10");
				}else if(cboApprove.getSelectedItem() == "APPROVED") {
					lblPenaltyCharged.setText("");
				}
			}
		});
		cboApprove.setBounds(225, 434, 210, 36);
		contentPane.add(cboApprove);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameReturnProcess.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(464, 434, 123, 36);
		contentPane.add(btnCancel);
	}
	
		private void update() {
			int selectedRow = tblReturn.getSelectedRow();
				frameAdmin.modelreturn.setValueAt(lblReturnID.getText(), selectedRow,0);
				frameAdmin.modelreturn.setValueAt(txtAccountID.getText(), selectedRow,1);
				frameAdmin.modelreturn.setValueAt(txtName.getText(), selectedRow,2);
				frameAdmin.modelreturn.setValueAt(txtStockID.getText(), selectedRow,3);
				frameAdmin.modelreturn.setValueAt(txtBookID.getText(), selectedRow,4);
				frameAdmin.modelreturn.setValueAt(txtISBN.getText(), selectedRow,5);
				frameAdmin.modelreturn.setValueAt(txtTitle.getText(), selectedRow,6);
				frameAdmin.modelreturn.setValueAt(txtCategory.getText(), selectedRow,7);
				frameAdmin.modelreturn.setValueAt(txtAuthor.getText(), selectedRow,8);
				frameAdmin.modelreturn.setValueAt(txtIssueDate.getText(), selectedRow,9);
				frameAdmin.modelreturn.setValueAt(txtDue.getText(), selectedRow,10);
				frameAdmin.modelreturn.setValueAt(txtPrice.getText(), selectedRow,11);	
				frameAdmin.modelreturn.setValueAt(cboApprove.getSelectedItem(), selectedRow,12);
				frameAdmin.modelreturn.setValueAt(lblPenaltyCharged.getText(), selectedRow,13);

}
		private void clear() {
			lblReturnID.setText("");
			txtAccountID.setText("");
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
			lblPenaltyCharged.setText("");
		}
}
