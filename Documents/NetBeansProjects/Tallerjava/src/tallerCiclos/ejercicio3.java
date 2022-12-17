/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

/**
 *
 * @author Claudia
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Contador;
        int Espacio;
        int C_Espacios;
        String Signo;
        String C;
        Contador = 0;
        Signo = "*";
        Espacio = 12;
        C_Espacios = 1;
        C = "";
        double i;

        for (i = 0; i <= 11; i++) {
            while (Contador <= i) {
                Signo = Signo.concat("*");
                Contador = Contador + 1;
            }
            while (C_Espacios <= Espacio) {
                C = C.concat(" ");
                C_Espacios = C_Espacios + 1;
            }
            System.out.println(C + Signo);
            Contador = Contador - 1;
            Espacio = Espacio - 1;
            C_Espacios = 1;
            C = "";
        }
        System.out.println("           ***");
        System.out.println("          *****");
        System.out.println("         *******");
        System.out.println("        *********");
    }

}
