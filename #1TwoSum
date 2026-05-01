import java.util.ArrayList;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //get the element at the indexes in nums
        // check if element i + j = target
        //if yea return element index
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            for(int j = i +1; j< nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    int num1 = i;
                    int num2= j; 
                    result.add(num1);
                    result.add(num2);
                }   
            }
        }
        return new int[]{ result.get(0), result.get(1) };
    }
}
