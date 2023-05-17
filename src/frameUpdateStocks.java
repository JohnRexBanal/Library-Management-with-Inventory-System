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
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameUpdateStocks extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookID;
	private JTextField txtISBN;
	private JTextField txtTitle;
	private JTextField txtCategory;
	private JTextField txtAuthor;
	private JTextField txtYear;
	private JTable tblUpdateStocks;
	private JComboBox<Object> cboStatus;

	private String[] BookStatus = {"GOOD","DAMAGED"};
	private JButton btnUpdate;
	private JButton btnSave;
	private JButton btnCancel;
	
	public frameUpdateStocks() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1204, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("UPDATE BOOK STOCKS");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(466, 11, 275, 49);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBookID = new JTextField();
		txtBookID.setEditable(false);
		txtBookID.setDisabledTextColor(Color.BLACK);
		txtBookID.setColumns(10);
		txtBookID.setBounds(21, 120, 134, 33);
		contentPane.add(txtBookID);
		
		JLabel lblBookId = new JLabel("BOOK ID");
		lblBookId.setForeground(new Color(102, 51, 255));
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookId.setBounds(29, 86, 95, 33);
		contentPane.add(lblBookId);
		
		JLabel lblSelectStatus = new JLabel("SELECT STATUS:");
		lblSelectStatus.setForeground(new Color(102, 51, 255));
		lblSelectStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectStatus.setBounds(202, 86, 124, 33);
		contentPane.add(lblSelectStatus);
		
		cboStatus = new JComboBox<Object>(BookStatus);
		cboStatus.setSelectedIndex(-1);
		cboStatus.setEnabled(false);
		cboStatus.setBounds(191, 120, 168, 33);
		contentPane.add(cboStatus);
		
		JLabel lblTitle = new JLabel("ONLINE ISBN");
		lblTitle.setForeground(new Color(102, 51, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(31, 158, 184, 33);
		contentPane.add(lblTitle);
		
		txtISBN = new JTextField();
		txtISBN.setEditable(false);
		txtISBN.setDisabledTextColor(Color.BLACK);
		txtISBN.setColumns(10);
		txtISBN.setBounds(23, 192, 384, 33);
		contentPane.add(txtISBN);
		
		JLabel lblTitle1 = new JLabel("TITLE");
		lblTitle1.setForeground(new Color(102, 51, 255));
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle1.setBounds(34, 230, 81, 33);
		contentPane.add(lblTitle1);
		
		txtTitle = new JTextField();
		txtTitle.setEditable(false);
		txtTitle.setDisabledTextColor(Color.BLACK);
		txtTitle.setColumns(10);
		txtTitle.setBounds(21, 258, 386, 33);
		contentPane.add(txtTitle);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(new Color(102, 51, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(30, 293, 94, 33);
		contentPane.add(lblCategory);
		
		txtCategory = new JTextField();
		txtCategory.setEditable(false);
		txtCategory.setDisabledTextColor(Color.BLACK);
		txtCategory.setColumns(10);
		txtCategory.setBounds(21, 317, 386, 33);
		contentPane.add(txtCategory);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setForeground(new Color(102, 51, 255));
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAuthor.setBounds(33, 348, 81, 33);
		contentPane.add(lblAuthor);
		
		txtAuthor = new JTextField();
		txtAuthor.setEditable(false);
		txtAuthor.setDisabledTextColor(Color.BLACK);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(21, 382, 386, 33);
		contentPane.add(txtAuthor);
		
		JLabel lblYearPublished = new JLabel("YEAR PUBLISHED");
		lblYearPublished.setForeground(new Color(102, 51, 255));
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYearPublished.setBounds(33, 414, 150, 33);
		contentPane.add(lblYearPublished);
		
		txtYear = new JTextField();
		txtYear.setEditable(false);
		txtYear.setDisabledTextColor(Color.BLACK);
		txtYear.setColumns(10);
		txtYear.setBounds(21, 448, 384, 33);
		contentPane.add(txtYear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(466, 86, 712, 404);
		contentPane.add(scrollPane);
		
		tblUpdateStocks = new JTable(frameAdmin.modelBookStocks) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
				}
			};	
		tblUpdateStocks.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		tblUpdateStocks.setBackground(new Color(255, 255, 204));
		tblUpdateStocks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblUpdateStocks.getSelectedRow();
					txtBookID.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 1).toString());
					txtISBN.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 2).toString());
					txtTitle.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 3).toString());
					txtCategory.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 4).toString());
					txtAuthor.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 5).toString());
					txtYear.setText( frameAdmin.modelBookStocks.getValueAt(selectedRow, 6).toString());
					cboStatus.setSelectedItem(frameAdmin.modelBookStocks.getValueAt(selectedRow, 7).toString());


			}
		});
		tblUpdateStocks.setEnabled(false);
		frameAdmin.modelBookStocks.setColumnIdentifiers(frameAdmin.columnStocks);
		tblUpdateStocks.getTableHeader().setResizingAllowed(false);
		tblUpdateStocks.getTableHeader().setReorderingAllowed(false); 
		tblUpdateStocks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tblUpdateStocks);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tblUpdateStocks.setEnabled(true);
				btnSave.setEnabled(true);
				cboStatus.setEnabled(true);
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdate.setBorder(null);
		btnUpdate.setBackground(new Color(51, 51, 255));
		btnUpdate.setBounds(27, 531, 124, 38);
		contentPane.add(btnUpdate);
		
		btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updaterow();
				clear();
				tblUpdateStocks.setEnabled(false);
				btnSave.setEnabled(false);
				cboStatus.setEnabled(false);
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setEnabled(false);
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(51, 51, 255));
		btnSave.setBounds(175, 531, 124, 38);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameUpdateStocks.this.dispose();
				}

			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(321, 531, 124, 38);
		contentPane.add(btnCancel);
	}
		private void updaterow() {
			int selectedRow = tblUpdateStocks.getSelectedRow();
				frameAdmin.modelBookStocks.setValueAt(txtBookID.getText(), selectedRow,1);
				frameAdmin.modelBookStocks.setValueAt(txtISBN.getText(), selectedRow,2);
				frameAdmin.modelBookStocks.setValueAt(txtTitle.getText(), selectedRow,3);
				frameAdmin.modelBookStocks.setValueAt(txtCategory.getText(), selectedRow,4);
				frameAdmin.modelBookStocks.setValueAt(txtAuthor.getText(), selectedRow,5);
				frameAdmin.modelBookStocks.setValueAt(txtYear.getText(), selectedRow,6);
				frameAdmin.modelBookStocks.setValueAt(cboStatus.getSelectedItem(), selectedRow,7);


		}
		private void clear() {
			txtBookID.setText("");
			txtISBN.setText("");
			txtTitle.setText("");
			txtCategory.setText("");
			txtAuthor.setText("");
			txtYear.setText("");
			cboStatus.setSelectedIndex(-1);
		}
}

