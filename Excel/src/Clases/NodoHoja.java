
package Clases;

//Nodos dobles de la lista de hojas (libro), cada uno contiene la tabla inicial de 200 celdas y las funciones.

public class NodoHoja {
    public String nombre = "HOJA";
    public ListaSimple listaprincipal = new ListaSimple();
    public ListaSimple listaNodos = new ListaSimple();
    Pila pila = new Pila();

    private int columnas = 10;
    private int filas = 20;
    private NodoHoja proximo;
    private NodoHoja anterior;
    
    
    public NodoHoja (){
       System.out.println("            >>>>>>>>>>>>>>>>>>>>>>> NUEVA HOJA CREADA <<<<<<<<<<<<<<<<<<<<<<           ");
        FilaLista();
    }
    
    public void FilaLista (){                       //Fila inicial: lista(10nodos), cada nodo con una lista(20nodos).
        for(int i = 0; i<20;i++){
        listaprincipal.insertarPrimero(NodoLista());
        }
    }
        
    public NodoSimple NodoLista (){           //Columna: nodo con lista(20nodos), componen la lista de 10 nodos.
        NodoSimple nodo;
        nodo = new NodoSimple(ListaNodo());
        return nodo;
    }
    
    public ListaSimple ListaNodo (){              //Lista de 20 nodos.
        ListaSimple listaNodo;
        listaNodo = new ListaSimple();
        for(int i=0; i<columnas;i++){
            listaNodo.insertarPrimero(CrearNodo());
        }
        listaNodos = listaNodo;
        return listaNodo;
    }
    
    public NodoSimple CrearNodo (){         //Nodo que contiene una pila, componen la lista de 20 nodos.
        NodoSimple nuevo = new NodoSimple();
        return nuevo;
    }  
        
    public void insertarColumna(){
        columnas = columnas +1;
        NodoSimple aux = listaprincipal.getCabeza();
        while (aux!= null){
            aux.getLista().insertarFinal(CrearNodo());
            aux = aux.getProximo();
        }
       /*NodoSimple nuevo = new NodoSimple(ListaNodo());
       listaprincipal.insertarFinal(nuevo);*/
       }
    
    public void eliminarColumna (){
        columnas = columnas-1;
        NodoSimple aux = listaprincipal.getCabeza();
        while (aux!= null){
            aux.getLista().eliminarFinal();
            aux = aux.getProximo();
        }
        
    }
    
    
    public void insertarFila (){
        filas = filas+1;
        listaprincipal.insertarFinal(NodoLista());

        
    }
    
 
    public void eliminarFila(){
        filas = filas-1;
        listaprincipal.eliminarFinal();
    }
    
    
    public void nuevaCelda(int x){
        NodoSimple nuevo = new NodoSimple();
        NodoSimple aux1 = listaprincipal.getCabeza();
        
        for (int i = 1;i<x+1;i++){
            aux1 = aux1.getProximo();
        }
        aux1.getLista().insertarFinal(nuevo);      
        imprimirHoja();
    }
    
    public void eliminarCelda (int x){
        NodoSimple aux1 = listaprincipal.getCabeza();
        
        for (int i = 1;i<x+1;i++){
            aux1 = aux1.getProximo();
        }
        aux1.getLista().eliminarFinal();      
        imprimirHoja();
        
    }
    
    public void insertarData (int x, int y, String data){
        //NodoSimple nuevo = new NodoSimple(data);
        NodoSimple aux1 = listaprincipal.getCabeza();
      
        
        for(int i = 1; i < y+1 ; i++){
            aux1 = aux1.getProximo();
        }
        NodoSimple aux2 = aux1.getLista().getCabeza();
          
            for(int i = 1; i < x; i++){
              aux2 = aux2.getProximo();
            }            
             aux2.setDatoTexto(data);
             
             NodoSimple nuevo = new NodoSimple(x,y);
             pila.push(nuevo);
             
    }
    
    
    public void deshacer( ){
        
       NodoSimple celda = pila.pop();
       int x = celda.getX();
       int y = celda.getY();
        NodoSimple aux1 = listaprincipal.getCabeza();
      
        for(int i = 1; i < y+1 ; i++){
            aux1 = aux1.getProximo();
        }
        NodoSimple aux2 = aux1.getLista().getCabeza();
          
            for(int i = 1; i < x; i++){
              aux2 = aux2.getProximo();
            }            
             aux2.setDatoTexto(null);
       
       imprimirHoja();
    }
    
    
    public void pegar (int x, int y, String data){
                NodoSimple aux1 = listaprincipal.getCabeza();
      
        
        for(int i = 1; i < y+1 ; i++){
            aux1 = aux1.getProximo();
        }
        NodoSimple aux2 = aux1.getLista().getCabeza();
          
            for(int i = 1; i < x; i++){
              aux2 = aux2.getProximo();
            }            
             aux2.setDatoTexto(data);
        
             imprimirHoja();
    }

/*    
    public void buscar (String data){
               NodoSimple aux1 = listaprincipal.getCabeza();
               NodoSimple aux2 = aux1.getLista().getCabeza();
               //NodoSimple posicion;
               int c =0;
               int y = 0;
               
            for(int i =0; i<listaprincipal.contar(); i++){
               y++;
                while (aux2 != null){
                    c++;
                    if (aux2.getdatoTexto().equals(data)){
                        //NodoSimple posicion = new NodoSimple(c,y);
                        System.out.println(" ");
                        System.out.println("Se encontró la data en la celda "+y+", "+c);
                        System.out.println(" ");
                        break;
                        
                    }
                    else
                    aux2 = aux2.getProximo();
                }

            }
    }*/

 
    
    public ListaSimple getListaprincipal() {
        return listaprincipal;
    }

    public void setListaprincipal(ListaSimple listaprincipal) {
        this.listaprincipal = listaprincipal;
    }

    public ListaSimple getListaNodos() {
        return listaNodos;
    }

    public void setListaNodos(ListaSimple listaNodos) {
        this.listaNodos = listaNodos;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }
            
    public void mostrar(){
        System.out.println("[]");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoHoja getProximo() {
        return proximo;
    }

    public void setProximo(NodoHoja proximo) {
        this.proximo = proximo;
    }

    public NodoHoja getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoHoja anterior) {
        this.anterior = anterior;
    }
    
   public void imprimirHoja(){
       
       System.out.println("                >>>>>>>>>>>>>>>>>>>>>>> "+nombre+" <<<<<<<<<<<<<<<<<<<<<<           ");
       System.out.println(" ");
       
       NodoSimple aux1 = listaprincipal.getCabeza();
     
            while(aux1 != null){
               
                ListaSimple l1 = aux1.getLista();
                l1.mostrar();
                System.out.println("  ");
                aux1 = aux1.getProximo();
                
            }
           
    }


}

