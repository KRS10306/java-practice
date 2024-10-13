package Loop;

public class for_loop {
    public static void main(String[] args) {
        // for(int i = 1; i<=4;i++){
        //     System.out.println("Hello");
        // }

        //Kind of building a Time table
        for(int i = 1; i<=7; i++){
            System.out.println("DAY "+i);
            for(int j = 9; j<=16; j++){
                System.out.println("   " + j + " - " + (j+1)); //if I use (j++) here instead of j+1 it will update the value of j
            }
        }
    }
}
