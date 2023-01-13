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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        int OpcioneMenu;
        int PrecioTotal;
        int PrecioAdvil = 2500;
        int PrecioDipirona = 1100;
        int PrecioCefalixina = 800;
        int PrecioLoratadina = 6600;

        System.out.println("Farmacia mi salud:");
        System.out.println("Ingrese el nombre del cliente:");
        String Nombre = bufEntrada.readLine();
        System.out.println("1: consultar producto, precio y caracteristica");
        System.out.println("2: devolucion de producto");
        System.out.println("3: cerrar");
        int OpcionesMenu = Integer.parseInt(bufEntrada.readLine());

        switch (OpcionesMenu) {
            case 1:
                System.out.println("Consultar producto existente:");
                System.out.println("1: Advil");
                System.out.println("2: Dipirona");
                System.out.println("3: Cefaxilicina");
                System.out.println("4: Loratadina");
                int OpcionesProducto = Integer.parseInt(bufEntrada.readLine());
                 
                switch (OpcionesProducto) {
                    case 1:
                        System.out.println("Caracteristicas del producto:");
                        System.out.println("Nombre: Advil");
                        System.out.println("Beneficios: Alivia la migraña, sna espasmos musculares");
                        System.out.println("Precio: 2500 C/U");
                        System.out.println("Desea comprarlo:");
                        System.out.println("1: Si");
                        System.out.println("2: No");
                        OpcionesMenu = Integer.parseInt(bufEntrada.readLine());

                        if (OpcionesMenu == 1) {
                            System.out.println("Ingresa las unidades a comprar:");
                            int Cantidad = Integer.parseInt(bufEntrada.readLine());
                            PrecioTotal = Cantidad * PrecioAdvil;
                            System.out.println("Sr/Sra " + Nombre + " su compra fue exitosa");
                            System.out.println("Advil, cantidad comprada: " + Cantidad + " valor a pagar: " + PrecioTotal);

                        } else {
                            if (OpcionesMenu == 2) {
                                System.out.println("Un gusto atenderle vuelva pronto");
                            } else {
                                System.out.println("Ingresio una opcion incorrecta, fue un gusto atenderle vuelva pronto");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Caracteristicas del producto:");
                        System.out.println("Nombre: Dipirona");
                        System.out.println("Beneficios: Alivia el dolor intenso");
                        System.out.println("Precio: 1100 C/U");
                        System.out.println("Desea comprarlo:");
                        System.out.println("1: Si");
                        System.out.println("2: No");
                        OpcionesMenu = Integer.parseInt(bufEntrada.readLine());

                        if (OpcionesMenu == 1) {
                            System.out.println("Ingresa las unidades a comprar:");
                            int Cantidad = Integer.parseInt(bufEntrada.readLine());
                            PrecioTotal = Cantidad * PrecioDipirona;
                            System.out.println("Sr/Sra " + Nombre + " su compra fue exitosa");
                            System.out.println("Dipirona, cantidad comprada: " + Cantidad + " valor a pagar: " + PrecioTotal);

                        } else {
                            if (OpcionesMenu == 2) {
                                System.out.println("Un gusto atenderle vuelva pronto");
                            } else {
                                System.out.println("Ingresio una opcion incorrecta, fue un gusto atenderle vuelva pronto");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Caracteristicas del producto:");
                        System.out.println("Nombre: Cefalixna");
                        System.out.println("Beneficios: detener las infecciones");
                        System.out.println("Precio: 800 C/U");
                        System.out.println("Desea comprarlo:");
                        System.out.println("1: Si");
                        System.out.println("2: No");
                        OpcionesMenu = Integer.parseInt(bufEntrada.readLine());

                        if (OpcionesMenu == 1) {
                            System.out.println("Ingresa las unidades a comprar:");
                            int Cantidad = Integer.parseInt(bufEntrada.readLine());
                            PrecioTotal = Cantidad * PrecioCefalixina;
                            System.out.println("Sr/Sra " + Nombre + " su compra fue exitosa");
                            System.out.println("Dipirona, cantidad comprada: " + Cantidad + " valor a pagar: " + PrecioTotal);

                        } else {
                            if (OpcionesMenu == 2) {
                                System.out.println("Un gusto atenderle vuelva pronto");
                            } else {
                                System.out.println("Ingresio una opcion incorrecta, fue un gusto atenderle vuelva pronto");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Caracteristicas del producto:");
                        System.out.println("Nombre: Loratadina");
                        System.out.println("Beneficios: Controla algun tipo de alergia");
                        System.out.println("Precio: 6600 C/U");
                        System.out.println("Desea comprarlo:");
                        System.out.println("1: Si");
                        System.out.println("2: No");
                        OpcionesMenu = Integer.parseInt(bufEntrada.readLine());

                        if (OpcionesMenu == 1) {
                            System.out.println("Ingresa las unidades a comprar:");
                            int Cantidad = Integer.parseInt(bufEntrada.readLine());
                            PrecioTotal = Cantidad * PrecioLoratadina;
                            System.out.println("Sr/Sra " + Nombre + " su compra fue exitosa");
                            System.out.println("Dipirona, cantidad comprada: " + Cantidad + " valor a pagar: " + PrecioTotal);

                        } else {
                            if (OpcionesMenu == 2) {
                                System.out.println("Un gusto atenderle vuelva pronto");
                            } else {
                                System.out.println("Ingresio una opcion incorrecta, fue un gusto atenderle vuelva pronto");
                            }
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("Devolucion del producto");
                System.out.println("Elija el producto a devolver:");
                System.out.println("1: Advil");
                System.out.println("2: Dipirona");
                System.out.println("3: Cefaxilicina");
                System.out.println("4: Loratadina");
                OpcionesProducto = Integer.parseInt(bufEntrada.readLine());

                switch (OpcionesProducto) {
                    case 1:
                        System.out.println("Ingresa la cantida a devolver:");
                        int Cantidad = Integer.parseInt(bufEntrada.readLine());
                        PrecioTotal = Cantidad * PrecioAdvil;
                        System.out.println("Sr/Sra " + Nombre + " su devolucion fue exitosa");
                        System.out.println("Advil, cantidad devuelta: " + Cantidad + " saldo a favor: " + PrecioTotal);
                        break;
                    case 2:
                        System.out.println("Ingresa la cantida a devolver:");
                        Cantidad = Integer.parseInt(bufEntrada.readLine());
                        PrecioTotal = Cantidad * PrecioDipirona;
                        System.out.println("Sr/Sra " + Nombre + " su devolucion fue exitosa");
                        System.out.println("Dipirona, cantidad devuelta: " + Cantidad + " saldo a favor: " + PrecioTotal);
                        break;

                    case 3:
                        System.out.println("Ingresa la cantida a devolver:");
                        Cantidad = Integer.parseInt(bufEntrada.readLine());
                        PrecioTotal = Cantidad * PrecioCefalixina;
                        System.out.println("Sr/Sra " + Nombre + " su devolucion fue exitosa");
                        System.out.println("Advil, cantidad devuelta: " + Cantidad + " saldo a favor: " + PrecioTotal);
                        break;
                    case 4:
                        System.out.println("Ingresa la cantida a devolver:");
                        Cantidad = Integer.parseInt(bufEntrada.readLine());
                        PrecioTotal = Cantidad * PrecioLoratadina;
                        System.out.println("Sr/Sra " + Nombre + " su devolucion fue exitosa");
                        System.out.println("Advil, cantidad devuelta: " + Cantidad + " saldo a favor: " + PrecioTotal);
                        break;

                }
                break;
            case 3:
                System.out.println("Cerrar farmacia");
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }

    }

}
