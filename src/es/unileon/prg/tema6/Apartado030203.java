package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "do-while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion do-while";
	}

	/**
	 * Instruccion do-while - Ejercicio1.
	 *
	 * Programar el codigo que ofrezca un menu de opciones al usuario  hasta que seleccione la opcion salir.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int opcion;

		do{

			System.out.println("Seleccione una opcion:");
			System.out.println("[1]- Bienvenida");
			System.out.println("[2]- Despedida");
			System.out.println("[3]- Salir");
			opcion = Teclado.readInteger();
			System.out.println("Opcion selecionada ["+opcion+"]");
			if (opcion>3 || opcion <1) {
				System.out.println("FATAL ERROR: Opcion not valid");
			}
			System.out.println();

		}while(opcion != 3);
		System.out.println("Hasta la proxima");
       		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual a cero 
	 * o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 * 
	 * Similar al  ejercicio02() de la clase Apartado030202 pero empleando la sentencia do-while).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int numDado = 0;
		int numDadoAntes = 0;

		do{
			numDadoAntes = numDado;

			System.out.println("Introduzca un numero");
			numDado = Teclado.readInteger();

		}while((numDadoAntes != numDado) && (numDado!=0));
		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio3.
	 *
	 * Programar el codigo que lea la base y la altura de un numero indeterminado de rectangulos y
	 * cree los correspondientes objetos de tipo Rectangulo. Para cada rectangulo el programa mostrara 
	 * por pantalla su area y si es un cuadrado o un rectangulo. El programa terminara cuando alguno 
	 * de los lados del cuadrilatero sea menor o igual que  0.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int base;
		int altura;
		Rectangulo rectangulo;
		do{

			System.out.println("Introduzca la base del rectangulo");
			base = Teclado.readInteger();
			System.out.println("Introduzca la altura del rectangulo");
			altura = Teclado.readInteger();
			rectangulo = new Rectangulo(base, altura);
			System.out.println(rectangulo.toString());
			System.out.println();
		}while(base > 0 && altura > 0);
		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio4.
	 *
	 * Programar el codigo que dado un numero entero introducido por teclado indique si es o no perfecto.
	 * Un numero entero es perfecto si es igual a la suma de los sus divisores positivos menores que el.
	 * Ejemplos
	 * <ul>
	 * <li>6 es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el  son 1, 2, 3  y
	 * <li> 1 + 2 + 3 = 6;
	 * </ul>
	 * <li> 8 no es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el son 1, 2,4  y
	 * <li> 1+2+4  !=  8
	 * </ul>
	 * </ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int numero;
		int divisor;
		int sumaDivisores = 0;
		int contador = 1;
		System.out.println("Introduzca un numero");
		numero = Teclado.readInteger();

		do{
			divisor =  contador;
			if ( (numero % divisor) == 0 ){
				sumaDivisores = sumaDivisores + divisor;
			}
			contador++;
		}while(contador < numero);
		if (sumaDivisores == numero){
			System.out.println("El "+numero + " es un numero perfecto");
		}
		else{
			System.out.println("El "+numero + " no es un numero perfecto");
		}
		// Fin modificacion
	}
}
