package br.com.GynasticFit.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FormFuncionarios extends JInternalFrame {
	private JTextField txtSobrenome;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtEmail;
	private JTextField txtDNI;
	private JTextField txtCodigo;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFuncionarios frame = new FormFuncionarios();
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
	public FormFuncionarios() {
		getContentPane().setBackground(new Color(102, 102, 102));
		setBounds(223,38,941,587);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 905, 272);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setBounds(25, 38, 86, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(266, 40, 86, 14);
		panel.add(lblDni);
		lblDni.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(25, 78, 86, 14);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(266, 80, 86, 14);
		panel.add(lblNome);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(25, 173, 86, 14);
		panel.add(lblSobrenome);
		lblSobrenome.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setBounds(25, 237, 86, 14);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(25, 205, 86, 14);
		panel.add(lblCargo);
		lblCargo.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(121, 235, 86, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JComboBox cbCargo = new JComboBox();
		cbCargo.setBounds(121, 202, 86, 22);
		panel.add(cbCargo);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(121, 171, 86, 20);
		panel.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(362, 78, 86, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(121, 76, 86, 20);
		panel.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(362, 38, 86, 20);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(121, 36, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(791, 38, 45, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inserir");
		btnNewButton_1.setBounds(750, 94, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Salvar");
		btnNewButton_1_1.setBounds(750, 128, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 294, 905, 252);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);

	}
}
