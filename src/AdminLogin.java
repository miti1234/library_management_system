import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminLoginFrom = new JLabel("Admin Login Form");
		lblAdminLoginFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLoginFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdminLoginFrom.setBounds(135, 11, 163, 33);
		contentPane.add(lblAdminLoginFrom);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setBounds(50, 69, 104, 14);
		contentPane.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(135, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(50, 128, 75, 14);
		contentPane.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 125, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				if(name.equals("admin")&&password.equals("admin123")){
					AdminSuccess.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}

			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(176, 172, 89, 23);
		contentPane.add(btnLogin);
	}
}
