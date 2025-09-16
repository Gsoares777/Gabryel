/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// AumentarArray.java
import java.util.Arrays;

public class AumentarArray {
    public static void main(String[] args) {
        // Array inicial
        int[] numeros = {1, 2, 3};
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Novo tamanho desejado (maior que numeros.length)
        int novoTamanho = 5;
        if (novoTamanho <= numeros.length) {
            System.out.println("Erro: novoTamanho deve ser maior que o tamanho atual.");
            return;
        }

        // Cria um novo array maior e copia os elementos automaticamente
        int[] novoArray = Arrays.copyOf(numeros, novoTamanho);

        // Preenche as novas posições (exemplo: continuar a sequência)
        for (int i = numeros.length; i < novoArray.length; i++) {
            novoArray[i] = i + 1; // ou qualquer valor que você queira inserir
        }

        System.out.println("Novo array aumentado: " + Arrays.toString(novoArray));
    }
}


