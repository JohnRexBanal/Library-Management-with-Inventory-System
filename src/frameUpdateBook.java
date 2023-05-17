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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class frameUpdateBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtISBN;
	private JTextField txtTItle;
	private JTextField txtCategory;
	private JTextField txtAuthor;
	private JTextField txtYear;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JTable tblUpdateBook;
	private JRadioButton rdoOut;
	private JRadioButton rdoAvailable;

	public frameUpdateBook() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 496);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdateBookInformation = new JLabel("UPDATE BOOK INFORMATION");
		lblUpdateBookInformation.setForeground(new Color(102, 51, 255));
		lblUpdateBookInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateBookInformation.setFont(new Font("Arial", Font.BOLD, 20));
		lblUpdateBookInformation.setBounds(230, 11, 314, 32);
		contentPane.add(lblUpdateBookInformation);
		
		JLabel lblBookID = new JLabel("ONLINE ISBN");
		lblBookID.setForeground(new Color(102, 51, 255));
		lblBookID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBookID.setBounds(37, 49, 86, 32);
		contentPane.add(lblBookID);
		
		txtISBN = new JTextField();
		txtISBN.setColumns(10);
		txtISBN.setBounds(25, 78, 299, 32);
		contentPane.add(txtISBN);
		
		JLabel lblTitle = new JLabel("TITLE");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(37, 115, 86, 32);
		contentPane.add(lblTitle);
		
		txtTItle = new JTextField();
		txtTItle.setColumns(10);
		txtTItle.setBounds(25, 144, 299, 32);
		contentPane.add(txtTItle);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategory.setBounds(37, 175, 86, 32);
		contentPane.add(lblCategory);
		
		txtCategory = new JTextField();
		txtCategory.setColumns(10);
		txtCategory.setBounds(25, 204, 299, 32);
		contentPane.add(txtCategory);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAuthor.setBounds(360, 49, 101, 30);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(350, 77, 273, 32);
		contentPane.add(txtAuthor);
		
		JLabel lblNewLabel_1 = new JLabel("PUBLISHER YEAR");
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(359, 115, 150, 32);
		contentPane.add(lblNewLabel_1);
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		txtYear.setBounds(350, 145, 273, 34);
		contentPane.add(txtYear);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PRICE");
		lblNewLabel_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(369, 175, 84, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(360, 202, 93, 34);
		contentPane.add(txtPrice);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setForeground(new Color(102, 51, 255));
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantity.setBounds(504, 175, 84, 32);
		contentPane.add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(495, 202, 93, 34);
		contentPane.add(txtQuantity);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 275, 808, 162);
		contentPane.add(scrollPane);
		
		tblUpdateBook = new JTable(frameAdmin.modelBookList) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblUpdateBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblUpdateBook.getSelectedRow();
				txtISBN.setText( frameAdmin.modelBookList.getValueAt(selectedRow, 1).toString());
				txtTItle.setText(  frameAdmin.modelBookList.getValueAt(selectedRow, 2).toString());
				txtCategory.setText(  frameAdmin.modelBookList.getValueAt(selectedRow, 3).toString());
				txtAuthor.setText(frameAdmin.modelBookList.getValueAt(selectedRow, 4).toString());
				txtYear.setText(frameAdmin.modelBookList.getValueAt(selectedRow, 5).toString());
				txtPrice.setText(frameAdmin.modelBookList.getValueAt(selectedRow, 6).toString());
				txtQuantity.setText(frameAdmin.modelBookList.getValueAt(selectedRow, 7).toString());
			}
		});
		tblUpdateBook.getTableHeader().setResizingAllowed(false);
		tblUpdateBook.getTableHeader().setReorderingAllowed(false); 
		tblUpdateBook.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelBookList.setColumnIdentifiers(frameAdmin.columnBookList);
		scrollPane.setViewportView(tblUpdateBook);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updaterow();
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdate.setBorder(null);
		btnUpdate.setBackground(new Color(51, 51, 255));
		btnUpdate.setBounds(61, 452, 108, 35);
		contentPane.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameUpdateBook.this.dispose();
				}
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(51, 51, 255));
		btnBack.setBounds(189, 452, 108, 35);
		contentPane.add(btnBack);
		
		JLabel lblSetStatus = new JLabel("SET STATUS");
		lblSetStatus.setForeground(new Color(102, 51, 255));
		lblSetStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSetStatus.setBounds(661, 81, 103, 25);
		contentPane.add(lblSetStatus);
		
		rdoAvailable = new JRadioButton("AVAILABLE");
		rdoAvailable.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdoAvailable.setBorder(null);
		rdoAvailable.setBackground(Color.LIGHT_GRAY);
		rdoAvailable.setBounds(671, 115, 92, 27);
		contentPane.add(rdoAvailable);
		
		rdoOut = new JRadioButton("OUT OF STOCK");
		rdoOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdoOut.setBorder(null);
		rdoOut.setBackground(Color.LIGHT_GRAY);
		rdoOut.setBounds(670, 146, 118, 27);
		contentPane.add(rdoOut);
		
		ButtonGroup status = new ButtonGroup();
		status.add(rdoAvailable);
		status.add(rdoOut);
	}
	private void updaterow() {
		
		String quality = "";
		 if (rdoOut.isSelected())
			 quality = rdoOut.getText();
		 else if
	     (rdoAvailable.isSelected())
			 quality = rdoAvailable.getText();
		

		int selectedRow = tblUpdateBook.getSelectedRow();
		frameAdmin.modelBookList.setValueAt(txtISBN.getText(), selectedRow,1);
		frameAdmin.modelBookList.setValueAt(txtTItle.getText(), selectedRow,2);
		frameAdmin.modelBookList.setValueAt(txtCategory.getText(), selectedRow,3);
		frameAdmin.modelBookList.setValueAt(txtAuthor.getText(), selectedRow,4);
		frameAdmin.modelBookList.setValueAt(txtYear.getText(), selectedRow,5);
		frameAdmin.modelBookList.setValueAt(txtPrice.getText(), selectedRow,6);
		frameAdmin.modelBookList.setValueAt(txtQuantity.getText(), selectedRow,7);
		frameAdmin.modelBookList.setValueAt(quality, selectedRow,8);


	}
}
