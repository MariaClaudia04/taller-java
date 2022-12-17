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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int Buscador;
        int Estacionamiento;
        String Marca1 = "";
        String Marca2 = "";
        String Marca3 = "";
        String Marca4 = "";
        String Marca5 = "";
        String Nombre1 = "";
        String Nombre2 = "";
        String Nombre3 = "";
        String Nombre4 = "";
        String Nombre5 = "";
        int Opciones;
        String Placa1 = "";
        String Placa2 = "";
        String Placa3 = "";
        String Placa4 = "";
        String Placa5 = "";
        int Salir;
        String Telefono1 = "";
        String Telefono2 = "";
        String Telefono3 = "";
        String Telefono4 = "";
        String Telefono5 = "";
        do {
            System.out.println("");
            System.out.println("El guardian de los autos ");
            System.out.println("1 ingresa el automovil");
            System.out.println("2 buscar el automovil");
            System.out.println("3 salida del automovil");
            System.out.println("4 salir ");
            Opciones = Integer.parseInt(bufEntrada.readLine());
            switch (Opciones) {
                case 1:
                    System.out.println("El guardian de los autos");
                    System.out.println("");
                    System.out.println("Ingresar automovil");
                    System.out.println("En cual estacionamiento desea guardar su automovil 1,2,3,4 o 5?");
                    Estacionamiento = Integer.parseInt(bufEntrada.readLine());
                    if (Estacionamiento == 1) {
                        System.out.println("Agregar automovil 1");
                        System.out.println("Ingrese su nombre");
                        Nombre1 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de telefono");
                        Telefono1 = bufEntrada.readLine();
                        System.out.println("Ingresa la plata de automivil");
                        Placa1 = bufEntrada.readLine();
                        System.out.println("Ingresa la marca del automovil");
                        Marca1 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Automivil 1");
                        System.out.println("Nombre: " + Nombre1);
                        System.out.println("Telefono: " + Telefono1);
                        System.out.println("Placa: " + Placa1);
                        System.out.println("Marca: " + Marca1);
                    }
                    if (Estacionamiento == 2) {
                        System.out.println("Agregar automovil 1");
                        System.out.println("Ingrese su nombre");
                        Nombre2 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de telefono");
                        Telefono2 = bufEntrada.readLine();
                        System.out.println("Ingresa la plata de automivil");
                        Placa2 = bufEntrada.readLine();
                        System.out.println("Ingresa la marca del automovil");
                        Marca2 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Automivil 1");
                        System.out.println("Nombre: " + Nombre2);
                        System.out.println("Telefono: " + Telefono2);
                        System.out.println("Placa: " + Placa2);
                        System.out.println("Marca: " + Marca2);
                    }
                    if (Estacionamiento == 3) {
                        System.out.println("Agregar automovil 3");
                        System.out.println("Ingrese su nombre");
                        Nombre3 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de telefono");
                        Telefono3 = bufEntrada.readLine();
                        System.out.println("Ingresa la plata de automivil");
                        Placa3 = bufEntrada.readLine();
                        System.out.println("Ingresa la marca del automovil");
                        Marca3 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Automivil 3");
                        System.out.println("Nombre: " + Nombre3);
                        System.out.println("Telefono: " + Telefono3);
                        System.out.println("Placa: " + Placa3);
                        System.out.println("Marca: " + Marca3);
                    }
                    if (Estacionamiento == 4) {
                        System.out.println("Agregar automovil 4");
                        System.out.println("Ingrese su nombre");
                        Nombre4 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de telefono");
                        Telefono4 = bufEntrada.readLine();
                        System.out.println("Ingresa la plata de automivil");
                        Placa4 = bufEntrada.readLine();
                        System.out.println("Ingresa la marca del automovil");
                        Marca4 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Automivil 4");
                        System.out.println("Nombre: " + Nombre4);
                        System.out.println("Telefono: " + Telefono4);
                        System.out.println("Placa: " + Placa4);
                        System.out.println("Marca: " + Marca4);
                    }
                    if (Estacionamiento == 5) {
                        System.out.println("Agregar automovil 5");
                        System.out.println("Ingrese su nombre");
                        Nombre5 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de telefono");
                        Telefono5 = bufEntrada.readLine();
                        System.out.println("Ingresa la plata de automivil");
                        Placa5 = bufEntrada.readLine();
                        System.out.println("Ingresa la marca del automovil");
                        Marca5 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Automivil 5");
                        System.out.println("Nombre: " + Nombre5);
                        System.out.println("Telefono: " + Telefono5);
                        System.out.println("Placa: " + Placa5);
                        System.out.println("Marca: " + Marca5);
                    }
                    break;
                case 2:
                    System.out.println("Buscar automoviles del parqueadero");
                    System.out.println("");
                    System.out.println("Cual automovil desea buscar, Indica su estacionamiento 1,2,3,4 o 5");
                    Buscador = Integer.parseInt(bufEntrada.readLine());
                    System.out.println("");
                    if (Buscador == 1) {
                        System.out.println("Estacionamiento 1");
                        System.out.println("Automivil 1");
                        System.out.println("Nombre: " + Nombre1);
                        System.out.println("Telefono: " + Telefono1);
                        System.out.println("Placa: " + Placa1);
                        System.out.println("Marca: " + Marca1);
                        System.out.println("Sr/Sra " + Nombre1 + " aqui esta su automovil ");
                    }
                    if (Buscador == 2) {
                        System.out.println("Estacionamiento 2");
                        System.out.println("Automivil 2");
                        System.out.println("Nombre: " + Nombre2);
                        System.out.println("Telefono: " + Telefono2);
                        System.out.println("Placa: " + Placa2);
                        System.out.println("Marca: " + Marca2);
                        System.out.println("Sr/Sra " + Nombre2 + " aqui esta su automovil ");
                    }
                    if (Buscador == 3) {
                        System.out.println("Estacionamiento 3");
                        System.out.println("Automivil 3");
                        System.out.println("Nombre: " + Nombre3);
                        System.out.println("Telefono: " + Telefono3);
                        System.out.println("Placa: " + Placa3);
                        System.out.println("Marca: " + Marca3);
                        System.out.println("Sr/Sra " + Nombre3 + " aqui esta su automovil ");
                    }
                    if (Buscador == 4) {
                        System.out.println("Estacionamiento 4");
                        System.out.println("Automivil 4");
                        System.out.println("Nombre: " + Nombre4);
                        System.out.println("Telefono: " + Telefono4);
                        System.out.println("Placa: " + Placa4);
                        System.out.println("Marca: " + Marca4);
                        System.out.println("Sr/Sra " + Nombre4 + " aqui esta su automovil ");
                    }
                    if (Buscador == 5) {
                        System.out.println("Estacionamiento 5");
                        System.out.println("Automivil 5");
                        System.out.println("Nombre: " + Nombre5);
                        System.out.println("Telefono: " + Telefono5);
                        System.out.println("Placa: " + Placa5);
                        System.out.println("Marca: " + Marca5);
                        System.out.println("Sr/Sra " + Nombre5 + " aqui esta su automovil ");
                    }
                    break;
                case 3:
                    System.out.println("Salida del automovil");
                    System.out.println("Ingresa que automovil deseas sacar del parqueadero 1,2,3,4 o 5");
                    Salir = Integer.parseInt(bufEntrada.readLine());
                    if (Salir == 1) {
                        System.out.println("Estacionamiento 1");
                        System.out.println("Automivil 1");
                        System.out.println("Nombre: " + Nombre1);
                        System.out.println("Telefono: " + Telefono1);
                        System.out.println("Placa: " + Placa1);
                        System.out.println("Marca: " + Marca1);
                        System.out.println("Sr/Sra " + Nombre1 + " fue un gusto prestarle nuestros servicios ");
                    }
                    if (Salir == 2) {
                        System.out.println("Estacionamiento 2");
                        System.out.println("Automivil 2");
                        System.out.println("Nombre: " + Nombre2);
                        System.out.println("Telefono: " + Telefono2);
                        System.out.println("Placa: " + Placa2);
                        System.out.println("Marca: " + Marca2);
                        System.out.println("Sr/Sra " + Nombre2 + " fue un gusto prestarle nuestros servicios ");
                    }
                    if (Salir == 3) {
                        System.out.println("Estacionamiento 3");
                        System.out.println("Automivil 3");
                        System.out.println("Nombre: " + Nombre3);
                        System.out.println("Telefono: " + Telefono3);
                        System.out.println("Placa: " + Placa3);
                        System.out.println("Marca: " + Marca3);
                        System.out.println("Sr/Sra " + Nombre3 + " fue un gusto prestarle nuestros servicios ");
                    }
                    if (Salir == 4) {
                        System.out.println("Estacionamiento 4");
                        System.out.println("Automivil 4");
                        System.out.println("Nombre: " + Nombre4);
                        System.out.println("Telefono: " + Telefono4);
                        System.out.println("Placa: " + Placa4);
                        System.out.println("Marca: " + Marca4);
                        System.out.println("Sr/Sra " + Nombre4 + " fue un gusto prestarle nuestros servicios ");
                    }
                    if (Salir == 5) {
                        System.out.println("Estacionamiento 5");
                        System.out.println("Automivil 5");
                        System.out.println("Nombre: " + Nombre5);
                        System.out.println("Telefono: " + Telefono5);
                        System.out.println("Placa: " + Placa5);
                        System.out.println("Marca: " + Marca5);
                        System.out.println("Sr/Sra " + Nombre5 + " fue un gusto prestarle nuestros servicios ");
                    }
                    break;
                case 4:
                    System.out.println("parquedero cerrado");
                    break;
            }
        } while (Opciones != 4);
    }

}
