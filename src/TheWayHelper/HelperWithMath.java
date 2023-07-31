package TheWayHelper;

//Classe ajudante que guarda métodos que auxiliam em certas funções
public class HelperWithMath {

	//Esse método lida com a comparação entre 2 números.
	public int comparacaoMaior(int primeiroNumero, int segundoNumero)
	{
		if(primeiroNumero > segundoNumero)
		{
			return primeiroNumero;
		}else
		{
			return segundoNumero;
		}
	}
	//Esse método lida com operações de soma.
	public int soma (int primeiroNumero, int segundoNumero)
	{
		int sum = primeiroNumero + segundoNumero;
		return sum;
	}
	
	//Esse método lida com operações de cálculo de raiz quadrática baseado nas regras de Pell
	public int raizDePell(int alvo)
	{
		Integer testador = 1;
		int ciclo = 0;
		int compRunner = comparacaoMaior(alvo,testador);
		while(compRunner == alvo)
		{
			alvo -= testador;
			testador += 2;
			ciclo++;
			compRunner = comparacaoMaior(alvo,testador);
		}
		return ciclo;
	}
	
	
}
