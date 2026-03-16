import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arrayA = {10, 30, 60, 70};
        int[] arrayB = {20, 40, 50, 80, 90, 100};

        // O array de destino deve ter o tamanho da soma dos dois
        int[] arrayC = new int[arrayA.length + arrayB.length];

        int i = 0; // Ponteiro para o arrayA
        int j = 0; // Ponteiro para o arrayB
        int k = 0; // Ponteiro para o arrayC (destino)

        // 1. Percorrer ambos enquanto houver elementos nos dois
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] <= arrayB[j]) {
                arrayC[k] = arrayA[i];
                i++; // Avançamos no arrayA
            } else {
                arrayC[k] = arrayB[j];
                j++; // Avançamos no arrayB
            }
            k++; // Sempre avançamos no destino
        }

        // 2. Se sobrar algo no arrayA (arrayB acabou primeiro)
        while (i < arrayA.length) {
            arrayC[k] = arrayA[i];
            i++;
            k++;
        }

        // 3. Se sobrar algo no arrayB (arrayA acabou primeiro)
        while (j < arrayB.length) {
            arrayC[k] = arrayB[j];
            j++;
            k++;
        }

        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
        System.out.println("Fusão Ordenada: " + Arrays.toString(arrayC));
    }
}
