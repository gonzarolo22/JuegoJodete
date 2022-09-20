
public class Mano {
	Carta[] mano;
	int cantCarta;
	
	public Mano() {
		
		this.mano=new Carta[48];
		this.cantCarta=0;
	}
	
	
	public void mostrar() {
		for(int i=0;i<cantCarta;i++) {
			System.out.println(i+"  -   " + mano[i]);
		}
	}
	
	public void recibirCarta(Carta c) {
		mano[cantCarta]=c;
		cantCarta++;
	}
	
	
	public Carta jugarCarta(int k) {
		Carta Jugada=mano[k];
		mano[k]=mano[cantCarta-1];
		mano[cantCarta-1]=null;
		cantCarta--;
		return Jugada;
	}
	
	public int cantidadDeCartas() {
		return cantCarta;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
