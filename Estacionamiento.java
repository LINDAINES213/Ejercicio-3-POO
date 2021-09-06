/**
 * Esta clase sirve para ingresar informacion sobre el local del estacionamiento y el uso de metodos para ingresar el resto de la informacion de autos y espacios de parqueo
 * @author: Linda Ines Jimenez Vides
 * @version: 5 - septiembre - 2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamiento {
    String nombre;
    String dirección;
    double precio;
    Scanner sn = new Scanner(System.in);

    /**
     * Metodo que pide el nombre del parqueo
     * @return nombre
     */
    public String getNombre(){
        System.out.println("Nombre: ");
        nombre = sn.nextLine();
        return nombre;
    }

    /**
     * Metodo que pide la direccion del parqueo
     * @return direccion
     */
    public String getDireccion(){
        System.out.println("Direccion: ");
        dirección = sn.nextLine();
        return dirección;
    }

    /**
     * Metodo que pide el precio del parqueo por hora
     * @return precio
     */
    public double getPrecio(){
        System.out.println("Precio: ");
        precio = sn.nextDouble();
        return precio;
    }

    /**
     * Metodo que crea un arreglo dinamico de los datos recien ingresados
     * @return info
     */
    public void Info(){
        ArrayList info = new ArrayList();
        info.add(nombre);
        info.add(dirección);
        info.add(precio);
        System.out.println("Caracteristicas del Local del Parqueo: " +info);
        return;
    }

}

