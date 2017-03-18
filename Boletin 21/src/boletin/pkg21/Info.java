/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Info implements Comparable{
    private int numero;
    private String palabra;

    public Info() {
    }

    public Info(int numero, String palabra) {
        this.numero = numero;
        this.palabra = palabra;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalabra() {
        return palabra;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.numero;
        hash = 71 * hash + Objects.hashCode(this.palabra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Info other = (Info) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Info{" + "numero=" + numero + ", palabra=" + palabra + '}';
    }

    @Override
    public int compareTo(Object o) {
        Info inf = (Info) o;
        if(palabra.compareToIgnoreCase(inf.palabra)==0){
            return 0;
        }else if(palabra.compareToIgnoreCase(inf.palabra)>0){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
