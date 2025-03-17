import java.util.Scanner;

public class exercicio7for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiores50 = 0, 
        contAltura = 0, 
        abaixo40kg = 0;
        double somaAlturas = 0;
        int totalPessoas = 10;

        for (int n = 0; n < totalPessoas; n++) {
            System.out.println("Pessoa " + (n + 1) + ":");

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            double peso = entrada.nextDouble();


            if (idade > 50) {
                maiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAltura++;
            }

            if (peso < 40) {
                abaixo40kg++;
            }
        }

        entrada.close();
 
        double mediaAlturas = (contAltura > 0) ? (somaAlturas / contAltura) : 0;
        double percentualAbaixo40 = (abaixo40kg * 100.0) / totalPessoas;

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + maiores50);
        System.out.printf("Média das alturas das pessoas entre 10 e 20 anos: %.2f metros\n", mediaAlturas);
        System.out.printf("Porcentagem de pessoas com menos de 40kg: %.2f%%\n", percentualAbaixo40);
    }
}
