
public class Carta {
	
	int palo;
	int numero;
	
	
	public Carta(int  n, int p) {
		this.palo=p;
		this.numero=n;
	}
	
	public String toString() {
		String s[]= {"espada","basto","copa","oro"};
		
		return this.numero+"/"+s[this.palo];
	}
	
	public boolean esCompatible(Carta m) {
		if(this.palo==m.palo || this.numero==m.numero){
			return true;
		}
		
		return false;
	}
	

}
