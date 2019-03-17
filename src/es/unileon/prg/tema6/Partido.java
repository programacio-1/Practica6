package es.unileon.prg.tema6;

/**
 * 
 * 
 * Definicion de la clase Partido
 *   
 * @author PRG
 * @version (1.0)
 *
 */

public class Partido
{
    
	/**
	 * Jugador 1 del partido
	 * 
	 */
    private Jugador _jugador1;
    /**
	 * Jugador 2 del partido
	 * 
	 */
    private Jugador _jugador2;
    /**
	 * Ganador del partido. Si su su valor es null todavia no se ha jugado el partido
	 * 
	 */
    private Jugador _ganador;
    
    
    
    /**
	 * Constructor de la clase. Crea un partido con los jugadores introducidos
	 * 
	 * @param jugador1
	 * @param jugador2
	 *           
	 */
    public Partido(Jugador jugador1, Jugador jugador2)
    {
    	_jugador1 = jugador1;
    	_jugador2 = jugador2;
        _ganador=null;
    }
    
    /**
	 * Retorna el jugador 1 
	 * 
	 * @return Retorna el jugador 1 
	 */    
    public Jugador getJugador1()
    {
        return _jugador1;
    }
    
    /**
	 * Retorna el jugador 2
	 * 
	 * @return Retorna el jugador 2
	 */
    public Jugador getJugador2()
    {
        return _jugador2;
    }
    
    /**
	 * Juega el partido y genera el ganador
	 * 
	 */
    public void jugar() 
    {
        //Inicio modificacion - ejercicio06() de la clase Apartado030202 -
    	double puntosA=0;
	double puntosB=0;
	int juegoA=0;
	int juegoB=0;
	int setA=0;
	int setB=0;
	while((setA<=5 && setB<=5) && !(juegoA+2==juegoB || juegoB+2==juegoA)){
		while(juegoA<6 && juegoB<6){
			puntosA=Math.random()*_jugador1.getPuntosATP();
			puntosB=Math.random()*_jugador2.getPuntosATP();
			if(puntosA>puntosB){
				juegoA++;
			}
			if(puntosB>puntosA){
				juegoB++;
			}
			if(puntosA==puntosB){
				puntosA=Math.random()*_jugador1.getPuntosATP();
				puntosB=Math.random()*_jugador2.getPuntosATP();
			}
		}
		if(juegoA>juegoB){
			setA++;
			System.out.println("Set para " + _jugador1.getNombre() + " por " + juegoA+"-"+juegoB+" juegos");
		}
		else{
			setB++;
			System.out.println("Set para " + _jugador2.getNombre() + " por " + juegoA+"-"+juegoB+" juegos");
		}
		juegoA=juegoB=0;
	}
	if(setA>setB){
		_ganador=_jugador1;
	}
	else{
		_ganador=_jugador2;
	}
	_ganador.setPuntosATP(_ganador.getPuntosATP()+1);
    	//Fin modificacion - ejercicio06() de la clase Apartado030202 -
        
            
    }
    
    /**
	 * Retorna el ganador. Si retorna null el partido todavia no se ha jugado
	 * 
	 * @return Retorna el ganador del partido
	 */  
    public Jugador ganador()
    {
       
        return _ganador;
    }
    
  
    
}
