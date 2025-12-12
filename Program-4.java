package com.vini;

public class CountMultiples 
{
	 public static void main(String[] args) {

	        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
	        int[] count = new int[10];
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int d = 1; d <= 9; d++) 
	            {
	                if (arr[i] % d == 0) 
	                {
	                    count[d]++;
	                }
	            }
	        }
	        System.out.print("{");
	        for (int d = 1; d <= 9; d++) 
	        {
	            System.out.print(d + ": " + count[d]);
	            if (d < 9) 
	            {
	                System.out.print(", ");
	            }
	        }
	        System.out.print("}");
}
}
