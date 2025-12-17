public class Q9_FindFirstIncorrectPosition {
    public static int findFirstIncorrectPosition(int[] nums) {
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

    // Step 2: Find first incorrect position
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != j + 1) {
            return j; // index
        }
    }

    return -1; // array is correct
}

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 6, 5, 8, 9, 10, 12};
        int index = findFirstIncorrectPosition(arr);
        System.out.println("First Incorrect Position Index: " + index); // Output: 4
    }   
}
