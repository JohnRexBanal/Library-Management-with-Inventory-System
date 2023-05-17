import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameDeleteStudent extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tblDelete;

	
	public frameDeleteStudent() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(5, 5, 0, 492);
		contentPane.add(table);
		
		JLabel lblDeleteStudentRecords = new JLabel("DELETE STUDENT RECORDS");
		lblDeleteStudentRecords.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStudentRecords.setForeground(new Color(102, 51, 255));
		lblDeleteStudentRecords.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeleteStudentRecords.setBounds(240, 21, 302, 37);
		contentPane.add(lblDeleteStudentRecords);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 85, 710, 337);
		contentPane.add(scrollPane);
		
		tblDelete = new JTable(frameAdmin.modelStudent) {
			public boolean editCelAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};		
		tblDelete.getTableHeader().setResizingAllowed(false);
		tblDelete.getTableHeader().setReorderingAllowed(false); 
		tblDelete.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frameAdmin.modelStudent.setColumnIdentifiers(frameAdmin.columnstudent);
		scrollPane.setViewportView(tblDelete);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frameAdmin.modelStudent.getRowCount() > 0) {
					
					int response = JOptionPane.showConfirmDialog(contentPane, "Are you sure to delete?");
							
					if (response == JOptionPane.YES_OPTION) {	
						
						frameAdmin.modelStudent.removeRow(tblDelete.getSelectedRow());
					}else {
						JOptionPane.showMessageDialog(contentPane, "Please Select A row to Delete:");
					}	
					}else {
						JOptionPane.showMessageDialog(contentPane, "No existing Records");
					}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete.setBorder(null);
		btnDelete.setBackground(new Color(51, 51, 255));
		btnDelete.setBounds(92, 447, 89, 28);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this form?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frameDeleteStudent.this.dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(51, 51, 255));
		btnCancel.setBounds(212, 448, 89, 28);
		contentPane.add(btnCancel);
	}

}
