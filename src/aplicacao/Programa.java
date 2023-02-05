package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Classes;
import entidades.Mago;
import entidades.Personagem;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------");
		System.out.println("       Bem vindo ao RPG       ");
		System.out.println("------------------------------");
		System.out.print("Me diga seu nome para continuar: ");
		String nome = sc.nextLine();
		System.out.println("Muito bem " + nome);
		System.out.println("Essas são as classes disponiveis: ");

		for (Classes clas : Classes.values()) {
			System.out.println(clas);
		}

		System.out.print("escolha uma delas para começar sua aventurar: ");
		Classes escolha = Classes.valueOf(sc.next().toUpperCase());
		System.out.print("Voce escolheu a classe " + escolha + " deseja confirma essa escolha? (S/N): ");
		char resp = sc.next().charAt(0);
		while(resp == 'n'|| resp == 'N' ) {
			System.out.print("Escolha novamente: ");
			escolha = Classes.valueOf(sc.next().toUpperCase());
			resp = 's';
		}
		System.out.println("Agora crie uma breve historia sobre seu personagem: ");
		System.out.print("ESCREVA AQUI:");
		sc.nextLine();
		String historia = sc.nextLine();
		
		System.out.println("Essas são as caracteristicas da sua classe");
		Personagem mago = new Mago(historia, nome, escolha, 220, 30, 180, 130);
		
		System.out.println("Seu nome: "+mago.getNome());
		System.out.println("Sua classe: "+mago.getClase());
		System.out.println("Seus pontos de vida:"+mago.getHp());
		System.out.println("Sua mana: " +180);
		
		
	   
		
		
	}

}
