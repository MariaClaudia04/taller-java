/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCondicionales;

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

        String Cliente;
        int DecoracionesMenu;
        int DecoracionMenu;
        int OpcionesMenu;
        int OpcionesTortas;
        int PorcionesMenu;
        String Respuesta;
        String Resuesta;
        System.out.println("La pasteleria don carlos ");
        System.out.println("Ingrese el nombre del cliente");
        Cliente = bufEntrada.readLine();
        System.out.println("Menu");
        System.out.println("1: Tortas disponibles ");
        System.out.println("2: Cerrar sistemas ");
        OpcionesMenu = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        switch (OpcionesMenu) {
            case 1:
                System.out.println("Tortas disponibles");
                System.out.println("Sabores de tortas");
                System.out.println("1: Torta de chocolate ");
                System.out.println("2: Torta de vainilla");
                System.out.println("3: Torta de franbueza ");
                System.out.println("Desea comprar una torta Si/No");
                Respuesta = bufEntrada.readLine();

                if (Respuesta.equals("si")) {
                    System.out.println("Ingrese el numero de la torta deseada");
                    OpcionesTortas = Integer.parseInt(bufEntrada.readLine());
                    switch (OpcionesTortas) {
                        case 1:
                            System.out.println("Torta de chocolate ");
                            System.out.println("Contiene los siguites tamaños y porciones  ");
                            System.out.println("1: Torta pequeña de 4 porciones ");
                            System.out.println("2: Torta mediana de 8 porciones");
                            System.out.println("3: Torta grande de 16 porciones");
                            PorcionesMenu = Integer.parseInt(bufEntrada.readLine());
                            switch (PorcionesMenu) {
                                case 1:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 4 porciones viene con cubierta de pasta de azucar a tu gusto");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 4 porciones viene cubierta con matequilla a tu preferencia de color");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 4 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 8 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 8 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 8 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 16 porciones viene con cubierta de pasta de azucar a tu gusto");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 16 porciones viene cubierta con matequilla a tu preferencia de color");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de chocolate y tiene 16 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Torta de vainilla");
                            System.out.println("Contiene los siguites tamaños y porciones  ");
                            System.out.println("1 Torta pequeña de 4 porciones ");
                            System.out.println("2 Torta mediana de 8 porciones");
                            System.out.println("3 Torta grande de 16 porciones");
                            PorcionesMenu = Integer.parseInt(bufEntrada.readLine());
                            switch (PorcionesMenu) {
                                case 1:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla y tiene 4 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 4 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 4 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 8 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 8 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 8 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 16 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 16 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de vainilla  y tiene 16 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Torta de franbueza");
                            System.out.println("Contiene los siguites tamaños y porciones  ");
                            System.out.println("1: Torta pequeña de 4 porciones ");
                            System.out.println("2: Torta mediana de 8 porciones");
                            System.out.println("3: Torta grande de 16 porciones");
                            PorcionesMenu = Integer.parseInt(bufEntrada.readLine());
                            switch (PorcionesMenu) {
                                case 1:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza y tiene 4 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 4 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 4 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 8 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 8 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 8 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Contine las siguientes decoraciones ");
                                    System.out.println("1: Cubierta con pasta de azucar a tu gusto ");
                                    System.out.println("2: Cubierta con matequilla a tu preferencia de color ");
                                    System.out.println("3: Cubierta con chocolate y coco");
                                    DecoracionesMenu = Integer.parseInt(bufEntrada.readLine());
                                    switch (DecoracionesMenu) {
                                        case 1:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 16 porciones viene con cubierta de pasta de azucar a tu gusto ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 2:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 16 porciones viene cubierta con matequilla a tu preferencia de color ");
                                            System.out.println("Vuelva pronto");
                                            break;
                                        case 3:
                                            System.out.println("Sr" + Cliente + " su torta es de franbueza  y tiene 16 porciones viene cubierta con chocolate y coco");
                                            System.out.println("Vuelva pronto");
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    System.out.println("Fue un gusto atenderle");
                }
                break;
            case 2:
                System.out.println("cerrar sistemas ");
                break;
            default:
                System.out.println(" la opcion que elegiste no esta disponible ");
        }
    }

}
