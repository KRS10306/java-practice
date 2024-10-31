import java.util.*;

public class Pattern8{
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();
    if (n<=20 && n>=1) {
      for (int j = 0 ; j < n ; j++) {
        for (int i = 0; i <= j ; i++) {
          System.out.print("*");
        }
        System.out.println("");
      }
      for (int k = n-1 ; k > 0 ; k--) {
        for (int m = 0;  m < k ; m++) {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}
