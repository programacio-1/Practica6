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
	public String numeroDeSoluciones(){
		double x1=0;
		double x2=0;
		int numeroSoluciones=0;
		StringBuffer soluciones=new StringBuffer();
		if(((Math.pow(_b,2))-(4*_a*_c))>0){
			x1=(((-_b)+(Math.sqrt((Math.pow(_b,2)-(4*_a*_c))))/(2*_a)));
			x2=(((-_b)-(Math.sqrt((Math.pow(_b,2)-(4*_a*_c))))/(2*_a)));
			if (x1==x2){
				numeroSoluciones=1;
				soluciones.append("La ecuacion tiene " + numeroSoluciones + "solucion que es " + x1);
			}
			else{
				numeroSoluciones=2;
				soluciones.append("La ecuacion tiene " + numeroSoluciones + "soluciones que son " + x1 + "y" + x2);
			}
		}
		else{
			numeroSoluciones=0;
			soluciones.append(" La ecuacion no tiene soluciones");
		}
		return soluciones.toString();
	}

	/**
	* Muestra el numero de soluciones y las soluciones
	*
	*/
	public String toString(){
		StringBuffer salida=new StringBuffer();
		
		salida.append("La ecuacion "+_a+"*x²"+_b+"*x"+_c+" = 0");
		salida.append(numeroDeSoluciones());

		return salida.toString();
	}
}

