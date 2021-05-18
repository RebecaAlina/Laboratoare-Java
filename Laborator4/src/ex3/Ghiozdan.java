package ex3;

import java.util.ArrayList;

public class Ghiozdan {
    ArrayList<Rechizita> rechizite = new ArrayList<Rechizita>();

    public Ghiozdan(){
        this(null);
    }

    public Ghiozdan(ArrayList<Rechizita> rechizite){
        this.rechizite=rechizite;
    }

    public void addInArray(Rechizita rechizita){
        rechizite.add(rechizita);
    }
    public Rechizita remove(int pozitie){
        Rechizita rechizita=rechizite.get(pozitie);
        rechizite.remove(pozitie);
        return rechizita;
    }
    public Rechizita elementAt(int pozitie){
        return rechizite.get(pozitie);
    }

    public void listItem(){
        System.out.println("Rechizitele din ghiozdan: ");
    for(int i=0;i<rechizite.size();i++){
        System.out.println(rechizite.get(i).toString());
    }
    }

    public void listManual(){
        System.out.println("Manualele din ghiozdan: ");
        for (Rechizita rechizita : rechizite) {
            if(rechizita instanceof Manual)
            System.out.println(rechizita.toString());
        }
    }

    public void listCaiet(){
        System.out.println("Caietele din ghiozdan: ");
        for (Rechizita rechizita : rechizite) {
            if(rechizita instanceof Caiet)
                System.out.println(rechizita.toString());
        }
    }

    public void getNrRechizite(){
        System.out.println("Numarul de rechizite: " + rechizite.size());
    }

    public void getNrManuale(){
        int cnt = 0;
        for (Rechizita rechizita : rechizite) {
            if(rechizita instanceof Manual)
                cnt++;
        }
        System.out.println("Numarul manualelor: " + cnt);
    }

    public void getNrCaiete(){
        int cnt = 0;
        for (Rechizita rechizita : rechizite) {
            if(rechizita instanceof Caiet) {
                cnt++;
            }
        }
        System.out.println("Numarul caietelor: "+ cnt);
    }

}
