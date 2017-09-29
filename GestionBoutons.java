package sprint2;

public class GestionBoutons {
	private int numeros;
	private boolean etat;

	public GestionBoutons(int numeros, boolean etat)
    {
        this.numeros = numeros;
        this.etat = etat;
    }

    public int getNumeros() {
        return this.numeros;
    }

    public boolean getEtat()
    {
        return this.etat;
    }

    public void changeEtat()
    {
        this.etat = !this.etat;
    }
}