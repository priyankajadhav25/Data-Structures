public class CountOccurrences{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,6,7,3};
        int target = 3;
        countOccurrences(nums, target);
    }

    public static void countOccurrences(int[] nums, int target){
        int count = 0;
        for(int n:nums){
            if(n==target){
                count++;
            }
        }
        System.out.println("count occurences of target element "+target+" is "+count);
    }
}