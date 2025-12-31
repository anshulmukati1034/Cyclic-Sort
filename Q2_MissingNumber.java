public class Q2_MissingNumber {
    public static int missingNumber(int[] nums) {
    int i = 0;

    // Cyclic Sort
    while (i < nums.length) {
        int correctIndex = nums[i];

        if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
            int temp = nums[i];
            nums[i] = nums[correctIndex];
            nums[correctIndex] = temp;
        } else {
            i++;
        }
    }

    
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != j) {
            return j;
        }
    }

    return nums.length;
}
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println("Missing Number: " + missingNumber(arr)); // Output: 2
    }
}
