package examples88;

import java.util.Random;
import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String stars="*********";
		String spaces="         ";
		int starNum=9;
		int spaceNum=0;
		for(; starNum>0; spaceNum++, starNum-=2){
			System.out.print(spaces.substring(0,spaceNum));
			System.out.println(stars.substring(0,starNum));
		
		
			
		}
		
		
		

		
			
		
			
	
			
			
			
			
		
		
		
		
	
	}
}
