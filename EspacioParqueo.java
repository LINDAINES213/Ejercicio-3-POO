/**
 * Esta clase sirve para ingresar los datos sobre el espacio del parqueo a registrar
 * @author: Linda Ines Jimenez Vides
 * @version: 5 - septiembre - 2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EspacioParqueo {
    String caracteristicas;
    double ancho;
    double largo;
    double altura;

    Scanner sn = new Scanner(System.in);

    /**
     * Metodo que pide el ancho del parqueo a registrar
     * @return ancho
     */
    public double getAncho(){
        System.out.println("Ancho: ");
        ancho = sn.nextDouble();
        return ancho;  
    }

    /**
     * Metodo que pide el largo del parqueo a registrar
     * @return largo
     */
    public double getLargo(){
        System.out.println("Largo: ");
        largo = sn.nextDouble();
        return largo;  
    }

    /**
     * Metodo que pide la altura del parqueo a registrar
     * @return altura
     */
    public double getAltura(){
        System.out.println("Altura: ");
        altura = sn.nextDouble();
        return altura;  
    }

    /**
     * Metodo que pide las caracteristicas del parqueo a registrar
     * @return caracteristicas
     */
    public String getCaracteristicas(){
        System.out.println("Caracteristicas: ");
        caracteristicas = sn.nextLine();
        return caracteristicas;
    }

    /**
     * Metodo que crea un arreglo dinamico de los datos recien ingresados
     * @return parqueo1
     */
    public void Parqueo(){
        ArrayList parqueo1 = new ArrayList();
        parqueo1.add(ancho);
        parqueo1.add(largo);
        parqueo1.add(altura);
        parqueo1.add(caracteristicas);
        System.out.println("Caracteristicas del Parqueo: " +parqueo1);
        return;
    }

}