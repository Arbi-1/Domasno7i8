import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


public class Glavna {

    public static void main(String[] args) {
        Set<String> Glavna = new HashSet<>();
        Glavna.add("Random1");
        Glavna.add("Random2");
        Glavna.add("Random3");
        Glavna.add("Random4");
        Glavna.add("Random5");

        Set<String> Glavna2 = new HashSet<>();
        Glavna2.add("Random6");
        Glavna2.add("Random2");
        Glavna2.add("Random4");
        Glavna2.add("Random7");
        Glavna2.add("Random1");
// Unija od dve mnozhestva
Glavna.addAll(Glavna2);

System.out.println("Unija od dve mnozhestva"+""+Glavna);

// Presek od dve mnozhestva
        Glavna.retainAll(Glavna2);
        System.out.println("Presek od dve mnozhestva"+""+Glavna);
    }
}