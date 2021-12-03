package br.com.GynasticFit.entidade;

public class Funcionarios {
	
	public int codigo, cargo;
	public String dni, senha, nome, sobrenome, email;
	
	
	public Funcionarios(int codigo,  String dni, String senha, String nome, String sobrenome,int cargo, String email) {
		this.codigo = codigo;
		this.cargo = cargo;
		this.dni = dni;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String DetalhesCargo() {
		switch (cargo) {
		
		case 0 : 
			return "Administrador";
		case 1: 
			return "Gerente";
		default:
			return "Caixa";
		}
		
	}
}
