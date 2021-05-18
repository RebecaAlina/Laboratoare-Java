package ex6;

import ex2.cmm;

import java.util.Scanner;

public class Operatii {

    void simplificare(NumarRational q1){
        cmm q=new cmm();
        q.a=q1.get_numarator();
        q.b=q1.get_numitor();
        if(q.cmmdc()!=1)
        {
            q1.set_numarator(q1.get_numarator()/q.cmmdc());
            q1.set_numitor(q1.get_numitor()/q.cmmdc());
        }
    }
    void afisare(NumarRational q1){
        if(q1.get_numarator()==0)
            System.out.println("0");
        else if(q1.get_numitor()<0)
        System.out.println(-q1.get_numarator()+"/"+Math.abs(q1.get_numitor()));
        else
            System.out.println(q1.get_numarator()+"/"+q1.get_numitor());

    }

    NumarRational adunare(NumarRational q1, NumarRational q2){


        NumarRational suma=new NumarRational();
        cmm a = new cmm();
        a.a=q1.get_numitor();
        a.b=q2.get_numitor();
        if(q1.get_numitor()==q2.get_numitor())
        {
            suma.set_numarator(q1.get_numarator()+q2.get_numarator());
            suma.set_numitor(q1.get_numitor());
        }
        else{
            suma.set_numarator(a.cmmmc()/q1.get_numitor()*q1.get_numarator()+a.cmmmc()/q2.get_numitor()*q2.get_numarator());
            suma.set_numitor(a.cmmmc());
        }
        simplificare(suma);
        return suma;


    }

    NumarRational scadere(NumarRational q1, NumarRational q2){

        NumarRational dif=new NumarRational();
        cmm a = new cmm();
        a.a=q1.get_numitor();
        a.b=q2.get_numitor();
        if(q1.get_numitor()==q2.get_numitor())
        {
            dif.set_numarator(q1.get_numarator()-q2.get_numarator());
            dif.set_numitor(q1.get_numitor());
        }
        else{
            dif.set_numarator(a.cmmmc()/q1.get_numitor()*q1.get_numarator()-a.cmmmc()/q2.get_numitor()*q2.get_numarator());
            dif.set_numitor(a.cmmmc());
        }
        simplificare(dif);
        return dif;
    }

    NumarRational produs(NumarRational q1, NumarRational q2){

        NumarRational p= new NumarRational();
        p.set_numarator(q1.get_numarator()*q2.get_numarator());
        p.set_numitor(q1.get_numitor()*q2.get_numitor());
        simplificare(p);
        return p;
    }

    NumarRational raport(NumarRational q1, NumarRational q2){

        NumarRational r= new NumarRational();
        r.set_numarator(q1.get_numarator()*q2.get_numitor());
        r.set_numitor(q1.get_numitor()*q2.get_numarator());
        simplificare(r);
        return r;
    }



    void citire(NumarRational q1){
        System.out.println("Introduceti numaratorul fractiei: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        q1.set_numarator(x);
        System.out.println("Introduceti numitorul fractiei(diferit de 0): ");
        x=scanner.nextInt();
        while(x==0){
            System.out.println("Numitorul nu poate avea valoarea 0, introduceti alta valoare");
            x=scanner.nextInt();
            q1.set_numitor(1);
        }
        q1.set_numitor(x);
        simplificare(q1);
    }
}
