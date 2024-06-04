package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CreateExtensionForm extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateExtensionForm frame = new CreateExtensionForm();
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
	public CreateExtensionForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("SGAE");
		setBackground(new Color(240, 240, 240));
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(0, 0, 1385, 661);
			scrollPane.getVerticalScrollBar().setUnitIncrement(10);
			contentPane.add(scrollPane);
			
		ExtensionFormScroll extensionFormScroll = new ExtensionFormScroll();
		scrollPane.setViewportView(extensionFormScroll);
		
		//Nova execução em paralelo com a anterior
		Thread 	checkState = new Thread(
			
		   ()-> { while(true) {
			   
			   System.out.println(extensionFormScroll.getReturnState());
				
						if(extensionFormScroll.getReturnState()) {
							
							System.out.println(extensionFormScroll.getReturnState());
							
							Point frame = getLocation();

							try {
								
								ExtensionForms extensionforms = new ExtensionForms();
								extensionforms.setLocation(frame);		
								extensionforms.setVisible(true);
								dispose();
								break;
								
							} catch (IOException e) {

								e.printStackTrace();
							}
						}
					}
				}
		);
		
		checkState.start();
	}
}