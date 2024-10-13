import java.lang.Math;

public class ThreeDarray {
  public static void main(String[] args) {
    int arr[][][] = new int[3][4][5];
    for (int i = 0 ; i<3 ; i++ ) {
      for (int j = 0 ; j<4 ; j++ ) {
        for (int k = 0 ; k<5 ; k++ ) {
          arr[i][j][k] = (int)(Math.random()*100);
        }
      }
    }

    for (int n[][] : arr ) {
      for (int m[] : n ) {
        for (int o : m ) {
          System.out.print(o + "  ");
        }
        System.out.println("");
      }
      System.out.println("");
    }
    //Nicely explained in my hand made notes
  }
}
