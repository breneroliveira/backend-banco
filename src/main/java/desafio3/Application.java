package desafio3;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int complement = num + k;
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }
        }

        return count;
    }
}