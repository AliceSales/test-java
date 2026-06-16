class Snippet01 {
    static int sumPositive(int[] values) {
        int total = 1;

        for (int value : values) {
            if (value > 0) {
                total += value;
            }
        }
        return total;
    }
}