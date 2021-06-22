/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import static java.awt.SystemColor.menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Flor Melanni Infante
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ProyectoMain[] menus;
        int tam = 0;
        int contador1 = 1;//para iniciar en 1 el arreglo
        int contador2 = 0;//para contar a las personas ingresadas
        int contador3 = 0;//almacena la suma del contador 1

        System.out.print("De que tamaño es la agenda:");
        tam = sc.nextInt();
        menus = new ProyectoMain[tam];
        int tam2 = tam;
        System.out.println("El espacio restante de la agenda es: " + tam2);

        //inicializar cada posicion del arreglo
        for (int i = 0; i < menus.length; i++) {
            menus[i] = new ProyectoMain();
        }

        int opc = 0;
        int opc2 = 0;

        do {

            System.out.println("---------------Menu---------------------");
            System.out.println("El espacio restante de la agenda es: " + tam2);
            System.out.println("1) Agregar al cliente");
            System.out.println("2) Mostrar informacion de todos los clientes ");
            System.out.println("3) Buscar al cliente");
            System.out.println("0) Salir");
            System.out.print("Elige una opcion:");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    if (contador3 < tam) {
                        contador3 += contador1;
                        for (int i = contador2; i < contador3; i++) {
                            System.out.print("id: ");
                            menus[i].setIdCliente(sc.nextInt());
                            System.out.print("nombre: ");
                            menus[i].setNombre(bf.readLine());
                            System.out.print("apellidoPaterno: ");
                            menus[i].setApellidoPaterno(bf.readLine());
                            System.out.print("apellidoMaterno: ");
                            menus[i].setApellidoMaterno(bf.readLine());
                            System.out.print("telefono: ");
                            menus[i].setTelefono(bf.readLine());
                            System.out.print("direccion: ");
                            menus[i].setDireccion(bf.readLine());
                            System.out.print("edad: ");
                            menus[i].setEdad(bf.readLine());
                            i++;
                            contador2++;

                        }
                        tam2--;
                    } else {
                        System.out.println("No hay espacio en la cartera: ");
                    }

                    break;
                case 2:
                    System.out.println("----Lista de los clientes------");
                    for (ProyectoMain menu : menus) {
                        System.out.println("id: " + menu.getIdCliente());
                        System.out.println("nombre: " + menu.getNombre());
                        System.out.println("apellidoPaterno: " + menu.getApellidoPaterno());
                        System.out.println("apellidoMaterno: " + menu.getApellidoMaterno());
                        System.out.println("telefono: " + menu.getTelefono());
                        System.out.println("direccion: " + menu.getDireccion());
                        System.out.println("edad: " + menu.getEdad());
                    }
                    System.out.println("------------------------------------");
                    break;
                case 3:

                    System.out.println("----------Buscar al cliente------");
                    System.out.println("1) Buscar por codigo: ");
                    System.out.println("2) Buscar por nombre: ");
                    System.out.println("0) regresar");
                    System.out.print("Elige una opcion: ");
                    opc2 = sc.nextInt();

                    switch (opc2) {
                        case 1:
                            System.out.print("Codigo a buscar: ");
                            int buscar = sc.nextInt();
                            if (buscar >= 0 && buscar <= tam) {
                                System.out.println("El cliente se ha encontrado: ");
                                System.out.println("id: " + menus[buscar - 1].getIdCliente());
                                System.out.println("nombre: " + menus[buscar - 1].getNombre());
                                System.out.println("apellidoPaterno: " + menus[buscar - 1].getApellidoPaterno());
                                System.out.println("apellidoMaterno: " + menus[buscar - 1].getApellidoMaterno());
                                System.out.println("telefono: " + menus[buscar - 1].getTelefono());
                                System.out.println("direccion: " + menus[buscar - 1].getDireccion());
                                System.out.println("edad: " + menus[buscar - 1].getEdad());
                            } else {
                                System.out.println("No se ha encontrado ese codigo: ");

                            }
                            break;

                        case 2:
                            int posicion = -1;
                            System.out.print("Ingresa el nombre a buscar: ");
                            String buscador = bf.readLine();

                             {
                                for (int i = 0; i < menus.length; i++) {
                                    if (buscador.equals(menus[i].getNombre())) {
                                        posicion = i;
                                        System.out.println("El cliente se ha encontado: ");
                                        System.out.println("nombre: " + menus[i].getNombre());
                                        System.out.println("apellidoPaterno: " + menus[i].getApellidoPaterno());
                                        System.out.println("apellidoMaterno: " + menus[i].getApellidoMaterno());
                                        System.out.println("telefono: " + menus[i].getTelefono());
                                        System.out.println("direccion: " + menus[i].getDireccion());
                                        System.out.println("edad: " + menus[i].getEdad());
                                    }
                                }
                                if (posicion == -1) {
                                    System.out.println("El cliente no se ha encontado: ");
                                }

                            }

                        case 0:
                            System.out.println("Gracias por usar el sub menu");

                    }

                    break;
                case 0:
                    System.out.println("ADIOS");
                    break;
            }

        } 
        while (opc != 0);

    }

    private static boolean nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
