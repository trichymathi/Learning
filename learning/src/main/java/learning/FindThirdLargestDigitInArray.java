package learning;

import java.util.Arrays;

public class FindThirdLargestDigitInArray {

	public static void main(String[] args) {
		int arr[]= {80,70,60,50,40,90,100,200,0};
		
//		Arrays.sort(arr);
//		
//		int a =arr.length-3;
//		
//		System.out.println(arr[a]);
		
		int n=arr.length;
		 
		
//bubble Sort Method
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int a =arr.length-3;
		System.out.println(arr[a]);
	}

}
