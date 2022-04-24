import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    
    int i = in.nextInt();

    for (int v=i; v>0; v--) 
    {
      for (int k=0; k<v; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
