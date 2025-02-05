package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class patternProgram {
	
	static void increasingPyramid() {
//		for(int row=1;row<=5;row++) {
//			for(int col=1;col<=row;col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
			
			int num[]= {1,2,5,6,4};
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<num.length;i++) {
				list.add(num[i]);
			}
			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list);
			
			
			
//		}
	}

	public static void main(String[] args) {
		increasingPyramid();
		//System.out.println("* * * * * *");
		//decreasingPyramid();
	}

}
