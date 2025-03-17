import java.util.Scanner;

public class exercicio6for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int candidato1 = 0, 
        candidato2 = 0,
        candidato3 = 0, 
        candidato4 = 0;
        int nulos = 0, 
        brancos = 0;
        int totalVotos = 10;

        System.out.println("Digite o número do candidato (1 a 4), 5 para nulo e 6 para branco:");

        for (int n = 0; n < totalVotos; n++) {
            System.out.print("Voto " + (n + 1) + ": ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1 -> candidato1++;
                case 2 -> candidato2++;
                case 3 -> candidato3++;
                case 4 -> candidato4++;
                case 5 -> nulos++;
                case 6 -> brancos++;
                default -> System.out.println("Voto inválido! Não será contabilizado.");
            }
        }

        entrada.close();

     
        int votosBrancoseNulos = nulos + brancos;
        double percentual = (votosBrancoseNulos * 100.0) / totalVotos;

   
        System.out.println("Candidato 1: " + candidato1 + " votos.");
        System.out.println("Candidato 2: " + candidato2 + " votos.");
        System.out.println("Candidato 3: " + candidato3 + " votos.");
        System.out.println("Candidato 4: " + candidato4 + " votos.");
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos em Branco: " + brancos);
        System.out.printf("Percentual de votos brancos e nulos: %.2f%%\n", percentual);
    }
}
