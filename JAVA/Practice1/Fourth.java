import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        char alph ='A';
        if(n < 27 && n > 0){
            for(int i=1; i<=n;i++){
                System.out.print(alph);
                System.out.println();
                alph++;
            }
    
            }
        }   
    }
