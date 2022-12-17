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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) throws IOException {
        BufferedReader BufEntrada = new BufferedReader(new InputStreamReader(System.in));

        String NombreUsuario;
        String Telefono;
        String Direccion;
        int Opciones;
        String Entrega;
        int OpcionesPeliculas;
        String Estado;
        String Observaciones;
        String Pelicula;

        System.out.println("Video tienda barrio porvenir");

        System.out.println("Ingrese su nombre:");
        NombreUsuario = BufEntrada.readLine();
        System.out.println("Seleciones una opcion");
        System.out.println("1: Consultar peliculas disponibles");
        System.out.println("2: Alquilar peliculas");
        System.out.println("3: Recibbir o devolver peliculas");
        System.out.println("4: Salir menu");
        Opciones = Integer.parseInt(BufEntrada.readLine());
        switch (Opciones) {
            case 1:
                System.out.println("Lista de peliculas disponible:");
                System.out.println("Batman");
                System.out.println("Hombre Araña");
                System.out.println("La cabaña maldita");
                System.out.println("La asotea");
                System.out.println("Lista de peliculas disponible");
                break;
            case 2:
                System.out.println("Elija la pelicula a reservar:");
                System.out.println("1: Baatma");
                System.out.println("2: Hombre Araña");
                System.out.println("3: La Cabaña maldita");
                System.out.println("4: La Asotea");
                System.out.println("5: Cancelar");
                OpcionesPeliculas = Integer.parseInt(BufEntrada.readLine());

                switch (OpcionesPeliculas) {
                    case 1:
                        System.out.println("Sr/Sra " + NombreUsuario + " su pelicula reservada es Batman tiene diez dias para devolverla");
                        break;
                    case 2:
                        System.out.println("Sr/Sra " + NombreUsuario + " su pelicula reservada es Hombre Araña tiene diez dias para devolverla");
                        break;
                    case 3:
                        System.out.println("Sr/Sra " + NombreUsuario + " su pelicula reservada es La Cabaña maldita tiene diez dias para devolverla");
                        break;
                    case 4:
                        System.out.println("Sr/Sra " + NombreUsuario + " su pelicula reservada es La Asotea tiene diez dias para devolverla");
                        break;
                }
                break;
            case 3:
                System.out.println("Ingresa el nombre de la pelicula a devolver:");
                Pelicula = BufEntrada.readLine();
                System.out.println("Ingresa el estado de la pelicula:");
                Estado = BufEntrada.readLine();
                System.out.println("Ingresa las observaciones del estado de la pelicula:");
                Observaciones = BufEntrada.readLine();

                System.out.println("la pelicula " + Pelicula + " se ha devuelto exitosamente por el cliente " + NombreUsuario + " en el estado " + Estado + " con la novedad " + Observaciones);
                break;
            case 4:
                System.out.println("Feliz dia regrese pronto");

        }

    }

    private static void Switch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
