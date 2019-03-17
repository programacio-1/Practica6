package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030202 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion while";
	}

	/**
	 * Instruccion while - Ejercicio1.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor 
	 * y el menor de todos ellos (similar al ejercicio05() de la clase Apartado030201 pero 
	 * utilizando la sentencia while)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int mayor=0;
		int menor=0;
		int cuenta=0;
		int num=0;
		while(cuenta!=10){
			System.out.println("Introduzca un numero");
			num=Teclado.readInteger();
			if(cuenta==1){
				mayor=num;
				menor=num;
			}
			if(num>mayor){
				mayor=num;
			}
			if(num<menor){
				menor=num;
			}
			cuenta++;
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
					
        // Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual 
	 * a cero  o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int num=7;
		int numAtras=0;
		while(num!=0 && numAtras!=num){
			numAtras=num;
			System.out.println("Introduzca un numero");	
			num=Teclado.readInteger();
		}
		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio3.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre
	 * dos numeros enteros introducidos por el usuario.
	 * 
	 * Nota: similar al ejercicio06() de la clase Apartado030201 pero utilizando la sentencia while
	 * y sin suponer que el primer numero es siempre par)
	 * 
	 * Nota : Los numeros enteros se manejaran como objetos la clase NumeroEntero
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		NumeroEntero pares=new NumeroEntero();
		NumeroEntero impares=new NumeroEntero();
		NumeroEntero n1=new NumeroEntero();
		NumeroEntero n2=new NumeroEntero();
		NumeroEntero cuenta=new NumeroEntero();

		System.out.println("Introduzca el primer numero");
		n1.setValor(Teclado.readInteger());
		System.out.println("Introduzca el segundo numero");
		n2.setValor(Teclado.readInteger());
		cuenta=n1;
		if(cuenta.getValor()>n2.getValor()){
			cuenta.decrementar();
		}
		else{
			cuenta.incrementar();
		}
		while(cuenta.getValor()!=n2.getValor()){
			if(cuenta.getValor()%2==0){
				pares=pares.suma(cuenta);
			}
			else{
				impares=impares.suma(cuenta);
			}
			if(cuenta.getValor()>n2.getValor()){
				cuenta.decrementar();
			}
			else{
				cuenta.incrementar();
			}
		}
		System.out.println("La suma de los numeros pares es: " + pares);
		System.out.println("La suma de los numeros impares es: " + impares);
		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio4.
	 *
	 * Programar el codigo  que calcule la media, de una serie de numeros introducidos por teclado. 
	 * La serie acaba cuando se introduce el tercer 5. Los 5 introducidos se procesaran como numeros 
	 * de la serie, es decir, intervendran a la hora de calcular los valores pedidos.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		float num=0;
		int numCincos=0;
		int contador=0;
		float suma=0;
		float media=0;

		while(numCincos!=3){
			contador++;
			System.out.println("Introduzca un numero");
			num=Teclado.readInteger();
			suma = suma + num;
			if (num==5){
				numCincos++;
			}
		}
		media=suma/contador;
		System.out.println("La media de es: " + media);
		
		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio5.
	 *
	 * Modificar la clase NumeroEntero definiendo e implementando los siguientes metodos
	 * <ul>
	 * <li> int numeroDigitos():  retornara el numero de digitos del  numero.
	 * <li>	int inverso(): retornara el inverso del numero (Ej.: 23 -> 32)
	 * <li>	booleam  esCapicua(): retorna si el numero es o no capicua.
	 * </ul>
	 * 
	 * Probar los nuevos metodos de la clase numero en el metodo ejercicio05.
	 *
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion
		NumeroEntero num=new NumeroEntero();
		System.out.println("Introduzca un numero");
		num.setValor(Teclado.readInteger());
		System.out.println("Numero de digitos: " + num.numeroDigitos());
		System.out.println("Inverso del numero: " + num.inverso());
		System.out.println("Es capicua: " + num.esCapicua());
	        // Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio6.
	 * 
	 * Teniendo en cuenta el siguiente diagrama de clases del enunciado de la practica
	 * 
	 * <ul>
	 * <li> La clase Partido representa partidos de tenis en los que intervienen dos jugadores
	 * <li> Cada jugador tiene un nombre y una puntuacion en el ranking de la ATP
	 * </ul>
	 * 
	 * Se pide:
	 * 
	 * <ul>
	 * <li>	Consultar el codigo de las clase Partido y Jugador
	 * <li>	Implementar el metodo jugar de la clase Partido
	 * <li>	Simulara que se juega el partido entre los dos jugadores generando el ganador de forma aleatoria
	 * <li>	El jugador con mayor puntuacion en la ATP tendra mayor posibilidad de ganar.
	 * <li> El ganador del partido aumentara en 1 punto su puntuacion en el ranking.
	 * <li>	Nota 1:
	 * <ul>	Una  forma de generar el ganador puede ser:
	 * <li>	
	 * <li>	resultado1= Math.random() * puntos_jugador1;
	 * <li> resultado2= Math.random() * puntos_jugador2;
	 * <li>  el que tenga mayor resultado ganara el partido
	 * </ul>
	 * <li>Nota 2:
	 * <ul>
	 * <li>Hay que tener en cuenta que el resultado puede ser empate, en este caso se volveran a generar resultados hasta que exista un ganador.
	 * <li>
	 * </ul>
	 * </ul>
	 *
	 */
	
	public void ejercicio06() {
		cabecera("06", "");
		
		Jugador j1=new Jugador("Federer",5);
        	Jugador j2=new Jugador("Nadal",4);
        
        
		System.out.println("Los Jugadores del Partido son " + j1.getNombre() + " y "+j2.getNombre());
        
	        Partido partido=new Partido(j1,j2);
	        partido.jugar();
	        
	        System.out.println("El ganador es: "+ 	partido.ganador().getNombre());
	}
}
