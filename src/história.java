import java.util.Scanner;

public class hist�ria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome, resposta1;
		System.out.println("Ol�, seja muito bem-vinde. Qual o seu nome?");
		nome = sc.nextLine();
		
		System.out.println ("Muito prazer, " + nome + ".");
		System.out.println ("Fico feliz que esteja comigo neste momento. Voc� gostaria de brincar um pouco?");
		
		resposta1 = sc.nextLine();
		
		if (resposta1.equals ("Sim")) {
			System.out.println("Muito bem. Ent�o, eu vou te contar uma hist�ria, e voc� ter� o papel de complet�-la.");
			System.out.println("No centro de um pa�s tropical, apreciado por Deus e bonito por natureza, havia uma cidade chamada Goi�nia. Era um lugar calmo, com noites tranquilas e um c�u estrelado apreciado por todos. E, neste momento, eu estou te transportando para Goi�nia! Agora, voc� � parte da hist�ria.");
			System.out.println(nome + ", gostaria de ir do lado de fora apreciar a noite?");
		}
		
		else {
			System.out.println("Ent�o v� se foder. Passar bem.");
		}
		
		resposta1 = sc.nextLine();
		
		if (resposta1.equals ("Sim")) {
			System.out.println("Voc� sai de sua casa e caminha pela cal�ada, parando no espa�o em frente � sua casa, onde pode relaxar e olhar "
					+ "as estrelas. Entretanto, uma coisa n�o usual aconteceu: voc� avistou um brilho verde no horizonte, perto da entrada "
					+ "da cidade. Um clar�o r�pido e que quase te fez duvidar de sua pr�pria sanidade mental.");
			System.out.println ("O que quer fazer?");
			System.out.println ("A) Voltar para casa.");
			System.out.println ("B) Seguir at� a dire��o do clar�o.");
			System.out.println ("C) Ignorar e continuar relaxando no quintal.");
		}
		else {
			System.out.println("Lhe pareceu de bom grado ficar do lado de dentro esta noite.");
		}
		
		sc.close();

	}

}
