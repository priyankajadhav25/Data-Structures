//Check if an Element Exists in an Array → Return true if found, else false.

public class BooleanDemo{
    public static void main(String[] args) {
        int[] nums = {10, 20, 30 ,40};
        int target = 30;
        
        System.out.println(searchElement(nums, target)?"Element found at inedex "+nums:"Element not found");
        //Calls the searchElement method with numbers and 30 as arguments.
        //Uses a ternary operator (? :) for concise output
    }
    public static boolean searchElement(int[] nums, int target){    
        for(int n:nums)
            if(n == target)
                return true;
        return false;
    }
}