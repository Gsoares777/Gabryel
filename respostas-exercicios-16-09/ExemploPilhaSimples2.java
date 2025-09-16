/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;

public class ExemploPilhaSimples2 {
    public static void main(String[] args) {
        // Criando uma pilha usando Stack
        Stack<Integer> pilha = new Stack<>();

        // Empilhando 10 elementos
        for (int i = 1; i <= 10; i++) {
            pilha.push(i);
            System.out.println("Empilhado: " + i);
        }

        System.out.println("\nDesempilhando os elementos:");
        // Desempilhando todos os elementos
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhado: " + pilha.pop());
        }
    }
}
