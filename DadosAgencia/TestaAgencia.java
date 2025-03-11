public class TestaAgencia{
	public static void main(String args[]){
	
	Agencia a = new Agencia();
	
	a.nrAgencia = "Nubank 123";
	a.codBanco = 123456;
	
	System.out.println("Numero da Agencia...: "+a.nrAgencia);
	System.out.println("COdigo do banco...: "+a.codBanco);
	}
}