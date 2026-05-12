public class MethodsArray1 {

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