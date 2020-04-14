package io.javasoup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OddManOut {

	public OddManOut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cases:");   // number of cases should be 1 to 50
		int n = sc.nextInt();
	
		if(n > 0 && n<=50) {
			
		   for(int k= 0; k< n; k++) {
				
			
			System.out.println("Enter the number of guests:");
			int g = sc.nextInt();
		
				System.out.println("Enter the invitation codes for each guest:");
				List<Integer> list = new ArrayList();
				List<Integer> outputList = new ArrayList();
				while(sc.hasNextInt()) {
					
					list.add(sc.nextInt());
					if(list.size() >= g) 
						break;
				}
				
				list.forEach(temp->
				{
					
					int occurrences = Collections.frequency(list, temp);
					if(occurrences != 2) {
						outputList.add(temp);
					}
					
				}
				);
				
				
				
				System.out.println("The Odd Man out is:::");
			     outputList.forEach(num -> System.out.println(num));
			
			
			}
		}
		else {
			if(n == 0)
			System.out.println("Error: The number of cases should be atleast one");
			if(n > 50)
			System.out.println("Error: The number of cases cannot exceed 50");
			
		}

	}

}
