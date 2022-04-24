import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
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
