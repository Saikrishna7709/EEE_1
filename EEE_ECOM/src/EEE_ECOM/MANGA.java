package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MANGA {

	private JFrame frmManga;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MANGA window = new MANGA();
					window.frmManga.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MANGA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManga = new JFrame();
		frmManga.getContentPane().setBackground(new Color(255, 255, 255));
		frmManga.setTitle("MANGA");
		frmManga.setBounds(100, 100, 893, 566);
		frmManga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManga.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("MANGA");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_3.setBounds(386, 41, 142, 32);
		frmManga.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS.500");
		lblNewLabel_4.setBounds(132, 373, 46, 14);
		frmManga.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS.700");
		lblNewLabel_5.setBounds(442, 361, 46, 14);
		frmManga.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS.1000");
		lblNewLabel_6.setBounds(732, 361, 73, 14);
		frmManga.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "OPEN", "PAGES"}));
		comboBox.setBounds(94, 405, 84, 22);
		frmManga.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "OPEN", "PAGES"}));
		comboBox_1.setBounds(408, 405, 80, 22);
		frmManga.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "OPEN", "PAGES"}));
		comboBox_2.setBounds(712, 405, 79, 22);
		frmManga.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART:0");
		lb.setBounds(712, 41, 93, 14);
		frmManga.getContentPane().add(lb);
		JLabel lb_1 = new JLabel("total price :0");
		lb_1.setBounds(709, 66, 113, 14);
		frmManga.getContentPane().add(lb_1);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				b=b+500;
				lb_1.setText("total price:"+b);
			}
		});
		btnNewButton.setBounds(89, 451, 120, 23);
		frmManga.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				b=b+700;
				lb_1.setText("total price:"+b);
			}
		});
		btnNewButton_1.setBounds(408, 451, 120, 23);
		frmManga.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD TO CART");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				b=b+1000;
				lb_1.setText("total price:"+b);
			}
		});
		btnNewButton_2.setBounds(687, 451, 135, 23);
		frmManga.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\Capture2.PNG"));
		lblNewLabel.setBounds(89, 142, 115, 208);
		frmManga.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\Capture3.PNG"));
		lblNewLabel_1.setBounds(386, 153, 120, 177);
		frmManga.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\Capture4.PNG"));
		lblNewLabel_2.setBounds(687, 122, 135, 195);
		frmManga.getContentPane().add(lblNewLabel_2);
		
		
	}
}
