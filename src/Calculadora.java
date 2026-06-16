public class Calculadora {

    public double calcularPrecoFinal(double valorProduto, double percentualDesconto, double percentualImposto) {
        double valorComDesconto = valorProduto - calcularDesconto(valorProduto, percentualDesconto);
        double valorDoImposto = calcularImposto(valorComDesconto, percentualImposto);

        return valorComDesconto + valorDoImposto;
    }

    public double calcularDesconto(double valorProduto, double percentualDesconto) {
        return valorProduto * percentualDesconto;
    }

    public double calcularImposto(double valorBase, double percentualImposto) {
        return valorBase * percentualImposto;
    }

    public boolean valorEstaDentroDoLimite(double valorCompra, double limitePermitido) {
        return valorCompra <= limitePermitido;
    }
}