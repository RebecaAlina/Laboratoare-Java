package ex3;

public class Cerc {
    Punct centru;
    double raza;

    public Cerc() {}

    public Cerc(Punct centru, double raza) {
        this.centru = centru;
        this.raza = raza;
    }
    public boolean equals(Cerc cerc){
        return this.centru.equals(cerc.centru) && this.raza==cerc.raza;
    }

    @Override
    public String toString(){
        return "Centru: " + centru.toString() + "; raza:"+ raza;
    }

    public double perimetru(){
        return 2*Math.PI*raza;
    }
    public double arie(){
        return Math.PI*Math.pow(raza,2);
    }

}
