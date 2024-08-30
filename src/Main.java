import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println();
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task2(nums2);
        System.out.println();
        List<Integer> nums3 = new ArrayList<>(List.of(8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task2(nums3);
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("stroka", "stroka", "stroka1", "stroka2", "stroka"));
        task3(strings);
        List<String> strings2 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task4(strings2);
    }

    public static void task1(List<Integer> arr) {
        for (Integer value : arr) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }

    public static void task2(List<Integer> arr) {
        Collections.sort(arr);
        Map<Integer, Boolean> store = new HashMap<>();

        for (Integer value : arr) {
            if (store.get(value) == null && value % 2 == 0) {
                store.put(value, true);
                System.out.print(value + " ");
            }
        }
    }

    public static void task3(List<String> arr) {
        Set<String> store = new HashSet<>(arr);
        System.out.println(store);
    }

    public static void task4(List<String> arr) {
        Map<String, Integer> store = new HashMap<>();

        for (String value : arr) {
            store.merge(value, 1, Integer::sum);
        }

        System.out.println(store);
    }
}