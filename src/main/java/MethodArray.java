public class MethodArray {

    public static void main(String[] args) {
        // 1.
        byte[] ar1 = {3, 127, 5, -15, 8};
        System.out.println(arraySum(ar1));

        // 2.
        double[] ar2 = {8.3, 7.23, 9.12, -23.3, -2.1};
        System.out.println(arraySum(ar2));

        // 3.
        float[] ar3 = {6.2F, 5.7F, 8.4F};
        System.out.println(arraySum(ar3));

        // 4.
        boolean[] ar4 = {true, false, true, false};
        System.out.println(arraySum(ar4));
    }

    // HW 1
    public static int arraySum(byte[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // HW 2
    public static double arraySum(double[] ar) {
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // HW 3
    public static double arraySum(float[] ar) {
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // HW 4 ADVANCE
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
