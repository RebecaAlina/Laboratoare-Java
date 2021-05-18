package ex3;
//calculeaza aria si perimetrul a doua cercuri (+ alte metode de afisare a unor obiecte de tip punct)

public class FiguriGeometrice {
     public static void main(String[] args){
         Punct punct1 = new Punct(2,3);
         Punct punct2 = new Punct(2,3);

         System.out.println("Primul punct:" + punct1.toString() + "\nAl doilea punct:" + punct2.toString());
         System.out.println("Rezultatul verificarii de egalitate dintre cele doua puncte:" + punct1.equals(punct2));

         Cerc cerc1 = new Cerc(punct1,20);
         Cerc cerc2 = new Cerc(punct2, 2);

         System.out.println("Primul cerc:"+cerc1.toString());
         System.out.println("Al doilea cerc:" +cerc2.toString());
         System.out.println("Rezultatul verificarii de egalitate dintre cele doua cercuri:" + cerc1.equals(cerc2));

         System.out.println("Aria primului cerc:" + cerc1.arie());
         System.out.println("Perimetrul primului cerc:"+cerc1.perimetru());
         System.out.println("Aria celui de-al doilea cerc: "+cerc2.arie());
         System.out.println("Perimetrul celui de-al doilea cerc:"+cerc2.perimetru());

     }
}
