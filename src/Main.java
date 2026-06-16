public class Main {

    // TODO: Melhorar este método futuramente

    public static void main(String[] args) {

        System.out.println("Iniciando aplicação");

        String nome = "Alice";

        System.out.println("Olá " + nome);

        int soma = 0;
        calcular(soma);
    }

    public static void calcular(int soma) {

        for (int i = 0; i < 10; i++) {
            soma += i;
        }

        System.out.println("Resultado: " + soma);
    }
}