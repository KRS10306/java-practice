import java.util.*;

public class Pattern10{
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();
    if (n>=1 && n<=20) {
      for (int i = 1 ; i <= n ; i++) {
        for (int j = 1; j <=i ; j++) {
          System.out.print(j + " ");
        }
        for (int l = 0 ; l < 4; l++){
          for (int z = n-i ; z > 0 ; z--) {
            System.out.print(" ");
          }
        }
        for (int j = i; j >=1 ; j--) {
          System.out.print(j + " ");
        }
        System.out.println("");
      }
    }
  }
}
