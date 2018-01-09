import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueBooks extends JFrame {
	static IssueBooks frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBooks frame = new IssueBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IssueBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Issue Books");
		lblNewLabel.setBounds(178, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Call No");
		lblNewLabel_1.setBounds(26, 58, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student id");
		lblNewLabel_2.setBounds(26, 107, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sudent Name");
		lblNewLabel_3.setBounds(26, 164, 90, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student Contact No");
		lblNewLabel_4.setBounds(26, 210, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Issue Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String bookcallno=textField.getText();
				int studentid=Integer.parseInt(textField_1.getText());
				String studentname=textField_2.getText();
				String studentcontact=textField_3.getText();
				
				if(IssueBooksDao.checkBook(bookcallno)){
				
				int i=IssueBooksDao.save(bookcallno, studentid, studentname, studentcontact);
				if(i>0){
					JOptionPane.showMessageDialog(IssueBooks.this,"Book issued successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(IssueBooks.this,"Sorry, unable to issue!");
				}//end of save if-else
				
				}else{
					JOptionPane.showMessageDialog(IssueBooks.this,"Sorry, Callno doesn't exist!");
				}//end of checkbook if-else
				
				
			}
		});
		btnNewButton.setBounds(95, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(228, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(130, 55, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 104, 194, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 161, 194, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 207, 194, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
