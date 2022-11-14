package ejecutar;

import clases.DeDos;

public class pri_uno {

	public static void main(String[] args) {
		DeDos ob = new DeDos();
		imprimir(ob,3);
		
		ob.reiniciar();
        System.out.println("\nReiniciando");
        imprimir(ob,4);
        
        ob.setComenzar(100);
        System.out.println("\nIniciando en 100");
        imprimir(ob,4);
        
	}
	
	private static void imprimir(DeDos pOb, int pRonda) {

		for (int i=0;i<pRonda;i++)
            System.out.println("Siguiente valor es: "+pOb.getSiguiente());
	}

}
