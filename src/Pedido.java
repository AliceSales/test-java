public class Pedido {

    public double calcularTotal(double valorProduto, int quantidade, boolean clienteVip) {
        double total = valorProduto * quantidade;

        if (clienteVip && quantidade > 5) {
            total = total * 0.9;
        }

        if (total > 500) {
            total = total - 25;
        }

        return total;
    }

    public String definirStatus(boolean pago, boolean enviado) {
        if (pago && enviado) {
            return "Finalizado";
        }

        if (pago && !enviado) {
            return "Aguardando envio";
        }

        return "Pendente";
    }
}