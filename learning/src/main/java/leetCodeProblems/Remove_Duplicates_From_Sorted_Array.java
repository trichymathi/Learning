package leetCodeProblems;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array {
	
	 public static int removeDuplicates(int[] nums) {

	        int indexForNextNumber=1;         //1
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]>nums[i-1]){        //nums[i]>nums[i-1]-->nums[1]>nums[1-1=0]-->1>0
	              nums[indexForNextNumber]=nums[i]; //nums[1] = nums[1]
	              indexForNextNumber++;             //indexForNextNumber=2;
	            }
	        }
	        return indexForNextNumber;
	    }

	public static void main(String[] args) {
		int arr[]= {0,1,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr)); //5
		System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
	}

}
