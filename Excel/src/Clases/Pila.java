
package Clases;


public class Pila extends ListaSimple {
    
    private String dato;
    
    public Pila(){
        super();
        dato = null;
    }
    
    public Pila (String dato){
        super();
        this.dato = dato;
    }
    // Metodo donde se inserta el nodo nuevo en el tope de la pila
    public void push(NodoSimple nuevo){
        insertarPrimero(nuevo);
    }
    
    // Metodo donde se elimina el nodo que esta en el tope de la pila
    public NodoSimple pop(){
        return eliminarPrimero();
    }
    
    // Metodo donde se obtiene los datos del tope de la pila
    public String peek(){
        return getCabeza().getdatoTexto();
    }
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
    
    public void insertarDato (String dato){
        
        
    }
    
    
}