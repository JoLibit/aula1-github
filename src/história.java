import java.util.Scanner;

public class história {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome, resposta1;
		System.out.println("Olá, seja muito bem-vinde. Qual o seu nome?");
		nome = sc.nextLine();
		
		System.out.println ("Muito prazer, " + nome + ".");
		System.out.println ("Fico feliz que esteja comigo neste momento. Você gostaria de brincar um pouco?");
		
		resposta1 = sc.nextLine();
		
		if (resposta1.equals ("Sim")) {
			System.out.println("Muito bem. Então, eu vou te contar uma história, e você terá o papel de completá-la.");
			System.out.println("No centro de um país tropical, apreciado por Deus e bonito por natureza, havia uma cidade chamada Goiânia. Era um lugar calmo, com noites tranquilas e um céu estrelado apreciado por todos. E, neste momento, eu estou te transportando para Goiânia! Agora, você é parte da história.");
			System.out.println(nome + ", gostaria de ir do lado de fora apreciar a noite?");
		}
		
		else {
			System.out.println("Então vá se foder. Passar bem.");
		}
		
		resposta1 = sc.nextLine();
		
		if (resposta1.equals ("Sim")) {
			System.out.println("Você sai de sua casa e caminha pela calçada, parando no espaço em frente à sua casa, onde pode relaxar e olhar "
					+ "as estrelas. Entretanto, uma coisa não usual aconteceu: você avistou um brilho verde no horizonte, perto da entrada "
					+ "da cidade. Um clarão rápido e que quase te fez duvidar de sua própria sanidade mental.");
			System.out.println ("O que quer fazer?");
			System.out.println ("A) Voltar para casa.");
			System.out.println ("B) Seguir até a direção do clarão.");
			System.out.println ("C) Ignorar e continuar relaxando no quintal.");
		}
		else {
			System.out.println("Lhe pareceu de bom grado ficar do lado de dentro esta noite.");
		}
		
		sc.close();

	}

}
