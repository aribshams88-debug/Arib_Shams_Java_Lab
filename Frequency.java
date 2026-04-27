import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        System.out.println("\nElement Frequency:");

        // Calculate frequency
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        sc.close();
    }
}