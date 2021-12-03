package br.com.GynasticFit.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import br.com.GynasticFit.entidade.Funcionarios;
import br.com.GynasticFit.util.ArranjoFuncionarios;

public class FormFuncionarios extends JInternalFrame implements ActionListener{
	
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	ArranjoFuncionarios af = new ArranjoFuncionarios("Funcionario.txt");
	
	
	
	private JTextField txtEmail;
	private JTable tbFunc;
	private JTextField txtSobrenome;
	private JTextField txtCodigo;
	private JTextField txtDNI;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JComboBox <String> cbCargo;
	private JButton btnAceitar;
	
	
	private DefaultTableModel modelo;
	private JButton btnInserir;
	private JButton btnSalvar;
	private JButton btnModificar;
	private JButton btnExcluir;

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
	
	public void TirarBarraTitulo() {
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		DimensionBarra = Barra.getPreferredSize();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension(0,0));
		repaint();
	}
	
	public FormFuncionarios() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //tirar bordas do JInternalFrame
		TirarBarraTitulo();													  //tirar barra do  titulo
		getContentPane().setBackground(new Color(102, 102, 102));
		setBounds(223,38,941,587);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 905, 142);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setBounds(25, 38, 86, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(25, 65, 86, 14);
		panel.add(lblDni);
		lblDni.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(229, 65, 86, 14);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(229, 38, 86, 14);
		panel.add(lblNome);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(426, 38, 86, 14);
		panel.add(lblSobrenome);
		lblSobrenome.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setBounds(664, 40, 86, 14);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(426, 65, 86, 14);
		panel.add(lblCargo);
		lblCargo.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(710, 36, 141, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		cbCargo = new JComboBox();
		cbCargo.setModel(new DefaultComboBoxModel<String>
				(new String[] {"Administrador", "Gerente", "Caixa"}));
		cbCargo.setBounds(509, 62, 142, 22);
		panel.add(cbCargo);
		
		btnAceitar = new JButton("");
		btnAceitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int codigo = lerCodigo();
				String dni = lerDNI();
					if(dni.length() > 0) {
						String senha = lerSenha();
						if(senha.length() > 0) {
							String nome = lerNome();
							if(nome.length() > 0) {
								String sobrenome = lerSobrenome();
								if(sobrenome.length() > 0) {
									int cargo = lerCargo();
									String email = lerEmail();
										if(email.length() > 0) {
											
											if(btnInserir.isEnabled()==false) {
												Funcionarios novo = new Funcionarios(codigo, dni,senha,nome,sobrenome,cargo,email);
												af.Adicionar(novo);
												btnInserir.setEnabled(true);
											}
											
											if(btnModificar.isEnabled()==false) {
												Funcionarios x = af.buscar(codigo);
												x.setDni(dni);
												x.setSenha(senha);
												x.setNome(nome);
												x.setSobrenome(sobrenome);
												x.setCargo(cargo);
												x.setEmail(email);
												btnModificar.setEnabled(true);
											}
											
											Listar();
											HabilitarEntradas(false); //bloqueia
									}
										else {
											JOptionPane.showMessageDialog(null,"Insira um E-mail!");
											txtEmail.setText("");
											txtEmail.requestFocus();
										}
								}
								else {
									JOptionPane.showMessageDialog(null,"Insira um Sobrenome!");
									txtSobrenome.setText("");
									txtSobrenome.requestFocus();
								}
							}
							else {
								JOptionPane.showMessageDialog(null,"Insira um Nome!");
								txtNome.setText("");
								txtNome.requestFocus();
							}
						}
						else {
							JOptionPane.showMessageDialog(null,"Insira uma Senha!");
							txtSenha.setText("");
							txtSenha.requestFocus();
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Insira um DNI!");
						txtDNI.setText("");
						txtDNI.requestFocus();
					}
				
				
				
				
				
			}
		});
		btnAceitar.setIcon(new ImageIcon("C:\\Users\\gabri\\eclipse-workspace\\GynasticFit\\Imagens\\sucesso (1).png"));
		btnAceitar.setBackground(Color.GREEN);
		btnAceitar.setBounds(15, 92, 45, 33);
		panel.add(btnAceitar);
		
		btnInserir = new JButton("Inserir");
		btnInserir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInserir.setFocusTraversalKeysEnabled(false);
		btnInserir.setBorder(null);
		btnInserir.setForeground(Color.WHITE);
		btnInserir.setBackground(new Color(204, 153, 0));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInserir.setEnabled(false);
				Limpeza();
				txtCodigo.setText(""+af.CodigoCorrelativo());
				HabilitarEntradas(true);
				txtDNI.requestFocus();
			}
		});
		btnInserir.setBounds(70, 102, 89, 23);
		panel.add(btnInserir);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setBorder(null);
		btnSalvar.setBackground(Color.GRAY);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSalvar.setEnabled(true);
				btnAceitar.setEnabled(false);
				if(af.ExisteArquivo()) {
					int YesOrNo = JOptionPane.showConfirmDialog(null,"\" Deseja Atualizar"+ af.getArquivo()+"\"","Atualizando Bloco Empilhado ",JOptionPane.YES_NO_OPTION);
					
					if(YesOrNo == 0) {
						af.GravarFuncionarios();
						JOptionPane.showMessageDialog(null,"\"  "+af.getArquivo()+ "\" Atualizado Corretamente!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null,"\" "+af.getArquivo()+ "\" Não Atualizado!");
					}
				}
				else {
					af.GravarFuncionarios();
					JOptionPane.showMessageDialog(null,"\" "+af.getArquivo()+ "\" Criado com Sucesso! ");
					}
			}
		});
		btnSalvar.setBounds(210, 102, 89, 23);
		panel.add(btnSalvar);
		
		JLabel lblDadosCadastrais_1 = new JLabel(":: Dados Cadastrais Funcionario ::");
		lblDadosCadastrais_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDadosCadastrais_1.setBounds(25, 0, 301, 14);
		panel.add(lblDadosCadastrais_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(509, 36, 141, 20);
		panel.add(txtSobrenome);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(77, 36, 141, 20);
		panel.add(txtCodigo);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(77, 63, 141, 20);
		panel.add(txtDNI);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(275, 36, 141, 20);
		panel.add(txtNome);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(275, 63, 141, 20);
		panel.add(txtSenha);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInserir.setEnabled(true);
				btnModificar.setEnabled(false);
				if(af.Tamanho() == 0) {
					btnAceitar.setEnabled(false);
					HabilitarEntradas(false);
					JOptionPane.showMessageDialog(null,"Não existe elementos!");
				}
				else {
					btnAceitar.setEnabled(true);
					HabilitarEntradas(true);
					EditarFila();
					txtDNI.requestFocus();
				}
			}
		});
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditarFila();
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(204, 153, 0));
		btnModificar.setBounds(366, 102, 89, 23);
		panel.add(btnModificar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInserir.setEnabled(true);
				btnModificar.setEnabled(true);
				btnAceitar.setEnabled(false);
				
				if(af.Tamanho() == 0) {
					JOptionPane.showMessageDialog(null,"Não existe Funcionarios!");
				}
				else {
					int YesOrNo = JOptionPane.showConfirmDialog(null,"\" Deseja Deletar o codigo"+ lerCodigo()+"\"","Deletando Funcionario ",JOptionPane.YES_NO_OPTION);
				if(YesOrNo == 0) {
					af.Eliminar(af.buscar(lerCodigo()));
					Listar();
					EditarFila();
					JOptionPane.showMessageDialog(null,"Deletado com Sucesso! ");
					af.GravarFuncionarios();
					JOptionPane.showMessageDialog(null,"Arquivo Atualizado! ");
				}
				else {
					JOptionPane.showMessageDialog(null,"Funcionario não deletado! ");
					}
				
			}
			}
		});
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBorder(null);
		btnExcluir.setBackground(new Color(204, 153, 0));
		btnExcluir.setBounds(519, 102, 89, 23);
		panel.add(btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 164, 905, 382);
		getContentPane().add(scrollPane);
		
		tbFunc = new JTable();
		tbFunc.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				HabilitarEntradas(false);
				HabilitarBotoes(true);
				EditarFila();
			}
		});
		tbFunc.setFillsViewportHeight(true);
		scrollPane.setViewportView(tbFunc);

		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("DNI");
		modelo.addColumn("Senha");
		modelo.addColumn("Nome");
		modelo.addColumn("Sobrenome");
		modelo.addColumn("Cargo");
		modelo.addColumn("Email");
		
		tbFunc.setModel(modelo);
		
		HabilitarEntradas(false);
		
		Listar();
		EditarFila();
		AjustarColunas();
		
		tbFunc.getTableHeader().setBackground(Color.black);//cor do cabecalho
		tbFunc.getTableHeader().setForeground(Color.white);//letra do cabecalho
	}
	
	void Listar() {
		Funcionarios x;
		int PosFila = 0;
		if(modelo.getRowCount() > 0) 
			PosFila = tbFunc.getSelectedRow();
		if(modelo.getRowCount() == af.Tamanho()-1) 
			PosFila = af.Tamanho()-1;
		if(PosFila == af.Tamanho())
			PosFila --;
		modelo.setRowCount(0);
		for(int i = 0; i < af.Tamanho();i++) {
			x = af.obter(i);
			Object[] fila = {
				x.getCodigo(),
				x.getDni(),
				x.getSenha(),
				x.getNome(),
				x.getSobrenome(),
				x.DetalhesCargo(), //metodo detalhesCargo
				x.getEmail()
			
			};
			modelo.addRow(fila);
		}
		if(af.Tamanho() > 0) {
			tbFunc.getSelectionModel().setSelectionInterval(PosFila, PosFila);
		}
	}
	
	void EditarFila() {
		if(af.Tamanho()==0) 
			Limpeza();
		else {
			Funcionarios x = af.obter(tbFunc.getSelectedRow());
			txtCodigo.setText(""+ x.getCodigo());
			txtDNI.setText(""+ x.getDni());
			txtSenha.setText(""+ x.getSenha());
			txtNome.setText(""+ x.getNome());
			txtSobrenome.setText(""+ x.getSobrenome());
			cbCargo.setSelectedItem(""+ x.getCargo());
			txtEmail.setText(""+ x.getEmail());
		}
	}
	
	void HabilitarBotoes(Boolean ok) {
		
	}
	
	void HabilitarEntradas(boolean ok) {
		btnAceitar.setEnabled(ok);
		txtDNI.setEditable(ok);
		txtSenha.setEditable(ok);
		txtNome.setEditable(ok);
		txtSobrenome.setEditable(ok);
		txtEmail.setEditable(ok);
		cbCargo.setEditable(ok);
		txtCodigo.setEditable(ok);
	}
	
	void Limpeza() {
		txtDNI.setText("");
		txtSenha.setText("");
		txtNome.setText("");
		txtSobrenome.setText("");
		txtEmail.setText("");
		cbCargo.setSelectedItem("");
		txtCodigo.setText("");
		
	}
	
	private int AcharColuna(int porcentagem) {
		return porcentagem * ScrollPaneLayout() / 100;
	}
	
	private int ScrollPaneLayout() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void AjustarColunas() {
		TableColumnModel tcm = tbFunc.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(AcharColuna(10));//codigo
		tcm.getColumn(1).setPreferredWidth(AcharColuna(10));//dni
		tcm.getColumn(2).setPreferredWidth(AcharColuna(10));//senha
		tcm.getColumn(3).setPreferredWidth(AcharColuna(10));//nome
		tcm.getColumn(4).setPreferredWidth(AcharColuna(10));//sobrenome
		tcm.getColumn(5).setPreferredWidth(AcharColuna(10));//cargo
		tcm.getColumn(6).setPreferredWidth(AcharColuna(18));//email
	}
	
	int lerCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}
	String lerDNI() {
		return txtDNI.getText().trim();
	}
	String lerSenha() {
		return txtSenha.getText().trim();
	}
	String lerNome() {
		return txtNome.getText().trim();
	}
	String lerSobrenome() {
		return txtSobrenome.getText().trim();
	}
	int lerCargo() {
		return cbCargo.getSelectedIndex();
	}
	String lerEmail() {
		return txtEmail.getText().trim();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
