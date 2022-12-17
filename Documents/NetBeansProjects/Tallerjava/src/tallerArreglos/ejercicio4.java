/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerArreglos;

/**
 *
 * @author Claudia
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Columnas;
        int Contador;
        int Filas;
        int Fin;
        int Inicio;
        int Matriz[][];
        int pasos;
        Matriz = new int[4][5];
        Contador = 1;
        for (Filas = 0; Filas <= 3; Filas++) {
            for (Columnas = 0; Columnas <= 4; Columnas++) {
                Matriz[Filas][Columnas] = Contador;
                Contador = Contador + 1;
            }
        }
        for (Filas = 0; Filas <= 3; Filas++) {
            for (Columnas = 0; Columnas <= 4; Columnas++) {
                if ((Matriz[Filas][Columnas] < 10)) {
                    System.out.print("0" + Matriz[Filas][Columnas] + " ");
                } else {
                    System.out.print(Matriz[Filas][Columnas] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (Filas = 0; Filas <= 3; Filas++) {
            if ((Filas % 2 == 0)) {
                Inicio = 0;
                Fin = 4;
                pasos = 1;
            } else {
                Inicio = 4;
                Fin = 0;
                pasos = -1;
            }
            for (Columnas = Inicio; Columnas <= Fin; Columnas += pasos) {
                if ((Matriz[Filas][Columnas] < 10)) {
                    System.out.print("0" + Matriz[Filas][Columnas] + " ");
                } else {
                    System.out.print(Matriz[Filas][Columnas] + " ");
                }
            }
            System.out.println("");
        }
    }

}
