import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arrSize = sc.nextInt();
    int arr[] = new int[arrSize];
    for(int i = 0; i < arrSize; i++) {
      arr[i] = sc.nextInt();
    }
    int largest = 0;
    for(int i = 0; i < arrSize; i++) {
      if(arr[i] > largest) {
        largest = arr[i];
      }
    }
    System.out.println(largest);
  }
}