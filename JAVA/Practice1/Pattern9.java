import java.util.*;

public class Pattern9{
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();
    int a = 0;
    int b = 2;
    int c = 1;
    int d = 0;
    if (n>=1 && n<=20) {
      for (int r = 1; r <= n ; r++) {
        if (r%2 == 0) {
          a = 0;
        }
        else {
          a = 1;
        }
        if ((r-1)%2 == 0 && r >= 2) {
          b = 0;
        }
        else if ((r-1)%2 !=0 && r >= 2) {
          b = 1;
        }
        if (r%2 == 0) {
          for (int i = 0; i < (r-c) ; i++) {
            System.out.print(a);
            if (b != 2 && i < (r - d)) {
                System.out.print(b);
            }
          }
          c++;
        }
        else {
          for (int i = 0; i < (r-d) ; i++) {
            System.out.print(a);
            if (b != 2 && i < ((r-d)-1)) {
                System.out.print(b);
            }
          }
          d++;
        }
        System.out.println("");
      }
    }
  }
}
