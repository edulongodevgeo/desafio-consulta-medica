package Models;

import java.util.ArrayList;

public abstract class Funcionarios {

	private String Funcionarios;

	abstract public void medico(int nome);

	abstract public void horario(int horario);

	abstract public void dia(int dia);

	public Funcionarios(String Especialidades) {
		this.Funcionarios = Especialidades;
	}

	public String getEspecialidade() {
		return Funcionarios;
	}

	public void setEspecialidade(String especialidades) {
		Funcionarios = especialidades;
	}
}
