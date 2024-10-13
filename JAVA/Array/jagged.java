import java.lang.Math;

public class jagged {
  public static void main(String[] args) {
    int arr[][] = new int[4][]; //jagged

    arr[0] = new int[5]; //Number of columns in 1st row
    arr[1] = new int[4];
    arr[2] = new int[3];
    arr[3] = new int[2];


    // System.out.println(arr.length);
    for (int i = 0 ; i<arr.length ; i++ ) {
      for (int j = 0 ; j<arr[i].length ; j++ ) {
        arr[i][j] = (int)(Math.random()*100);
      }
    }

    for (int n[] : arr ) {
      for (int m : n ) {
        System.out.print(m + "  ");
      }
      System.out.println("");
    }
  }
}
