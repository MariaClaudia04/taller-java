/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerArreglos;

/**
 *
 * @author Claudia
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a;
        int contador;
        int numer;
        int vector[];
        int x;
        vector = new int[168];
        a = 0;
        for (numer = 0; numer <= 1000 - 1; numer++) {
            x = 1;
            contador = 0;
            while (x <= numer) {
                if (numer % x == 0) {
                    contador = contador + 1;
                }
                x = x + 1;
            }
            if (contador == 2) {
                vector[a] = numer;
                a = a + 1;
            }
        }
        for (numer = 0; numer <= 167; numer++) {
            System.out.println(vector[numer]);
        }
    }

}
