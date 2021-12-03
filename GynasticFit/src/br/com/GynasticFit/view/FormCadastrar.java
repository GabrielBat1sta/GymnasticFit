package br.com.GynasticFit.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JSpinField;

public class FormCadastrar extends JInternalFrame implements ActionListener {
	
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension DimensionBarra = null;

	private JPanel contentPane;
	private JTextField txtNomCliente;
	private JTextField txtEndCliente;
	private JTextField txtCpfCliente;
	private JTextField txtNascimentoCliente;
	private JTextField txtNumCliente;
	private JTextField txtBairroCliente;
	private JTextField txtTelCliente;
	private JTextField txtCidCliente;
	private JTextField txtCepCliente;
	private JTextField txtEmailCliente;
	private JTextField txtNomResponsavel;
	private JTextField txtEmailResponsavel;
	private JTextField txtCpfResponsavel;
	private JTextField txtValParcela;
	private JComboBox cbCategoria;
	private JPanel panelDadosCadastrais;
	private JPanel panelObservacoes;
	private JPanel panelDadosFinanc;
	private JPanel panelDadosResponsaveis;

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
	
	public void TirarBarraTitulo() {
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		DimensionBarra = Barra.getPreferredSize();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension(0,0));
		repaint();
	}
	public FormCadastrar() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //tirar bordas do JInternalFrame
		TirarBarraTitulo();													  //tirar barra do  titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(223,38,941,587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelDadosCadastrais = new JPanel();
		panelDadosCadastrais.setBackground(new Color(204, 204, 204));
		panelDadosCadastrais.setToolTipText("MG\r\nSP");
		panelDadosCadastrais.setBounds(10, 11, 748, 216);
		contentPane.add(panelDadosCadastrais);
		panelDadosCadastrais.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente: ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 36, 155, 14);
		panelDadosCadastrais.add(lblNewLabel);
		
		txtNomCliente = new JTextField();
		txtNomCliente.setBounds(10, 51, 245, 25);
		panelDadosCadastrais.add(txtNomCliente);
		txtNomCliente.setColumns(10);
		
		JLabel lblEnderecoDoCliente = new JLabel("Endereco do Cliente:");
		lblEnderecoDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEnderecoDoCliente.setBounds(10, 87, 155, 14);
		panelDadosCadastrais.add(lblEnderecoDoCliente);
		
		txtEndCliente = new JTextField();
		txtEndCliente.setColumns(10);
		txtEndCliente.setBounds(10, 101, 245, 25);
		panelDadosCadastrais.add(txtEndCliente);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCpf.setBounds(265, 36, 155, 14);
		panelDadosCadastrais.add(lblCpf);
		
		txtCpfCliente = new JTextField();
		txtCpfCliente.setColumns(10);
		txtCpfCliente.setBounds(265, 51, 123, 25);
		panelDadosCadastrais.add(txtCpfCliente);
		
		txtNascimentoCliente = new JTextField();
		txtNascimentoCliente.setColumns(10);
		txtNascimentoCliente.setBounds(398, 51, 123, 25);
		panelDadosCadastrais.add(txtNascimentoCliente);
		
		JLabel lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNascimento.setBounds(398, 36, 97, 14);
		panelDadosCadastrais.add(lblNascimento);
		
		JLabel lblN = new JLabel("N:");
		lblN.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblN.setBounds(265, 87, 62, 14);
		panelDadosCadastrais.add(lblN);
		
		txtNumCliente = new JTextField();
		txtNumCliente.setColumns(10);
		txtNumCliente.setBounds(265, 101, 62, 25);
		panelDadosCadastrais.add(txtNumCliente);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(337, 87, 79, 14);
		panelDadosCadastrais.add(lblBairro);
		
		txtBairroCliente = new JTextField();
		txtBairroCliente.setColumns(10);
		txtBairroCliente.setBounds(337, 101, 126, 25);
		panelDadosCadastrais.add(txtBairroCliente);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEstado.setBounds(473, 87, 48, 14);
		panelDadosCadastrais.add(lblEstado);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setBackground(new Color(255, 255, 255));
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"-", "MG", "SP", "RJ", "ES"}));
		cbEstado.setToolTipText("");
		cbEstado.setBounds(473, 101, 48, 24);
		panelDadosCadastrais.add(cbEstado);
		
		txtTelCliente = new JTextField();
		txtTelCliente.setColumns(10);
		txtTelCliente.setBounds(531, 51, 123, 25);
		panelDadosCadastrais.add(txtTelCliente);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(531, 36, 89, 14);
		panelDadosCadastrais.add(lblTelefone);
		
		txtCidCliente = new JTextField();
		txtCidCliente.setColumns(10);
		txtCidCliente.setBounds(531, 101, 123, 25);
		panelDadosCadastrais.add(txtCidCliente);
		
		txtCepCliente = new JTextField();
		txtCepCliente.setColumns(10);
		txtCepCliente.setBounds(664, 101, 80, 25);
		panelDadosCadastrais.add(txtCepCliente);
		
		JComboBox cbStatusCliente = new JComboBox();
		cbStatusCliente.setBackground(new Color(255, 255, 255));
		cbStatusCliente.setModel(new DefaultComboBoxModel(new String[] {"-", "Ativo", "Desativado"}));
		cbStatusCliente.setToolTipText("");
		cbStatusCliente.setBounds(664, 51, 80, 25);
		panelDadosCadastrais.add(cbStatusCliente);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(531, 87, 48, 14);
		panelDadosCadastrais.add(lblCidade);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(664, 87, 48, 14);
		panelDadosCadastrais.add(lblCep);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(10, 154, 245, 25);
		panelDadosCadastrais.add(txtEmailCliente);
		
		JLabel lblEmailDoCliente = new JLabel("E-mail do  Cliente:");
		lblEmailDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmailDoCliente.setBounds(10, 140, 155, 14);
		panelDadosCadastrais.add(lblEmailDoCliente);
		
		JLabel lblCategoriaplano = new JLabel("Categoria/Plano:");
		lblCategoriaplano.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCategoriaplano.setBounds(265, 140, 155, 14);
		panelDadosCadastrais.add(lblCategoriaplano);
		
		cbCategoria = new JComboBox();
		cbCategoria.setBackground(new Color(255, 255, 255));
		cbCategoria.addMouseListener(new MouseAdapter() {
	
		});
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"-", "Mensal", "Trimestral", "Anual"}));
		cbCategoria.setBounds(265, 154, 198, 24);
		panelDadosCadastrais.add(cbCategoria);
		
		JButton btnSalvarDados = new JButton("           Salvar Dados do Cliente");
		btnSalvarDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSalvarDados.setBackground(new Color(255, 165, 0));
				btnSalvarDados.setForeground(Color.white);
				btnSalvarDados.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\salvar.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSalvarDados.setBackground(Color.white);
				btnSalvarDados.setForeground(Color.gray);
				btnSalvarDados.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\salvar.png"));
			}
		});
		btnSalvarDados.setBackground(new Color(255, 255, 255));
		btnSalvarDados.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\salvar.png"));
		btnSalvarDados.setBounds(473, 146, 271, 40);
		panelDadosCadastrais.add(btnSalvarDados);
		
		JLabel lblDadosCadastrais = new JLabel(":: Dados Cadastrais ::");
		lblDadosCadastrais.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosCadastrais.setBounds(10, 0, 155, 14);
		panelDadosCadastrais.add(lblDadosCadastrais);
		
		JLabel lblStatusCliente = new JLabel("Status Cliente:");
		lblStatusCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblStatusCliente.setBounds(664, 36, 90, 14);
		panelDadosCadastrais.add(lblStatusCliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(768, 11, 147, 216);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFotoAlunocliente = new JLabel("::Foto Aluno/Cliente ::");
		lblFotoAlunocliente.setBounds(0, 0, 163, 14);
		panel_1.add(lblFotoAlunocliente);
		lblFotoAlunocliente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		panelDadosResponsaveis = new JPanel();
		panelDadosResponsaveis.setBackground(new Color(204, 204, 204));
		panelDadosResponsaveis.setBounds(10, 238, 905, 91);
		contentPane.add(panelDadosResponsaveis);
		panelDadosResponsaveis.setLayout(null);
		
		JLabel lblDadosDo = new JLabel(":: Dados do Responsavel Financeiro ::");
		lblDadosDo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosDo.setBounds(10, 0, 268, 14);
		panelDadosResponsaveis.add(lblDadosDo);
		
		JLabel lblNomeDoResponsavel = new JLabel("Nome do Responsavel: ");
		lblNomeDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNomeDoResponsavel.setBounds(10, 41, 155, 14);
		panelDadosResponsaveis.add(lblNomeDoResponsavel);
		
		txtNomResponsavel = new JTextField();
		txtNomResponsavel.setColumns(10);
		txtNomResponsavel.setBounds(10, 55, 245, 25);
		panelDadosResponsaveis.add(txtNomResponsavel);
		
		txtEmailResponsavel = new JTextField();
		txtEmailResponsavel.setColumns(10);
		txtEmailResponsavel.setBounds(265, 55, 245, 25);
		panelDadosResponsaveis.add(txtEmailResponsavel);
		
		txtCpfResponsavel = new JTextField();
		txtCpfResponsavel.setColumns(10);
		txtCpfResponsavel.setBounds(520, 55, 123, 25);
		panelDadosResponsaveis.add(txtCpfResponsavel);
		
		JLabel lblCpfDoResponsavel = new JLabel("CPF do Responsavel:");
		lblCpfDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCpfDoResponsavel.setBounds(520, 41, 123, 14);
		panelDadosResponsaveis.add(lblCpfDoResponsavel);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		lblParentesco.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblParentesco.setBounds(653, 41, 123, 14);
		panelDadosResponsaveis.add(lblParentesco);
		
		JComboBox cbParentesco = new JComboBox();
		cbParentesco.setBackground(new Color(255, 255, 255));
		cbParentesco.setModel(new DefaultComboBoxModel(new String[] {"-", "Pai", "M\u00E3e", "V\u00F3", "V\u00F4", "Tio", "Tia"}));
		cbParentesco.setToolTipText("");
		cbParentesco.setBounds(653, 55, 100, 24);
		panelDadosResponsaveis.add(cbParentesco);
		
		JLabel lblEmailDoResponsavel = new JLabel("E-mail do Responsavel:");
		lblEmailDoResponsavel.setBounds(265, 41, 155, 14);
		panelDadosResponsaveis.add(lblEmailDoResponsavel);
		lblEmailDoResponsavel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		panelDadosFinanc = new JPanel();
		panelDadosFinanc.setBackground(new Color(204, 204, 204));
		panelDadosFinanc.setBounds(10, 340, 299, 155);
		contentPane.add(panelDadosFinanc);
		panelDadosFinanc.setLayout(null);
		
		JLabel lblDadosFinanceiro = new JLabel(":: Dados Financeiro ::");
		lblDadosFinanceiro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosFinanceiro.setBounds(10, 0, 163, 14);
		panelDadosFinanc.add(lblDadosFinanceiro);
		
		JLabel lblDiaVencimento = new JLabel("Dia Vencimento:");
		lblDiaVencimento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDiaVencimento.setBounds(10, 52, 109, 14);
		panelDadosFinanc.add(lblDiaVencimento);
		
		JComboBox cbDiaVenc = new JComboBox();
		cbDiaVenc.setBackground(new Color(255, 255, 255));
		cbDiaVenc.setModel(new DefaultComboBoxModel(new String[] {"-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		cbDiaVenc.setBounds(10, 67, 132, 24);
		panelDadosFinanc.add(cbDiaVenc);
		
		JLabel lblTipoDeCliente = new JLabel("Pagamento:");
		lblTipoDeCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTipoDeCliente.setBounds(157, 52, 109, 14);
		panelDadosFinanc.add(lblTipoDeCliente);
		
		JComboBox cbTipoCliente = new JComboBox();
		cbTipoCliente.setBackground(new Color(255, 255, 255));
		cbTipoCliente.setModel(new DefaultComboBoxModel(new String[] {"-", "A VISTA", "CART\u00C3O"}));
		cbTipoCliente.setBounds(157, 67, 132, 24);
		panelDadosFinanc.add(cbTipoCliente);
		
		JLabel lblValorParcela = new JLabel("Valor Parcela:");
		lblValorParcela.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblValorParcela.setBounds(10, 102, 109, 14);
		panelDadosFinanc.add(lblValorParcela);
		
		JLabel lblDataDoCadastro = new JLabel("Data do Cadastro:");
		lblDataDoCadastro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDataDoCadastro.setBounds(157, 102, 109, 14);
		panelDadosFinanc.add(lblDataDoCadastro);
		
		txtValParcela = new JTextField();
		txtValParcela.setColumns(10);
		txtValParcela.setBounds(10, 115, 132, 25);
		panelDadosFinanc.add(txtValParcela);
		
		JDateChooser dateCadastro = new JDateChooser();
		dateCadastro.setBounds(157, 116, 132, 24);
		panelDadosFinanc.add(dateCadastro);
		
		panelObservacoes = new JPanel();
		panelObservacoes.setBackground(new Color(204, 204, 204));
		panelObservacoes.setBounds(330, 340, 585, 155);
		contentPane.add(panelObservacoes);
		panelObservacoes.setLayout(null);
		
		JLabel lblObservacoes = new JLabel(":: OBSERVACOES ::");
		lblObservacoes.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblObservacoes.setBounds(10, 0, 163, 14);
		panelObservacoes.add(lblObservacoes);
		
		JTextPane tpObservacoes = new JTextPane();
		tpObservacoes.setBounds(10, 40, 565, 104);
		panelObservacoes.add(tpObservacoes);
		
		JLabel lblNewLabel_1 = new JLabel("Observacoes:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 26, 93, 14);
		panelObservacoes.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
