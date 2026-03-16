import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 25, 30, 40};
        int valorParaRemover = 25;
        int totalElementos = 5; // Quantos itens válidos temos no momento
        System.out.println("Valor que iremos remover: 25");

        System.out.println("Antes da remoção: " + Arrays.toString(vetor));

        // 1. Localizar o índice do elemento
        int indiceEncontrado = -1;
        for (int i = 0; i < totalElementos; i++) {
            if (vetor[i] == valorParaRemover) {
                indiceEncontrado = i;
                break;
            }
        }

        // 2. Se o elemento existir, realizamos o deslocamento
        if (indiceEncontrado != -1) {
            // Começamos do índice encontrado e trazemos o próximo para a posição atual
            for (int i = indiceEncontrado; i < totalElementos - 1; i++) {
                vetor[i] = vetor[i + 1];
            }

            // 3. Limpamos a última posição que ficou duplicada
            vetor[totalElementos - 1] = 0;
            totalElementos--;
            // Agora temos um elemento válido a menos

            System.out.println("Após a remoção:  " + Arrays.toString(vetor));
        } else {
            System.out.println("Valor não encontrado no array.");
        }
    }
}
