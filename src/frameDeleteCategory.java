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
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameDeleteCategory extends JFrame {

	private JPanel contentPane;
	private JTable tblDeleteCat;
	private JComboBox<Object> cboDeleteCat;

	
	public void  buildcat() {
		
		String[] bookcat = frameAddBookCategory.getCat();
		for (String cate : bookcat) {
			cboDeleteCat.addItem(cate);
		}
		}
	
	public frameDeleteCategory() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteBookCategory = new JLabel("DELETE BOOK CATEGORY");
		lblDeleteBookCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteBookCategory.setForeground(new Color(102, 51, 255));
		lblDeleteBookCategory.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeleteBookCategory.setBounds(284, 23, 289, 44);
		contentPane.add(lblDeleteBookCategory);
		
		JLabel lblNewLabel_1 = new JLabel("AVAILABLE CATEGORIES");
		lblNewLabel_1.setForeground(new Color(102, 51, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(97, 89, 334, 34);
		contentPane.add(lblNewLabel_1);
		
		cboDeleteCat = new JComboBox<Object>();
		buildcat();
		cboDeleteCat.setSelectedIndex(-1);
		cboDeleteCat.setBounds(83, 121, 348, 34);
		contentPane.add(cboDeleteCat);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 188, 715, 252);
		contentPane.add(scrollPane);
		
		tblDeleteCat = new JTable(frameAdmin.modelCat) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
				}
			};	
		tblDeleteCat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tblDeleteCat.getTableHeader().setResizingAllowed(false);
		tblDeleteCat.getTableHeader().setReorderingAllowed(false); 
		frameAdmin.modelCat.setColumnIdentifiers(frameAdmin.columncat);
		scrollPane.setViewportView(tblDeleteCat);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int getCategory = cboDeleteCat.getSelectedIndex();
				if (cboDeleteCat.getSelectedIndex() >= 4) {
					cboDeleteCat.removeItemAt(cboDeleteCat.getSelectedIndex());
					frameAdmin.modelCat.removeRow(getCategory);
					
					cboDeleteCat.setSelectedIndex(-1);
					
					JOptionPane.showMessageDialog(contentPane, "SUCCESSFULLY REMOVED");
				}else {
					
					JOptionPane.showMessageDialog(contentPane, "Cannot Remove");
			}
			}
		});
		btnNewButton.setBackground(new Color(51, 51, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(524, 121, 102, 34);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameDeleteCategory.this.dispose();
			}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(648, 121, 102, 34);
		contentPane.add(btnCancel);
	}

}
