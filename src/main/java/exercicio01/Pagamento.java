package exercicio01;

public interface Pagamento {
    void processar();
}

// Implementações
class Boleto implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Boleto...");
    }
}

class Pix implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Pix...");
    }
}

class CartaoDeCredito implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Cartão de Crédito...");
    }
}
