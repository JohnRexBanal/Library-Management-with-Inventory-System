import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameAddBookCategory extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdd;
	
	private String[] BookCat = {
			"COMPUTER SCIENCE & INFORMATION TECHNOLOGY",
			"PSYCHOLOGY",
	};
	private JComboBox cboCat;
	private JLabel lblcatno;
	
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
			cboCat.addItem(cate);
		}
	}

	

	public static int NO = 7;
	
	public frameAddBookCategory() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 432);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD NEW BOOK CATEGORY");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(102, 51, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(124, 26, 289, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AVAILABLE CATEGORIES");
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(97, 132, 238, 34);
		contentPane.add(lblNewLabel_1);
		
		cboCat = new JComboBox<Object>(BookCat);
		buildcat();
		cboCat.setSelectedIndex(-1);
		cboCat.setBounds(83, 164, 372, 34);
		contentPane.add(cboCat);
		JLabel lblNewLabel_1_1 = new JLabel("ADD NEW CATEGORY");
		lblNewLabel_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(97, 218, 238, 34);
		contentPane.add(lblNewLabel_1_1);
		
		txtAdd = new JTextField();
		txtAdd.setEnabled(false);
		txtAdd.setBounds(83, 253, 372, 34);
		contentPane.add(txtAdd);
		txtAdd.setColumns(10);
		
		JButton btnNewButton = new JButton("NEW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcatno.setText(String.valueOf(NO));
				NO++;
				txtAdd.setEnabled(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(96, 336, 100, 34);
		contentPane.add(btnNewButton);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String categories = txtAdd.getText().toUpperCase();
				
				if(!categories.equals("")) {

					Object[] rowData = new Object[2];
					rowData[0] = lblcatno.getText();
					rowData[1] = txtAdd.getText().toUpperCase();
					frameAdmin.modelCat.addRow(rowData);
					cboCat.removeAllItems();
				
				buildcat();	
				txtAdd.setText("");
				cboCat.setSelectedIndex(-1);
				txtAdd.setEnabled(false);
				JOptionPane.showMessageDialog(contentPane, "NEW CATEGORY HAS BEEN ADDED!");
				
					}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(51, 51, 255));
		btnSave.setBounds(226, 336, 100, 34);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameAddBookCategory.this.dispose();
				}
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(51, 51, 255));
		btnBack.setBounds(355, 336, 100, 34);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1_2 = new JLabel("CATEGORY NO:");
		lblNewLabel_1_2.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(97, 81, 238, 34);
		contentPane.add(lblNewLabel_1_2);
		
		lblcatno = new JLabel("");
		lblcatno.setForeground(new Color(102, 51, 255));
		lblcatno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblcatno.setBounds(226, 81, 238, 34);
		contentPane.add(lblcatno);
	}

}
