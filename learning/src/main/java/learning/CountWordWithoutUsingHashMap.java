package learning;

import java.util.Scanner;

public class CountWordWithoutUsingHashMap {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a String");
		        String name=sc.nextLine();
		        String[] ch=name.split(" ");
		        for(int i=0;i<ch.length;i++){
		            int count=1;
		            if(ch[i]=="0"){
		                continue;
		            }
		            for(int j=i+1;j<ch.length;j++){
		               if(ch[i].equals(ch[j])){
		                   count=count+1;
		                   ch[j]="0";
		               } 
		            }
		            System.out.println(ch[i]+" : "+count);
		        }
	}
}
