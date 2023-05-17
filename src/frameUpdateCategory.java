import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class frameUpdateCategory extends JFrame {

	private JPanel contentPane;
	private JComboBox<Object> cboUpdateCat;
	private JTextField txtUpdate;

	public void  buildcat() {
		
		String[] bookcat = frameAddBookCategory.getCat();
		for (String cate : bookcat) {
			cboUpdateCat.addItem(cate);
		}
		}
	public frameUpdateCategory() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 359);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("UPDATE BOOK CATEGORY");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(206, 11, 275, 49);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("AVAILABLE CATEGORIES");
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(163, 89, 238, 34);
		contentPane.add(lblNewLabel_1);
		
		cboUpdateCat = new JComboBox<Object>();
		cboUpdateCat.setSelectedIndex(-1);
		buildcat();
		cboUpdateCat.setBounds(149, 121, 372, 34);
		contentPane.add(cboUpdateCat);
		
		txtUpdate = new JTextField();
		txtUpdate.setColumns(10);
		txtUpdate.setBounds(149, 201, 372, 34);
		contentPane.add(txtUpdate);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SELECTED CATEGORY");
		lblNewLabel_1_1_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(163, 166, 238, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtUpdate.getText().toUpperCase();
				int selectedIndex = cboUpdateCat.getSelectedIndex();
				
				if(name.equals("") && selectedIndex >= 5) {
					JOptionPane.showMessageDialog(contentPane, "CANNOT EDIT");
				} 
				else {
					
					cboUpdateCat.removeItemAt(selectedIndex);
					cboUpdateCat.insertItemAt(name, selectedIndex);
					txtUpdate.setText("");
					cboUpdateCat.setSelectedIndex(selectedIndex);
					int selectedRow = cboUpdateCat.getSelectedIndex();
					frameAdmin.modelCat.setValueAt(cboUpdateCat.getSelectedItem(), selectedRow,1);
					cboUpdateCat.setSelectedIndex(-1);
					cboUpdateCat.removeAllItems();
					buildcat();
					
					 
					JOptionPane.showMessageDialog(contentPane, "UPDATED SUCCESSFULLY");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(175, 284, 126, 34);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameUpdateCategory.this.dispose();
			}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(345, 284, 126, 34);
		contentPane.add(btnCancel);
	}

}
