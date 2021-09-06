/**
 * Esta clase es la vista del programa, donde imprime toda la informacion requerida
 * @author: Linda Ines Jimenez Vides
 * @version: 5 - septiembre - 2021
 */

import java.util.Scanner;

public class Vista {

    //Creacion de contructor de la clase scanner
    Scanner sn = new Scanner(System.in);
    //Creacion de objeto tipo estacionamiento
    Estacionamiento estacionamiento = new Estacionamiento();
    //Objetos tipo espacio
    public EspacioParqueo espacio1 = new EspacioParqueo();
    public Autos auto1 = new Autos();
    public Autos auto2 = new Autos();

    //Vista del menu principal
    public int menuOp(){

        int opcion;

        String menu = "\n¿Que opcion desea ejecutar?\n" +
                            "1. Nuevo Carro\n" +
                            "2. Nuevo Estacionamiento\n" +
                            "3. Informacion del Parqueo\n" +
                            "4. Imprimir datos\n" +
                            "5. Salir\n";

        System.out.println(menu);
        opcion =  sn.nextInt();

        return opcion;
    }

    //Impresion mensaje final
    public void Salir(){
        System.out.println("Gracias por su colaboración");
    }

    /**
     * Metodo que permite que el usuario ingrese informacion del estacionamiento a registrar
     */
    public void nuevoParqueo(){
        espacio1.getCaracteristicas();
        espacio1.getAncho();
        espacio1.getLargo();
        espacio1.getAltura();
    }

     /**
     * Metodo que imprime los datos que el usuario recien ingreso
     */
    public void datosParqueo(){
        espacio1.Parqueo();
    }

     /**
     * Metodo que permite que el usuario ingrese informacion del auto a registrar
     */
    public void nuevoAuto(){
            auto1.getPlaca();
            auto1.getMarca();
            auto1.getModelo();
            auto1.getHoraentrada();
            auto1.getHorasalida();
    }

    /**
     * Metodo que imprime los datos que el usuario recien ingreso
     */
    public void datosAuto(){
        auto1.Automovil(auto1);
        auto2.Automovil2(auto2);
    }
    
     /**
     * Metodo que permite que el usuario ingrese informacion del local de su parqueo
     */
    public void datosInfo(){
        estacionamiento.getNombre();
        estacionamiento.getDireccion();
        estacionamiento.getPrecio();
    }

    public void imprimirinfo(){
        estacionamiento.Info();
    }

}
