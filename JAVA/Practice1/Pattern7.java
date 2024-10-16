import java.util.*;

public class Pattern7{
public static void main(String[] args) {
  Scanner num = new Scanner(System.in);
  int n = num.nextInt();
  int a = n-1;
        int b = n;
        int c = 0;
        int d = n;
        int e = 0;
        if (n>=1 && n<=20) {
            for (int i = 0; i < n; i++) {
                for (int k = a; k> 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                if (i>0) {
                  for (int z = 0; z < c ; z++) {
                    System.out.print("*");
                  }
                }
                System.out.println("");
                a--;
                c++;
            }
            for (int l = n; l > 0; l--) {
              for (int k = 0; k < e; k++) {
                  System.out.print(" ");
              }
              for (int j = 0; j < l; j++) {
                  System.out.print("*");
              }
              d--;
              if (l>1) {
                for (int z = 0; z < d ; z++) {
                  System.out.print("*");
                }
              }
              e++;
              System.out.println("");
            }
        }
}
}
