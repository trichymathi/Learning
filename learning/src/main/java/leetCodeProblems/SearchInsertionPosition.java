package leetCodeProblems;

public class SearchInsertionPosition {
	
	 public static int searchInsert(int[] nums, int target) {

		 
		 //Why we returning first index if we take
		 //eg:1  arr={3} and target =2
		 //firstIndex=0,lastIndex=0,mid =0
		 //the conditon pass in 
//		 else if(target<nums[mid]){   //nums[mid]>target
//         lastIndex=mid-1;  -->lastIndex=0-1
//         }
		 //so firstIndex =0;lastIndex=0-1
		 // firstIndex -->return 0
		 
		//eg:2  arr={3} and target =4
		 //firstIndex=0,lastIndex=0,mid =0
		 //the conditon pass in 
//		 else if(target>nums[mid]){  //nums[mid]<target
//         firstIndex=mid+1; -->firstIndex=0+1
//        }
		 //so firstIndex =0+1 --> return 1
		 
		 //Binary Search
	        int firstIndex=0;
	        int lastIndex=nums.length-1;
	         while(firstIndex<=lastIndex) //lastIndex>=firstIndex
	         {
	            int mid = (firstIndex+lastIndex)/2;
	            if(nums[mid]==target){
	                return mid;
	            }
	           else if(target>nums[mid]){  //nums[mid]<target
	                firstIndex=mid+1;
	            }
	            else if(target<nums[mid]){   //nums[mid]>target
	                lastIndex=mid-1;
	            }
	         }
	         return firstIndex; 
	    }

	public static void main(String[] args) {
		int arr[]={1,3,5,6};
        System.out.println(searchInsert(arr,7));
	}

}
