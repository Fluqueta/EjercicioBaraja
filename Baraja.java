package barajaEspañola;

public class Baraja {

	Carta[] mazoCartas; 
	
	public Baraja(TipoBaraja baraja){

		if(baraja==TipoBaraja.ESPAÑOLA) {
		this.mazoCartas=new Carta[40];	
		for(int i=0;i<10;i++) {
			mazoCartas[i]=new Carta((i+1),tipoPalo.OROS);
		}
		for(int i=10;i<20;i++){
			mazoCartas[i]=new Carta((i-9),tipoPalo.BASTOS);
		}
		for(int i=20;i<30;i++) {
			mazoCartas[i]=new Carta((i-19),tipoPalo.ESPADAS);
		}
		for(int i=30;i<40;i++){
			mazoCartas[i]=new Carta((i-29),tipoPalo.COPAS);
		}
		}else {
			this.mazoCartas=new Carta[52];
			for(int i=0;i<13;i++) {
				mazoCartas[i]=new Carta((i+1),tipoPalo.CORAZONES,baraja);
			}
			for(int i=13;i<26;i++){
				mazoCartas[i]=new Carta((i-12),tipoPalo.DIAMANTES,baraja);
			}
			for(int i=26;i<39;i++) {
				mazoCartas[i]=new Carta((i-25),tipoPalo.PICAS,baraja);
			}
			for(int i=39;i<52;i++){
				mazoCartas[i]=new Carta((i-38),tipoPalo.TREBOLES,baraja);
			}
		}
	}
	
	public Baraja() {
			this(TipoBaraja.ESPAÑOLA);
			}
	
	public String toString() {
		String cadena="";
		
		for(int i=0;i<this.mazoCartas.length;i++) {
			if(!this.mazoCartas[i].haSalido)
			cadena=cadena+("El "+mazoCartas[i].getNumero()+" de "+mazoCartas[i].getPalo()+"\n");
		}
		return cadena;
	}
	
	public void barajar() {
		Carta cartaGuardada;
		int pos;
		for(int i=0;i<this.mazoCartas.length;i++) {
			pos=(int)(Math.random()*40);
			cartaGuardada=mazoCartas[pos];
			mazoCartas[pos]=mazoCartas[i];
			mazoCartas[i]=cartaGuardada;	
		}
	}
	
	public void darCartas(int cantidad) {
		
	for(int i=0;i<cantidad;i++) {
		this.siguienteCarta();
		}
	}
	
	public void siguienteCarta() {

		for(int i=0;i<this.mazoCartas.length;i++) {
			if(!this.mazoCartas[i].haSalido) { 
				this.mazoCartas[i].setHaSalido();
				break;
			}
		}

	}
	
	public int cartasDisponibles() {
		int contador=0;
		for (int i=0; i<this.mazoCartas.length;i++) {
			if (!this.mazoCartas[i].haSalido) contador++;
		}
		return contador;
	}
	
	public String cartasMonton() {
		String monton="";
		for(int i=0;i<this.mazoCartas.length;i++) {
			if(this.mazoCartas[i].haSalido) {
				monton=monton+"\n"+("El "+this.mazoCartas[i].numero+" de "+this.mazoCartas[i].palo);
			}
		}
		return monton;
	}
}
