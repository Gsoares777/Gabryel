/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// atividade5.java
import java.util.Vector;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

public class atividade5 {
    public static void main(String[] args) {
        // ----- Vector (uso básico) -----
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        System.out.println("Vector (toString): " + v);

        // Se outra thread puder modificar o Vector enquanto iteramos,
        // faça sincronização externa:
        synchronized (v) {
            System.out.println("Iterando Vector (synchronized):");
            for (String s : v) {
                System.out.println("  -> " + s);
            }
        }

        // ----- Stack (LIFO) -----
        Stack<String> stack = new Stack<>();
        stack.push("primeiro");   // ficará mais abaixo
        stack.push("segundo");
        stack.push("topo");       // topo da pilha
        System.out.println("\nStack (toString): " + stack);
        System.out.println("peek() -> " + stack.peek()); // "topo"
        System.out.println("pop()  -> " + stack.pop());  // remove "topo"
        System.out.println("Depois do pop, stack: " + stack);
        // search: posição 1-based a partir do topo
        System.out.println("search('primeiro') -> " + stack.search("primeiro")); // ex: 2 (se "segundo" estiver acima)

        // ----- Alternativa moderna (recomendada) -----
        Deque<String> pilhaRecomendada = new ArrayDeque<>();
        pilhaRecomendada.push("x");
        pilhaRecomendada.push("y");
        System.out.println("\nArrayDeque como pilha, pop() -> " + pilhaRecomendada.pop());

        // ----- Thread-safe alternatives -----
        List<String> listaSincronizada = Collections.synchronizedList(new java.util.ArrayList<>());
        listaSincronizada.add("item1");
        System.out.println("Collections.synchronizedList -> " + listaSincronizada);
    }
}

