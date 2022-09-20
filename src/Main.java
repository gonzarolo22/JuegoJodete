import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mazo m= new Mazo();
		m.mesclarMazo();
		m.imprimirMazo();
		Mano manojugador=new Mano();
		
		Carta mesa=(m.darCarta());
		
		
		for(int i=0;i<5;i++) {
			manojugador.recibirCarta(m.darCarta()); //aca reparto las cartas (5)
		}
		
		
	while(manojugador.cantCarta > 0 && m.cantidadCartas>0) {	
		
	manojugador.mostrar();
	
	System.out.println("la carta en la mesa es "+ mesa);
	
	
	Scanner sc=new Scanner(System.in);
	 
	int s =sc.nextInt();
	System.out.println("Haga su jugada");
	
	Carta jugada=manojugador.jugarCarta(s);
	
	if(jugada.esCompatible(mesa)) {
		mesa=jugada;
	}
	else {
		System.out.println("carta invalidad toma una de penalizacion");
		manojugador.recibirCarta(m.darCarta());
		manojugador.recibirCarta(jugada);
	}
	}
	
	if(manojugador.cantCarta==0) {
		System.out.println("GANASTE");
	}
	else if(m.cantidadCartas==0){
		System.out.println("PERDISTE");
	}
	
	
	
		
	
		

	
	
	
	}

}
