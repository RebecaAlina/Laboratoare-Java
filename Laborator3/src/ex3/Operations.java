package ex3;

public class Operations {

    public ComplexNumber adunare(ComplexNumber z1,ComplexNumber z2){
        ComplexNumber z3 = new ComplexNumber();
        z3.set_im(z1.get_im()+z2.get_im());
        z3.set_re(z1.get_re()+z2.get_re());
        return z3;
    }
     public ComplexNumber scadere(ComplexNumber z1,ComplexNumber z2){
         ComplexNumber z3 = new ComplexNumber();
         z3.set_im(z1.get_im()-z2.get_im());
         z3.set_re(z1.get_re()-z2.get_re());
         return z3;
     }

     public ComplexNumber inmultire(ComplexNumber z1,ComplexNumber z2){
        ComplexNumber z3 = new ComplexNumber();
         z3.set_im(z1.get_re()*z2.get_im()+z2.get_re()*z1.get_im());
         z3.set_re(z1.get_re()*z2.get_re()-z1.get_im()*z2.get_im());
         return z3;
     }

     public ComplexNumber impartire(ComplexNumber z1,ComplexNumber z2){
         ComplexNumber z3 = new ComplexNumber();
         z3.set_im((z1.get_re()*z2.get_re()+z1.get_im()*z2.get_im())/(z2.get_re()*z2.get_re()+z2.get_im()*z2.get_im()));
         z3.set_re((z1.get_im()*z2.get_re()-z1.get_re()*z2.get_im())/(z2.get_re()*z2.get_re()+z2.get_im()*z2.get_im()));
         return z3;
     }

     public double modul(ComplexNumber x){
        double Modul;
        Modul=Math.sqrt(x.get_re()*x.get_re()+x.get_im()*x.get_im());
        return Modul;
    }

    public boolean equals(ComplexNumber z1,ComplexNumber z2){
        if(z1.get_im()==z2.get_im() && z1.get_re()==z2.get_re())
            return true;
        return false;
    }

   public String toString(ComplexNumber x){
        if(x.get_im()>=0)
            return "Numarul complex in forma string: "+x.get_re()+"+i*"+x.get_im();
        else
            return "Numarul complex in forma string: "+x.get_re()+"-i*"+Math.abs(x.get_im());

   }
}
