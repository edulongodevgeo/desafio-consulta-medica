package Models;

public class Paciente {

	private String nomeCompleto;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private int genero;
	private float numeroConvenio;

	public Paciente(String nomeCompleto, int genero, String cpf, String dataNascimento,
			String endereco, float numeroConvenio) {
		// padrão
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.genero = genero;
		this.setNumeroConvenio(getNumeroConvenio());;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public float getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(float numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}



}
