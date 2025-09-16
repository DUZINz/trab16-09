package exercicio01;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = PagamentoFactory.criarPagamento("boleto");
        p1.processar();

        Pagamento p2 = PagamentoFactory.criarPagamento("pix");
        p2.processar();

        Pagamento p3 = PagamentoFactory.criarPagamento("cartao");
        p3.processar();
    }
}
