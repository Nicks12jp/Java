public class BilheteEvento {
    private String status;

    // Construtor
    public BilheteEvento() {
        this.status = "não utilizado";
    }

    // Método para entrada
    public void registrarEntrada() {
        status = "entrada";
    }

    // Método para saída
    public void registrarSaida() {
        status = "saida";
    }

    // Método para exibir o status
    public String getStatus() {
        return status;
    }

    // Método para imprimir os dados
    public void imprimeDados() {
        System.out.println("Status do bilhete: " + status);
    }
}
