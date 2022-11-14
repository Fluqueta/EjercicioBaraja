package barajaEspañola;



public class Carta {

	int numero;
	tipoPalo palo;
	boolean haSalido=false;
	TipoBaraja baraja=TipoBaraja.ESPAÑOLA;
	public Carta(int numero, tipoPalo palo,TipoBaraja baraja) {
		setTipoBaraja(baraja);
		setNumero(numero);
		setPalo(palo);

		}
	
	public Carta(int numero, tipoPalo palo) {
		setTipoBaraja(TipoBaraja.ESPAÑOLA);
		setNumero(numero);
		setPalo(palo);

		}
	
	private void setNumero(int numero) {
		if(this.baraja.equals(TipoBaraja.ESPAÑOLA)) {
			if(numero==10) numero =12;
			if(numero==8) numero=10;
			if(numero==9) numero=11;
			}
		this.numero=numero;
	} 
	
	private void setPalo(tipoPalo palo) {
		this.palo=palo;
	}
	
	protected void setHaSalido() {
		this.haSalido=true;
	}
	
	protected void setTipoBaraja(TipoBaraja baraja) {
		this.baraja=baraja;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public tipoPalo getPalo() {
		return this.palo;
	}
	
	@Override
	public String toString() {
		String cadena;
		cadena=(this.getNumero()+" de "+this.getPalo());
		return cadena;
	}
}
