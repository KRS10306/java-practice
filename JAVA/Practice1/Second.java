import java.util.Scanner;

public class Second{
  public static void main(String [] args) {
    System.out.print("Enter a number: ");
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();

      int y = n;
      int x = 0;
      int count = 0;
      int div = 0;
      while(n>0 && n<100000){
        x = n%10;
        n = n/10;
        if (x!=0 && y%x == 0) {
          div++;
          // System.out.println(y);
        }
        count++;
      }
      // System.out.println(y);
      System.out.println("");
      System.out.println(div);
      System.out.println("");
      System.out.println("Number of digits: "+count);
  }
}
