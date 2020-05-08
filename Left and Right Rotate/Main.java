import java.util.Scanner;
class Main {
  public static void leftRotateEvenElem(int arr_size, int arr[], int no_of_rotation) {
    int firstEvenElemIndex = 1;
    int lastEvenElemIndex;
    if(arr_size % 2 == 0) {
      lastEvenElemIndex = arr_size - 1;
    } else {
      lastEvenElemIndex = arr_size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++) {
      int temp = arr[firstEvenElemIndex];
      for(int index = 3; index < arr_size; index = index + 2) {
        arr[index - 2] = arr[index];
      }
      arr[lastEvenElemIndex] = temp;
    }
  }
  public static void rightRotateOddElem(int arr_size, int arr[], int no_of_rotation) {
    int firstOddElemIndex = 0;
    int lastOddElemIndex;
    if(arr_size % 2 == 1) {
      lastOddElemIndex = arr_size - 1;
    } else {
      lastOddElemIndex = arr_size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++) {
      int temp = arr[lastOddElemIndex];
      for(int index = (lastOddElemIndex - 2); index >= 0; index = index - 2) {
        arr[index + 2] = arr[index];
      }
      arr[firstOddElemIndex] = temp;
    }
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int index = 0; index <= (arr_size - 1); index++) {
      arr[index] = in.nextInt();
    }
    int no_of_rotation = in.nextInt();
    leftRotateEvenElem(arr_size, arr, no_of_rotation);
    rightRotateOddElem(arr_size, arr, no_of_rotation);
    for(int index = 0; index <= (arr_size - 1); index++) {
      System.out.print(arr[index]+" ");
    }
  }
}