package br.com.dados;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String municipio;
	private String estado;
	

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public Endereco(String rua, String bairro, String municipio, String estado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Endereço" + novaLinha + "Logradouro: " + rua + novaLinha + "Bairro: " + bairro + novaLinha + 
				"Municipio: " + municipio + novaLinha + "Estado: " + estado + novaLinha;
	}
	
	//Auxiliar para quebra de linha
		String novaLinha = System.getProperty("line.separator");

}
