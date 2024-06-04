package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("SGAE");
		setBackground(new Color(192, 192, 192));
		setLocationRelativeTo(null);
		setResizable(false);
		panel = new JPanel();
		panel.setBackground(new Color(238, 238, 238));
		setContentPane(panel);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Formulários de Extenção");
		
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBackground(new Color(57, 113, 190));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(933, 147, 316, 41);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						
						ExtensionForms extensionforms = new ExtensionForms();
						Point frame = getLocation();
						extensionforms.setLocation(frame);		
						extensionforms.setVisible(true);
						dispose();
						
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}	
				}
			});
		
			getContentPane().add(btnNewButton);
			
		JLabel lblImage = new JLabel();
		lblImage.setBackground(new Color(255, 255, 255));
			ImageIcon image = new ImageIcon(Home.class.getResource("/images/Forms-rafiki.png"));
			lblImage.setBounds(51, 100, 787, 471);
			image.setImage(image.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), 1));
			lblImage.setIcon(image);
			panel.add(lblImage);

	}
}
