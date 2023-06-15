package metro_ticket_booking_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class merto {

	private JFrame frame;
	int i=0;
	int b=0;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					merto window = new merto();
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
	public merto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 851, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(274, 42, 243, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME OF PASSENGER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(129, 134, 178, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FROM STATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(129, 190, 128, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO STATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(129, 251, 128, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel IB_2 = new JLabel("NO OF TICKET:0");
		IB_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IB_2.setBounds(129, 355, 128, 14);
		frame.getContentPane().add(IB_2);
		
		tb1 = new JTextField();
		tb1.setBounds(366, 133, 178, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MIYAPUR", "LB NAGAR", "SECENDARBAD EAST", "SECENDARBAD WEST"}));
		comboBox.setBounds(366, 188, 178, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "AMEERPET", "LB NAGAR", "SECENDARBAD EAST", "SECENDARBAD WEST"}));
		comboBox_1.setBounds(366, 249, 178, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel IB_3 = new JLabel("TOTAL PRICE:0");
		IB_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IB_3.setBounds(129, 398, 143, 14);
		frame.getContentPane().add(IB_3);
		
		JButton btnNewButton = new JButton("ADD A TICKET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				IB_2.setText("NO OF TICKET:"+i);
				b=b+50;
				IB_3.setText("TOTAL PRICE:"+b);
				
				
			}
		});
		btnNewButton.setBounds(282, 302, 143, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("book ticket");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				JOptionPane.showMessageDialog(btnNewButton_1, " hello "+n+
						" your ticket is booked "+" have a nice trip vist agian");
			}
		});
		btnNewButton_1.setBounds(336, 433, 135, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\gg.jfif"));
		lblNewLabel_4.setBounds(147, 11, 125, 87);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
