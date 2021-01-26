package leet_Sort;

public class SortArray_912 {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] nums = {5,2,3,1};
		
		sol.sortArray(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
	

}


class Solution {
    public static int[] sortArray(int[] nums) {
        
        int temp = 0;
        int index = 0;
        int min;
        for(int i = 0; i < nums.length; i++){
            min = 50000;
            for(int j = i; j < nums.length; j++){
                if(min > nums[j]){
                    min = nums[j];
                    index = j;
                                    }
            }
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
           
        }
        return nums;
    }
}
