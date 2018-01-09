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

public class AdminSuccess extends JFrame {
	static AdminSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSuccess frame = new AdminSuccess();
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
	public AdminSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setBounds(122, 11, 166, 36);
		contentPane.add(lblAdminSection);
		
		JButton btnAddLibrarian = new JButton("Add Librarian");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddLibrarian.setBounds(132, 58, 132, 23);
		contentPane.add(btnAddLibrarian);
		
		JButton btnViewLibrarian = new JButton("View Librarian");
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewLibrarian.main(new String[]{});
				frame.dispose();
		
			}
		});
		btnViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnViewLibrarian.setBounds(135, 110, 129, 23);
		contentPane.add(btnViewLibrarian);
		
		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteLibrarian.main(new String[]{});
				frame.dispose();
		
			}
		});
		btnDeleteLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDeleteLibrarian.setBounds(135, 162, 129, 23);
		contentPane.add(btnDeleteLibrarian);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
		
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogout.setBounds(140, 212, 124, 23);
		contentPane.add(btnLogout);
	}

}
