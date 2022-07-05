package Models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medicos extends Funcionarios {

	String diaConsulta, horaConsulta, medicoConsulta, enderecoConsulta, dhm;
	boolean continueLoop;

	public Medicos() {
		super("Clinico Geral");
	}

	int medico, dia, horario;
	Scanner leia = new Scanner(System.in);

	@Override
	public void medico(int medico) {
		do {
			continueLoop = true;
			try {
				System.out.println("\nEscolha o médico: " + "\n1-Dra. Buma\n2-Dr. Vegeta");
				medico = leia.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				continueLoop = false;
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
		} while (continueLoop == false);
		
		do {
			switch (medico) {
			case 1:
				System.out.println("\nObs. Dr. Buma atende na Rua Dragon Ball Z, n. 123");
				medicoConsulta = "Dra. Buma";
				enderecoConsulta = "Rua Dragon Ball Z, n. 123";

				break;
			case 2:
				System.out.println("\nObs. Dr. Vegeta atende na Rua Mestre Padawan, 199");
				medicoConsulta = "Dr. Vegeta";
				enderecoConsulta = "Rua Mestre Padawan, 199";

				break;
			default:
				do {
					continueLoop = true;
					try {
						System.out.println("\nOpção inválida. Escolha o médico novamente:");
						System.out.println("\nEscolha o médico: " + "\n1-Buma\n2-Vegeta");
						medico = leia.nextInt();
					} catch (InputMismatchException inputMismatchException) {
						continueLoop = false;
						System.err.printf("\nException: %s\n", inputMismatchException);
						leia.nextLine();
						System.out.println(
								"\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
					}
				} while (continueLoop == false);
				
				switch (medico) {
				case 1:
					System.out.println("\nObs. Dr. Buma atende na Rua Dragon Ball Z, n. 123");
					medicoConsulta = "Dra. Buma";
					enderecoConsulta = "Rua Dragon Ball Z, n. 123";

					break;
				case 2:
					System.out.println("\nObs. Dr. Vegeta atende na Rua Mestre Padawan, 199");
					medicoConsulta = "Dr. Vegeta";
					enderecoConsulta = "Rua Mestre Padawan, 199";

					break;
				}
			}
		} while (medico < 1 || medico > 2);
	}

	@Override
	public void dia(int dia) {
		do {
			continueLoop = true;
			try {
				System.out.println("\nEscolha o dia da semana: "
						+ "\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
				dia = leia.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				continueLoop = false;
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
		} while (continueLoop == false);
		do {
			switch (dia) {
			case 1:
				diaConsulta = "Segunda-feira";
				break;
			case 2:
				diaConsulta = "Terça-feira";
				break;
			case 3:

				diaConsulta = "Quarta-feira";
				break;
			case 4:

				diaConsulta = "Quinta-feira";
				break;
			case 5:

				diaConsulta = "Sexta-feira";
				break;
			default:
				do {
					continueLoop = true;
					try {
						System.out.println("\nOpção inválida. Digte o dia da semana novamente:");
						System.out.println("\nEscolha o dia da semana: "
								+ "\n1 - Segunda-feira \n2 - Terça-feira \n3 - Quarta-feira \n4 - Quinta-feira \n5 - Sexta-feira");
						dia = leia.nextInt();
					} catch (InputMismatchException inputMismatchException) {
						continueLoop = false;
						System.err.printf("\nException: %s\n", inputMismatchException);
						leia.nextLine();
						System.out.println(
								"\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
					}
				} while (continueLoop == false);
				switch (dia) {
				case 1:
					diaConsulta = "Segunda-feira";
					break;
				case 2:
					diaConsulta = "Terça-feira";
					break;
				case 3:
					diaConsulta = "Quarta-feira";
					break;
				case 4:
					diaConsulta = "Quinta-feira";
					break;
				case 5:
					diaConsulta = "Sexta-feira";
					break;
				}
			}
		} while (dia < 1 || dia > 5);
	}

	@Override
	public void horario(int horario) {
		do {
			continueLoop = true;
			try {
				System.out.println("\nEscolha o horário: " 
			+ "\n1 - 7:30h"
			+ "\n2 - 8:45h"
			+ "\n2 - 11:00h"
			+ "\n4 - 13:40h"
			+ "\n5 - 15:00h"
			+ "\n6 - 16:00h");
				horario = leia.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				continueLoop = false;
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
		} while (continueLoop == false);
		do {
			switch (horario) {
			case 1:
				horaConsulta = "7:30";
				break;
			case 2:
				horaConsulta = "8:45";
				break;
			case 3:
				horaConsulta = "11:00";
				break;
			case 4:
				horaConsulta = "13:40";
				break;
			case 5:
				horaConsulta = "15:00";
				break;
			case 6:
				horaConsulta = "16:00";
				break;
				
			default:
				do {
					continueLoop = true;
					try {
						System.out.println("\nOpção inválida. Digte o horário novamente:");
						System.out.println("\nEscolha o horário: " 
								+ "\n1 - 7:30h"
								+ "\n2 - 8:45h"
								+ "\n2 - 11:00h"
								+ "\n4 - 13:40h"
								+ "\n5 - 15:00h"
								+ "\n6 - 16:00h");
						horario = leia.nextInt();
					} catch (InputMismatchException inputMismatchException) {
						continueLoop = false;
						System.err.printf("\nException: %s\n", inputMismatchException);
						leia.nextLine();
						System.out.println(
								"\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
					}
				} while (continueLoop == false);
				switch (horario) {
				case 1:
					horaConsulta = "7:30";
					break;
				case 2:
					horaConsulta = "8:45";
					break;
				case 3:
					horaConsulta = "11:00";
					break;
				case 4:
					horaConsulta = "13:40";
					break;
				case 5:
					horaConsulta = "15:00";
					break;
				case 6:
					horaConsulta = "16:00";
					break;
				}
			}
		} while (horario < 1 || horario > 6);
	}
}
