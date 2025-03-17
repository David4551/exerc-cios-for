import java.util.Scanner;

public class exercicio4for {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        double somaAlturas = 0;
        int quantidade = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = entrada.nextDouble();


            if (idade > 50) {
                somaAlturas += altura;
                quantidade++;
            }
        }

      entrada.close();

        if (quantidade > 0) {
            double mediaAltura = somaAlturas / quantidade;
            System.out.printf("A média das alturas das pessoas com mais de 50 anos é: %.2f metros%n", mediaAltura);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }
    }
}
