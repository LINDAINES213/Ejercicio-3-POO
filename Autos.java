/**
 * Esta clase sirve para el ingreso de los datos del auto
 * @author: Linda Ines Jimenez Vides
 * @version: 5 - septiembre - 2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Autos{
    String placa;
    String marca;
    String modelo;
    String horaentrada;
    String horasalida;

    Scanner sn = new Scanner(System.in);

    /**
     * Metodo que pide la placa del auto
     * @return placa
     */
    public String getPlaca(){
        System.out.println("Placa: ");
        placa = sn.nextLine();
        return placa;
    }

    /**
     * Metodo que pide la marca del auto
     * @return marca
     */
    public String getMarca(){
        System.out.println("Marca: ");
        marca = sn.nextLine();
        return marca;
    }
    
    /**
     * Metodo que pide el modelo (año) del auto
     * @return modelo
     */
    public String getModelo(){
        System.out.println("Modelo: ");
        modelo = sn.nextLine();
        return modelo;
    }

    /**
     * Metodo que pide la hora de entrada del auto
     * @return horaentrada
     */
    public String getHoraentrada(){
        System.out.println("Hora de Entrada: ");
        horaentrada = sn.nextLine();
        return horaentrada;
    }

    /**
     * Metodo que pide la hora de salida del auto
     * @return horasalida
     */
    public String getHorasalida(){
        System.out.println("Hora de Salida: ");
        horasalida = sn.nextLine();
        return horasalida;
    }

    /**
     * Metodo que crea un arreglo dinamico de los datos recien ingresados
     * @return carro1
     */
    public void Automovil(Autos auto1){
        ArrayList carro1 = new ArrayList();
        carro1.add(placa);
        carro1.add(marca);
        carro1.add(modelo);
        carro1.add(horaentrada);
        carro1.add(horasalida);
        System.out.println("Caracteristicas del Carro: " +carro1);
        return;
    }

    public void Automovil2(Autos auto2){
        ArrayList carro2 = new ArrayList();
        carro2.add(placa);
        carro2.add(marca);
        carro2.add(modelo);
        carro2.add(horaentrada);
        carro2.add(horasalida);
        System.out.println("Caracteristicas del Carro: " +carro2);
        return;
    }
}