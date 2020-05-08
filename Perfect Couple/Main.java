import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int index = 0; index <= arr_size - 1; index++) {
      arr[index] = in.nextInt();
    }
    int value = in.nextInt();
    perfect_couple(arr_size, arr, value);
  }
  public static void perfect_couple(int arr_size, int arr[], int value) {
    for(int i = 0; i <= arr_size - 1; i++) {
      for(int j = i + 1; j <= arr_size - 1; j++) {
        int sum = arr[i] + arr[j];
        if(sum == value) {
          System.out.println(arr[i] + "," + " " + arr[j]);
        }
      }
    }
  }
}