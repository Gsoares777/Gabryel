/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// atividade2.java
enum Modo {
    PADRAO(1), JEDI(2), SITH(3), DARTH_VADER(4);

    private int valor;

    Modo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

public class atividade2 {
    public static void main(String[] args) {
        for (Modo m : Modo.values()) {
            System.out.println("Modo: " + m + " - Valor: " + m.getValor());
        }
    }
}
