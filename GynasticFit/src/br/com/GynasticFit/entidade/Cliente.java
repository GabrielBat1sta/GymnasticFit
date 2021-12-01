package br.com.GynasticFit.entidade;

public class Cliente {
	
	public float valParcela;
	public String dateCadastro, nascimentoCliente;
	public String nomCliente,endCliente, cpfCliente , numCliente, bairroCliente,telCliente, cidCliente, cepCliente, emailCliente, nomResponsavel,emailResponsavel, cpfResponsavel, cbCategoria;
	
	
	
	
	
	
	public Cliente(float valParcela, String dateCadastro, String nomCliente, String endCliente, String cpfCliente,
			String numCliente, String bairroCliente, String telCliente, String cidCliente, String cepCliente,
			String emailCliente, String nomResponsavel, String emailResponsavel, String cpfResponsavel,
			String cbCategoria, String nascimentoCliente) {
		
		this.valParcela = valParcela;
		this.dateCadastro = dateCadastro;
		this.nomCliente = nomCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
		this.numCliente = numCliente;
		this.bairroCliente = bairroCliente;
		this.telCliente = telCliente;
		this.cidCliente = cidCliente;
		this.cepCliente = cepCliente;
		this.emailCliente = emailCliente;
		this.nomResponsavel = nomResponsavel;
		this.emailResponsavel = emailResponsavel;
		this.cpfResponsavel = cpfResponsavel;
		this.cbCategoria = cbCategoria;
		this.nascimentoCliente = nascimentoCliente;
		
	}
	
	


	public String getNascimentoCliente() {
		return nascimentoCliente;
	}


	public void setNascimentoCliente(String nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}


	public float getValParcela() {
		return valParcela;
	}
	public void setValParcela(float valParcela) {
		this.valParcela = valParcela;
	}
	public String getDateCadastro() {
		return dateCadastro;
	}
	public void setDateCadastro(String dateCadastro) {
		this.dateCadastro = dateCadastro;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getEndCliente() {
		return endCliente;
	}
	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
	public String getCidCliente() {
		return cidCliente;
	}
	public void setCidCliente(String cidCliente) {
		this.cidCliente = cidCliente;
	}
	public String getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getNomResponsavel() {
		return nomResponsavel;
	}
	public void setNomResponsavel(String nomResponsavel) {
		this.nomResponsavel = nomResponsavel;
	}
	public String getEmailResponsavel() {
		return emailResponsavel;
	}
	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}
	public String getCpfResponsavel() {
		return cpfResponsavel;
	}
	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	public String getCbCategoria() {
		return cbCategoria;
	}
	public void setCbCategoria(String cbCategoria) {
		this.cbCategoria = cbCategoria;
	}
	
	//public String 
	
	
}
