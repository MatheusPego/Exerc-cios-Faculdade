// Scanner para entrada de Dados:
import java.util.Scanner;
// Importo também um array:
import java.util.Arrays;

public class AttVetor {

    // Função para ler números do usuario e guardar num vetor
    public static int[] lerVetor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer digitar? ");
        int n = scanner.nextInt();  // Quantidade de números
        int[] vetor = new int[n];   // Cria um vetor com n posições

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();  // Lê cada número e guarda no vetor
        }
        return vetor;  // Retorna o vetor preenchido
    }

    // Função que ordena o vetor em ordem crescente
    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);  // Usa função pronta do Java para ordenar
    }

    // Função que retorna o menor valor do vetor ordenado
    public static int menorValor(int[] vetor) {
        return vetor[0];  // Primeiro elemento é o menor (vetor já esta ordenado)
    }

    // Função que calcula o valor do meio (mediana) do vetor ordenado
    public static double valorMedio(int[] vetor) {
        int n = vetor.length;
        if (n % 2 != 0) {  // Se o número de elementos for ímpar
            return vetor[n / 2];  // Retorna o valor central
        } else {  // Se for par
            int meio1 = vetor[(n / 2) - 1];  // Valor do meio da esquerda
            int meio2 = vetor[n / 2];        // Valor do meio da direita
            return (meio1 + meio2) / 2.0;   // Retorna a média dos dois
        }
    }

    // Função que retorna o maior valor do vetor ordenado
    public static int maiorValor(int[] vetor) {
        return vetor[vetor.length - 1];  // Último elemento é o maior
    }

    // Função que retorna o valor no índice k do vetor
    public static void selecionarPorIndice(int[] vetor, int k) {
        if (k < 0 || k >= vetor.length) {  // Verifica se índice é válido
            System.out.println("Erro: índice inválido!");
        } else {
            System.out.println("Valor na posição " + k + ": " + vetor[k]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: ler o vetor
        int[] vetor = lerVetor();

        // Passo 2: ordenar o vetor
        ordenarVetor(vetor);

        // Passo 3: mostrar vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Passo 4: mostrar o menor valor
        System.out.println("Menor valor: " + menorValor(vetor));

        // Passo 5: mostrar o valor médio (mediana)
        System.out.println("Valor médio (mediana): " + valorMedio(vetor));

        // Passo 6: mostrar o maior valor
        System.out.println("Maior valor: " + maiorValor(vetor));

        // Passo 7: pedir índice e mostrar valor na posição
        System.out.print("Digite um índice para ver o valor nessa posição: ");
        int k = scanner.nextInt();
        selecionarPorIndice(vetor, k);

        scanner.close();
    }
}
