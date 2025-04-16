package patternProblems;

public class HoursGlass_With_Extra_Windows {

	
	/*
7  7  7  7  7  7  7  7  7  7  7  7  7    
   6  6  6  6  6  6  6  6  6  6  6    
      5  5  5  5  5  5  5  5  5    
         4  4  4  4  4  4  4    
            3  3  3  3  3    
               2  2  2    
                  1    
               2  2  2    
            3  3  3  3  3    
         4  4  4  4  4  4  4    
      5  5  5  5  5  5  5  5  5    
   6  6  6  6  6  6  6  6  6  6  6    
7  7  7  7  7  7  7  7  7  7  7  7  7
	 */
	public static void main(String[] args) {
		 int n=5;
	        //upperPart
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i-1;j++){
	                System.out.print("   ");
	            }
	            for(int j=1;j<=(n*2)+1-(i*2);j++){
	                if(i==1){
	                 System.out.print(n+"  ");   
	                }else{
	                 System.out.print(n-i+1+"  "); 
	                }
	                
	            }
	            System.out.println("  ");
	        }
	        //lower Part
	        for(int i=1;i<n;i++){
	            for(int j=1;j<=n-i-1;j++){
	               System.out.print("   "); 
	            }
	            for(int j=1;j<=(i*2)+1;j++){
	             if(i==n){
	                 System.out.print(n+"  ");   
	                }else{
	                 System.out.print(i+1+"  "); 
	                }
	            }
	            System.out.println("  ");
	        }
	        
	    }

}
