/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamiento del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 5 - septiembre - 2021
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class Controlador {
    public static void main(String[] args){
        
        //Creacion de objeto tipo vista
        Vista vista = new Vista();
        int opcion = 0;

        // If del menu impreso desde la clase vista donde se colocan los metodos para llamar a otroa previamente programados para que funcione el programa completo
        while (opcion != 5){
            
            opcion = vista.menuOp();

            if (opcion == 1){

                vista.nuevoAuto();

            } else if (opcion == 2){

                vista.nuevoParqueo();

            } else if (opcion == 3){
                
                vista.datosInfo();
                
            } else if (opcion == 4){

                vista.datosAuto();
                vista.datosParqueo();
                vista.imprimirinfo();
                
            } else if (opcion == 5){
                vista.Salir();
            }
        }
    }
}
