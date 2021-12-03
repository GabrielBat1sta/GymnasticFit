package br.com.GynasticFit.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FormProdutos extends JInternalFrame {
	
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProdutos frame = new FormProdutos();
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
	
	public FormProdutos() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //tirar bordas do JInternalFrame
		TirarBarraTitulo();													  //tirar barra do  titulo
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 905, 535);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastroDe = new JLabel(":: Cadastro de Produtos ::");
		lblCadastroDe.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblCadastroDe.setBounds(10, 0, 183, 14);
		panel.add(lblCadastroDe);
		
		JLabel lblCod = new JLabel("Cod:");
		lblCod.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCod.setBounds(74, 39, 39, 14);
		panel.add(lblCod);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 35, 39, 25);
		panel.add(textField);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblProduto.setBounds(152, 40, 70, 14);
		panel.add(lblProduto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 37, 369, 25);
		panel.add(textField_1);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblQuantidade.setBounds(585, 40, 70, 14);
		panel.add(lblQuantidade);
		
		JLabel lblPrecoDeCompra = new JLabel("Preco de Compra: ");
		lblPrecoDeCompra.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPrecoDeCompra.setBounds(72, 86, 111, 14);
		panel.add(lblPrecoDeCompra);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 84, 99, 25);
		panel.add(textField_2);
		
		JLabel lblPrecoDeVenda = new JLabel("Preco de Venda: ");
		lblPrecoDeVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPrecoDeVenda.setBounds(283, 87, 111, 14);
		panel.add(lblPrecoDeVenda);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(378, 84, 99, 25);
		panel.add(textField_3);
		
		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblFornecedor.setBounds(487, 87, 70, 14);
		panel.add(lblFornecedor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Growth Suplementos", "Probiotica", "Max Titanium", "Integral Medica", "Universal Nutrition", "Option Nutrition", "Dymatize Nutrition", "Whey Protein"}));
		comboBox.setBounds(558, 83, 199, 22);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(767, 83, 47, 23);
		panel.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(658, 37, 99, 25);
		panel.add(textField_4);
		
		table = new JTable();
		table.setBounds(10, 173, 885, 351);
		panel.add(table);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setForeground(Color.WHITE);
		btnNovo.setBorder(null);
		btnNovo.setBackground(new Color(204, 153, 0));
		btnNovo.setBounds(35, 132, 89, 23);
		panel.add(btnNovo);
		
		JButton btnSalvar_1 = new JButton("Salvar");
		btnSalvar_1.setForeground(Color.WHITE);
		btnSalvar_1.setBorder(null);
		btnSalvar_1.setBackground(Color.GRAY);
		btnSalvar_1.setBounds(152, 132, 89, 23);
		panel.add(btnSalvar_1);
		
		JButton btnEditar = new JButton("Modificar");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBorder(null);
		btnEditar.setBackground(new Color(204, 153, 0));
		btnEditar.setBounds(264, 132, 89, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBorder(null);
		btnExcluir.setBackground(new Color(204, 153, 0));
		btnExcluir.setBounds(363, 132, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(new Color(204, 153, 0));
		btnCancelar.setBounds(468, 132, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setBorder(null);
		btnPesquisar.setBackground(new Color(204, 153, 0));
		btnPesquisar.setBounds(715, 132, 89, 23);
		panel.add(btnPesquisar);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(567, 133, 138, 25);
		panel.add(textField_5);
		setBounds(223,38,941,587);

	}

}
