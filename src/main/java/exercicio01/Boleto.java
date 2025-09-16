package exercicio01;

// Implementações
public class Boleto implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Boleto...");
    }
}
