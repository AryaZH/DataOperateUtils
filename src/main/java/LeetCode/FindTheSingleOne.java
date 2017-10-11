package LeetCode;

import java.util.Arrays;

public class FindTheSingleOne {

	public static void main(String[] args) {
		int[] nums={3,3,1,2,2};
		System.out.println(singleNumber(nums));
	}
	
	 public static int singleNumber(int[] nums) {
		 int length = nums.length;
		 int tmp = nums[0];
		 for(int i=0;i<length;i++){
			 tmp=nums[0];
			 i+=1;
			 if(nums[i]==tmp)
			 {
				 continue;
			 }
		 }
			return nums[tmp];
	    }
	 
	 public int singleNumber1(int[] nums) {
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;i+=2){
		 if(nums[i]!=nums[i+1])return nums[i];
		 }
		 return nums[nums.length-1];
		 }

}
