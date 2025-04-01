public class TestaBilheteEvento {
    public static void main(String[] args) {
        // Criando dois bilhetes
        BilheteEvento bilhete1 = new BilheteEvento();
        BilheteEvento bilhete2 = new BilheteEvento();

        // Alterando o status dos bilhetes
        bilhete1.registrarEntrada();  // O bilhete1 entrada
        bilhete2.registrarSaida();    // O bilhete2 saida

        // Imprimindo os dados dos bilhetes
        System.out.println("Dados do bilhete 1:");
        bilhete1.imprimeDados();  // Exibe o status do bilhete 1

        System.out.println("Dados do bilhete 2:");
        bilhete2.imprimeDados();  // Exibe o status do bilhete 2
    }
}
