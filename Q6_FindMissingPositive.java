public class Q6_FindMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        // Step 1: Place numbers at correct index
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] > 0
                    && nums[i] <= nums.length
                    && nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find first missing
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        int missingPositive = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missingPositive); // Output: 2
    }
}