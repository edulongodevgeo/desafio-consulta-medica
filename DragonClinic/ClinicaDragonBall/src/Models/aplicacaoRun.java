package Models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class aplicacaoRun {

	public static void main(String[] args) {
		boolean continueLoop = true;
		
		int option = 0, numeroConvenio, i = 0, f = 0, k = 0, l = 0;
		
		String nomePaciente, cpfPaciente, dataNascimentoPaciente, enderecoCliente;
	
		ArrayList<String> listaAgendamentos = new ArrayList<String>();
		
		Medicos clinicoGeral = new Medicos();
		
		Paciente pc = new Paciente("", 1, "", "", "", 9);
		
		Funcionarios esp = null;
		
		Scanner inputDados = new Scanner(System.in);
		
		System.out.println("BEM-VINDO!");
		System.out.println("BOLAS DO DRAGÃO - CLÍNICA");
		System.out.println("\n --- FICHA DO CLIENTE ---");

		do {

			System.out.println("\nDigite seu nome completo: ");
			nomePaciente = inputDados.nextLine();
			pc.setNomeCompleto(nomePaciente);
			if (nomePaciente == "") {
				System.out.println("\nCampo obrigatório ");
			} else {
				i++;
			}
		} while (i < 1);


		System.out.println("\nEntre com a sua Data de Nascimento:* ");
		dataNascimentoPaciente = inputDados.nextLine();
		pc.setDataNascimento(dataNascimentoPaciente);
		do {
			if (dataNascimentoPaciente == "") {
				System.out.println("\nCampo obrigatório ");
				System.out.println("\nEntre com a sua Data de Nascimento:* ");
				dataNascimentoPaciente = inputDados.nextLine();
				pc.setDataNascimento(dataNascimentoPaciente);
			} else {
				f++;
			}
		} while (f < 1);

		System.out.println("\nDigite seu CPF válido: ");
		cpfPaciente = inputDados.nextLine();
		pc.setCpf(cpfPaciente);
		do {
			if (cpfPaciente == "") {
				System.out.println("\nCampo obrigatório ");
				System.out.println("\nEntre com o seu CPF:(somente os numeros)* ");
				cpfPaciente = inputDados.nextLine();
			} else {
				k++;
				if (cpfPaciente.length() != 11) {
					System.out.println("\nDigite o CPF correto");
					System.out.println("\nEntre com o seu CPF:(somente os numeros)* ");
					cpfPaciente = inputDados.nextLine();
					pc.setCpf(cpfPaciente);
				}
				if (cpfPaciente.length() != 11) {
					k--;
				}
			}
		} while (k < 1);

		System.out.println("\nDigite seu endereço:* ");
		enderecoCliente = inputDados.nextLine();
		do {
			pc.setEndereco(enderecoCliente);
			if (enderecoCliente == "") {
				System.out.println("\nCampo obrigatório ");
				System.out.println("\nEntre com o seu endereço: ");
				enderecoCliente = inputDados.nextLine();
			} else {
				l++;
			}
		} while (l < 1);

		do {
			continueLoop = true;
			try {
				System.out.println("\nDigite o número de seu convênio: \n >>> Se não possuir, digite zero. ");
				numeroConvenio = inputDados.nextInt();

				pc.setNumeroConvenio(numeroConvenio);
			} catch (InputMismatchException inputMismatchException) {
				continueLoop = false;
				System.err.printf("\nException: %s\n", inputMismatchException);
				inputDados.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
		} while (continueLoop == false);

		

		do {
			do {
				do {
					continueLoop = true;
					try {
						System.out.println("\n--------------------------------------------------------------");
						System.out.println("\nO que você deseja?: ");
						System.out.println("\n1- Marcar consulta com Clínico Geral");
						System.out.println("\n2- Pegar Receita");
						System.out.println("\n0- Sair do programa?");
						option = inputDados.nextInt();
					} catch (InputMismatchException inputMismatchException) {
						continueLoop = false;
						System.err.printf("\nException: %s\n", inputMismatchException);
						inputDados.nextLine();
						System.out.println(
								"\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
					}
				} while (continueLoop == false);
				
				switch (option) {
				case 0:
					System.out.println("\nPrograma finalizado");
					break;
				case 1:
					esp = clinicoGeral;
					break;
				case 2:
					System.out.println("GERANDO RECEITA MÉDICA...");
					break;
				}
			} while (option < 0 || option > 2);
			if (esp != null && option != 0 && option != 2) {
				esp.medico(1);
				esp.dia(1);
				esp.horario(1);
			}
			if (option == 1) {
				clinicoGeral.dhm = "";
				clinicoGeral.dhm = clinicoGeral.medicoConsulta + clinicoGeral.diaConsulta + clinicoGeral.horaConsulta;

				if (listaAgendamentos.contains(clinicoGeral.dhm)) {
					System.out.println("\nData e horario indisponível. Escolha outra data e/ou horario. ");
				} else {
					listaAgendamentos.add(clinicoGeral.dhm);
					System.out.println("\nSua consulta foi agendada com o/a " + clinicoGeral.medicoConsulta + ", no Endereço " + clinicoGeral.enderecoConsulta + " na "
							+ clinicoGeral.diaConsulta + ", às " + clinicoGeral.horaConsulta + ".");
				}

			}
			if (option == 2) {
				System.out.println("Receita gerada com sucesso...");
			}
			
		} while (option != 0);
	}

}
