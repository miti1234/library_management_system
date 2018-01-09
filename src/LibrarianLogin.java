import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin extends JFrame {
	static LibrarianLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin frame = new LibrarianLogin();
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
	public LibrarianLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLibrarianLoginForm = new JLabel("Librarian Login Form");
		lblLibrarianLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLibrarianLoginForm.setBounds(118, 11, 188, 22);
		contentPane.add(lblLibrarianLoginForm);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterName.setBounds(23, 77, 121, 14);
		contentPane.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(154, 76, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterPassword.setBounds(44, 142, 100, 14);
		contentPane.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 141, 138, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				if(LibrarianDao.validate(name, password)){
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		btnLogin.setBounds(179, 198, 89, 23);
		contentPane.add(btnLogin);
	}

}
