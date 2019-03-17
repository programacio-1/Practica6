package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "for".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion for";
	}

	/**
	 * Instruccion for - Ejercicio1.
	 *
	 * Programar el codigo que muestre la suma de los numeros comprendidos del 1 al 100
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int suma=0;
		for (int i=1;i<=100;i++){
			suma = suma + i;
		}
		System.out.println("La suma de los 100 primeros numeros es: " + suma);	
			
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio2.
	 *
	 * Programar el codigo  que calcule la media de los numeros impares menores que 1000.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int suma=0;
		int media=0;
		int terminos=(999-1)/2;
		for (int i=1;i<1000;i=i+2){
			suma=suma+i;
		}
		media = suma/terminos;
		System.out.println("La media es: " + media);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio3.
	 *
	 * Programar el codigo que calcule la suma de todos los numeros comprendidos entre 
	 * dos numeros n1 y n2 que introduzca el usuario.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		System.out.println("Introduzca un numero");
		int n1=Teclado.readInteger();
		System.out.println("Introduzca otro numero");
		int n2=Teclado.readInteger();
		int suma=0;
		for (int i=n1;i<=n2;i++){
			suma=suma+i;
		}
		System.out.println("La suma de los numeros de ese intervalo es: " + suma);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio4.
	 *
	 * Programar el codigo  para que se lean 10 numeros enteros  del teclado y  se indique cuantas 
	 * veces aparece el 3, cuantas el 5 y cuantas el 7.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int numeros[]={0,0,0,0,0,0,0,0,0,0};
		for (int i=0;i<10;i++){
			System.out.println("Introduzca un numero");
			numeros[i]=Teclado.readInteger();
		}
		int numeroCinco=0;
		int numeroTres=0;
		int numeroSiete=0;
		for (int i=0;i<10;i++){
			if (numeros[i]==5){
				numeroCinco=numeroCinco+1;
			}
			if (numeros[i]==3){
				numeroTres=numeroTres+1;
			}
			if (numeros[i]==7){
				numeroSiete=numeroSiete+1;
			}
		}
		System.out.println("El numero tres (3) aparece " + numeroTres + " veces");
		System.out.println("El numero cinco (5) aparece " + numeroCinco + " veces");
		System.out.println("El numero siete (7) aparece " + numeroSiete + " veces");
		
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio5.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor y
	 * el menor de todos ellos.
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion
		int numeros[]={0,0,0,0,0,0,0,0,0,0};
		int numeroMayor=0;
		int numeroMenor=0;
		for (int i=0;i<10;i++){
			System.out.println("Introduzca un numero");
			numeros[i]=Teclado.readInteger();
		}
		for (int i=1;i<10;i++){
			if(numeros[i]>numeros[i-1]){
				numeroMayor=numeros[i];
			}
			if(numeros[i]<numeros[i-1]){
				numeroMenor=numeros[i];
			}
		}
		System.out.println("El numero mayor es " + numeroMayor);
		System.out.println("El numero menor es " + numeroMenor);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio6.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre dos numeros enteros 
	 * introducidos por el usuario. Suponer que el primer numero es siempre par. 
	 * <ul>
	 * <li>Nota 1: Solo se debe utilizar un unico  bucle for.
	 * </ul>
	 *
	 * [Falta enunciado]
	 */
	public void ejercicio06() {
		cabecera("06", "");

		// Inicio modificacion
		System.out.println("Introduce un numero");
		int n1=Teclado.readInteger();
		System.out.println("Introduce un numero");
		int n2=Teclado.readInteger();
		int mayor,menor;
		int sumaPar=0;
		int sumaImpar=0;
		int suma=0;
		if (n1<n2){
			mayor=n2;
			menor=n1;
		}
		else{
			mayor=n1;
			menor=n2;
		}
		for (int i=menor;i<=mayor;i++){
			suma=suma+i;
			if(i%2==0){
				sumaPar=sumaPar+i; 
			}
			else{
				sumaImpar=suma-sumaPar;
			}
		}
		System.out.println("La suma de los pares es: " + sumaPar);
		System.out.println("La suma de los impares es: " + sumaImpar);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio7.
	 *
	 * Consultar las clases String, StringBuffer y Character del API de java y escribir un codigo 
	 * que pida una cadena en minusculas y obtenga dos a partir de ella, una solo con vocales y 
	 * la otra el resto de caracteres. Posteriormente deberan convertir todos los caracteres de las 
	 * dos cadenas de minusculas a mayusculas. 
	 *
	 */
	public void ejercicio07() {
		cabecera("07", "");

		// Inicio modificacion
		String cadena;
		StringBuffer cadenaVocal =new StringBuffer();
		StringBuffer cadenaConsonante =new StringBuffer();

		System.out.println("Introduzca una cadena de caracteres en minusculas");
		cadena=Teclado.readString();
		cadena=cadena.toLowerCase();

		for (int i=0;i<cadena.length();i++){
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u'){
				cadenaVocal.append(cadena.charAt(i));
			}
			else{
				cadenaConsonante.append(cadena.charAt(i));
			}
		}
		System.out.println(cadenaVocal.toString().toUpperCase());
		System.out.println(cadenaConsonante.toString().toUpperCase());
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio8.
	 *
	 * Programar el codigo que  muestre la cadena con mayor numero de caracteres de un conjunto de 
	 * cadenas introducidas por el usuario (Si hay dos cadenas de igual tamanio se mostrara la primera 
	 * que se ha introducido). Previamente se le pedira al usuario el numero de cadenas que 
	 * desea introducir
	 * 
	 * <pre>Ejemplo de ejecucion
	 *  Introduce el numero de cadenas a leer: 4
	 *  
	 *  Cadena 1: hola que tal
	 *  Cadena 2: ayer fui
	 *  Cadena 3: en un lugar de la mancha
	 *  Cadena 4: la casa esta vacia
	 *  
	 *  Cadena mas larga: en un lugar de la mancha
	 *  </pre>
	 *
	 */
	public void ejercicio08() {
		cabecera("08", "");

		// Inicio modificacion
		String cadena;
		String cadenaMayor="";
		System.out.println("Introduce el numero de cadenas a leer: ");
		int cadenas=Teclado.readInteger();

		for (int i=1;i<=cadenas;i++){
			System.out.println("Cadena " + i + ":");
			cadena=Teclado.readString();
			if (cadena.length()>cadenaMayor.length()){
				cadenaMayor=cadena;
			}
		}
		System.out.println("Cadena mas larga: " + cadenaMayor);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio9.
	 *
	 * Se pide
	 * <ul>
	 * <li>Quitar los comentarios indicados y compilar  el metodo ejercicio03() de la clase Apartado030102.
	 * <li>Modificar la clase Rectangulo
	 * <ul>
	 * <li>	Implementar el metodo: int compareTo(Rectangulo rectangulo) para que
	 * <ul>
	 * <li>	retorne -1 si el area del Rectangulo sobre el que se ejecuta el metodo  es menor que  
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * <li> retorne 0 si el area de los dos rectangulos es igual.
	 * <li> retorne 1 si el area del Rectangulo sobre el que se ejecuta el metodo  es mayor que 
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * </ul>
	 * </ul>
	 * <li>Modificar el metodo ejercicio09() de la clase Apartado030201 para que al ejecutarlo se muestre la 
	 *     informacion del rectangulo con mayor area.
	 * </ul>
	 *     
	 */
	public void ejercicio09() {
		cabecera("09", "");

		// Inicio modificacion
	   	int n=4; //Numero de rectangulos a leer
		Rectangulo rectanguloMaximo,rectangulo;
		int base,altura,area;
		rectanguloMaximo=new Rectangulo(0,0);
		for (int i=1;i<=n;i++)
		{
			System.out.println("Introduce la base del rectangulo "+i+" :");
			base=Teclado.readInteger();
			System.out.println("Introduce la altura del rectangulo "+i+" :");
			altura=Teclado.readInteger();
			rectangulo=new Rectangulo(base,altura);
			if(rectanguloMaximo.compareTo(rectangulo)==-1 || rectanguloMaximo.compareTo(rectangulo)==0){
				rectanguloMaximo=rectangulo;
			}
		}
		
		System.out.println("El rectangulo con mayor area es "+rectanguloMaximo.toString());
		// Fin modificacion
	}
			
	

	/**
	 * Instruccion for - Ejercicio10.
	 *
	 * Modificar los metodos de la clase TablaConversion para que al ejecutar el metodo ejercicio010()
	 * de la clase Apartado030201 se muestre una tabla de conversion con el siguiente formato.
	 *
	 * Ejemplo
	 * 
	 * <pre>C	F	C	F	C	F	C	F	C	F	
	 * 0	32	1	33	2	35	3	37	4	39
	 * 5	41	6	42	7	44	8	46	9	48
	 * 10	50	11	51	12	53	13	55	14	57
	 * 15	59	16	60	17	62	18	64	19	66
	 * 20	68	21	69	22	71	23	73	24	75
	 * 25	77	26	78	27	80	28	82	29	84
	 * 30	86	31	87	32	89	33	91	34	93
	 * 35	95	36	96	37	98	38	100	39	102
	 * 40	104	41	105	42	107	43	109	44	111
	 * 45	113	46	114	47	116	48	118	49	120</pre>	
	 */
	public void ejercicio10() {
		cabecera("10", "");

		TablaConversion tabla=new TablaConversion(5,10);
		tabla.imprimir();
	}
}
