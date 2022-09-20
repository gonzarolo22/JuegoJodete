import java.util.Random;


public class Mazo {
	Carta[] cartas;
	int cantidadCartas;
	

	public Mazo() {
		
		 cartas = new Carta[48];
		int cont=0;
		for(int p=0; p <=3;p++) {
			for(int n=1; n<13; n++) {
				cartas[cont]= new Carta(n,p);
				cont++;
			}
		}
	
	this.cantidadCartas=48;
	
	}
	
	public void imprimirMazo() {
 		for(int j=0; j<cantidadCartas;j++) {
			System.out.println(this.cartas[j]);
		}
	}
	
	
	public void mesclarMazo() {
		Random sc= new Random();
		for(int t=0;t<5000;t++) {
			for(int i=0; i<48;i++) {
				int r=sc.nextInt(this.cantidadCartas);
					Carta cont= cartas[i]; 
						cartas[i]=cartas[r];
						cartas[r]= cont;
			}
		}
	}
	
	public Carta darCarta() {
		Carta c = this.cartas[cantidadCartas - 1];
		this.cantidadCartas--;
		return c;
	}
	
	
	
	
	
	
}
