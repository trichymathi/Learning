package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class patternProgram {
	
	static void increasingPyramid() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println("1 2 3 4 5 6");
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();	
	}
	}
	
	static void HourglassPatternExample() {
        int i, j, k, n = 8;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }

            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

	

	public static void main(String[] args) {
		increasingPyramid();
		HourglassPatternExample();
//		System.out.println("1 2 3 4 5 6");
		//decreasingPyramid();
	}

}
