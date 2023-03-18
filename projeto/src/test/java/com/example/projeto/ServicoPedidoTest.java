package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoPedidoTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido efetivado", servico.salvar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido cancelado", servico.excluir());
    }
}
