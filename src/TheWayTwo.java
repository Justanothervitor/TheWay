import java.util.Scanner;
import java.util.Random;
public class TheWayTwo {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Random RNG = new Random();
	int aleatorio,resposta,tentativa;
	tentativa = 3;
	System.out.println("Bem vindo ao jogo de adivinha!");
	System.out.println("Voce tem direito a 3 tentativas!Boa sorte!");
	aleatorio = RNG.nextInt(0,6);
	do
	{
		System.out.print("Voce ainda tem "+tentativa+" tentativas para adivinhar qual eh o numero sorteado");
		resposta = sc.nextInt();
		if(resposta !=aleatorio)
		{
			tentativa--;
		}else if(resposta == aleatorio)
		{
			System.out.println("Parabens voce acertou o numero aleatorio que eh "+aleatorio+"!");
			break;
		}if(tentativa == 0 )
		{
			System.out.println("Infelizmente tu nao conseguiu acertar o numero aleatorio que eh "+aleatorio+" mais sorte na proxima!");
		}
	}while((tentativa != 0)||(resposta == aleatorio));
	sc.close();
	}
}
