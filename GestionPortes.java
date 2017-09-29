package sprint2;

public class GestionPortes {
	public class Porte {
		private String typePorte;
		private int numEtagePorte;
		
		public Porte(String typePorte, int numEtagePorte) {
			super();
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
	private Porte porte1;
	private Porte porte2;
	
	
	public GestionPortes(int numero, String etatOuverture) {
		this.numero = numero;
		this.etatOuverture = etatOuverture;
		this.porte1 = new Porte(etatOuverture, numero);
		this.porte2 = new Porte(etatOuverture, numero);
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
