package br.com.GynasticFit.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class FormPrincipal extends JFrame {
	
	FormCadastrar fcad;
	FormConsulta fcons;
	FormPagamento fpag;
	FormFuncionarios ffun;
	FormProdutos fprod;
	
	
	

	private JPanel contentPane;
	private JButton btnCadastrar;
	private JPanel panelConsul;
	private JPanel panelCad;
	private JPanel panelPag;
	private JPanel panelFun;
	private JPanel panelProd;
	private JLabel lblMenu;
	private JLabel lblExit;
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JButton btnConsultar;
	private JButton btnPagamento;
	private JButton btnFuncionario;
	private JButton btnProdutos;
	private JLabel lblGerente;
	private JLabel lblAdministrador;
	private JLabel lblNome;
	private JLabel lblCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPrincipal frame = new FormPrincipal();
					frame.setLocationRelativeTo(null); //centralizar dashboard
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void esconderBotoes() {
		btnCadastrar.setBounds(7, 142,58, 37); 	//encolhemos o botão
		btnCadastrar.setText("");				//apaga o texto
		
		btnConsultar.setBounds(7, 188,58, 37);
		btnConsultar.setText("");

		btnPagamento.setBounds(7, 230,58, 37);
		btnPagamento.setText("");
		
		
		btnFuncionario.setBounds(7, 272,58, 37);
		btnFuncionario.setText("");
		
		btnProdutos.setBounds(7, 315,58, 37);
		btnProdutos.setText("");
		
		
		
		//Ocultar admin
		lblGerente.setVisible(false);
		lblAdministrador.setVisible(false);
		lblNome.setVisible(false);
		lblCargo.setVisible(false);

	}
	
	public void mostrarBotoes() {
		btnCadastrar.setBounds(7, 135, 187,37); 	//encolhemos o botão
		btnCadastrar.setText("           Cadastrar         ");				//apaga o texto
		
		if(btnCadastrar.getBounds().width == 203) {
			btnCadastrar.setBackground(Color.white);
		}
		
		btnConsultar.setBounds(7, 183, 187,37);
		btnConsultar.setText("           Consultar         ");
		
		if(btnConsultar.getBounds().width == 203) {
			btnConsultar.setBackground(Color.white);
		}

		btnPagamento.setBounds(7, 231, 187,37);
		btnPagamento.setText("        Pagamento         ");
		
		if(btnPagamento.getBounds().width == 203) {
			btnPagamento.setBackground(Color.white);
		}
		
		
		
		btnFuncionario.setBounds(7, 279, 187,37);
		btnFuncionario.setText("         Funcionarios     ");
		
		if(btnFuncionario.getBounds().width == 203) {
			btnFuncionario.setBackground(Color.white);
		}
		
		btnProdutos.setBounds(7, 327, 187,37);
		btnProdutos.setText("           Produtos         ");
		
		if(btnProdutos.getBounds().width == 203) {
			btnProdutos.setBackground(Color.white);
		}
		
		
		
		//mostrar funcionario
		lblGerente.setVisible(true);
		lblAdministrador.setVisible(true);
		lblNome.setVisible(true);
		lblCargo.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public FormPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLateral = new JPanel();
		panelLateral.setForeground(new Color(0, 0, 0));
		panelLateral.setBackground(new Color(102, 102, 102));
		panelLateral.setBounds(0, 0,219,625);
		contentPane.add(panelLateral);
		panelLateral.setLayout(null);
		
		btnCadastrar = new JButton("           Cadastrar         ");
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setFocusPainted(false);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCadastrar.setBackground(new Color(255, 165, 0));
				btnCadastrar.setForeground(Color.white);
				btnCadastrar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\cadastro.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnCadastrar.setBackground(Color.white);
				btnCadastrar.setForeground(Color.gray);
				btnCadastrar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\cadastro.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnCadastrar.isVisible() == true) {
						
						panelCad.setVisible(true);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						panelFun.setVisible(false);
						panelProd.setVisible(false);
					}
					
					CarregarFormCadastrar();
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
				
			}
		});
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\cadastro.png"));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}
			}
		);
		btnCadastrar.setBounds(7,135,187,37);
		panelLateral.add(btnCadastrar);
		
		btnConsultar = new JButton("           Consultar         ");
		btnConsultar.setBackground(new Color(255, 255, 255));
		btnConsultar.setFocusPainted(false);
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
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnConsultar.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(true);
						panelPag.setVisible(false);
						panelFun.setVisible(false);
						panelProd.setVisible(false);
					}
					CarregarFormConsulta();
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\consultar.png"));
		btnConsultar.setBorderPainted(false);
		btnConsultar.setBounds(7, 183, 187, 37);
		panelLateral.add(btnConsultar);
		
		btnPagamento = new JButton("        Pagamento         ");
		btnPagamento.setBackground(new Color(255, 255, 255));
		btnPagamento.setFocusPainted(false);
		btnPagamento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPagamento.setBackground(new Color(255, 165, 0));
				btnPagamento.setForeground(Color.white);
				btnPagamento.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\pagamento.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPagamento.setBackground(Color.white);
				btnPagamento.setForeground(Color.gray);
				btnPagamento.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\pagamento.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnPagamento.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(true);
						panelFun.setVisible(false);
						panelProd.setVisible(false);
			
					}
					
					CarregarFormPagamento();
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnPagamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPagamento.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\pagamento.png"));
		btnPagamento.setBorderPainted(false);
		btnPagamento.setBounds(7, 231, 187, 37);
		panelLateral.add(btnPagamento);
		
		btnFuncionario = new JButton("         Funcionarios     ");
		btnFuncionario.setBackground(new Color(255, 255, 255));
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFuncionario.setFocusPainted(false);
		btnFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnFuncionario.setBackground(new Color(255, 165, 0));
				btnFuncionario.setForeground(Color.white);
				btnFuncionario.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\funcionarios.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnFuncionario.setBackground(Color.white);
				btnFuncionario.setForeground(Color.gray);
				btnFuncionario.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\funcionarios.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnFuncionario.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						panelFun.setVisible(true);
						panelProd.setVisible(false);
						
					}
					
					CarregarFormFuncionarios();
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnFuncionario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFuncionario.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\funcionarios.png"));
		btnFuncionario.setBorderPainted(false);
		btnFuncionario.setBounds(7, 279, 187, 37);
		panelLateral.add(btnFuncionario);
		
		btnProdutos = new JButton("           Produtos         ");
		btnProdutos.setBackground(new Color(255, 255, 255));
		btnProdutos.setFocusPainted(false);
		btnProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProdutos.setBackground(new Color(255, 165, 0));
				btnProdutos.setForeground(Color.gray);
				btnProdutos.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\produto.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnProdutos.setBackground(Color.white);
				btnProdutos.setForeground(Color.gray);
				btnProdutos.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\produto.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnProdutos.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						//panelAAcess.setVisible(false);
						panelFun.setVisible(false);
						panelProd.setVisible(true);
						//panelProv.setVisible(false);
					}
					
					CarregarFormProdutos();
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\produto.png"));
		btnProdutos.setBorderPainted(false);
		btnProdutos.setBounds(7, 327, 187, 37);
		panelLateral.add(btnProdutos);
		
		panelCad = new JPanel();
		panelCad.setVisible(false);
		panelCad.setBackground(new Color(204, 153, 0));
		panelCad.setBounds(199, 135, 7, 37);
		panelLateral.add(panelCad);
		
		panelConsul = new JPanel();
		panelConsul.setVisible(false);
		panelConsul.setBackground(new Color(204, 153, 0));
		panelConsul.setBounds(199, 183, 7, 37);
		panelLateral.add(panelConsul);
		
		panelPag = new JPanel();
		panelPag.setVisible(false);
		panelPag.setBackground(new Color(204, 153, 0));
		panelPag.setBounds(199, 231, 7, 37);
		panelLateral.add(panelPag);
		
		panelFun = new JPanel();
		panelFun.setVisible(false);
		panelFun.setBackground(new Color(204, 153, 0));
		panelFun.setBounds(199, 279, 7, 37);
		panelLateral.add(panelFun);
		
		panelProd = new JPanel();
		panelProd.setVisible(false);
		panelProd.setBackground(new Color(204, 153, 0));
		panelProd.setBounds(199, 327, 7, 37);
		panelLateral.add(panelProd);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\logo.png"));
		lblNewLabel.setBounds(10, 24, 91, 69);
		panelLateral.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gymnastic");
		lblNewLabel_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(80, 43, 103, 37);
		panelLateral.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fit");
		lblNewLabel_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(154, 74, 40, 28);
		panelLateral.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 0));
		panel.setBounds(80, 109, 129, 4);
		panelLateral.add(panel);
		
		lblGerente = new JLabel("");
		lblGerente.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\admin.png"));
		lblGerente.setBounds(69, 485, 72, 73);
		panelLateral.add(lblGerente);
		
		lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setBackground(Color.WHITE);
		lblAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAdministrador.setBounds(58, 560, 118, 14);
		panelLateral.add(lblAdministrador);
		
		lblNome = new JLabel("Gabriel Batista");
		lblNome.setBackground(Color.WHITE);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNome.setBounds(58, 585, 129, 14);
		panelLateral.add(lblNome);
		
		lblCargo = new JLabel("Desenvolvedor");
		lblCargo.setBackground(Color.WHITE);
		lblCargo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblCargo.setBounds(58, 600, 129, 14);
		panelLateral.add(lblCargo);
		
		JPanel panelTopo = new JPanel();
		panelTopo.setBackground(new Color(204, 153, 0));
		panelTopo.setBounds(223, 0, 941, 37);
		contentPane.add(panelTopo);
		panelTopo.setLayout(null);
		
		lblMenu = new JLabel("");
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panelLateral.getBounds().width == 219) {
					panelLateral.setBounds(0, 0, 72, 664);
					panelTopo.setBounds(75, 0, 1130, 37);
					desktopPane.setBounds(75, 37, 1129, 627);
					lblExit.setBounds(1055, 4, 15, 27);
					
					esconderBotoes();
				}
				else {
					panelLateral.setBounds(0, 0, 219, 663);
					panelTopo.setBounds(223, 0, 957, 37);
					desktopPane.setBounds(223, 37, 957, 627);
					lblExit.setBounds(907, 0, 24, 37);
					
					mostrarBotoes();
				}
			}
		});
		lblMenu.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\menu.png"));
		lblMenu.setBounds(10, 0, 39, 37);
		panelTopo.add(lblMenu);
		
		lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblExit.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\close (1).png"));
		lblExit.setBounds(907, 0, 24, 37);
		panelTopo.add(lblExit);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(223, 38, 941, 587);
		contentPane.add(desktopPane);
	}
	
	
	void CarregarFormFuncionarios() {
		if(ffun == null || ffun.isClosed()) {
			ffun = new FormFuncionarios();
			ffun.setBounds(0,0,957,627);
			desktopPane.add(ffun);
			ffun.show();
		}
	}
	void CarregarFormCadastrar() {
		if(fcad == null || fcad.isClosed()) {
			fcad = new FormCadastrar();
			fcad.setBounds(0,0,957,627);
			desktopPane.add(fcad);
			fcad.show();
		}
	}
	void CarregarFormPagamento() {
		if(fpag == null || fpag.isClosed()) {
			fpag = new FormPagamento();
			fpag.setBounds(0,0,957,627);
			desktopPane.add(fpag);
			fpag.show();
		}
	}
	
	void CarregarFormConsulta() {
		if(fcons == null || fcons.isClosed()) {
			fcons = new FormConsulta();
			fcons.setBounds(0,0,957,627);
			desktopPane.add(fcons);
			fcons.show();
		}
	}
	void CarregarFormProdutos() {
		if(fprod == null || fprod.isClosed()) {
			fprod = new FormProdutos();
			fprod.setBounds(0,0,957,627);
			desktopPane.add(fprod);
			fprod.show();
		}
	}
	
}