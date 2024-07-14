package Array;

import java.util.Arrays;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int X = 13;

        // Sort the array (if necessary)
        Arrays.sort(arr);

        // Use a two-pointer technique to find the triplet
        boolean foundTriplet = false;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == X) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    foundTriplet = true;
                    break;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }

            if (foundTriplet) {
                break;
            }
        }

        if (!foundTriplet) {
            System.out.println("Triplet not found");
        }
    }
}

