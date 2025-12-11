import java.util.Scanner;

public class vineeth 
{
	  public static void main(String[] args)
	  {
	  Scanner scan= new Scanner(System.in);
	  System.out.print("Enter a: ");
      int a = scan.nextInt();
      int num = 1;

      for (int i = 1; i <= a; i++) {
          System.out.print(num);
          if (i < a) 
          {
              System.out.print(", ");
          }
          num += 2;
	}
}
}
