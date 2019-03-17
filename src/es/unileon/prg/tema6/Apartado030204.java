package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		System.out.println("Introduce un numero");
		int n1=Teclado.readInteger();
		System.out.println("Introduce otro numero");
		int n2=Teclado.readInteger();

		int suma;
		int i=0;
		for (i=n1;i<=n2;i++){
			suma=0;
			for (int j=n1;j<i;j++){
				if(i%j==0){
					suma=suma+j;
				}
			}	
			if (suma==i){
				System.out.println(i);
			}
		}
        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		Cheque cheque=null;
		
		//Modificar el numero de cheque para probar
		//cheque=new Cheque("1000988887");    
        	//cheque=new Cheque("1010098888");
        	cheque=new Cheque("1004808880");   
        
       
         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque no es falso");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 * 	****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		System.out.println("Introduce el tamanyo:");
		int tam=Teclado.readInteger();
		char dibujo='*';
		System.out.println("Triangulo");
		for (int i=1;i<=tam;i++){
			for(int j=1;j<=i;j++){
				System.out.println(dibujo);
			}
			System.out.println("\t");
		}
		System.out.println("");
		System.out.println("Cuadrado relleno");
		int contador=0;
		do{
			for(int i=1;i<=tam;i++){
				System.out.println(dibujo);
			}
			System.out.println("\t");
			contador++;
		}while(contador<tam);
		System.out.println("");
		System.out.println("Cuadrado vacio");
		int contador2=0;
		do{
			if(contador2!=0 && contador2!= tam-1){
				System.out.println(dibujo);
				for(int i=2;i<=tam-1;i++){
					System.out.println(" ");
				}
				System.out.println(dibujo);
			}
			else{
				for(int i=1;i<=tam;i++){
					System.out.println(dibujo);
				}
			}
			System.out.println();
			contador2++;
		}while(contador2<tam);		
		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int numeroRandom=0; 
		int prueba;
		int intentos=0;
		int opcion=0;
		do {
			numeroRandom = (int) (Math.random()*100)+1;
			do {
				intentos=intentos+1;
				System.out.println("Introduce un numero");
				prueba=Teclado.readInteger();
				if (prueba==numeroRandom){
					System.out.println("Has acertado");					
					System.out.println("Numero de intentos: " + intentos);
				}
				else{
					if (numeroRandom<prueba){
						System.out.println("Demasiado grande");
					}
					if (numeroRandom>prueba){
						System.out.println("Demasiado bajo");
					}
				}
			}while((numeroRandom!=prueba) && (intentos<5));
			System.out.println("1:-Volver a empezar");
			System.out.println("2:-Salir");
			opcion=Teclado.readInteger();
			switch (opcion){
				case 1: 
					intentos=0;
					break;
				case 2:
					System.out.println("Hasta la proxima");
					break;
				default:
					System.out.println("Opcion no valida, saliendo");
			}
		}while ((opcion==1));
		// Fin modificacion
	}
}
