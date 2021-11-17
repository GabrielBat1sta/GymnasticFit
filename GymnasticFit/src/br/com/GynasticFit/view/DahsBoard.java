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

public class DahsBoard extends JFrame {
	

	private JPanel contentPane;
	private JButton btnCadastrar;
	private JPanel panelConsul;
	private JPanel panelCad;
	private JPanel panelPag;
	private JPanel panelAAcess;
	private JPanel panelRel;
	private JPanel panelProd;
	private JPanel panelProv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DahsBoard frame = new DahsBoard();
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
	public DahsBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLateral = new JPanel();
		panelLateral.setBackground(Color.WHITE);
		panelLateral.setBounds(0, 0,219,625);
		contentPane.add(panelLateral);
		panelLateral.setLayout(null);
		
		btnCadastrar = new JButton("           Cadastrar         ");
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
						panelAAcess.setVisible(false);
						panelRel.setVisible(false);
						panelProd.setVisible(false);
						panelProv.setVisible(false);
					}
					
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
		});
		btnCadastrar.setBounds(7,105,187,37);
		panelLateral.add(btnCadastrar);
		
		JButton btnConsultar = new JButton("           Consultar         ");
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
						panelAAcess.setVisible(false);
						panelRel.setVisible(false);
						panelProd.setVisible(false);
						panelProv.setVisible(false);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\consultar.png"));
		btnConsultar.setBorderPainted(false);
		btnConsultar.setBounds(7, 153, 187, 37);
		panelLateral.add(btnConsultar);
		
		JButton btnPagamento = new JButton("           Pagamento         ");
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
						panelAAcess.setVisible(false);
						panelRel.setVisible(false);
						panelProd.setVisible(false);
						panelProv.setVisible(false);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnPagamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPagamento.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\pagamento.png"));
		btnPagamento.setBorderPainted(false);
		btnPagamento.setBounds(7, 201, 187, 37);
		panelLateral.add(btnPagamento);
		
		JButton btnAutoAcesso = new JButton("         Autorizar Acesso     ");
		btnAutoAcesso.setFocusPainted(false);
		btnAutoAcesso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAutoAcesso.setBackground(new Color(255, 165, 0));
				btnAutoAcesso.setForeground(Color.white);
				btnAutoAcesso.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\autorizar.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAutoAcesso.setBackground(Color.white);
				btnAutoAcesso.setForeground(Color.gray);
				btnAutoAcesso.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\autorizar.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnAutoAcesso.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						panelAAcess.setVisible(true);
						panelRel.setVisible(false);
						panelProd.setVisible(false);
						panelProv.setVisible(false);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnAutoAcesso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAutoAcesso.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\autorizar.png"));
		btnAutoAcesso.setBorderPainted(false);
		btnAutoAcesso.setBounds(7, 250, 187, 37);
		panelLateral.add(btnAutoAcesso);
		
		JButton btnRelatorio = new JButton("           Relatorio         ");
		btnRelatorio.setFocusPainted(false);
		btnRelatorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRelatorio.setBackground(new Color(255, 165, 0));
				btnRelatorio.setForeground(Color.white);
				btnRelatorio.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\relatorio.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRelatorio.setBackground(Color.white);
				btnRelatorio.setForeground(Color.gray);
				btnRelatorio.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\relatorio.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnRelatorio.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						panelAAcess.setVisible(false);
						panelRel.setVisible(true);
						panelProd.setVisible(false);
						panelProv.setVisible(false);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnRelatorio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRelatorio.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\relatorio.png"));
		btnRelatorio.setBorderPainted(false);
		btnRelatorio.setBounds(7, 298, 187, 37);
		panelLateral.add(btnRelatorio);
		
		JButton btnProdutos = new JButton("           Produtos         ");
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
						panelAAcess.setVisible(false);
						panelRel.setVisible(false);
						panelProd.setVisible(true);
						panelProv.setVisible(false);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\produto.png"));
		btnProdutos.setBorderPainted(false);
		btnProdutos.setBounds(7, 346, 187, 37);
		panelLateral.add(btnProdutos);
		
		JButton btnProvedor = new JButton("           Provedor         ");
		btnProvedor.setFocusPainted(false);
		btnProvedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProvedor.setBackground(new Color(255, 165, 0));
				btnProvedor.setForeground(Color.gray);
				btnProvedor.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\provedor.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnProvedor.setBackground(Color.white);
				btnProvedor.setForeground(Color.gray);
				btnProvedor.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\provedor.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnProvedor.isVisible() == true) {
						
						panelCad.setVisible(false);
						panelConsul.setVisible(false);
						panelPag.setVisible(false);
						panelAAcess.setVisible(false);
						panelRel.setVisible(false);
						panelProd.setVisible(false);
						panelProv.setVisible(true);
					}
					
				} 
				catch( Exception ex){
					System.err.print(ex.toString());
				}
			}
		});
		btnProvedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProvedor.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\provedor.png"));
		btnProvedor.setBorderPainted(false);
		btnProvedor.setBounds(7, 394, 187, 37);
		panelLateral.add(btnProvedor);
		
		panelCad = new JPanel();
		panelCad.setVisible(false);
		panelCad.setBackground(new Color(204, 153, 0));
		panelCad.setBounds(199, 105, 7, 37);
		panelLateral.add(panelCad);
		
		panelConsul = new JPanel();
		panelConsul.setVisible(false);
		panelConsul.setBackground(new Color(204, 153, 0));
		panelConsul.setBounds(199, 153, 7, 37);
		panelLateral.add(panelConsul);
		
		panelPag = new JPanel();
		panelPag.setVisible(false);
		panelPag.setBackground(new Color(204, 153, 0));
		panelPag.setBounds(199, 202, 7, 37);
		panelLateral.add(panelPag);
		
		panelAAcess = new JPanel();
		panelAAcess.setVisible(false);
		panelAAcess.setBackground(new Color(204, 153, 0));
		panelAAcess.setBounds(199, 250, 7, 37);
		panelLateral.add(panelAAcess);
		
		panelRel = new JPanel();
		panelRel.setVisible(false);
		panelRel.setBackground(new Color(204, 153, 0));
		panelRel.setBounds(199, 298, 7, 37);
		panelLateral.add(panelRel);
		
		panelProd = new JPanel();
		panelProd.setVisible(false);
		panelProd.setBackground(new Color(204, 153, 0));
		panelProd.setBounds(199, 346, 7, 37);
		panelLateral.add(panelProd);
		
		panelProv = new JPanel();
		panelProv.setVisible(false);
		panelProv.setBackground(new Color(204, 153, 0));
		panelProv.setBounds(199, 394, 7, 37);
		panelLateral.add(panelProv);
		
		JPanel panelTopo = new JPanel();
		panelTopo.setBackground(new Color(204, 153, 0));
		panelTopo.setBounds(223, 0, 941, 37);
		contentPane.add(panelTopo);
		panelTopo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\menu.png"));
		lblNewLabel.setBounds(10, 0, 39, 37);
		panelTopo.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\close (1).png"));
		lblNewLabel_1.setBounds(907, 0, 24, 37);
		panelTopo.add(lblNewLabel_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(223, 38, 941, 587);
		contentPane.add(desktopPane);
	}
}
