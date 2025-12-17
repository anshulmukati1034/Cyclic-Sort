class Q8_SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        // Step 1: Cyclic Sort
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find duplicate & missing
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        int[] result = findErrorNums(arr);
        System.out.println("Duplicate Number: " + result[0] + ", Missing Number: " + result[1]); // Output: [2,3]

    }
}