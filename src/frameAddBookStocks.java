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
import javax.swing.JButton;

public class frameAddBookStocks extends JFrame {

	private JPanel contentPane;
	private JTextField txtAuthor;

	private String[] BookCat = {
			"1090465",
			"1090466",
			"1090467",
			"1090468",
			"1090469",
			"1090470",
			"1090471",
			"1090472",
			"1090473",
			"1090474"
	};
	private String[] BookStatus = {"GOOD","DAMAGED"};
	
	
	private JComboBox cboID;
	private JTextField txtISBN;
	private JTextField txtTitle;
	private JTextField txtCategory;
	private JTextField txtYear;
	
	private int id = 3008;
	private JButton btnNewStock;
	private JButton btnAddStock;
	private JButton btnCancel;
	private JLabel lblSelectStatus;
	private JComboBox<Object> cboStatus;
	private JLabel lblStockID;
	
	public frameAddBookStocks() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 636);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ADD BOOK STOCKS");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(94, 18, 275, 49);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("STOCK ID:");
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(57, 78, 81, 33);
		contentPane.add(lblNewLabel);
		
		lblStockID = new JLabel("");
		lblStockID.setForeground(new Color(102, 51, 255));
		lblStockID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStockID.setBounds(148, 78, 144, 33);
		contentPane.add(lblStockID);
		
		JLabel lblBookId = new JLabel("BOOK ID");
		lblBookId.setForeground(new Color(102, 51, 255));
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookId.setBounds(48, 122, 81, 33);
		contentPane.add(lblBookId);
		
		JLabel lblTitle = new JLabel("ONLINE ISBN");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(45, 200, 184, 33);
		contentPane.add(lblTitle);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAuthor.setBounds(47, 390, 81, 33);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setDisabledTextColor(Color.BLACK);
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(35, 424, 386, 33);
		contentPane.add(txtAuthor);
		
		cboID = new JComboBox<Object>(BookCat);
		cboID.setSelectedIndex(-1);
		cboID.setEnabled(false);
		cboID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cboID.getSelectedItem() == "1090465") {
					txtISBN.setText("9781118761915");
					txtTitle.setText("3D VIDEO: FROM CAPTURE TO DIFUSSION");
					txtCategory.setText("COMPUTER SCIENCE & INFORMATION TECHNOLOGY");
					txtAuthor.setText("Laurent LucasCéline LoscosYannick Remion");
					txtYear.setText("11/10/13");
				}else if(cboID.getSelectedItem() == "1090466") {
					txtISBN.setText("9781118180822");
					txtTitle.setText("ADVANCED INTERNET PROTOCOLS");
					txtCategory.setText("COMPUTER SCIENCE & INFORMATION TECHNOLOGY");
					txtAuthor.setText("EIJI OKIROBERTO ROJAS");
					txtYear.setText("20/03/12");
				}else if(cboID.getSelectedItem() == "1090467") {
					txtISBN.setText("9780470611739");
					txtTitle.setText("APPLICATION INTEGRATION");
					txtCategory.setText("COMPUTER SCIENCE & INFORMATION TECHNOLOGY");
					txtAuthor.setText("Bernard ManouvrierLaurent Ménard");
					txtYear.setText("01/01/08");
				}else if(cboID.getSelectedItem() == "1090468") {
					txtISBN.setText("9781119004752");
					txtTitle.setText("AUTOMATIC TEXT SUMMARIZATION");
					txtCategory.setText("COMPUTER SCIENCE & INFORMATION TECHNOLOGY");
					txtAuthor.setText("Juan-Manuel Torres-Moreno");
					txtYear.setText("24/09/14");
				}else if(cboID.getSelectedItem() == "1090469") {
					txtISBN.setText("9781119055228");
					txtTitle.setText("BEYOND CYBER SECURITY");
					txtCategory.setText("COMPUTER SCIENCE & INFORMATION TECHNOLOGY");
					txtAuthor.setText("James M. KaplanTucker");
					txtYear.setText("10/04/15");
				}else if(cboID.getSelectedItem() == "1090470") {
					txtISBN.setText("9780470996652");
					txtTitle.setText("Blackwell Handbook of Childhood Cognitive Development");
					txtCategory.setText("PSYCHOLOGY");
					txtAuthor.setText("Usha Goswami");
					txtYear.setText("01/02/02");
				}else if(cboID.getSelectedItem() == "1090471") {
					txtISBN.setText("9781444323542");
					txtTitle.setText("Handbook of Jealousy: Theory, Research, and Multidisciplinary Approaches");
					txtCategory.setText("PSYCHOLOGY");
					txtAuthor.setText("Sybil L. Hart, Maria Legerstee PhD");
					txtYear.setText("16/04/10");
				}else if(cboID.getSelectedItem() == "1090472") {
					txtISBN.setText("9781119788492");
					txtTitle.setText("Humans in the Making: In the Beginning was Technique, Volume 4");
					txtCategory.setText("PSYCHOLOGY");
					txtAuthor.setText("Michel J.F. Dubois");
					txtYear.setText("30/10/20");
				}else if(cboID.getSelectedItem() == "1090473") {
					txtISBN.setText("9780470773307");
					txtTitle.setText("Understanding Developmental Disorders: A Causal Modelling Approach");
					txtCategory.setText("PSYCHOLOGY");
					txtAuthor.setText("John Morton");
					txtYear.setText("01/01/04");
				}else if(cboID.getSelectedItem() == "1090474") {
					txtISBN.setText("9781444325461");
					txtTitle.setText("A History of Autism: Conversations with the Pioneers");
					txtCategory.setText("PSYCHOLOGY");
					txtAuthor.setText("Adam Feinstein");
					txtYear.setText("14/06/10");
				}
			}
		});
		cboID.setBounds(35, 156, 160, 33);
		contentPane.add(cboID);
		
		txtISBN = new JTextField();
		txtISBN.setDisabledTextColor(Color.BLACK);
		txtISBN.setEditable(false);
		txtISBN.setColumns(10);
		txtISBN.setBounds(37, 234, 384, 33);
		contentPane.add(txtISBN);
		
		JLabel lblTitle1 = new JLabel("TITLE");
		lblTitle1.setForeground(new Color(102, 51, 255));
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle1.setBounds(48, 272, 81, 33);
		contentPane.add(lblTitle1);
		
		txtTitle = new JTextField();
		txtTitle.setDisabledTextColor(Color.BLACK);
		txtTitle.setEditable(false);
		txtTitle.setColumns(10);
		txtTitle.setBounds(35, 300, 386, 33);
		contentPane.add(txtTitle);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(44, 335, 94, 33);
		contentPane.add(lblCategory);
		
		txtCategory = new JTextField();
		txtCategory.setDisabledTextColor(Color.BLACK);
		txtCategory.setEditable(false);
		txtCategory.setColumns(10);
		txtCategory.setBounds(35, 359, 386, 33);
		contentPane.add(txtCategory);
		
		JLabel lblYearPublished = new JLabel("YEAR PUBLISHED");
		lblYearPublished.setForeground(new Color(102, 51, 255));
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYearPublished.setBounds(47, 456, 150, 33);
		contentPane.add(lblYearPublished);
		
		txtYear = new JTextField();
		txtYear.setDisabledTextColor(Color.BLACK);
		txtYear.setEditable(false);
		txtYear.setColumns(10);
		txtYear.setBounds(35, 490, 384, 33);
		contentPane.add(txtYear);
		
		btnNewStock = new JButton("NEW");
		btnNewStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStockID.setText(String.valueOf(id));
				id++;
				cboID.setEnabled(true);
				cboStatus.setEnabled(true);
				btnNewStock.setEnabled(false);
				btnAddStock.setEnabled(true);
				
				
			}
		});
		btnNewStock.setForeground(Color.WHITE);
		btnNewStock.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewStock.setBorder(null);
		btnNewStock.setBackground(new Color(51, 51, 255));
		btnNewStock.setBounds(23, 557, 124, 38);
		contentPane.add(btnNewStock);
		
		btnAddStock = new JButton("ADD");
		btnAddStock.setEnabled(false);
		btnAddStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] rowData = new Object[8];
				rowData[0] = lblStockID.getText();
				rowData[1] = cboID.getSelectedItem();
				rowData[2] = txtISBN.getText().toUpperCase();
				rowData[3] = txtTitle.getText().toUpperCase();
				rowData[4] = txtCategory.getText().toUpperCase();
				rowData[5] = txtAuthor.getText().toUpperCase();
				rowData[6] = txtYear.getText().toUpperCase();
				rowData[7] = cboStatus.getSelectedItem();

				
				frameAdmin.modelBookStocks.addRow(rowData);
				
				clearfields();
				cboID.setEnabled(false);
				cboStatus.setEnabled(false);
				btnNewStock.setEnabled(true);
				btnAddStock.setEnabled(false);



			}
		});
		btnAddStock.setForeground(Color.WHITE);
		btnAddStock.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddStock.setBorder(null);
		btnAddStock.setBackground(new Color(51, 51, 255));
		btnAddStock.setBounds(171, 557, 124, 38);
		contentPane.add(btnAddStock);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameAddBookStocks.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(317, 557, 124, 38);
		contentPane.add(btnCancel);
		
		lblSelectStatus = new JLabel("SELECT STATUS:");
		lblSelectStatus.setForeground(new Color(102, 51, 255));
		lblSelectStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectStatus.setBounds(264, 122, 124, 33);
		contentPane.add(lblSelectStatus);
		
		cboStatus = new JComboBox<Object>(BookStatus);
		cboStatus.setSelectedIndex(-1);
		cboStatus.setEnabled(false);
		cboStatus.setBounds(253, 156, 168, 33);
		contentPane.add(cboStatus);
	}

		private void clearfields() {
			lblStockID.setText("");
			cboID.setSelectedIndex(-1);
			txtISBN.setText("");
			txtTitle.setText("");
			txtCategory.setText("");
			txtAuthor.setText("");
			txtYear.setText("");
			cboStatus.setSelectedIndex(-1);
			
			
			
			
		}
}
