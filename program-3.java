package com.vini;

import java.util.Scanner;

public class vineeth 
{
	  public static void main(String[] args)
	  {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        int a = sc.nextInt();

	        if (a % 2 == 0) 
	        {
	            a = a + 1;
	        }
	        for (int i = 1; i <= a; i += 2) 
	        {
	            System.out.print(i);
	            if (i + 2 <= a) 
	            {
	                System.out.print(", ");
	            }

	}
}
}
