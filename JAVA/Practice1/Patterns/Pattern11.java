import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int z = 0;
        if (n>=1 && n<=20) {
          for (int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((j+z) + " ");
            }
            z = z + i;
            // System.out.println("");
            // System.out.print("z = " + z);
            System.out.println("");
          }
        }
      }
}
