package com.example.projeto;

public class ServicoPedido implements IServico {
    public String salvar() {
        return "Pedido efetivado";
    }

    public String excluir() {
        return "Pedido cancelado";
    }
}
