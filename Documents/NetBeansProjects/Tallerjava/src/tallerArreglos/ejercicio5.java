/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerArreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Claudia
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int columna;
        int cont;
        int contador;
        int fila;
        int matriz[][];
        int opciones;
        matriz = new int[10][10];
        contador = 0;
        fila = 0;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 1;
            columna = columna + 1;
        }
        fila = 1;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 2;
            columna = columna + 1;
        }
        fila = 2;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 3;
            columna = columna + 1;
        }
        // tabla del numero 4
        fila = 3;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 4;
            columna = columna + 1;
        }
        // tabla del numero 5
        fila = 4;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 5;
            columna = columna + 1;
        }
        // tabla del numero 6
        fila = 5;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 6;
            columna = columna + 1;
        }
        // tabla del numero 7
        fila = 6;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 7;
            columna = columna + 1;
        }
        // tabla del numero 8
        fila = 7;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 8;
            columna = columna + 1;
        }
        // tabla del numero 9
        fila = 8;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 9;
            columna = columna + 1;
        }
        // tabla del numero 10
        fila = 9;
        columna = 0;
        cont = 0;
        for (contador = 0; contador <= 9; contador++) {
            cont = cont + 1;
            matriz[fila][columna] = cont * 10;
            columna = columna + 1;
        }
        do {
            System.out.println("        |-----------------------COLUMNAS----------------------------------------|");
            System.out.println("        |___0___|__1___|__2___|__3___|__4___|__5___|__6___|__7___|__8___|__9____| ");
            System.out.println("|   |_0_|_1x1___|_2x1--|_3x1__|__4x1_|_5x1__|_6x1__|_7x1__|_8x1__|_9x1__|_10x1__|");
            System.out.println("|   |_1_|_1x2___|_2x2-_|_3x2__|__4x2_|_5x2__|_6x2__|_7x2__|_8x2__|_9x1__|_10x2__|");
            System.out.println("|F  |_2_|_1x3___|_2x3__|_3x3__|__4x3_|_5x3__|_6x3__|_7x3__|_8x3__|_9x2__|_10x3__|");
            System.out.println("|I  |_3_|_1x4___|_2x4__|_3x4__|__4x4_|_5x4__|_6x4__|_7x4__|_8x4__|_9x3__|_10x4__|");
            System.out.println("|L  |_4_|_1x5___|_2x5__|_3x5__|__4x5_|_5x5__|_6x5__|_7x5__|_8x5__|_9x4__|_10x5__|");
            System.out.println("|A  |_5_|_1x6___|_2x6__|_3x6__|__4x6_|_5x6__|_6x6__|_7x6__|_8x6__|_9x5__|_10x6__|");
            System.out.println("|S  |_6_|_1x7___|_2x7__|_3x7__|__4x7_|_5x7__|_6x7__|_7x7__|_8x7__|_9x6__|_10x7__|");
            System.out.println("|   |_7_|_1x8___|_2x8__|_3x8__|__4x8_|_5x8__|_6x8__|_7x8__|_8x8__|_9x7__|_10x8__|");
            System.out.println("|   |_8_|_1x9___|_2x9__|_3x9__|__4x9_|_5x9__|_6x9__|_7x9__|_8x9__|_9x8__|_10x9__|");
            System.out.println("|   |_9_|_1x10__|_2x10-|_3x10_|_4x10_|_5x10_|_6x10_|_7x10_|_8x10_|_9x10_|_10x10_|");
            System.out.println("");
            System.out.println(" Digita la fila y la columna de la que deseas ver el resultado ");
            do {
                System.out.print(" digita la fila ");
                fila = Integer.parseInt(bufEntrada.readLine());
            } while (!(fila > -1 && fila < 10));
            do {
                System.out.print("Digita la columna ");
                columna = Integer.parseInt(bufEntrada.readLine());
            } while (!(columna > -1 && columna < 10));
            System.out.println("");
            System.out.println(fila + "," + columna + " el resultado es:" + matriz[fila][columna]);
            System.out.println("");
            System.out.print("Ingresa 1 para volver a las tablas y 2 para salir ");
            opciones = Integer.parseInt(bufEntrada.readLine());
            System.out.println(""); // no hay forma directa de borrar la consola en Java
            if (opciones == 4) {
                System.out.println(" cerrado");
            }
        } while (opciones != 4);
    }

}
