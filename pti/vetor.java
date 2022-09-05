package pti;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Quantos números você quer colocar no vetor? ");
            int tamanho = entrada.nextInt();

            int vetor[] = new int[tamanho];

            for(int i = 0; i < vetor.length; i++) {
                System.out.printf("Informe o número que vai na %d° posição: ", i + 1);
                int num = entrada.nextInt();
                vetor[i] = num;
                
            }
   
            int max = 0;
            int min = vetor[0];
            Boolean crescente = true;
            VerificaOrdem1(max, min, vetor);
            System.out.println("b) O vetor esta em ordem crescente? " + VerificaOrdem2(vetor, crescente));
        }
    
    }
    public static void VerificaOrdem1(int max, int min, int vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > max) {
                max = vetor[i];
            }if(vetor[i] < min) {
                min = vetor[i];
            }
        }
        int diferenca = max - min;
        System.out.println("a) A maior diferença entre dois elementos distintos do vetor é: "+ diferenca);
    }
    public static boolean VerificaOrdem2(int vetor[], Boolean crescente) {
        for(int i = 0; i < (vetor.length - 1); i++) {
            if(vetor[i] < vetor[i+1]) {
                crescente = true;
            }else {
                crescente = false;
                break;
            }
        } 
        return crescente;
    }
}