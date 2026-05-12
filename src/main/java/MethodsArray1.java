public class MethodsArray1 {

    public static void main(String[] args) {
        // 1. Проверяем byte
        byte[] ar1 = {3, 127, 5, -15, 8};
        System.out.println("Sum byte: " + arraySum(ar1));

        // 2. Проверяем double
        double[] ar2 = {8.3, 7.23, 9.12, -23.3, -2.1};
        System.out.println("Sum double: " + arraySum(ar2));

        // 3. Проверяем float
        float[] ar3 = {6.2F, 5.7F, 8.4F};
        System.out.println("Sum float: " + arraySum(ar3));

        // 4. Проверяем boolean (ADVANCE)
        boolean[] ar4 = {true, false, true, false};
        System.out.println("Count true: " + arraySum(ar4));
    }

    // Твои методы:
    public static int arraySum(byte[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static double arraySum(double[] ar) {
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static double arraySum(float[] ar) {
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static byte arraySum(boolean[] ar) {
        byte sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]) {
                sum++;
            }
        }
        return sum;
    }
}