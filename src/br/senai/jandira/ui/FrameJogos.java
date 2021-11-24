package br.senai.jandira.ui;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.jandira.model.Console;
import br.senai.jandira.model.Jogos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class FrameJogos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField valorTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameJogos frame = new FrameJogos();
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
	    public FrameJogos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(29, 32, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(29, 74, 79, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setBounds(29, 112, 46, 14);
		contentPane.add(lblZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(29, 160, 63, 14);
		contentPane.add(lblConsole);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(29, 199, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setBounds(29, 249, 106, 14);
		contentPane.add(lblObservacoes);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(104, 29, 106, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JComboBox fabricanteBox = new JComboBox();
		fabricanteBox.setModel(new DefaultComboBoxModel(new String[] {"SEGA", "CAPCOM", "KONAMI", "BANDAI NAMCO", "EA", "UBISOFT", "EPIC", "NINTENDO", "TENCENT", "ACTVISION", "KONAMI", "ROCKSTAR", "NAUGHTY DOG ", "ENIX ", "BLIZZARD"}));
		fabricanteBox.setToolTipText("SEGA\r\nCAPCOM\r\nKONAMI\r\nBANDAI NAMCO\r\nEA\r\nUBISOFT\r\nEPIC\r\nNINTENDO\r\nTENCENT\r\nACTVISION\r\nKONAMI\r\nROCKSTAR\r\nNAUGHTY DOG \r\nENIX \r\nBLIZZARD\r\n");
		fabricanteBox.setBounds(104, 70, 106, 22);
		contentPane.add(fabricanteBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("sim");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(101, 108, 54, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("n\u00E3o");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(158, 108, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox consoleBox = new JComboBox();
		consoleBox.setBounds(102, 156, 108, 22);
		consoleBox.setModel(new DefaultComboBoxModel(Console.values()));
		contentPane.add(consoleBox);
		
		JComboBox comboConsole = new JComboBox();
		DefaultComboBoxModel<String> comboModelPeriodo = 
				new DefaultComboBoxModel<String>();
		 
		//carregar o combo model com as descriçoes dos consoles
		for (Console console : Console.values()) {
			
			comboModelPeriodo.addElement(console.getDescricao());
			
		}
		
		
		valorTextField = new JTextField();
		valorTextField.setBounds(104, 196, 106, 20);
		contentPane.add(valorTextField);
		valorTextField.setColumns(10);
		
		JEditorPane observacoesEditorPane = new JEditorPane();
		observacoesEditorPane.setBackground(UIManager.getColor("Button.light"));
		observacoesEditorPane.setForeground(UIManager.getColor("CheckBox.light"));
		observacoesEditorPane.setBounds(113, 243, 97, 66);
		contentPane.add(observacoesEditorPane);
		
		JLabel lblNewLabel_6 = new JLabel("Meus jogos:");
		lblNewLabel_6.setBounds(262, 32, 79, 14);
		contentPane.add(lblNewLabel_6);
		
		JScrollPane jogosPane = new JScrollPane();
		jogosPane.setBounds(262, 66, 132, 147);
		contentPane.add(jogosPane);
		
		JPanel panel = new JPanel();
		jogosPane.setViewportView(panel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(273, 237, 106, 39);
		contentPane.add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogos jogo = new Jogos();
				jogo.setConcluido(rootPaneCheckingEnabled);
				jogo.setNome(textFieldNome.getText());
				jogo.getFabricante();
				
			}
		});
	
		DefaultListModel <String> modelJogos = 
				new DefaultListModel<String>();
	    }
	    }
