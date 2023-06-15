package EEE_ECOM;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRIEND {

	private JFrame frame;
	private JTextField tp1;
	private JTextField tp2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRIEND window = new FRIEND();
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
	public FRIEND() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 860, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP %");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(290, 37, 233, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb4 = new JLabel("NAME:");
		lb4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lb4.setBounds(121, 147, 144, 24);
		frame.getContentPane().add(lb4);
		
		JLabel lb5 = new JLabel("FRIEND NAME:");
		lb5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lb5.setBounds(121, 211, 165, 24);
		frame.getContentPane().add(lb5);
		
		tp1 = new JTextField();
		tp1.setBounds(345, 147, 156, 20);
		frame.getContentPane().add(tp1);
		tp1.setColumns(10);
		
		tp2 = new JTextField();
		tp2.setBounds(350, 211, 151, 20);
		frame.getContentPane().add(tp2);
		tp2.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb.setBounds(639, 168, 144, 37);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int n=r.nextInt(1,500);
				lb.setText(n+"%");
			}
		});
		btnNewButton.setBounds(264, 317, 96, 31);
		frame.getContentPane().add(btnNewButton);
	}
}
