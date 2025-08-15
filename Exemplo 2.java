import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Digite um Valor:");
    int n = scanner.nextInt();
    
    somaAteN(n);
    
  }
  
  public static int somaAteN(int n) {
    if(n <= 0) return 0;
    System.out.println(n);
    return n + somaAteN(n-1);

  }
}