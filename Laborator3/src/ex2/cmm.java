package ex2;

public class cmm {
    public int a,b;

    public boolean verificare(){
        return a != 0 && b != 0;
    }

    public int cmmdc(){
        int r,ca=a,cb=b;
            while (cb != 0) {
                r = ca % cb;
                ca = cb;
                cb = r;
            }
            return ca;
    }

    public int cmmmc(){
        return (a*b)/this.cmmdc();
    }

}
