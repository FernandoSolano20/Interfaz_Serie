package clases;

import interfaces.Series;

public class DeTres implements Series{
    int iniciar;
    int valor;
    int anterior; //Variable solo para la clase
    
    public DeTres(){
        iniciar	 =	0;
        valor	 =	0;
        anterior =	valor;
    }
    
    public int getSiguiente() {
        valor	+=	3;
        return valor;
    }
    
    public void reiniciar() {
        valor	 =	iniciar;
        anterior =	valor - 3;
    }
    
    public void setComenzar(int x) {
        iniciar	=	x;
        valor	=	x;
        anterior =	x - 3;
    }
    
  //Añadiendo un método que no está definido en Series
    int getAnterior(){
        return anterior;
    }
}