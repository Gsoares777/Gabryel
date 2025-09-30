/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// atividade1.java
enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class atividade1 {
    public static void main(String[] args) {
        System.out.println("Semana de Provas N1 - UniAlfa:");

        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana dia : dias) {
            switch (dia) {
                case SEGUNDA:
                    System.out.println("Segunda: Prova de Programação");
                    break;
                case TERCA:
                    System.out.println("Terça: Prova de Banco de Dados");
                    break;
                case QUARTA:
                    System.out.println("Quarta: Prova de Estruturas de Dados");
                    break;
                case QUINTA:
                    System.out.println("Quinta: Prova de Engenharia de Software");
                    break;
                case SEXTA:
                    System.out.println("Sexta: Prova de Redes de Computadores");
                    break;
                default:
                    System.out.println(dia + ": Sem provas.");
            }
        }
    }
}

