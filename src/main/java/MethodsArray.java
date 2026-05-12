public class MethodsArray {
    public class ArraySumHW {

        // 1. Сумма элементов byte[]
        public static int arraySum(byte[] ar) {
            int sum = 0;

            for (int i = 0; i < ar.length; i++) {
                sum += ar[i];
            }

            return sum;
        }

        // 2. Сумма элементов double[]
        public static double arraySum(double[] ar) {
            double sum = 0;

            for (int i = 0; i < ar.length; i++) {
                sum += ar[i];
            }

            return sum;
        }

        // 3. Сумма элементов float[]
        public static double arraySum(float[] ar) {
            double sum = 0;

            for (int i = 0; i < ar.length; i++) {
                sum += ar[i];
            }

            return sum;
        }

        // 4. ADVANCE: сумма true в boolean[]
        public static byte arraySum(boolean[] ar) {
            byte sum = 0;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i]) {
                    sum++;
                }
            }

            return sum;
        }

        // Просто для проверки (если вдруг нужно)
        public static void main(String[] args) {
            byte[] b = {3, 127, 5, -15, 8};
            double[] d = {8.3, 7.23, 9.12, -23.3, -2.1};
            float[] f = {6.2F, 5.7F, 8.4F};
            boolean[] bool = {true, false, true, false};

            System.out.println(arraySum(b));    // 128
            System.out.println(arraySum(d));    // -0.75
            System.out.println(arraySum(f));    // 20.3
            System.out.println(arraySum(bool)); // 2
        }
    }
}