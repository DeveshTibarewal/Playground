import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arrSize = sc.nextInt();
    int arr[] = new int[arrSize];
    for(int i = 0; i < arrSize; i++) {
      arr[i] = sc.nextInt();
    }
    int searchEle1 = sc.nextInt();
    int searchEle2 = sc.nextInt();
    int indexEle1 = -1, indexEle2 = -1;
    for(int i = 0; i < arrSize; i++) {
      if(arr[i] == searchEle1) {
        indexEle1 = i;
      } else if(arr[i] == searchEle2) {
        indexEle2 = i;
      } 
    }
    System.out.println(indexEle1);
    System.out.println(indexEle2);
  }
}