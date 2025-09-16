/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class OrdenaArray {
    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Pedro", "Beatriz"};

        // Ordenando o array
        Arrays.sort(nomes);

        // Exibindo em ordem alfabética
        System.out.println("Array ordenado: " + Arrays.toString(nomes));
    }
}
