/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// atividade4.java
import java.util.Vector;

public class atividade4 {
    public static void main(String[] args) {
        Vector<String> lista = new Vector<>();

        lista.add("Item 1");
        lista.add("Item 2");
        lista.add("Item 3");

        System.out.println("Itens no Vector:");
        for (String item : lista) {
            System.out.println(item);
        }
    }
}
