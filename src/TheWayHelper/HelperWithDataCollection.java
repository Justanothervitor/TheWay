package TheWayHelper;

import javax.swing.JOptionPane;
//Classe com métodos que ajudam na coleta de dados dados pelo usuário
public class HelperWithDataCollection {

	private String nome,telefone,cpf,endereco,dataDeNascimento,sexo,escolaridade;
	
	//Construtor da classe
	public HelperWithDataCollection()
	{
		
	}
	
	public HelperWithDataCollection(String nome, String telefone, String cpf, String endereco, 
			String dataDeNascimento,String sexo, String escolaridade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.escolaridade = escolaridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	//Método com função de pegar dados digitados pelo usuário via teclado
	public void CollectData(String nome, String telefone, String cpf, String endereco, 
			String dataDeNascimento,String sexo, String escolaridade)
	{
		String nomeInicial,sobrenome,nomeCompletoTemp;
		String dia,mes,ano;
		Object [] sexoOpcoes = {"Masculino","Feminino"};
		Object [] escolaridadeOpcoes = {"Analfabeto","Fundamental","Médio","Superior"};
		String saudacao =  "Seja bem vindo ao programa de cadrasto de dados";
		String pergunta1 = "Poderia me dizer qual eh o seu nome?";
		String pergunta2 = "Poderia me dizer qual eh o seu sobrenome?";
		String repita = "Por favor se quiser continuar informe o seu sobrenome!";
		String pergunta3 = "Poderia me informar o seu numero de telefone?";
		String pergunta4 = "Poderia me informar o seu cpf?";
		String pergunta5 = "Poderia me informar o seu endereco?";
		String pergunta6 = "Poderia me informar o seu dia de nascimento?";
		String pergunta7 = "Poderia me informar o seu mês de nascimento?";
		String pergunta8 = "Poderia me informar o seu ano de nascimento?";
		String pergunta9 = "Poderia me informar o seu sexo?";
		String pergunta10= "Poderia me informar a sua escolaridade?";
		
		JOptionPane.showMessageDialog(null, saudacao);
		nomeInicial = JOptionPane.showInputDialog(pergunta1);
		sobrenome = JOptionPane.showInputDialog(pergunta2);
		do {
			sobrenome = JOptionPane.showInputDialog(repita);
		}while(voidStringValidation(sobrenome) == true);
		nomeCompletoTemp = nomeInicial+" "+ sobrenome;
		nome = nomeCompletoTemp;
		setNome(nome);
		telefone = JOptionPane.showInputDialog(pergunta3);
		setTelefone(telefone);
		cpf = JOptionPane.showInputDialog(pergunta4);
		setCpf(cpf);
		endereco = JOptionPane.showInputDialog(pergunta5);
		setEndereco(endereco);
		dia = JOptionPane.showInputDialog(pergunta6);
		mes = JOptionPane.showInputDialog(pergunta7);
		ano = JOptionPane.showInputDialog(pergunta8);
		dataDeNascimento = dia+"/"+mes+"/"+ano; 
		setDataDeNascimento(dataDeNascimento);
		sexo = (String) JOptionPane.showInputDialog(null, pergunta7, "Opção",JOptionPane.INFORMATION_MESSAGE,null,sexoOpcoes,sexoOpcoes[0]);
		setSexo(sexo);
		escolaridade = (String) JOptionPane.showInputDialog(null, pergunta8, "Opção",JOptionPane.INFORMATION_MESSAGE,null,escolaridadeOpcoes,escolaridadeOpcoes[0]);
		setEscolaridade(escolaridade);
		
		
	}
	
	//Imprime os dados na tela após o termino da coleta
	public void impressora ()
	{
		String resultado = ("Nome:"+getNome()+"\nTelefone:"+getTelefone()+"\nCpf:"+getCpf()+"\nEndereco:"+getEndereco()+"\nData de Nascimento:"+getDataDeNascimento()+"\nSexo:"+getSexo()+"\nEscolaridade:"+getEscolaridade());
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	//Método criado para rodar os métodos CollectData e Impressora
	public void runner()
	{
		CollectData(getNome(),getTelefone(),getCpf(),getEndereco(),getDataDeNascimento(),getSexo(),getEscolaridade());
		impressora();
	}
	
	//Esse método verifica se a string informada esta vazia
	public static boolean voidStringValidation (String str) {
		
		if(str.isEmpty())
		{
			return true;
		}else
		{
			return false;
		}
	}
}
