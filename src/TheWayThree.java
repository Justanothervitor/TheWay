import java.util.Scanner;
public class TheWayThree {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		Integer num1,num2;
		num1 = 0;
		num2 = 1;
		System.out.println("Esse programa tem um algoritmo que simula o calculo de fibbonaci!");
		System.out.println("Enquanto o usuario permitir esse programa rodar ele vai continuar fazendo o calculo");
		do {
			System.out.println("Por favor escolha uma opcao!");
			System.out.println("[1] - Comecar/continuar o programa");
			System.out.println("[2] - Parar o programa!");
			opcao = sc.nextInt();
			
			switch(opcao)
			{
			case 1:
				System.out.println("Numero antes da incrementacao:"+num2);
				num2 = num2+num1;
				num1 = num2-num1;
				System.out.println("Numero atual:"+num2);
				break;
				
			case 2:
				System.out.println("Parando o programa!");
				System.out.println("Numero final:"+num2);
				break;
				
			default:
				System.out.println("Opcao invalida!");
				System.out.println("Por favor selecione outra opcao!");
				break;
			}
		}while(opcao != 2);
		sc.close();
		
	}
	
}
