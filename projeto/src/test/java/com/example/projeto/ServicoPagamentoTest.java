package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoPagamentoTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento efetivado", servico.salvar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento cancelado", servico.excluir());
    }
}
