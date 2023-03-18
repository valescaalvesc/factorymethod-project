package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEntregaTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega efetivada", servico.salvar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega cancelada", servico.excluir());
    }
}
