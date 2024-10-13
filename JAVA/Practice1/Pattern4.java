import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    if (n>=1 && n<=25) {
            int count = 1;
            int x = 1;
            for (int i = 0; i < n; i++) {
                x = 1;
                for (int j = 0; j < count; j++) {
                    while (x<=count) {
                        System.out.print(x + " ");
                        x++;
                    }
                }
                count++;
                System.out.println("");
            }
        }
  }
}
