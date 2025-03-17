import java.util.Scanner;

public class exercicio5for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalAprovados = 0, 
        totalExame = 0, 
        totalReprovados = 0;
        double somaMedias = 0;

        for (int n = 1; n <= 6; n++) {
            System.out.print("Digite a primeira nota do aluno " + n + ": ");
            double nota1 = entrada.nextDouble();
            
            System.out.print("Digite a segunda nota do aluno " + n + ": ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.printf("Média do aluno %d: %.2f - ", n, media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                totalReprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                totalExame++;
            } else {
                System.out.println("APROVADO");
                totalAprovados++;
            }
        }

        entrada.close();

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de alunos APROVADOS: " + totalAprovados);
        System.out.println("Total de alunos de EXAME: " + totalExame);
        System.out.println("Total de alunos REPROVADOS: " + totalReprovados);
        System.out.printf("Média da classe: %.2f%n", mediaClasse);
    }
}

