package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapp1 {

	protected static final int YES_OPTION = 0;
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
					movieapp1 window = new movieapp1();
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
	public movieapp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKETS BOOKING");
		lblNewLabel.setBounds(176, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(83, 85, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setBounds(83, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setBounds(83, 187, 119, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(212, 82, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "PUSHPA", "VIKRAM"}));
		cb1.setBounds(212, 141, 86, 22);
		frame.getContentPane().add(cb1);
		
		tb2 = new JTextField();
		tb2.setBounds(212, 193, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String movie = (String) cb1.getSelectedItem();
				String tickets = tb2.getText();
				int nt = Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("SALAAR")) {
					bill = bill+100*nt;
				}
				if(movie.equals("PUSHPA")) {
					bill = bill+150*nt;
				}
				if(movie.equals("VIKRAM")) {
					bill = bill+50*nt;
				}
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton,  "Name "+name+ "\nMovie "+movie+ "\nNUM TICKS "+tickets+"\nAmount "+bill);
				if(res == YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CON");
				}
				else  {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CAN");
				}
				
        
				
	
			}
		});
		btnNewButton.setBounds(176, 236, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\on line lab\\Desktop\\ee.jpg"));
		lblNewLabel_4.setBounds(0, -11, 520, 381);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
