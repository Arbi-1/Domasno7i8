import java.util.ArrayList;
import java.util.List;

public class Lekovi {
    public static void main(String[] args){
        List<String> Lekovi = new ArrayList<>();
        Lekovi.add("Paracetamol");
        Lekovi.add("Depon");
        Lekovi.add("Taylin Hot");
        Lekovi.add("OKI");

        if (Lekovi.get(3).equals("Paracetamol")){
            System.out.println("Лекот помага за намалување на телесната температура");
        }
else   {

    System.out.println("Намената на лекот е непозната!");
        }

    }


}
