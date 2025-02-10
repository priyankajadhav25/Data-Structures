//eg: find the last occurrence of an element using Linear Search:

// Approach:
// Traverse the array from left to right.
// Keep updating the last index whenever the target is found.
// If the element is found, return the last index; otherwise, return -1

public class LastOccurrenceLinearSearch{
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 3, 8, 3, 9, 3, 10};
        int target = 11;
        int result = lastOccurrence(nums, target);

        if(result != -1)
            System.out.println("Element found at last index" + result);
        else
            System.out.println("Element not found");
    }

    public static int lastOccurrence(int[] nums, int target){
        int lastIndex = 0;  //track the last found occurrence.

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target)
                lastIndex = i;   //keep updating
        }
        return lastIndex;   //Return last occurrence index or -1 if not found
    }
}
