/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Claudia
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String CursoAprovado[];
        int i;
        String NombreCurso[];
        String NombreUsuario[];
        int Opciones = 0;
        int OpcionesMenu;
        String Paso = "";
        double ResultadoPrueba[];
        NombreUsuario = new String[8];
        CursoAprovado = new String[8];
        NombreCurso = new String[8];
        ResultadoPrueba = new double[8];
        do {
            System.out.println("ESCULA EL MAESTRO");
            System.out.println("Elija una opcion");
            System.out.println("1. Matricular cliente");
            System.out.println("2. Registrar pruebas");
            System.out.println("3. Consulta estado de clientes");
            System.out.println("4. Salir del programa");
            OpcionesMenu = Integer.parseInt(bufEntrada.readLine());
            switch (OpcionesMenu) {
                case 1:
                    for (i = 0; i <= 8 - 1; i++) {
                        System.out.println("Nombre Cliente: ");
                        NombreUsuario[i] = bufEntrada.readLine();
                        NombreCurso[i] = "Conduccion Auto";
                        CursoAprovado[i] = "No";
                        i = i + 1;
                    }

                    break;
                case 2:
                    for (i = 0; i <= 8 - 1; i++) {
                        System.out.println("Nombre Cliente ");
                        System.out.println(NombreUsuario[i]);
                        System.out.println("Ingresa la nota del curso ");
                        ResultadoPrueba[i] = Double.parseDouble(bufEntrada.readLine());
                        if (ResultadoPrueba[i] >= 3) {
                            CursoAprovado[i] = "si";
                        } else {
                            CursoAprovado[i] = "No";
                        }
                        i = i + 1;
                    }
                    break;
                case 3:
                    for (i = 0; i <= 7; i++) {
                        if (!NombreUsuario[i].equals("")) {
                            System.out.println("El cliente:");
                            System.out.println(NombreUsuario[i]);
                            System.out.println("Tiene una nota de: " + ResultadoPrueba[i]);
                            System.out.println(CursoAprovado[i] + " aprobo el curso de " + NombreCurso[i]);
                            if (CursoAprovado[i].equals("si")) {
                                System.out.println("Puede tramitar la licencia");
                            } else {
                                System.out.println("No puede tramitar la licencia");
                            }
                            System.out.println("");
                        }
                        i = i + 1;
                    }
                    break;
                case 4:
                    System.out.println("Fin de programa");
                    break;
            }
        } while (Opciones != 4);
    }

}
