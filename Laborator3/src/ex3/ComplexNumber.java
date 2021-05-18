package ex3;

public class ComplexNumber {
    private float re;
    private float im;

    public void set_re(float r){re=r;};
    public void set_im(float i){im=i;};
    public float get_re(){return re;};
    public float get_im(){return im;};

    public ComplexNumber(){set_re(0);set_im(0);};
    public ComplexNumber(float r, float i){set_re(r);set_im(i);};
}
