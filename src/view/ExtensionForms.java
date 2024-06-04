package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import javax.swing.SwingConstants;

import controller.ExtensionFormsController;

import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class ExtensionForms extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtensionForms frame = new ExtensionForms();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ExtensionForms() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("SGAE");
		setBackground(new Color(240, 240, 240));
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBackground(new Color(58, 113, 190));
			panel_1.setBounds(0, 0, 1400, 74);
			contentPane.add(panel_1);
		
		JButton btnButton_1 = new JButton("Voltar");
			btnButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Point frame = getLocation();
					Home home = new Home();
					home.setLocation(frame);
					home.setVisible(true);
					dispose();
		
				}
			});
			btnButton_1.setBounds(51, 18, 116, 39);
			panel_1.add(btnButton_1);
			
		JButton btnButton_2 = new JButton("Criar Formulário de Extensão");
			btnButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Point frame = getLocation();
					CreateExtensionForm createExForm = new CreateExtensionForm();
					createExForm.setLocation(frame);
					createExForm.setVisible(true);
					dispose();
					
				}
			});
			btnButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnButton_2.setBounds(1002, 18, 359, 39);
			panel_1.add(btnButton_2);
		
		JSeparator separator = new JSeparator();
			separator.setBackground(new Color(34, 13, 90));
			separator.setBounds(0, 73, 1400, 13);
			contentPane.add(separator);
			
		JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setBounds(291, 234, 430, 363);
			scrollPane.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			contentPane.add(scrollPane);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_2.setBackground(new Color(57, 113, 190));
			panel_2.setBounds(291, 189, 430, 50);
			panel_2.setLayout(null);
			contentPane.add(panel_2);
			
			
			JLabel lblLabel_1 = new JLabel("FORMULÁRIOS CRIADOS");
			lblLabel_1.setForeground(new Color(246, 245, 244));
			lblLabel_1.setBounds(43, 10, 343, 30);
			lblLabel_1.setBackground(new Color(57, 113, 190));
			lblLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
			panel_2.add(lblLabel_1);
			
			
			//Criando um DefaultistModel para o JList
			DefaultListModel<String> listModel = new DefaultListModel<String>();
			
			//Colocando os itens do ArrayList dentro do ListModel
			for(String list:ExtensionFormsController.readFolder("folderSubmissionForms")) {
					
				listModel.addElement(list);
					
			}
			
			JList<String> list_1 = new JList<String>(listModel);
			scrollPane.setViewportView(list_1);
			
			
			JLabel lblLabel_2 = new JLabel("Nome do arquivo");
			lblLabel_2.setBounds(917, 212, 133, 15);
			contentPane.add(lblLabel_2);
			
			JLabel lblLabel_3 = new JLabel("coloque o nome do arquivo sem o .txt no final");
			lblLabel_3.setForeground(new Color(154, 153, 150));
			lblLabel_3.setBounds(917, 258, 335, 20);
			contentPane.add(lblLabel_3);
			
			
			textField = new JTextField();
			textField.setBounds(917, 228, 184, 29);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JButton btnButton_3 = new JButton("Visualizar Formulário");
			btnButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						
						ArrayList<String> listFile = ExtensionFormsController.readFolder(textField.getText());
						
						if(listFile != null) {
							
							
							
						}else {
							
							JOptionPane.showMessageDialog(null, "Erro ao tentar visualizar o arquivo","Error", JOptionPane.ERROR_MESSAGE);
							
						}
						
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
				}
			});
			btnButton_3.setBounds(917, 308, 184, 29);
			contentPane.add(btnButton_3);
			
			
			JButton btnButton_4 = new JButton("Editar Formulário");
			btnButton_4.setBounds(917, 381, 184, 29);
			contentPane.add(btnButton_4);
			
			JButton btnButton_5 = new JButton("Excluir Formulário");
			btnButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						
						if(ExtensionFormsController.deleteForm(textField.getText())) {
						
							JOptionPane.showMessageDialog(null, "Arquivo excluido com sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
							Point frame = getLocation();
							ExtensionForms extensionforms = new ExtensionForms();
							extensionforms.setLocation(frame);		
							extensionforms.setVisible(true);
							dispose();
							
						}else {
							
							JOptionPane.showMessageDialog(null, "Erro ao excluir o arquivo","Error", JOptionPane.ERROR_MESSAGE);
							
						}
						
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
				}
			});
			btnButton_5.setBounds(917, 455, 184, 29);
			contentPane.add(btnButton_5);
			
			JButton btnButton_6 = new JButton("Avaliar Formulário");
			btnButton_6.setBounds(917, 525, 184, 29);
			contentPane.add(btnButton_6);
			
			
	}
}
