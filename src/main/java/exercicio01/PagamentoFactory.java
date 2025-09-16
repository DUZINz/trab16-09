package exercicio01;

// PagamentoFactory.java
public class PagamentoFactory {
    public static Pagamento criarPagamento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "boleto":
                return new Boleto();
            case "pix":
                return new Pix();
            case "cartao":
                return new CartaoDeCredito();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipo);
        }
    }
}
