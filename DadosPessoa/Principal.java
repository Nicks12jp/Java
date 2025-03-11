public class Principal{
	public static void main(String args[]){
	
	//Scanner sc = new Scanner();
	Pessoa p = new Pessoa();
	
	//Entrada de dados
	p.nome = "Nick";
	p.idade = 19;
	p.cpf = "352.156.986-65";

	//Saida de dados
	System.out.println("Nome...: "+p.nome);
	System.out.println("Idade...: "+p.idade);
	System.out.println("CPF...: "+p.cpf);
	
	}
}