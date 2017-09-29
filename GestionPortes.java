package sprint2;

public class GestionPortes {
	public static class Portes {
		private String typePorte;
		private int numEtagePorte;
		
		public Portes(String typePorte, int numEtagePorte) {
			this.typePorte = typePorte;
			this.numEtagePorte = numEtagePorte;
		}
	
		public String getTypePorte() {
			return typePorte;
		}
		public void setTypePorte(String typePorte) {
			this.typePorte = typePorte;
		}
		public int getNumEtagePorte() {
			return numEtagePorte;
		}
		public void setNumEtagePorte(int numEtagePorte) {
			this.numEtagePorte = numEtagePorte;
		}
	}
	private int numero;
	private String etatOuverture; 
	private Portes porte1;
	private Portes porte2;
	
	
	public GestionPortes(int numero, String etatOuverture) {
		this.numero = numero;
		this.etatOuverture = etatOuverture;
		this.porte1 = new Portes(etatOuverture, numero);
		this.porte2 = new Portes(etatOuverture, numero);
	}
	

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEtatOuverture() {
		return etatOuverture;
	}
	public void setEtatOuverture(String etatOuverture) {
		this.etatOuverture = etatOuverture;
	}
	
	
}
