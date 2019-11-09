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
public class NodoCola {
    
    private NodoArbol dato;
    private NodoCola siguiente;

    public NodoCola(NodoArbol dato, NodoCola siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoArbol getDato() {
        return dato;
    }

    public void setDato(NodoArbol dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
