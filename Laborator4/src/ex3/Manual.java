package ex3;

public class Manual extends Rechizita{
    String autori;
    String editura;

    public Manual(){
        this(null,0,null,null);
    }
    public Manual(String eticheta, double pret, String autori, String editura){
        super.eticheta=eticheta;
        super.pret=pret;
        this.autori=autori;
        this.editura= editura;
    }

    public String getNume(){
     return "-Manual " + super.eticheta;
    }

    @Override
    public String toString(){
        return "-Manual " + super.eticheta;
    }
}
