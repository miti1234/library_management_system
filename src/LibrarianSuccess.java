import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianSuccess frame = new LibrarianSuccess();
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
	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Librarian Section");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 11, 168, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnAddBooks.setBounds(137, 44, 128, 23);
		contentPane.add(btnAddBooks);
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
				frame.dispose();}
		});
		btnViewBooks.setBounds(142, 78, 121, 23);
		contentPane.add(btnViewBooks);
		
		JButton btnIssueBook = new JButton("Issue Books");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBooks.main(new String[]{});
				frame.dispose();
			}
		});
		btnIssueBook.setBounds(142, 111, 121, 23);
		contentPane.add(btnIssueBook);
		
		JButton btnViewIssued = new JButton("View Issued Books");
		btnViewIssued.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewIssued.setBounds(142, 146, 121, 23);
		contentPane.add(btnViewIssued);
		
		JButton btnReturn = new JButton("Return Books");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBooks.main(new String[]{});
				frame.dispose();
			}
		});
		btnReturn.setBounds(142, 180, 121, 23);
		contentPane.add(btnReturn);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setBounds(142, 214, 121, 23);
		contentPane.add(btnLogout);
	}
}
