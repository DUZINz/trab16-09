package exercicio03;

import exercicio01.Boleto;
import exercicio01.CartaoDeCredito;
import exercicio01.Pix;

public class MainPagamento {
    public static void main(String[] args) {
        // Injetando um pagamento específico
        PagamentoService service1 = new PagamentoService(new Boleto());
        service1.executarPagamento();

        PagamentoService service2 = new PagamentoService(new Pix());
        service2.executarPagamento();

        PagamentoService service3 = new PagamentoService(new CartaoDeCredito());
        service3.executarPagamento();
    }
}
