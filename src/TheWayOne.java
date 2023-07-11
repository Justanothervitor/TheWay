import java.util.Scanner;

public class TheWayOne {

	public static void main (String [] args)
	{
		double peso,altura,imc;
		String msg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao programa que calcula o IMC");
		System.out.println("Por favor digite o seu peso e sua altura!");
		System.out.print("Peso:");
		peso = sc.nextDouble();
		System.out.println("");
		System.out.print("Altura:");
		altura = sc.nextDouble();
		imc = peso/(altura*altura);
		if(imc <20.0)
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta abaixo do peso!";
		}else if((imc>20.0)&&(imc <=25.0))
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta no peso ideal!";
		}else if((imc> 25.0)&&(imc <=30.0))
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta com sobrepeso!";
		}else if((imc>30.0)&&(imc<=35.0)) 
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta com obesidade moderada!!!";	
		}else if((imc>35.0)&&(imc<=40.0))
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta com obesidade severa!!";
		}else if((imc>40.0)&&(imc<=50.0))
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta com obesidade morbida!!!CUIDADO!";
		}else
		{
			msg = "O seu peso eh de "+peso+"Kg"+", e a sua altura eh de"+altura+"m"+" e o seu IMC eh de:"+imc+", logo voce esta com super obesidade!!!!CUIDADO!!!";
		}
		sc.close();
		System.out.println(msg);
	}
	
}
