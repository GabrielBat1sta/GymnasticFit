package br.com.GynasticFit.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.com.GynasticFit.entidade.Funcionarios;

public class ArranjoFuncionarios {
	
	private ArrayList<Funcionarios> fun;
	private String Arquivo;
	
	public ArranjoFuncionarios(String arquivo) {
		fun = new ArrayList<Funcionarios>();
		this.Arquivo = arquivo;
		CarregarFuncionarios();
	}
	
	public int Tamanho() {
		return fun.size();
	}
	
	public Funcionarios obter(int i) {
		return fun.get(i);
	}
	
	public String getArquivo() {
		return Arquivo;
	}
	
	public void setArquivo(String arquivo) {
		Arquivo = arquivo;
	}
	
	public void Adicionar(Funcionarios x) {
		fun.add(x);
	}
	
	public void Eliminar(Funcionarios x) {
		fun.remove(x);
	}
	
	public int  CodigoCorrelativo() {
		if(Tamanho() == 0) {
			return 10001;
		}else {
			return obter(Tamanho()-1).getCodigo()+1;
		}
			
	}
	
	public Funcionarios buscar(int codigo) {
		Funcionarios x;
		for(int i = 0; i < Tamanho(); i++) {
			x = obter(i);
			if(x.getCodigo() == codigo) {
				return x;
			}
		}
		return null;
	}
	
	public void GravarFuncionarios() {
		try {
			PrintWriter pw;
			String linha;
			Funcionarios x;
			
			pw = new PrintWriter(new FileWriter(Arquivo));
			for (int i = 0; i < Tamanho(); i++) {
				x = obter(i);
				linha = x.getCodigo() + ";" +
						x.getDni() + ";"+
						x.getSenha()+ ";"+
						x.getNome()+ ";"+
						x.getSobrenome()+ ";"+
						x.getCargo()+ ";"+
						x.getEmail()+ ";";
				pw.println(linha);
			}
			pw.close();
			
		} catch (Exception ex) {
			System.err.print(ex.toString());
		}
	}
	public void CarregarFuncionarios() {
		
		try {
			BufferedReader br;
			String linha,dni,senha,nome,sobrenome,email;
			int codigo,cargo;
			String s[];
			br = new BufferedReader(new FileReader(Arquivo));
		
			while((linha = br.readLine()) != null ) {
				s = linha.split(";");
				codigo = Integer.parseInt(s[0].trim());
				dni = s[1].trim();
				senha = s[2].trim();
				nome = s[3].trim();
				sobrenome = s[4].trim();
				cargo = Integer.parseInt(s[5].trim());
				email = s[6].trim();
			
				Adicionar(new Funcionarios(codigo,dni,senha,nome,sobrenome,cargo,email));
			}
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean ExisteArquivo() {
		File f = new File(Arquivo);
		return f.exists();
	}
}