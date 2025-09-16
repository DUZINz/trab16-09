package exercicio03;
import exercicio01.Pagamento;

public class PagamentoService {
    private Pagamento pagamento;

    // Injeção via construtor
    public PagamentoService(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void executarPagamento() {
        pagamento.processar();
    }
}
