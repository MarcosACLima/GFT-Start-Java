package br.com.dlima.logicaprogramacao;

public class Algoritmos {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		String aluno = "Joao";

		nota1 = 7;
		nota2 = 1.5;
		nota3 = 9.3;
		nota4 = 8.75;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("O Aluno: " + aluno + " obteve a média: " + media);

		if (media >= 7) {
			System.out.println("Parabéns!Você foi aprovado");
		} else {
			System.out.println("Você foi reprovado");
		}

//		CASE

		System.out.println("1 - Netflix 2 - Amazon Prime 3 - HBO GO 4 - Sair");

		int menu = 1;

		switch (menu) {
		case 1:
			System.out.println("Netflix");
			break;
		case 2:
			System.out.println("Amazon Prime");
			break;
		case 3:
			System.out.println("HBO GO");
			break;
		case 4:
			System.out.println("Saindo do Menu...");
			break;
		default:
			System.out.println("Digite de 1 a 4");
		}

//		while - tabuada de 9 

		int contador, limite, resultado;
		contador = 0;
		limite = 10;

		do {
			resultado = 9 * contador;
			System.out.println("9 X " + contador + "=" + resultado + "\n");
			contador++;
		} while (contador <= limite);

	}
}
