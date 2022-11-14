package ejecutar;

import clases.*;
import interfaces.Series;

public class pri_dos_c {

	public static void main(String[] args) {
		Series ob = new DeDos();
		DeTres dT = new DeTres();
		imprimir(ob,3,1);
		imprimir(dT,3,2);
		
		ob.reiniciar();
		dT.reiniciar();
        System.out.println("\nReiniciando");
		imprimir(ob,3,1);
		imprimir(dT,3,2);
        
        ob.setComenzar(100);
        dT.setComenzar(100);
        System.out.println("\nIniciando en 100");
		imprimir(ob,3,1);
		imprimir(dT,3,2);
        
	}
	
	private static void imprimir(Series pOb, int pRonda, int pTipo) {
		String mtipo="";
		if (pTipo==1)
			mtipo = "DeDos";
		else
			mtipo = "DeTres";		

		
		for (int i=0;i<pRonda;i++)
            System.out.println("Siguiente valor de " + mtipo + " es: "+pOb.getSiguiente());
	}

}
