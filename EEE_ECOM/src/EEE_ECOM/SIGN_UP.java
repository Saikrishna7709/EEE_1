package EEE_ECOM;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SIGN_UP {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGN_UP window = new SIGN_UP();
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
	public SIGN_UP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(328, 32, 139, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(116, 119, 84, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(116, 197, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEPT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(119, 259, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FAV PROG");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(116, 338, 116, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(315, 123, 176, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(299, 195, 71, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(394, 195, 84, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("TRANS");
		r3.setBounds(502, 195, 109, 23);
		frame.getContentPane().add(r3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		JCheckBox CB1 = new JCheckBox("C++");
		CB1.setBounds(306, 336, 59, 23);
		frame.getContentPane().add(CB1);
		
		JCheckBox CB2 = new JCheckBox("PHYTON");
		CB2.setBounds(367, 336, 100, 23);
		frame.getContentPane().add(CB2);
		
		JCheckBox CB3 = new JCheckBox("JAVA");
		CB3.setBounds(468, 336, 64, 23);
		frame.getContentPane().add(CB3);
		
		JCheckBox CB4 = new JCheckBox("C");
		CB4.setBounds(534, 336, 44, 23);
		frame.getContentPane().add(CB4);
		
		JCheckBox CB5 = new JCheckBox("HTML");
		CB5.setBounds(604, 336, 97, 23);
		frame.getContentPane().add(CB5);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "CIVIL", "CSE", "MINING", "MECH"}));
		c1.setBounds(315, 257, 116, 22);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String g;
				if(r1.isSelected()) {
					g="MALE";
				}
				else if(r2.isSelected()) {
						g="FEMALE";
				}
				else if(r3.isSelected()) {
					g="TRANS";
				}
				else {
					g="invaid";
				}
				String b=(String)c1.getSelectedItem();
				String p = null;
				if(CB1.isSelected()) {
					p="c++";
				}
				else if(CB2.isSelected()) {
				    p="java";
			    
				}
			    	
			    
			JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n gender:"+g+"\n branch"+b+"\n programming"+p);
			
			
			     
			}
				
		    
		});
		btnNewButton.setBounds(311, 413, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
