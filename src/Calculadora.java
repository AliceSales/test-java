public class Calculadora {

    public int somar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public int subtrair(int primeiroNumero, int segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }

        return (double) dividendo / divisor;
    }
}