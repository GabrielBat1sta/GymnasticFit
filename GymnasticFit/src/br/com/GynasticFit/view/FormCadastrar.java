package br.com.GynasticFit.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

public class FormCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastrar frame = new FormCadastrar();
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
	public FormCadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(223,38,941,587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("MG\r\nSP");
		panel.setBounds(10, 11, 754, 216);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente: ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 36, 155, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 51, 245, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnderecoDoCliente = new JLabel("Endereco do Cliente:");
		lblEnderecoDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEnderecoDoCliente.setBounds(10, 87, 155, 14);
		panel.add(lblEnderecoDoCliente);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 101, 245, 25);
		panel.add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCpf.setBounds(265, 36, 155, 14);
		panel.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(265, 51, 123, 25);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(398, 51, 123, 25);
		panel.add(textField_3);
		
		JLabel lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNascimento.setBounds(398, 36, 97, 14);
		panel.add(lblNascimento);
		
		JLabel lblN = new JLabel("N:");
		lblN.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblN.setBounds(265, 87, 62, 14);
		panel.add(lblN);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 101, 62, 25);
		panel.add(textField_4);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(337, 87, 79, 14);
		panel.add(lblBairro);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(337, 101, 126, 25);
		panel.add(textField_5);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEstado.setBounds(473, 87, 48, 14);
		panel.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "MG", "SP", "RJ", "ES"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(473, 101, 48, 24);
		panel.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(531, 51, 123, 25);
		panel.add(textField_6);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(531, 36, 89, 14);
		panel.add(lblTelefone);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(531, 101, 123, 25);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(664, 101, 80, 25);
		panel.add(textField_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-", "Ativo", "Desativado"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(664, 51, 80, 25);
		panel.add(comboBox_1);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(531, 87, 48, 14);
		panel.add(lblCidade);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(664, 87, 48, 14);
		panel.add(lblCep);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 154, 245, 25);
		panel.add(textField_9);
		
		JLabel lblEmailDoCliente = new JLabel("E-mail do  Cliente:");
		lblEmailDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmailDoCliente.setBounds(10, 140, 155, 14);
		panel.add(lblEmailDoCliente);
		
		JLabel lblCategoriaplano = new JLabel("Categoria/Plano:");
		lblCategoriaplano.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCategoriaplano.setBounds(265, 140, 155, 14);
		panel.add(lblCategoriaplano);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-", "Mensal", "Trimestral", "Anual"}));
		comboBox_2.setBounds(265, 154, 198, 24);
		panel.add(comboBox_2);
		
		JButton btnNewButton = new JButton("           Salvar Dados do Cliente");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\salvar.png"));
		btnNewButton.setBounds(473, 146, 271, 40);
		panel.add(btnNewButton);
		
		JLabel lblDadosCadastrais = new JLabel(":: Dados Cadastrais ::");
		lblDadosCadastrais.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosCadastrais.setBounds(10, 0, 155, 14);
		panel.add(lblDadosCadastrais);
		
		JLabel lblStatusCliente = new JLabel("Status Cliente:");
		lblStatusCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblStatusCliente.setBounds(664, 36, 90, 14);
		panel.add(lblStatusCliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(773, 11, 147, 216);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFotoAlunocliente = new JLabel("::Foto Aluno/Cliente ::");
		lblFotoAlunocliente.setBounds(0, 0, 163, 14);
		panel_1.add(lblFotoAlunocliente);
		lblFotoAlunocliente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 238, 905, 91);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDadosDo = new JLabel(":: Dados do Responsavel Financeiro ::");
		lblDadosDo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosDo.setBounds(10, 0, 268, 14);
		panel_2.add(lblDadosDo);
		
		JLabel lblNomeDoResponsavel = new JLabel("Nome do Responsavel: ");
		lblNomeDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNomeDoResponsavel.setBounds(10, 41, 155, 14);
		panel_2.add(lblNomeDoResponsavel);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 55, 245, 25);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(265, 55, 245, 25);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(520, 55, 123, 25);
		panel_2.add(textField_12);
		
		JLabel lblCpfDoResponsavel = new JLabel("CPF do Responsavel:");
		lblCpfDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCpfDoResponsavel.setBounds(520, 41, 123, 14);
		panel_2.add(lblCpfDoResponsavel);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		lblParentesco.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblParentesco.setBounds(653, 41, 123, 14);
		panel_2.add(lblParentesco);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"-", "Pai", "M\u00E3e", "V\u00F3", "V\u00F4", "Tio", "Tia"}));
		comboBox_3.setToolTipText("");
		comboBox_3.setBounds(653, 55, 100, 24);
		panel_2.add(comboBox_3);
		
		JLabel lblEmailDoResponsavel = new JLabel("E-mail do Responsavel:");
		lblEmailDoResponsavel.setBounds(265, 41, 155, 14);
		panel_2.add(lblEmailDoResponsavel);
		lblEmailDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 340, 299, 155);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDadosFinanceiro = new JLabel(":: Dados Financeiro ::");
		lblDadosFinanceiro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosFinanceiro.setBounds(10, 0, 163, 14);
		panel_3.add(lblDadosFinanceiro);
		
		JLabel lblDiaVencimento = new JLabel("Dia Vencimento:");
		lblDiaVencimento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDiaVencimento.setBounds(10, 52, 109, 14);
		panel_3.add(lblDiaVencimento);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox_2_1.setBounds(10, 67, 132, 24);
		panel_3.add(comboBox_2_1);
		
		JLabel lblTipoDeCliente = new JLabel("Tipo de Cliente:");
		lblTipoDeCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTipoDeCliente.setBounds(157, 52, 109, 14);
		panel_3.add(lblTipoDeCliente);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"-", "A VISTA", "CART\u00C3O"}));
		comboBox_2_1_1.setBounds(157, 67, 132, 24);
		panel_3.add(comboBox_2_1_1);
		
		JLabel lblValorParcela = new JLabel("Valor Parcela:");
		lblValorParcela.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblValorParcela.setBounds(10, 102, 109, 14);
		panel_3.add(lblValorParcela);
		
		JLabel lblDataDoCadastro = new JLabel("Data do Cadastro:");
		lblDataDoCadastro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDataDoCadastro.setBounds(157, 102, 109, 14);
		panel_3.add(lblDataDoCadastro);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(10, 115, 132, 25);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(157, 115, 132, 25);
		panel_3.add(textField_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(330, 340, 585, 155);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblObservacoes = new JLabel(":: OBSERVACOES ::");
		lblObservacoes.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblObservacoes.setBounds(10, 0, 163, 14);
		panel_4.add(lblObservacoes);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 40, 565, 93);
		panel_4.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Observacoes:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 26, 93, 14);
		panel_4.add(lblNewLabel_1);
	}
}
