package view;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.ExtensionFormsController;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ExtensionFormScroll extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Variável que guarda true se a tentativa de salvamento ou de voltar for feita
	private boolean returnState = false;
	
	//Variável que guarda o nome do arquivo
	private String name;

	JComboBox<String> comboBox_1 = new JComboBox<String>();
	JComboBox<String> comboBox_2 = new JComboBox<String>();
	JComboBox<String> comboBox_3 = new JComboBox<String>();
	JComboBox<String> comboBox_4 = new JComboBox<String>();
	JComboBox<String> comboBox_5 = new JComboBox<String>();
	private JButton btnButton_1 = new JButton("Salvar");
	JButton btnButton_2 = new JButton("Voltar");
	JButton btnButton_3 = new JButton("Salvar");
	JLabel lblLabel_20 = new JLabel("Nome do arquivo:");
	JTextField txtField_2 = new JTextField();

	public boolean getReturnState() {
		return returnState;
	}
	
	public String getName() {
		return name;
	}

	public void setReturnState(boolean returnState) {
		this.returnState = returnState;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Método construtor da classe que gera a página do formulário com scroll 
	public ExtensionFormScroll() {
		
		this.setBackground(new Color(240, 240, 240));
		this.setSize(1367, 4000);
		
		
		//ArrayList com as escolhas feitas no formulário
		ArrayList<String> listChoices = new ArrayList<String>();
		
		JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 112, 192));
		
		JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_6 = new JPanel();
			panel_6.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			
		JPanel panel_7 = new JPanel();
			panel_7.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_8 = new JPanel();
			panel_8.setBorder(new LineBorder(new Color(154, 153, 150), 2));

		JPanel panel_9 = new JPanel();
			panel_9.setBorder(new LineBorder(new Color(154, 153, 150), 2));
		
		JPanel panel_10 = new JPanel();
			panel_10.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			
		JPanel panel_11 = new JPanel();
			panel_11.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			

		btnButton_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnButton_1.setBackground(new Color(73, 168, 53));
		btnButton_1.setForeground(new Color(255, 255, 255));
		
		txtField_2 = new JTextField();
		txtField_2.setToolTipText("Nome do arquivo");
		txtField_2.setColumns(10);
		
		btnButton_2.setForeground(Color.WHITE);
		btnButton_2.setFont(new Font("Dialog", Font.BOLD, 20));
		btnButton_2.setBackground(new Color(61, 56, 70));
		btnButton_2.setEnabled(false);
		btnButton_2.setVisible(false);
		
		btnButton_3.setForeground(Color.WHITE);
		btnButton_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnButton_3.setBackground(new Color(73, 168, 53));
		btnButton_3.setEnabled(false);
		btnButton_3.setVisible(false);
	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 1367, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 814, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE))
							.addGap(32)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(btnButton_2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
					.addComponent(lblLabel_20)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtField_2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnButton_3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnButton_1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
					.addGap(105))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(87)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnButton_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel_20)
						.addComponent(btnButton_2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addComponent(btnButton_3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(2401, Short.MAX_VALUE))
		);
		
		panel_1.setLayout(null);
		panel_2.setLayout(null);
		panel_3.setLayout(null);
		panel_4.setLayout(null);
		panel_5.setLayout(null);
		panel_6.setLayout(null);
		panel_7.setLayout(null);
		panel_8.setLayout(null);
		panel_9.setLayout(null);
		panel_10.setLayout(null);
		panel_11.setLayout(null);
		
		JLabel lblLabel_1 = new JLabel("FORMULÁRIO DE SUBMISSÃO DE AÇÃO DE EXTENSÃO");
			lblLabel_1.setBounds(310, 8, 747, 30);
			lblLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblLabel_1.setForeground(new Color(255, 255, 255));
			lblLabel_1.setFont(new Font("Tohama", Font.BOLD, 25));
			panel_1.add(lblLabel_1);
			setLayout(groupLayout);
		
		JPanel panel_2_1 = new JPanel();
			panel_2_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_2_1.setBackground(new Color(0, 112, 192));
			panel_2_1.setBounds(0, 0, 492, 40);
			panel_2.add(panel_2_1);
			panel_2_1.setLayout(null);
			
			JLabel lblLabel_2 = new JLabel("Modalidade de Proposta de Extensão");
			lblLabel_2.setForeground(new Color(255, 255, 255));
			lblLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_2.setBounds(34, 6, 424, 28);
			panel_2_1.add(lblLabel_2);
			
			comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Programa", "Projeto", "Núcleo Temático", "Evento", "Empresa Junior", "Liga Acadêmica", "Prestação de Serviço", "Curso"}));
			comboBox_1.setBounds(504, 4, 197, 32);
			panel_2.add(comboBox_1);
		
		JPanel panel_3_1 = new JPanel();
			panel_3_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_3_1.setBackground(new Color(0, 112, 192));
			panel_3_1.setBounds(0, 0, 145, 40);
			panel_3.add(panel_3_1);
			panel_3_1.setLayout(null);
			
		JLabel lblLabel_3 = new JLabel("Eventos");
			lblLabel_3.setForeground(new Color(255, 255, 255));
			lblLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_3.setBounds(27, 6, 91, 28);
			panel_3_1.add(lblLabel_3);
			
			comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Congresso", "Conferência", "Seminário", "Fórum", "Simpósio", "Oficina", "Palestra", "Mesa redonda", "Encontro", "Workshop", "Feira", "Semana", "Exposição", "Festival"}));
			comboBox_2.setBounds(158, 4, 135, 32);
			panel_3.add(comboBox_2);
			
		JPanel panel_4_1 = new JPanel();
			panel_4_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_4_1.setBackground(new Color(0, 112, 192));
			panel_4_1.setBounds(0, 0, 149, 40);
			panel_4.add(panel_4_1);
			panel_4_1.setLayout(null);
			
			JLabel lblLabel_4 = new JLabel("Cursos");
			lblLabel_4.setForeground(new Color(255, 255, 255));
			lblLabel_4.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_4.setBounds(34, 6, 77, 28);
			panel_4_1.add(lblLabel_4);
			
			comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Inicialização", "Atualização", "Formação", "Qualificação"}));
			comboBox_3.setBounds(165, 4, 137, 32);
			panel_4.add(comboBox_3);
			
		JPanel panel_5_1 = new JPanel();
			panel_5_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_5_1.setBackground(new Color(0, 112, 192));
			panel_5_1.setBounds(0, 0, 384, 40);
			panel_5.add(panel_5_1);
			panel_5_1.setLayout(null);
			
			JLabel lblLabel_5 = new JLabel("Área de Extensão Vinculada");
			lblLabel_5.setForeground(new Color(255, 255, 255));
			lblLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_5.setBounds(32, 6, 318, 28);
			panel_5_1.add(lblLabel_5);
			
			comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Ciências da Terra", "Ciências Humanas e Ciências Sociais Aplicadas", "Ciências da Vida", "Engenharias e Ciências Exatas"}));
			comboBox_4.setBounds(396, 4, 402, 32);
			panel_5.add(comboBox_4);
			
		JPanel panel_6_1 = new JPanel();
			panel_6_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_6_1.setBackground(new Color(0, 112, 192));
			panel_6_1.setBounds(0, 0, 239, 40);
			panel_6.add(panel_6_1);
			panel_6_1.setLayout(null);
			
			JLabel lblLabel_6 = new JLabel("Linha Extensão");
			lblLabel_6.setForeground(new Color(255, 255, 255));
			lblLabel_6.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_6.setBounds(34, 6, 174, 28);
			panel_6_1.add(lblLabel_6);
			
			comboBox_5.setModel(new DefaultComboBoxModel<String>(new String[] {"Cultura", "Comunicação", "Direitos Humanos e Justiça", "Educação", "Saúde", "Meio Ambiente", "Tecnologia e Produção", "Trabalho"}));
			comboBox_5.setBounds(257, 4, 172, 32);
			panel_6.add(comboBox_5);
			
		JPanel panel_7_1 = new JPanel();
			panel_7_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_7_1.setBackground(new Color(0, 112, 192));
			panel_7_1.setBounds(0, 0, 1367, 40);
			panel_7.add(panel_7_1);
			panel_7_1.setLayout(null);
			
			JLabel lblLabel_7 = new JLabel("Informações");
			lblLabel_7.setForeground(new Color(255, 255, 255));
			lblLabel_7.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_7.setBounds(613, 6, 141, 28);
			panel_7_1.add(lblLabel_7);
			
			JLabel lblLabel_7_1 = new JLabel("Título da Ação:");
			lblLabel_7_1.setBounds(10, 54, 113, 15);
			panel_7.add(lblLabel_7_1);
			
			JTextField txtField_1 = new JTextField("Digite seu texto aqui");
			txtField_1.setToolTipText("Título da Ação");
			txtField_1.setBounds(118, 52, 500, 20);
			panel_7.add(txtField_1);
			txtField_1.setColumns(10);
			
		JPanel panel_8_1 = new JPanel();
			panel_8_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_8_1.setBackground(new Color(0, 112, 192));
			panel_8_1.setBounds(0, 0, 1367, 40);
			panel_8.add(panel_8_1);
			panel_8_1.setLayout(null);
			
			JLabel lblLabel_8 = new JLabel("Apresentação da Ação de Extensão");
			lblLabel_8.setForeground(new Color(255, 255, 255));
			lblLabel_8.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_8.setBounds(483, 6, 401, 28);
			panel_8_1.add(lblLabel_8);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane_1.setBounds(2, 40, 1363, 158);
			panel_8.add(scrollPane_1);
			
			JTextArea txtrArea_1 = new JTextArea();
			txtrArea_1.setText("Digite seu texto aqui");
			scrollPane_1.setViewportView(txtrArea_1);
			txtrArea_1.setLineWrap(true);
			
		JPanel panel_9_1 = new JPanel();
			panel_9_1.setLayout(null);
			panel_9_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_9_1.setBackground(new Color(0, 112, 192));
			panel_9_1.setBounds(0, 0, 1367, 40);
			panel_9.add(panel_9_1);
			
			JLabel lblLabel_9 = new JLabel("Justificativa");
			lblLabel_9.setForeground(Color.WHITE);
			lblLabel_9.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_9.setBounds(615, 6, 136, 28);
			panel_9_1.add(lblLabel_9);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_2.setBounds(2, 40, 1363, 158);
			panel_9.add(scrollPane_2);
			
			JTextArea txtrArea_2 = new JTextArea();
			txtrArea_2.setText("Digite seu texto aqui");
			scrollPane_2.setViewportView(txtrArea_2);
			txtrArea_2.setLineWrap(true);
			
		JPanel panel_10_1 = new JPanel();
			panel_10_1.setLayout(null);
			panel_10_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_10_1.setBackground(new Color(0, 112, 192));
			panel_10_1.setBounds(0, 0, 1367, 40);
			panel_10.add(panel_10_1);
			
			JLabel lblLabel_10 = new JLabel("Objetivo Geral");
				lblLabel_10.setForeground(Color.WHITE);
				lblLabel_10.setFont(new Font("Dialog", Font.BOLD, 20));
				lblLabel_10.setBounds(483, 6, 401, 28);
				panel_10_1.add(lblLabel_10);
			
			JScrollPane scrollPane_3 = new JScrollPane();
				scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane_3.setBounds(2, 40, 1363, 158);
				panel_10.add(scrollPane_3);
			
			JTextArea txtrArea_3 = new JTextArea();
				txtrArea_3.setText("Digite seu texto aqui");
				scrollPane_3.setViewportView(txtrArea_3);
				txtrArea_3.setLineWrap(true);
			
		JPanel panel_11_1 = new JPanel();
			panel_11_1.setLayout(null);
			panel_11_1.setBorder(new LineBorder(new Color(154, 153, 150), 2));
			panel_11_1.setBackground(new Color(0, 112, 192));
			panel_11_1.setBounds(0, 0, 1367, 40);
			panel_11.add(panel_11_1);
			
			JLabel lblLabel_11 = new JLabel("Objetivo Específicas");
			lblLabel_11.setForeground(Color.WHITE);
			lblLabel_11.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLabel_11.setBounds(483, 6, 401, 28);
			panel_11_1.add(lblLabel_11);
			
			JScrollPane scrollPane_4 = new JScrollPane();
			scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_4.setBounds(2, 40, 1363, 158);
			panel_11.add(scrollPane_4);
			
			JTextArea txtrArea_4 = new JTextArea();
			txtrArea_4.setText("Digite seu texto aqui");
			scrollPane_4.setViewportView(txtrArea_4);
			txtrArea_4.setLineWrap(true);
			
			//Quando clicar em salvar(btnButton_1) transfere as escolhas feitas para um arraylist
			btnButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(comboBox_1.getSelectedItem() != null && 
					   comboBox_2.getSelectedItem() != null && 
					   comboBox_3.getSelectedItem() != null && 
					   comboBox_4.getSelectedItem() != null && 
					   comboBox_5.getSelectedItem() != null &&
					   txtField_1.getText() != null &&
					   txtField_2.getText() != null &&
					   txtrArea_1.getText() != null
					   ) {
					
							setName(txtField_2.getText());
							
							listChoices.add(comboBox_1.getSelectedItem().toString());
							listChoices.add(comboBox_2.getSelectedItem().toString());
							listChoices.add(comboBox_3.getSelectedItem().toString());
							listChoices.add(comboBox_4.getSelectedItem().toString());
							listChoices.add(comboBox_5.getSelectedItem().toString());
							listChoices.add(txtField_1.getText());
							listChoices.add(txtrArea_1.getText());
							
							try {
								
								if(ExtensionFormsController.createNewForm(getName(), listChoices, "folderSubmissionForms")) {
									
									JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
									setReturnState(true);
									
								}else {
									
									JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo","Error", JOptionPane.ERROR_MESSAGE);
									setReturnState(true);
									
								}
								
							} catch (IOException e1) {
								
								e1.printStackTrace();
							}
					}else {
						
						JOptionPane.showMessageDialog(null, "Preencha todos os campos do formulário ou o nome do arquivo já existe","Warning", JOptionPane.WARNING_MESSAGE);
						
					}		
				}
			
			});
			
			//Quando clicar em voltar(btnButton_2), volta para a tela ExtensionForms 
			btnButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					setReturnState(true);
					
				}
			});
			
			//Quando clicar em salvar(btnButton_3), transfere as escolhas feitas para um arraylist excluindo o arquivo e criando outro com mesmo nome
			btnButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						if(comboBox_1.getSelectedItem() != null && 
							   txtField_1.getText() != null &&
							   txtField_2.getText() != null &&
							   txtrArea_1.getText() != null
							   ) {
									
									listChoices.add(comboBox_1.getSelectedItem().toString());
									listChoices.add(comboBox_2.getSelectedItem().toString());
									listChoices.add(comboBox_3.getSelectedItem().toString());
									listChoices.add(comboBox_4.getSelectedItem().toString());
									listChoices.add(comboBox_5.getSelectedItem().toString());
									listChoices.add(txtField_1.getText());
									listChoices.add(txtrArea_1.getText());
									
									try {
										
										if(ExtensionFormsController.editForm(getName(), listChoices, "folderSubmissionForms")) {
											
											JOptionPane.showMessageDialog(null, "Arquivo editado com sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
											setReturnState(true);
											
										}else {
											
											JOptionPane.showMessageDialog(null, "Erro ao editar o arquivo","Error", JOptionPane.ERROR_MESSAGE);
											setReturnState(true);
											
										}
										
									} catch (IOException e1) {
										
										e1.printStackTrace();
									}
									
						}else {
								
							JOptionPane.showMessageDialog(null, "Preencha todos os campos do formulário","Warning", JOptionPane.WARNING_MESSAGE);
								
					}
		
				}
			});
	
	}	

	//Método que seta e bloqueia os campos para a visualização do formulário
	public void viewExtensionForm(String fileName) throws IOException {
		
		ArrayList<String> choices = ExtensionFormsController.readForm(fileName, "folderSubmissionForms");
		
		comboBox_1.setSelectedItem(choices.get(0));
		comboBox_1.setEnabled(false);
		comboBox_2.setSelectedItem(choices.get(1));
		comboBox_2.setEnabled(false);
		comboBox_3.setSelectedItem(choices.get(2));
		comboBox_3.setEnabled(false);
		comboBox_4.setSelectedItem(choices.get(3));
		comboBox_4.setEnabled(false);
		comboBox_5.setSelectedItem(choices.get(4));
		comboBox_5.setEnabled(false);
		btnButton_1.setEnabled(false);
		btnButton_1.setVisible(false);
		txtField_2.setEnabled(false);
		txtField_2.setVisible(false);
		lblLabel_20.setVisible(false);
		btnButton_2.setEnabled(true);
		btnButton_2.setVisible(true);
	}
	
	//Método que seta os campos para a edição do formulário
	public void editExtensionForm(String fileName) throws IOException {
		
		ArrayList<String> choices = ExtensionFormsController.readForm(fileName, "folderSubmissionForms");
		
		comboBox_1.setSelectedItem(choices.get(0));
		comboBox_2.setSelectedItem(choices.get(1));
		comboBox_3.setSelectedItem(choices.get(2));
		comboBox_4.setSelectedItem(choices.get(3));
		comboBox_5.setSelectedItem(choices.get(4));
		btnButton_1.setEnabled(false);
		btnButton_1.setVisible(false);
		txtField_2.setEnabled(false);
		txtField_2.setVisible(false);
		lblLabel_20.setVisible(false);
		btnButton_3.setEnabled(true);
		btnButton_3.setVisible(true);

		
		
	}
}