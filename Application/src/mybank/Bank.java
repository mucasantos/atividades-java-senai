package mybank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Bank {

	private JFrame frame;
	private JTextField fieldName;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank window = new Bank();
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
	public Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 886, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fieldName = new JTextField();
		fieldName.setBounds(97, 30, 272, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 69, 273, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel finalText = new JLabel("New label");
		finalText.setBounds(128, 171, 125, 14);
		frame.getContentPane().add(finalText);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = fieldName.getText();
				finalText.setText(name);
				
			
			}
		});
		btnNewButton.setBounds(251, 161, 118, 34);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(128, 109, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(41, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(246, 109, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(41, 217, 328, 33);
		frame.getContentPane().add(textArea);
		
		
	}
}
