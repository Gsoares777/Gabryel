/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class ExemploPilhaSimples1 {
    public static void main(String[] args) {
        // Criando uma pilha simples com array de 10 posições
        int[] pilha = new int[10];
        int topo = -1; // indica que a pilha está vazia

        // Empilhando 10 elementos
        for (int i = 1; i <= 10; i++) {
            topo++;
            pilha[topo] = i;
            System.out.println("Empilhado: " + pilha[topo]);
        }

        System.out.println("\nDesempilhando os elementos:");
        // Desempilhando todos os elementos
        while (topo >= 0) {
            System.out.println("Desempilhado: " + pilha[topo]);
            topo--;
        }
    }
}

