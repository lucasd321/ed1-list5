import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        // Começamos com uma capacidade pequena para testar o redimensionamento rápido
        int[] vetor = new int[2];
        int totalElementos = 0;

        // Vamos inserir 5 elementos em um vetor que só cabe 2
        //os elementos: 10, 20, 30, 40, 50
        vetor = inserir(vetor, totalElementos++, 10);
        vetor = inserir(vetor, totalElementos++, 20);

        System.out.println("Antes de lotar: " + Arrays.toString(vetor));

        // Aqui o vetor está cheio (2/2). A próxima inserção vai disparar o dobro.
        vetor = inserir(vetor, totalElementos++, 30);
        vetor = inserir(vetor, totalElementos++, 40);
        vetor = inserir(vetor, totalElementos++, 50);

        System.out.println("Após redimensionamentos: " + Arrays.toString(vetor));
        System.out.println("Capacidade final: " + vetor.length);
    }

    public static int[] inserir(int[] array, int posicao, int valor) {
        // 1. Verificar se o array está cheio
        if (posicao == array.length) {
            System.out.println("Log: Array cheio! Dobrando de " + array.length + " para " + (array.length * 2));

            // 2. Criar novo array com o dobro do tamanho
            int[] novoArray = new int[array.length * 2];

            // 3. Copiar dados do antigo para o novo (Custo O(n))
            for (int i = 0; i < array.length; i++) {
                novoArray[i] = array[i];
            }

            // O "ponteiro" agora aponta para o novo array maior
            array = novoArray;
        }

        // 4. Realizar a inserção normal
        array[posicao] = valor;
        return array;
    }
}
