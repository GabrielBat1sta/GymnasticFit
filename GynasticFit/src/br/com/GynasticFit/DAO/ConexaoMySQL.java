package br.com.GynasticFit.DAO;

//Classes necessárias para uso de Banco de dados //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.GynasticFit.entidade.Cliente;


//Início da classe de conexão//

public class ConexaoMySQL {

	public static String status = "N�o conectou...";

//Metodo Construtor da Classe//

	public ConexaoMySQL() {

	}

//Metodo de Conex�o//

	public static java.sql.Connection getConexaoMySQL() {

		Connection connection = null; // atributo do tipo Connection

		try {

// Carregando o JDBC Driver padrão

			String driverName = "com.mysql.jdbc.Driver";

			Class.forName(driverName);

// Configurando a nossa conex�o com um banco de dados//

			String serverName = "localhost"; // caminho do servidor do BD

			String mydatabase = "gymansticfit"; // nome do seu banco de dados

			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

			String username = "root"; // nome de um usuário de seu BD

			String password = ""; // sua senha de acesso

			connection = DriverManager.getConnection(url, username, password);

			// Testa sua conexão//

			if (connection != null) {

				status = ("STATUS--->Conectado com sucesso!");
				System.out.println("STATUS--->Conectado com sucesso!\"");

			} else {

				status = ("STATUS--->Não foi possivel realizar conexão");

			}

			return connection;

		} catch (ClassNotFoundException e) { // Driver n�o encontrado

			System.out.println("O driver expecificado nao foi encontrado.");

			return null;

		} catch (SQLException e) {

//N�o conseguindo se conectar ao banco

			System.out.println("Nao foi possivel conectar ao Banco de Dados.");

			return null;

		}

	}

	// Metodo que retorna o status da sua conexão//

	public static String statusConection() {

		return status;

	}

	// Metodo que fecha sua conexão//

	public static boolean FecharConexao() {

		try {

			ConexaoMySQL.getConexaoMySQL().close();

			return true;

		} catch (SQLException e) {

			return false;

		}

	}

	// Metodo que reinicia sua conexão//

	public static java.sql.Connection ReiniciarConexao() {

		FecharConexao();

		return ConexaoMySQL.getConexaoMySQL();

	}

	public static void main(String[] args) {
		Connection connection = ReiniciarConexao();
		try {
			if (connection != null) {
				Cliente c = new Cliente(0, status, status, status, status, status, status, status, status, status, status, status, status, status, status, status);
				
				c.setNomCliente("Nelson Mandela");
				c.setCpfCliente("700.654.321-00");
				c.setNascimentoCliente("07/12/2000");
				/*c.set();
				c.setPeriodo("2");
				c.setSexo("Masculino");
				c.setDataNascimento("07/12/2000");*/
				
				
				
				inserir(connection, c);
				//pesquisar(connection);
				

			}

			connection.close();
		} catch (Exception e) {
			System.out.println("Erro  de Conexão!");
		}

	}

	public static void inserir(Connection connection, Cliente c) throws SQLException {
		Statement stmt = connection.createStatement();

		int insert = stmt.executeUpdate("insert into cliente (nomeCliente, CpfCliente, NascimentoCliente) VALUES(" + c.getNomCliente()
				+ "','" + c.getCpfCliente() + "','"+ c.getNascimentoCliente() +"') ");
		System.out.println("Insert: " + insert);

	}
	


	/*public static List<Cliente> pesquisar(Connection connection) throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet cliente = stmt.executeQuery("select * from cliente ");
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		while (res.next()) {
			Cliente cliente = new Cliente();
			cliente.setNomCliente(res.getString("nome"));
			cliente.setCpfCliente(res.getString("CPF Cliente"));
			cliente.setNascimentoCliente(res.getString("Nascimento Cliente"));
			/*imoveis.setCpf(res.getInt("cpf"));
			imoveis.setEmail(res.getString("email"));
			imoveis.setDDD(res.getString("DDD"));
			imoveis.setTelefone(res.getString("telefone"));
			imoveis.setEndereco(res.getString("endereco"));
			listaCliente.add(cliente);
		}

		res.close();
		stmt.close();
		return listaCliente;
	}*/
	
	

}