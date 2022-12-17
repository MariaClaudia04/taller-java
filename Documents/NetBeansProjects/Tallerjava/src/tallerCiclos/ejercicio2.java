/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

/**
 *
 * @author Claudia
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Espacio;
        int C_Espacios;
        String Signo;
        String C;
        int i;
        Signo = "*";
        Espacio = 12;
        C_Espacios = 1;
        C = "";

        for (i = 0; i <= 12; i++) {
            Signo = Signo.concat("*");
            while (C_Espacios <= Espacio) {
                C = C.concat(" ");
                C_Espacios = C_Espacios + 1;
            }
            System.out.println(C + Signo);
            Espacio = Espacio - 1;
            C_Espacios = 1;
            C = "";
        }
    }

}
