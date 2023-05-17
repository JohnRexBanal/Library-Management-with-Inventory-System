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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameDeleteBook extends JFrame {

	private JPanel contentPane;
	private JTable tblDelete;


	public frameDeleteBook() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteBookRecord = new JLabel("DELETE BOOK RECORD");
		lblDeleteBookRecord.setForeground(new Color(102, 51, 255));
		lblDeleteBookRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteBookRecord.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeleteBookRecord.setBounds(236, 11, 284, 32);
		contentPane.add(lblDeleteBookRecord);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 54, 719, 402);
		contentPane.add(scrollPane);
		
		tblDelete = new JTable(frameAdmin.modelBookList) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};	
		tblDelete.getTableHeader().setResizingAllowed(false);
		tblDelete.getTableHeader().setReorderingAllowed(false); 
		tblDelete.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelBookList.setColumnIdentifiers(frameAdmin.columnBookList);
		scrollPane.setViewportView(tblDelete);
		
		JButton btnSave = new JButton("DELETE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frameAdmin.modelBookList.getRowCount() > 0) {
					
					int response = JOptionPane.showConfirmDialog(contentPane, "Are you sure to delete?");
							
					if (response == JOptionPane.YES_OPTION) {	
						
						frameAdmin.modelBookList.removeRow(tblDelete.getSelectedRow());
					}else {
						JOptionPane.showMessageDialog(contentPane, "Please Select A row to Delete:");
					}	
					}else {
						JOptionPane.showMessageDialog(contentPane, "No existing Records");
					}
				}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(51, 51, 255));
		btnSave.setBounds(71, 465, 108, 35);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("BACK");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameDeleteBook.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(211, 465, 108, 35);
		contentPane.add(btnCancel);
	}

}
