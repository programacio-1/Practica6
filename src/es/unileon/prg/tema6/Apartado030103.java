package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		System.out.println("Introduce una nota");
		int nota;
		nota=Teclado.readInteger();
		switch (nota){
			case 1: //next
			case 2: //next
			case 3: //next
			case 4: 
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7: //next
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula");
				break;
			default:
				System.out.println("Nota no valida");
		}
        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		System.out.println("Introduce un digito");
		int numero;
		numero=Teclado.readInteger();
		switch (numero){
			case 0: //next
			case 6: //next
			case 9:
				System.out.println("1 anillo");
				break;
			case 8:
				System.out.println("2 anillos");
				break;
			case 1: //next
			case 2: //next
			case 3: //next
			case 4: //next
			case 5: //next
			case 7:
				System.out.println("0 anillos");
				break;
			default:
				System.out.println("Digito no valido");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		System.out.println("Introduce un numero:");
		int Num1=Teclado.readInteger();
		System.out.println("Introduce otro numero:");
		int Num2=Teclado.readInteger();

		System.out.println("1 - Sumar: Se mostrara por pantalla la suma de los numeros");
		System.out.println("2 - Multiplicar: Se mostrara por pantalla la multiplicacion de los dos numeros");
		System.out.println("3 - Divisores: Se mostrara por pantalla: si el primero es divisor del segundo, si el segundo es divisor del primero o si ninguno es divisor del otro");

		int opcion=Teclado.readInteger();
		switch (opcion){
			case 1:
				int suma=0;
				suma=Num1+Num2;
				System.out.println("La suma es: " + suma);
				break;
			case 2:
				int multi=0;
				multi=Num1*Num2;
				System.out.println("La multiplicacion es: " + multi);
				break;
			case 3:
				if ((Num1%Num2==0) || (Num2%Num1==0)){
					if (Num2%Num1==0){
						System.out.println("El primer numero es divisor del segundo");
					}
					if (Num1%Num2==0){
						System.out.println("El segundo numero es divisor del primero");
					}
				}
				else{
					System.out.println("No son divisores entre si");
				}
			default:
				System.out.println("Opcion no valida");
		}
				
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		System.out.println("Introduce una cadena de caracteres");
		String cadena=Teclado.readString();
		char caracter=cadena.charAt(0);
		boolean vocal;
		int comparador=0;
		if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u' || caracter=='A' || caracter=='E' || caracter=='I' || caracter=='O' || caracter=='U'){
			comparador=1;
		}
		if (comparador==1){
			vocal=true;
		}
		else{
			vocal=false;
		}
		boolean minus=Character.isLowerCase(caracter);
		int opcion=0;
		if (vocal==true && minus==true){
			opcion=1;
		}
		if (vocal==true && minus==false){
			opcion=2;
		}
		switch (opcion){
			case 1: 
				System.out.println("El primer caracter es una vocal minuscula");
				break;
			case 2:
				System.out.println("El primer caracter es una vocal mayuscula");
				break;
			default:
				System.out.println("El primer caracter no es una vocal");
		}
		// Fin modificacion
	}
}
