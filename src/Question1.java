import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arrayOriginal = {10, 20, 30, 40, 50};
        int novoValor = 25;
        int indiceInsercao = 2; // Onde o 25 deve entrar

        // 1. Criamos um novo array com uma posição a mais
        int[] novoArray = new int[arrayOriginal.length + 1];

        // 2. Copiamos os elementos que vêm ANTES do índice de inserção
        for (int i = 0; i < indiceInsercao; i++) {
            novoArray[i] = arrayOriginal[i];
        }

        // 3. Copiamos os elementos RESTANTES deslocando-os
        // Começamos do final do array original e jogamos para i + 1 no novo
        for (int i = arrayOriginal.length - 1; i >= indiceInsercao; i--) {
            novoArray[i + 1] = arrayOriginal[i];
        }

        // 4. Inserimos o novo valor na posição que "sobrou"
        novoArray[indiceInsercao] = novoValor;

        // Exibição do resultado
        System.out.println("Array Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Novo Array:     " + Arrays.toString(novoArray));
    }
}
