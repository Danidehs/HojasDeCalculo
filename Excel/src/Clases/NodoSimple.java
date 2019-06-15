
package Clases;

import java.io.Serializable;


public class NodoSimple{
    
    private String datoTexto;
    private ListaSimple lista;
    private NodoSimple proximo;
    private int x;
    private int y;
    
    public NodoSimple(){
        
    }

    public NodoSimple (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public NodoSimple(ListaSimple lista){
        this.lista = lista;

        proximo=null;
    }
    public NodoSimple(String datoTexto){
        this.datoTexto=datoTexto;
        proximo=null;
    }

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }
    

    public void setDatoTexto(String datoTexto) {
        this.datoTexto = datoTexto;
    }

    public String getdatoTexto() {
        return datoTexto;
    }

    public void setdatoTexto(String datoTexto) {
        this.datoTexto = datoTexto;
    }

    public NodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(NodoSimple proximo) {
        this.proximo = proximo;
    }
    
    
    
    public void mostrar(NodoSimple aux){
        if (aux.getdatoTexto() == null)
            System.out.print(" [ ] ");
        else
        System.out.print(" ["+aux.getdatoTexto()+"] ");
    }
    
}
