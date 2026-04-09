import java.util.Scanner;

public class Solution {
    
    // Generic method to find max
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer array
        int n1 = scanner.nextInt();
        Integer[] intArray = new Integer[n1];
        for (int i = 0; i < n1; i++) {
            intArray[i] = scanner.nextInt();
        }

        // String array
        int n2 = scanner.nextInt();
        String[] strArray = new String[n2];
        for (int i = 0; i < n2; i++) {
            strArray[i] = scanner.next();
        }

        // Output
        System.out.println("Max Integer: " + findMax(intArray));
        System.out.print("Max String: " + findMax(strArray));

        scanner.close();
    }
}