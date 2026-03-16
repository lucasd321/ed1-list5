import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // Array com duplicados: 20 aparece 3 vezes, 30 aparece 2 vezes
        int[] vetor = {10, 20, 30, 20, 40, 30, 20, 50};
        int n = vetor.length;

        System.out.println("Array original: " + Arrays.toString(vetor));

        for (int i = 0; i < n; i++)
        {
            // Comparamos o elemento atual (i) com todos os sucessores (j)
            for (int j = i + 1; j < n; j++)
            {
                if (vetor[i] == vetor[j])
                {
                    // Encontramos duplicado no índice j!
                    // Realizamos o deslocamento para esquerda para apagar o elemento em j
                    for (int k = j; k < n - 1; k++)
                    {
                        vetor[k] = vetor[k + 1];
                    }

                    // Como puxamos todo mundo para a esquerda,
                    // a última posição agora é "lixo"
                    vetor[n - 1] = 0;
                    n--; // Diminuímos o tamanho lógico do array

                    // Como o novo elemento que veio para a posição j
                    // também pode ser um duplicado, não podemos avançar o j ainda.
                    j--;
                }
            }
        }

        // Criamos um array final apenas com o tamanho dos elementos únicos
        int[] resultado = Arrays.copyOf(vetor, n);
        System.out.println("Array sem duplicados: " + Arrays.toString(resultado));
    }
}
