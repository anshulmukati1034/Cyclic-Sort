public class Q7_KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int missingTillNow = arr[i] - (i + 1);

            if (missingTillNow >= k) {
                return i + k;
            }
        }

       // agar array ke baad missing hai
        return arr.length + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int kthMissing = findKthPositive(arr, k);
        System.out.println("Kth Missing Positive Number: " + kthMissing); // Output: 9
    }
}
