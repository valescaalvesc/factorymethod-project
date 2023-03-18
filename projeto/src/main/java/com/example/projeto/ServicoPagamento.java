package com.example.projeto;

public class ServicoPagamento implements IServico {
    public String salvar() {
        return "Pagamento efetivado";
    }

    public String excluir() {
        return "Pagamento cancelado";
    }
}
