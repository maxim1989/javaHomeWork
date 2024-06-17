import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] intArray = new int[]{
                1, 2, 3
        };
        float[] floatArray = {1.57f, 7.654f, 9.986f};
        int[] randomArray = new int[]{2, 0};
    }

    public static void task2() {
        int[] intArray = new int[]{
                1, 2, 3
        };
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i] + "\n");
                break;
            }
            System.out.print(intArray[i] + ", ");
        }

        float[] floatArray = {1.57f, 7.654f, 9.986f};
        for (int j = 0; j < floatArray.length; j++) {
            if (j == floatArray.length - 1) {
                System.out.print(floatArray[j] + "\n");
                break;
            }
            System.out.print(floatArray[j] + ", ");
        }

        int[] randomArray = new int[]{2, 0};
        for (int k = 0; k < randomArray.length; k++) {
            if (k == randomArray.length - 1) {
                System.out.print(randomArray[k] + "\n");
                break;
            }
            System.out.print(randomArray[k] + ", ");
        }
    }

    public static void task3() {
        int[] intArray = new int[]{
                1, 2, 3
        };
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(intArray[i] + "\n");
                break;
            }
            System.out.print(intArray[i] + ", ");
        }

        float[] floatArray = {1.57f, 7.654f, 9.986f};
        for (int j = floatArray.length - 1; j >= 0 ; j--) {
            if (j == 0) {
                System.out.print(floatArray[j] + "\n");
                break;
            }
            System.out.print(floatArray[j] + ", ");
        }

        int[] randomArray = new int[]{2, 0};
        for (int k = randomArray.length - 1; k >= 0 ; k--) {
            if (k == 0) {
                System.out.print(randomArray[k] + "\n");
                break;
            }
            System.out.print(randomArray[k] + ", ");
        }
    }

    public static void task4() {
        int[] intArray = new int[]{
                1, 2, 3
        };
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}