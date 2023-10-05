package q10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestAndSecondSmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter The Numbers(ENTER NON-INTEGER WHEN DONE)::");
	   
	   while (sc.hasNextInt()) {
		int num=sc.nextInt();
		list.add(num);
		
	}
	   Collections.sort(list);
	   //System.out.println(list);
	   System.out.println("Second Largest Element is::"+list.get(list.size()-2));
	   System.out.println("Second Smallest Element is::"+list.get(1));
			
		}

	}


