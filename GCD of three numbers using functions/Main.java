import java.util.Scanner;
public class Main {
  public static int find_GCD(int n1, int n2) {
    int gcd = 0;
    for(int i = 1; i <= n1 && i <= n2; ++i) {
      if(n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
  
  public static void main (String[] args) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    System.out.println(find_GCD(n1, find_GCD(n2, n3)));
  }
}