package exercicio01;

public class CartaoDeCredito implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Cartão de Crédito...");
    }
}
