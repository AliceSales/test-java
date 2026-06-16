public class Codigo {

    // TODO: refatorar este método depois

    public void processar(int a, int b, int c, int d, boolean x, boolean y, boolean z) {
        int n = 0;
        int t = 10;

        System.out.println("Iniciando processamento");

        if (a > 0 && b > 0 || c > 0) {
            if (x || y) {
                for (int i = 0; i < t; i++) {
                    if (z && i % 2 == 0) {
                        n += i;
                    } else {
                        n -= i;
                    }
                }
            }
        }

        while (n < 100) {
            n++;
        }

        System.out.println("Resultado: " + n);
    }
}