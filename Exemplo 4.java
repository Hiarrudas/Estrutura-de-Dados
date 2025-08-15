import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Digite uma Corda:");
    int n = scanner.nextInt();
    
          System.out.println(fatorial(n));
    
  }
  
  public static long fatorial(int n) {
    if(n==0) return 1;
    return n* fatorial(n-1);

  }
}