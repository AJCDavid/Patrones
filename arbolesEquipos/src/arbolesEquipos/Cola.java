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
public class Cola {
    
    private NodoCola inicio;
    private NodoCola fin;
    
    public Cola(){
        
        inicio=fin=null;
    }
    
    public boolean esVacia(){
        
        return inicio==null && fin==null;
    }
    
    public void encolar(NodoArbol dato){
        NodoCola nuevo=new NodoCola(dato, null);
        if(esVacia()){
            
            inicio=fin=nuevo;
        }else{
            
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    
    public NodoArbol desencolar(){
        
        if(esVacia()){
            
            return null;
        }else{
            
            NodoCola aux=inicio;
            inicio=inicio.getSiguiente();
            aux.setSiguiente(null);
            if(inicio==null){
                
                fin=null;
            }
            return aux.getDato();
        }
    }
    
    private void imprimirR(NodoCola actual){
        
        if(actual!=null){
            
            System.out.println(""+actual.getDato().getDatos());
            imprimirR(actual.getSiguiente());
        }
    }
    
    public void imprimirR(){
        
        imprimirR(inicio);
    }
    
       public void imprimir() {
        NodoCola aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato().getDatos());
            aux = aux.getSiguiente();
        }

    } 
}
