package barajaEspañola;

public class AppCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Baraja unaBaraja;
			unaBaraja= new Baraja(TipoBaraja.FRANCESA);
			System.out.println("La baraja ordenada");
			System.out.println(unaBaraja.toString());
			System.out.println("Barajamos");
			unaBaraja.barajar();
			System.out.println("Esta es la baraja desordenada");
			System.out.println(unaBaraja.toString());
			System.out.println("Repartimos 5 cartas\n");
			unaBaraja.darCartas(5);
			System.out.println("Hemos repartido estas cartas: \n");
			System.out.println(unaBaraja.cartasMonton());
			System.out.println("nos quedan en el mazo\n");
			System.out.println(unaBaraja.cartasDisponibles()+" Cartas, que son:\n");
			System.out.println(unaBaraja.toString());
			

	}

}
