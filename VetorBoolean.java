/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class VetorBoolean {
    public static void main(String[] args) {
        boolean[] status = new boolean[3];

        // atribuindo valores
        status[0] = true;
        status[1] = false;
        status[2] = true;

        // verificando a primeira posição
        if (status[0]) {
            System.out.println("O primeiro status está ativo.");
        } else {
            System.out.println("O primeiro status está inativo.");
        }
    }
}
