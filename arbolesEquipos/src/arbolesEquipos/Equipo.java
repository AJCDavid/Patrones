/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesEquipos;

import java.util.Random;

/**
 *
 * @author user
 */
public class Equipo {
      private String nombre;
    private int goles;
    private int nVictorias;

    public Equipo(String nombre) {
        this.nombre = nombre;
        goles=generarGoles();
    }
    
    public int generarGoles(){
        Random gA=new Random();
        int gol=gA.nextInt();
        gol=gol<0?gol*(-1):gol;
        gol=gol%10;
        goles=gol;
        return gol;
    
    }

    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    public int getnVictorias() {
        return nVictorias;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", goles=" + goles;
    }
    
    
}
