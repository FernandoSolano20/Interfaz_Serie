package clases;

import interfaces.Series;

public class DeDos implements Series {
    int iniciar;
    int valor;
    
    public DeDos(){
        iniciar=0;
        valor=0;
    }
    
    public int getSiguiente() {
        valor+=2;
        return valor;
    }
    
    public void reiniciar() {
        valor=iniciar;
    }
    
    public void setComenzar(int x) {
        iniciar=x;
        valor=x;
    }
}
