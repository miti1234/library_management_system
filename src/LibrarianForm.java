import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianForm extends JFrame {
	static LibrarianForm frame;
	private JPanel contentPane;
	private JTextField cont;
	private JTextField city;
	private JTextField address;
	private JTextField email;
	private JPasswordField password;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianForm frame = new LibrarianForm();
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
	public LibrarianForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Librarian");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(124, 11, 160, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(56, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(56, 82, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(56, 107, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(56, 138, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		lblNewLabel_5.setBounds(56, 163, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact Number");
		lblNewLabel_6.setBounds(56, 184, 88, 14);
		contentPane.add(lblNewLabel_6);
		
		cont = new JTextField();
		cont.setBounds(154, 187, 130, 20);
		contentPane.add(cont);
		cont.setColumns(10);
		
		city = new JTextField();
		city.setBounds(156, 163, 128, 17);
		contentPane.add(city);
		city.setColumns(10);
		
		address = new JTextField();
		address.setBounds(155, 135, 129, 20);
		contentPane.add(address);
		address.setColumns(10);
		
		email = new JTextField();
		email.setBounds(154, 104, 130, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(154, 79, 130, 20);
		contentPane.add(password);
		
		name = new JTextField();
		name.setBounds(154, 54, 130, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Librarian");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String names=name.getText();
				String passwords=String.valueOf(password.getPassword());
				String emails=email.getText();
				String addresss=address.getText();
				String citys=city.getText();
				String contact=cont.getText();
				
				int i=LibrarianDao.save(names,passwords,emails,addresss,citys,contact);
				if(i>0)
				{
					JOptionPane.showMessageDialog(LibrarianForm.this,"Librarian Added Successfully!");
				}
				else
				{
					JOptionPane.showMessageDialog(LibrarianForm.this,"Error Occured!");
				}
			}
		});
		btnNewButton.setBounds(82, 218, 119, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(244, 218, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
