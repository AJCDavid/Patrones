/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesEquipos;

/**
 *
 * @author user
 */
public class NodoArbol {
    private Equipo datos;
    private NodoArbol iz;
    private NodoArbol der;

    public NodoArbol(Equipo datos) {
        this.datos = datos;
         iz = null;
         der=null;
    }
     
    public NodoArbol(Equipo datos, NodoArbol iz, NodoArbol der) {
        this.datos = datos;
        this.iz = iz;
        this.der = der;
    }

    public Equipo getDatos() {
        return datos;
    }

    public void setDatos(Equipo datos) {
        this.datos = datos;
    }

    public NodoArbol getIz() {
        return iz;
    }

    public void setIz(NodoArbol iz) {
        this.iz = iz;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    } 
}
