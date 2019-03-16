package es.unileon.prg.tema6;
/**
*
*@author scasaf00
*@version 1.0
*/
public class Ecuacion2Grado {
	/**
	* Primer coeficiente
	*
	*/
	private int _a;
	/**
	* Segundo coeficiente
	*
	*/
	private int _b;
	/**
	* Tercer coeficiente
	*
	*/
	private int _c;

	/**
	* Constructor de la clase. Crea una ecuacion sin coeficientes
	*/
	public Ecuacion2Grado(){
		_a=0;
		_b=0;
		_c=0;
	}

	/**
	* Constructor de la clase. Crea una ecuacion con los coeficientes introducidos
	*/
	public Ecuacion2Grado(int a, int b, int c){
		_a=a;
		_b=b;
		_c=c;
	}

	/**
	* Obtiene el primer coeficiente
	*
	*@return Retorna el primer coeficiente
	*/
	public int getA(){
		return _a;
	}

	/**
	* Obtiene el segundo coeficiente
	*
	*@return Retorna el segundo coeficiente
	*/
	public int getB(){
		return _b;
	}

	/**
	* Obtiene el termino independiente
	*
	*@return Retorna el terminno independente
	*/
	public int getC(){
		return _c;
	}

	/**
	* Calcula el numero de soluciones de la x
	*
	*@return Retorna el numero de soluciones
	*/
	public float numeroDeSoluciones(Ecuacion2Grado){
		float x1, x2;
		int numeroSoluciones=0;
		x1=((-(b)+(Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a)));
		x2=((-(b)-(Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a)));
		if (x1==x2){
			numeroSoluciones=1;
		}
		else{
			numeroSoluciones=2;
		}
		return numeroSoluciones;
	}

	/**
	* Muestra el numero de soluciones y las soluciones
	*
	*/
	public String toString(){
		StringBuffer salida=new StringBuffer();

		salida.append("Numero de soluciones " + numeroSoluciones);
		salida.append("Primera solucion: " + x1);
		salida.append("Segunda solucion: " + x2);

		return salida.toString();
	}
}

