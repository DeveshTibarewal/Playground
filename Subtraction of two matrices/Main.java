import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < row; j++) {
        for(int k = 0; k < col; k++) {
          if(i == 1) {
            mat1[j][k] = sc.nextInt();
          } else {
            mat2[j][k] = sc.nextInt();
          }
        }
      }
    }
    for(int j = 0; j < row; j++) {
      for(int k = 0; k < col; k++) {
        System.out.print(mat2[j][k] - mat1[j][k] + " ");
      }
      System.out.println();
    }
  }
}