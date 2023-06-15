package EEE_SENT_DATA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login {

	protected static final Connection Con = null;
	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USE NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(86, 136, 108, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(86, 221, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(235, 137, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(235, 218, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un=tb1.getText();
				String ps=tb2.getText();
				try {
					
					Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EEE","root","mrec");
					String q="select count(*) from login where username=? and password=?";
					PreparedStatement pss=Con.prepareStatement(q);
					pss.setString(1,un);
					pss.setString(2,ps);
					ResultSet rs=pss.executeQuery();
					rs.next();
					int c=rs.getInt(1);
					if (c==0) {
						JOptionPane.showMessageDialog(btnNewButton, "invalid");
					}
					else {
						
						JOptionPane.showMessageDialog(btnNewButton, "login done");
					}
					//String q="insert into login values('"+un+"','"+ps+"')";
					//Statement sta=Con.createStatement();
					//sta.execute(q);
					//Con.close();
					//JOptionPane.showMessageDialog(btnNewButton, "DONE");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String q="insert into student value('"+un+"','"+ps+"')";
				
				}
		});
		btnNewButton.setBounds(138, 292, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
