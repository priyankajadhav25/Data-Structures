//O(n)
//array can be both sorted or not sorted

public class LinearSearch{
    public static void main(String[] args) {
         //int nums[] = {5,7,9,11,13};
         //int target = 13;

         int nums[] = new int[1000];
         int target = 900;

         for (int i = 0; i < nums.length; i++) {
            nums[i] = i; // Ensuring the array is sorted
        }
         
         int result = linearSearch(nums, target);
         if(result != -1)
            System.out.println("Element found at index " + result);
         else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if(nums[i] == target){
                System.out.println("steps of linear search: "+ steps);
                return i;
            }
        }
    System.out.println("steps of linear search: "+ steps);
    return -1;
    }
}