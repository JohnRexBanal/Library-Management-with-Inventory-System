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
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameAddBook extends JFrame {

	private JPanel contentPane;
	
	private int id = 1090475;
	private JTextField txtISBN;
	private JTextField txtTitle;
	private JComboBox cboCategory;
	private JTextField txtAuthor;
	private JTextField txtYear;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JRadioButton rdoOut;
	private JRadioButton rdoAvailable;
	private JButton btnBack;
	private JButton btnSave;
	private JButton btnNewButton;
	private ButtonGroup rdostatus;
	private JLabel lblBookID;
	
public static String[] getCat( ) {
		
		String[] cat = new String[frameAdmin.modelCat.getRowCount()];
		
		for(int row = 0; row < frameAdmin.modelCat.getRowCount(); row++) {
			cat[row] = (String) frameAdmin.tblCategories.getModel().getValueAt(row, 1);
		}
		
			
		return cat;
	}
	
	public void  buildcat() {
		
		String[] bookcat = getCat();
		for (String cate : bookcat) {
			cboCategory.addItem(cate);
		}
	}

	

	public frameAddBook() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 456);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewBook = new JLabel("ADD NEW BOOK");
		lblAddNewBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewBook.setForeground(new Color(102, 51, 255));
		lblAddNewBook.setFont(new Font("Arial", Font.BOLD, 20));
		lblAddNewBook.setBounds(267, 24, 251, 32);
		contentPane.add(lblAddNewBook);
		
		JLabel lblNewLabel = new JLabel("BOOK ID:");
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(39, 82, 76, 25);
		contentPane.add(lblNewLabel);
		
		lblBookID = new JLabel("");
		lblBookID.setForeground(new Color(102, 51, 255));
		lblBookID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookID.setBounds(136, 82, 76, 25);
		contentPane.add(lblBookID);
		
		JLabel lblOnlineIsbn = new JLabel("ONLINE ISBN");
		lblOnlineIsbn.setForeground(new Color(102, 51, 255));
		lblOnlineIsbn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnlineIsbn.setBounds(47, 129, 103, 25);
		contentPane.add(lblOnlineIsbn);
		
		txtISBN = new JTextField();
		txtISBN.setEnabled(false);
		txtISBN.setBounds(39, 152, 191, 32);
		contentPane.add(txtISBN);
		txtISBN.setColumns(10);
		
		JLabel lblBookTitle = new JLabel("TITLE");
		lblBookTitle.setForeground(new Color(102, 51, 255));
		lblBookTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBookTitle.setBounds(307, 129, 103, 25);
		contentPane.add(lblBookTitle);
		
		txtTitle = new JTextField();
		txtTitle.setEnabled(false);
		txtTitle.setColumns(10);
		txtTitle.setBounds(299, 152, 191, 32);
		contentPane.add(txtTitle);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCategory.setBounds(569, 129, 103, 25);
		contentPane.add(lblCategory);
		
		cboCategory = new JComboBox();
		cboCategory.setEnabled(false);
		buildcat();
		cboCategory.setSelectedIndex(-1);
		cboCategory.setBounds(554, 152, 208, 32);
		contentPane.add(cboCategory);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAuthor.setBounds(47, 195, 103, 25);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setEnabled(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(39, 218, 191, 32);
		contentPane.add(txtAuthor);
		
		JLabel lblYearPublished = new JLabel("YEAR PUBLISHED");
		lblYearPublished.setForeground(new Color(102, 51, 255));
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYearPublished.setBounds(307, 195, 118, 25);
		contentPane.add(lblYearPublished);
		
		txtYear = new JTextField();
		txtYear.setEnabled(false);
		txtYear.setColumns(10);
		txtYear.setBounds(299, 218, 191, 32);
		contentPane.add(txtYear);
		
		JLabel lblBookPrice = new JLabel("BOOK PRICE");
		lblBookPrice.setForeground(new Color(102, 51, 255));
		lblBookPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBookPrice.setBounds(572, 195, 103, 25);
		contentPane.add(lblBookPrice);
		
		txtPrice = new JTextField();
		txtPrice.setEnabled(false);
		txtPrice.setColumns(10);
		txtPrice.setBounds(554, 218, 201, 32);
		contentPane.add(txtPrice);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setForeground(new Color(102, 51, 255));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantity.setBounds(47, 268, 103, 25);
		contentPane.add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setEnabled(false);
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(39, 291, 191, 32);
		contentPane.add(txtQuantity);
		
		JLabel lblSetStatus = new JLabel("SET STATUS");
		lblSetStatus.setForeground(new Color(102, 51, 255));
		lblSetStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSetStatus.setBounds(309, 268, 103, 25);
		contentPane.add(lblSetStatus);
		
		rdoOut = new JRadioButton("OUT OF STOCK");
		rdoOut.setEnabled(false);
		rdoOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdoOut.setBorder(null);
		rdoOut.setBackground(Color.LIGHT_GRAY);
		rdoOut.setBounds(424, 304, 118, 27);
		contentPane.add(rdoOut);
		
		rdoAvailable = new JRadioButton("AVAILABLE");
		rdoAvailable.setEnabled(false);
		rdoAvailable.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdoAvailable.setBorder(null);
		rdoAvailable.setBackground(Color.LIGHT_GRAY);
		rdoAvailable.setBounds(319, 304, 92, 27);
		contentPane.add(rdoAvailable);
		
		rdostatus = new ButtonGroup();
		rdostatus.add(rdoAvailable);
		rdostatus.add(rdoOut);
		
		btnNewButton = new JButton("NEW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBounds(183, 379, 100, 34);
		contentPane.add(btnNewButton);
		
		btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newrow();
				clearfields();
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(51, 51, 255));
		btnSave.setBounds(313, 379, 100, 34);
		contentPane.add(btnSave);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameAddBook.this.dispose();
				}
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(51, 51, 255));
		btnBack.setBounds(442, 379, 100, 34);
		contentPane.add(btnBack);
	}
	private void enabled() {
		lblBookID.setText(String.valueOf(id));
		id++;
		txtISBN.setEnabled(true);
		txtTitle.setEnabled(true);
		cboCategory.setEnabled(true);
		txtAuthor.setEnabled(true);
		txtYear.setEnabled(true);
		txtPrice.setEnabled(true);
		txtQuantity.setEnabled(true);
		rdoOut.setEnabled(true);
		rdoAvailable.setEnabled(true);
	}
	private void clearfields() {
		lblBookID.setText("");
		txtISBN.setText("");
		txtTitle.setText("");
		cboCategory.setSelectedIndex(-1);
		txtAuthor.setText("");
		txtYear.setText("");
		txtPrice.setText("");
		txtQuantity.setText("");
		rdostatus.clearSelection();
	
	}
	private void newrow() {
		
		
		String quality = "";
		 if (rdoOut.isSelected())
			 quality = rdoOut.getText();
		 else if
	     (rdoAvailable.isSelected())
			 quality = rdoAvailable.getText();
		
	
		if (txtISBN.getText().isEmpty() || txtTitle.getText().isEmpty() || txtAuthor.getText().isEmpty()){
			JOptionPane.showMessageDialog(contentPane, "Please Fillup all fields");
		
		}else {	
		
			Object[] rowData = new Object [9];
			
			rowData[0] = lblBookID.getText();
			rowData[1] = txtISBN.getText();
			rowData[2] = txtTitle.getText();
			rowData[3] = cboCategory.getSelectedItem();
			rowData[4] = txtAuthor.getText();
			rowData[5] = txtYear.getText();
			rowData[6] = txtPrice.getText();
			rowData[7] = txtQuantity.getText();
			rowData[8] = quality;

		
			frameAdmin.modelBookList.addRow(rowData);
		}
}
}
