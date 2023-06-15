package EEE_SENT_DATA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DataSending {

	private JFrame frame;
	private JTextField textField;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataSending window = new DataSending();
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
	public DataSending() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 905, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S NO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(137, 130, 58, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(137, 226, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MARKS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(137, 318, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(262, 129, 33, -1);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		tb1 = new JTextField();
		tb1.setBounds(238, 129, 309, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(248, 225, 287, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		tb3 = new JTextField();
		tb3.setBounds(250, 317, 265, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tb1.getText();
				int sn=Integer.parseInt(s);
				String n=tb2.getText();
				
				String m=tb3.getText();
				Float ma=Float.parseFloat(m);
				try {
					Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EEE","root","mrec");
					String q="insert into student values('"+sn+"','"+n+"','"+ma+"')";
			        Statement sta=Con.createStatement();
					sta.execute(q);
					Con.close();
					JOptionPane.showMessageDialog(btnNewButton, "DONE");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(332, 418, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
