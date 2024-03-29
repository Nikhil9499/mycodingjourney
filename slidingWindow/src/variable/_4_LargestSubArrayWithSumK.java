package variable;

import java.util.HashMap;

public class _4_LargestSubArrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 6, 9};
        int n = arr.length;
        int k = 15;
        System.out.println("Length = " + lenOfLongSubArray(arr, n, k));
    }

    static int lenOfLongSubArray(int[] arr, int n, int k) {
        // HashMap to store (sum, index) tuples
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array arr = {10, 5, 2, 7, 6, 9};
        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {

                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
            System.out.println(map + " -> " + maxLen);
        }

        return maxLen;
    }



}
