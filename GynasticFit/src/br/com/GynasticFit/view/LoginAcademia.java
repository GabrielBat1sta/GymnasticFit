package br.com.GynasticFit.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginAcademia {
	

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_1;
	private JButton btnEntrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAcademia window = new LoginAcademia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginAcademia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 1180, 664);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(837, 0, 327, 625);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEntrar.setBackground(new Color(255, 165, 0));
				btnEntrar.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEntrar.setBackground(Color.white);
				btnEntrar.setForeground(Color.gray);
			}
		});
		btnEntrar.setBounds(43, 255, 126, 55);
		panel.add(btnEntrar);
		btnEntrar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(43, 209, 260, 35);
		panel.add(txtSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(43, 147, 260, 35);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(43, 193, 56, 20);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(43, 126, 73, 26);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\logo_login.png"));
		lblNewLabel_2.setBounds(10, 116, 279, 271);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("GYMNASTIC");
		lblNewLabel_3.setForeground(new Color(204, 153, 0));
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.BOLD, 80));
		lblNewLabel_3.setBounds(299, 192, 494, 134);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("FIT");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.BOLD, 80));
		lblNewLabel_4.setBounds(640, 325, 153, 107);
		frame.getContentPane().add(lblNewLabel_4);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 0));
		panel_1.setBounds(269, 471, 539, 10);
		frame.getContentPane().add(panel_1);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))){
		
					JOptionPane.showMessageDialog(null, "Bem Vindo ao Gymnastic Fit!");
					FormPrincipal formPrincipal = new FormPrincipal();
					formPrincipal.setVisible(true);
		
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos, favor conferir suas credencias!");
				}
				
			}
		});
	}
	
	

	public boolean checkLogin(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
		
	}
	
	
}
