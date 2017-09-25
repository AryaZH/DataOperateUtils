package LeetCode;

public class L_TwoSum {

	public static void main(String[] args) {
		int[] nums ={2,4, 7, 11, 15};
		int target = 15;
		
		twoSum1(nums,target);
		System.out.println("["+twoSum(nums, target)[0]+","+twoSum(nums, target)[1]+"]");
//		for (int i : twoSum(nums, target)) {
//			System.out.println(i);
//		}
	}
	
	    public static void twoSum1(int[] nums, int target) {
	        int length = nums.length;
	        for(int i=0;i<length-1;i++){
	        	for(int j=i+1;j<length;j++){
	        		if(nums[i]+nums[j]==target)
	        			System.out.println("["+i+","+j+"]"); 
	        	}
	        }
	    }
	    
	    public static int[] twoSum(int[] nums, int target) {
	        int length = nums.length;
	        int result[] = new int[2];
	        for(int i=0;i<length-1;i++){
	        	for(int j=i+1;j<length;j++){
	        		if(nums[i]+nums[j]==target)
	        			{
	        			result[0]=i;	        	
	        		    result[1]=j;
		        		break;
	        			}
	        	}
	        }
	        return result;
	    }
}
