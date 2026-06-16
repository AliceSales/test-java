public class Complexo {

    public double processarPedido(
            double valorProduto,
            int quantidade,
            boolean clienteVip,
            boolean entregaExpressa,
            boolean possuiCupom,
            boolean pagamentoAprovado
    ) {

        if (clienteVip && entregaExpressa) {
            if (possuiCupom || pagamentoAprovado) {
                for (int indice = 0; indice < quantidade; indice++) {
                    while (indice < 100) {
                        indice++;
                    }
                }
            }
        }

        return valorProduto;
    }
}