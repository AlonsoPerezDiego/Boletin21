/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select;
        CargarPalabras obj = new CargarPalabras();
        obj.leer();
        do{
            select = Integer.parseInt(JOptionPane.showInputDialog("1: Añadir palabra.\n2: Escribir fichero (si no se hace se perderán todas las palabras añadidas desde la última escritura).\n3: Mostrar todas la palabras ordenadas.\n4: Cerrar programa."));
            switch(select){
                case 1: obj.añadirPalabra();
                        break;
                case 2: obj.escribir();
                        break;
                case 3: obj.mostrar();
                        break;
            }           
        }while(select<=3);
    }
    
}
