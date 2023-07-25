package theWayDefaultPackage;
import java.util.Scanner;
import java.util.Random;
public class TheWayTwo {

	//Jogo de adivinhação de um número misterioso
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	//Objeto do tipo random para fazer o sorteio do número misterioso
	Random RNG = new Random();
	//Variáveis do tipo inteiro necessários para o programa
	int aleatorio,resposta,tentativa;
	//Você tem direito apenas á 3 tentativas
	tentativa = 3;
	System.out.println("Bem vindo ao jogo de adivinha!");
	System.out.println("Voce tem direito a 3 tentativas!Boa sorte!");
	//Realiza o sorteio do Número misterioso
	aleatorio = RNG.nextInt(0,6);
	//Loop do jogo de adivinhação
	do
	{
		System.out.print("Voce ainda tem "+tentativa+" tentativas para adivinhar qual eh o numero sorteado");
		resposta = sc.nextInt();
		//Se estiver errado repete o programa e retira uma tentativa
		if(resposta !=aleatorio)
		{
			tentativa--;
		}
		//Se estiver certo o programa para e manda uma mensagem notificando a vitória
		else if(resposta == aleatorio)
		{
			System.out.println("Parabens voce acertou o numero aleatorio que eh "+aleatorio+"!");
			break;	
		}
		//Se as chances acabarem mostra qual era o número misterioso e para o programa
		if(tentativa == 0 )
		{
			System.out.println("Infelizmente tu nao conseguiu acertar o numero aleatorio que eh "+aleatorio+" mais sorte na proxima!");
		}
	}while((tentativa != 0)||(resposta == aleatorio));
	sc.close();
	}
}
