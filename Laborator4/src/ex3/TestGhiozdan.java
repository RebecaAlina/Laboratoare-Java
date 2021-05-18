package ex3;
//aplicatie care gestioneaza rechizitele dintr-un ghiozdan
import java.util.ArrayList;

public class TestGhiozdan {
    public static void main(String[] args) {

        Caiet caiet = new Caiet("de matematica", 2.5, "A4", 80);
        Caiet caiet2 = new Caiet("de geografie", 1.5, "clasic", 50);
        Manual manual = new Manual("de informatica", 30, "Ioan Dumitru, Petru Constantin", "Mileniul");
        Manual manual2 = new Manual("de arhitectura calculatoarelor", 45, "Petrescu Alexandru, Mitre Bogdan, Albastru Mihai", "Art");
        ArrayList<Rechizita> rechizite = new ArrayList<>();
        rechizite.add(caiet);
        rechizite.add(caiet2);
        rechizite.add(manual);
        rechizite.add(manual2);
        Ghiozdan ghiozdan = new Ghiozdan(rechizite);
        ghiozdan.getNrRechizite();
        ghiozdan.getNrCaiete();
        ghiozdan.getNrManuale();
        ghiozdan.listItem();
        ghiozdan.listCaiet();
        ghiozdan.listManual();
    }
}
