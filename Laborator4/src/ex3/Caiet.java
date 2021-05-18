package ex3;

public class Caiet extends Rechizita{
    String tip;
    int pagini;

    public Caiet(){
        this(null,0,null,0);
    }
    public Caiet(String eticheta, double pret, String tip, int pagini){
        super.eticheta=eticheta;
        super.pret=pret;
        this.tip=tip;
        this.pagini=pagini;
    }

    public String getNume(){
        return "-Caiet " + super.eticheta;
    }

    public String toString(){
        return "-Caiet " + super.eticheta;
    }
}
