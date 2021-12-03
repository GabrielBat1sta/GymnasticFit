package br.com.GynasticFit.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FormConsulta extends JInternalFrame {

	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnConsultar;
	private JTable table;
	private JLabel lblDadosCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormConsulta frame = new FormConsulta();
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
	public FormConsulta() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //tirar bordas do JInternalFrame
		TirarBarraTitulo();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(223,38,941,587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 905, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente: ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 64, 99, 14);
		panel.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCpf.setBounds(95, 31, 23, 18);
		panel.add(lblCpf);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(129, 29, 245, 25);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 60, 245, 25);
		panel.add(textField_1);
		
		btnConsultar = new JButton("Pesquisar");
		btnConsultar.setBackground(new Color(204, 153, 0));
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsultar.setBackground(new Color(255, 165, 0));
				btnConsultar.setForeground(Color.white);
				btnConsultar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\consultar.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnConsultar.setBackground(Color.white);
				btnConsultar.setForeground(Color.gray);
				btnConsultar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\consultar.png"));
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\consultar.png"));
		btnConsultar.setBounds(636, 31, 138, 51);
		panel.add(btnConsultar);
		
		lblDadosCliente = new JLabel(":: Dados Cliente ::");
		lblDadosCliente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosCliente.setBounds(10, -1, 155, 20);
		panel.add(lblDadosCliente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 136, 905, 401);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
	}
}
