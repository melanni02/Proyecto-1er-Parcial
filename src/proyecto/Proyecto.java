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
        int tam=0;
        System.out.print("De que tamaño es la agenda:");
        tam=sc.nextInt();
        menus = new ProyectoMain[tam];
        System.out.println("El espacio restante de la agenda es: " + (tam-1));
        
        //inicializar cada posicion del arreglo
        for(int i=0; i<menus.length; i++){
            menus[i] = new ProyectoMain();
        }
        try{
            for (int i=0; i<menus.length; i++) {
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
            }
       }
            catch(IOException e){
                    System.out.println(e.getMessage());
                    }
                  
        int opc=100;
        int opc2=100;
        int opc3=100;
        while(opc!=0){
            System.out.println("---------------Menu---------------------");
            System.out.println("1) Agregar al cliente" );
            System.out.println("2) Mostrar informacion de todos los clientes ");
            System.out.println("3) Buscar al cliente");
            System.out.println("0) Salir");
            System.out.print("Elige una opcion:");
            opc=sc.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("El tamaño de la cartera es: " + tam);
                    System.out.print("Agregar al cliente: ");
                    opc2 = sc.nextInt();
                    if (opc2 >= 0 && opc2 < menus.length) {
                        System.out.println("id: " + menus[opc2].getIdCliente());
                        System.out.println("nombre: " + menus[opc2].getNombre());
                        System.out.println("apellidoPaterno: " + menus[opc2].getApellidoPaterno());
                        System.out.println("apellidoMaterno: " + menus[opc2].getApellidoMaterno());
                        System.out.println("telefono: " + menus[opc2].getTelefono());
                        System.out.println("direccion: " + menus[opc2].getDireccion());
                        System.out.println("edad: " + menus[opc2].getEdad());
                   }
                    else{
                    System.out.print("No hay espacio en la cartera: ");
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
                    
                    while(opc3!=0){
                        System.out.println("----------Buscar al cliente------");
                        System.out.println("1) Buscar por codigo: ");
                        System.out.println("2) Buscar por nombre: ");
                        System.out.println("0) regresar");
                        System.out.print("Elige una opcion: ");
                        opc3=sc.nextInt();
                        
                        switch(opc3){
                            case 1:
                                System.out.print("Codigo a buscar: ");
                                int buscar = sc.nextInt();
                                if(buscar !=tam){
                                   System.out.print("No se ha encontrado ese codigo: ");
                            }
                                else{
                                boolean numero = true;
                                if(tam == buscar){
                                System.out.print("El cliente se ha encontado: ");
                                    }
                                }
                                break;
                                
                            case 2:
                                System.out.print("Ingresa el nombre a buscar: ");
                                String buscador = bf.readLine();
                                
                        {      
                            String nombre = null;
                            if(buscador == null ? nombre != null : !buscador.equals(nombre)){
                                System.out.print("El cliente se ha encontado: ");
                            }
                            else{
                                if(nombre == null ? buscador == null : nombre.equals(buscador)){
                                    System.out.print("No se ha encontado ese nombre: ");
                                }
                            }
                        
                        }
                                
                            case 0:
                                System.out.println("Gracias por usar el sub menu");
                               
                        }
                    }
                     break;
                case 0:
                    System.out.println("Gracias por crearme Dios supremo");
                    break;
            }
        }
     
    }

    private static boolean nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

