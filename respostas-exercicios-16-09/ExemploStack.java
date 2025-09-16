/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        // Criando uma pilha de URLs
        Stack<String> historico = new Stack<>();

        // Empilhando 5 URLs reais
        historico.push("https://www.google.com");
        historico.push("https://www.openai.com");
        historico.push("https://www.github.com");
        historico.push("https://www.oracle.com");
        historico.push("https://www.wikipedia.org");

        // Exibindo o histórico
        System.out.println("Histórico de navegação (empilhado):");
        for (String url : historico) {
            System.out.println(url);
        }

        System.out.println("\nDesempilhando (voltando páginas):");
        while (!historico.isEmpty()) {
            System.out.println("Voltando para: " + historico.pop());
        }
    }
}
