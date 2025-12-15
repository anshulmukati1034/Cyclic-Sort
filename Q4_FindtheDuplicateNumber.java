public class Q4_FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
    int i = 0;

    while (i < nums.length) {
        int correctIndex = nums[i] - 1;

        if (nums[i] != nums[correctIndex]) {
            int temp = nums[i];
            nums[i] = nums[correctIndex];
            nums[correctIndex] = temp;
        } else {
            if (i != correctIndex) {
                return nums[i]; // duplicate found
            }
            i++;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println("Duplicate Number: " + findDuplicate(arr)); // Output: 2
    }

}
