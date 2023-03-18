package com.example.projeto;

public class ServicoEntrega implements IServico{
    public String salvar() {
        return "Entrega efetivada";
    }

    public String excluir() {
        return "Entrega cancelada";
    }
}
