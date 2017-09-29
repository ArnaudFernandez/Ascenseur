package sprint2;

public class GestionEtages {
	private int monterEtage;
	private int numero;
	private boolean estEnservice;
	
	public GestionEtages(int monterEtage, int numero, boolean estEnservice) {
		super();
		this.monterEtage = monterEtage;
		this.numero = numero;
		this.estEnservice = estEnservice;
	}
	
	
	public int getMonterEtage() {
		return monterEtage;
	}
	public void setMonterEtage(int monterEtage) {
		this.monterEtage = monterEtage;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isEstEnservice() {
		return estEnservice;
	}
	public void setEstEnservice(boolean estEnservice) {
		this.estEnservice = estEnservice;
	}


}
