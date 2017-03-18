/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class CargarPalabras {
    
    private ArrayList <Info> lista;
    private File fich;
    private PrintWriter escribir = null;
    private Scanner scan;
    
    public CargarPalabras(){
        lista = new ArrayList <Info>();
    }
    
    public void añadirPalabra(){
        Info obj = new Info(lista.size()+1, JOptionPane.showInputDialog("palabra"));
        lista.add(obj);
        Collections.sort(lista);
    }
    
    public void escribir(){
        try{
            fich = new File("bolet21.txt");
            escribir = new PrintWriter(fich);
            for(int i = 0; i<lista.size(); i++){
                escribir.println((i+1)+","+lista.get(i).getPalabra());
            }
        }catch(Exception ex){
            System.out.println(ex + "file not found");
        }finally{
            escribir.close();
        }
    }
    
    public void mostrar(){
        for(Info inf:lista){
            System.out.println(inf);
        }
    }
    
    public void leer(){
        lista = new ArrayList <Info>();
        String[]aux;
        try{
            scan = new Scanner(new File("bolet21.txt"));
            while(scan.hasNextLine()){
                aux = scan.nextLine().split(",");
                Info inf = new Info(Integer.parseInt(aux[0]), aux[1]);
                lista.add(inf);
            }
        }catch(Exception ex){
            System.out.println(ex + " file not found");
        }finally{
            scan.close();
        }
    }
}
