package sprint2;


public class gestionCabine {

    private int numEtage;
    private enumEtageCabine etageCabine;


    public gestionCabine() {
        this.numEtage = 0;
        this.etageCabine = enumEtageCabine.ARRET_FERMER;
    }

    public gestionCabine(int numEtage, enumEtageCabine etageCabine) {
        this.numEtage = numEtage;
        this.etageCabine = etageCabine ;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public enumEtageCabine getEtageCabine() {
        return etageCabine;
    }

    public void setEtageCabine(enumEtageCabine etageCabine) {
        this.etageCabine = etageCabine;
    }

    public void changeEtageCabine(enumEtageCabine etageCabine){
        this.etageCabine=etageCabine;
    }

    public void changeEtageCabine(String StringEtageCabine){
        if(StringEtageCabine=="ARRET_OUVERT") this.etageCabine=enumEtageCabine.ARRET_OUVERT;
        if(StringEtageCabine=="ARRET_FERMER") this.etageCabine=enumEtageCabine.ARRET_FERMER;
        if(StringEtageCabine=="MONTEE_FERMER") this.etageCabine=enumEtageCabine.MONTEE_FERMER;
        if(StringEtageCabine=="DECENTE_FERMER;") this.etageCabine=enumEtageCabine.DECENTE_FERMER;;

    }

    @Override
    public String toString() {
        return "gestionCabine{" +
                "numEtage=" + numEtage +
                ", etageCabine=" + etageCabine +
                '}';
    }
}




