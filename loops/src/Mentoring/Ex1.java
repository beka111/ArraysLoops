package Mentoring;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result;
		for(int i=num; i<num+1;i++) {
			for(int j=10; j>=0; j--) {
				result=i*j;
				System.out.println(i+"* "+ j+ " = "+result);
			}
			System.out.println();
			
		
			
		}
	}


}
