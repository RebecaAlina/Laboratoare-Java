package ex6;

public class NumarRational {
    private int numarator;
    private int numitor;

    public void set_numarator(int x){numarator=x;};
    public void set_numitor(int x){numitor=x;};
    public int get_numarator(){return numarator;};
    public int get_numitor(){return numitor;};

    public NumarRational(){numarator=0; numitor=1;};
    public NumarRational(int x, int y) {numarator=x;numitor=y;}

    }

