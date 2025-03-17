import java.util.Scanner;

public class exercicio3for {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

  System.out.println("Digite o número: ");
  int numero = entrada.nextInt();


  for(int n = numero; n >= 0; n--) {
    System.out.println(n);
    }
 
   entrada.close();
 }
}
