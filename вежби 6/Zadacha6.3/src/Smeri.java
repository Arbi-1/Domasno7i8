
import java.util.ArrayList;
import java.util.List;

public class Smeri {

    public static void main (String[] args){
        List<String> Smeri = new ArrayList<>();
        ArrayList<String> Smeri2 = new ArrayList<>();
// Staviv 2 Smera
        Smeri.add("Programer");
        Smeri.add("Inzinier Za Kompjuteri");
        // Dodaov i tret smer na treta pozicija PS. Smerov e random bideljki ne znaev od fikt drugi smer
        Smeri2.add(3 ,"BioScience Researchers");

        Smeri2.addAll(Smeri);
       //Primtiam rezultatite
        System.out.println(Smeri2);


    }
}
