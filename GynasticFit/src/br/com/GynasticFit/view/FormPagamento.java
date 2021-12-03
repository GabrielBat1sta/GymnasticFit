package br.com.GynasticFit.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class FormPagamento extends JInternalFrame {
	
	
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTable table;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPagamento frame = new FormPagamento();
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
	public FormPagamento() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //tirar bordas do JInternalFrame
		TirarBarraTitulo();													  //tirar barra do  titulo
		getContentPane().setBackground(Color.GRAY);
		setBounds(223,38,941,587);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 348, 122);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 47, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 86, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2.setBounds(194, 47, 46, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(236, 82, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblDadosCliente = new JLabel(":: Dados Cliente ::");
		lblDadosCliente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosCliente.setBounds(10, 0, 155, 20);
		panel.add(lblDadosCliente);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(51, 84, 126, 25);
		panel.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(51, 45, 126, 25);
		panel.add(textField);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(230, 47, 108, 23);
		panel.add(dateChooser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 144, 348, 402);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		comboBox.setBounds(10, 160, 174, 24);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A VISTA - PIX/DINHEIRO", "CREDITO", "DEBITO", "CHEQUE", "BOLETO"}));
		
		JLabel lblNewLabel = new JLabel("Forma de Pagamento:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 146, 126, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblPagamento = new JLabel(":: Pagamento ::");
		lblPagamento.setBounds(10, 0, 155, 20);
		panel_2.add(lblPagamento);
		lblPagamento.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Mensalidade:");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 61, 82, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Total a Pagar:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 96, 82, 22);
		panel_2.add(lblNewLabel_3_1);
		
		JButton btnPagamento = new JButton("Pagamento");
		btnPagamento.setBackground(new Color(204, 153, 0));
		btnPagamento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnPagamento.setBounds(10, 228, 143, 46);
		panel_2.add(btnPagamento);
		
		JButton btnCancelarPagamento = new JButton("Cancelar Pagamento");
		btnCancelarPagamento.setBackground(new Color(204, 153, 0));
		btnCancelarPagamento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCancelarPagamento.setBounds(162, 228, 143, 46);
		panel_2.add(btnCancelarPagamento);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 59, 126, 25);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(86, 98, 126, 25);
		panel_2.add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(368, 11, 547, 535);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
