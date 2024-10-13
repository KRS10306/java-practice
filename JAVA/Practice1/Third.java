import java.util.Scanner;

public class Third {
public static void main(String[] args){
  System.out.print("Enter a number: ");
  Scanner a = new Scanner(System.in);
  int x = a.nextInt();
    int y = x;
    int n = 0;
    int count = 0;
    int z = 0;
      while(x!=0){
        n = x%10;
        x = x/10;
        System.out.println(n);
        z = (z*10) + n;
        count++;
      }
      if (z> Integer.MAX_VALUE || z<Integer.MIN_VALUE ) {
            z = 0;
        }
      System.out.println("");
      System.out.println((int)z);
      System.out.println("");
      System.out.println(count);
      System.out.println("");
      System.out.println(n);
  }
}
