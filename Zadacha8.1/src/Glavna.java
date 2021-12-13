
import java.util.HashMap;
import java.util.Map;

public class Glavna {

    public static void main (String[] args){
Map<String,String> Recnik = new HashMap<String,String>();

        Recnik.put("Hi", "Zdravo");
        Recnik.put("Job","Rabota");
        Recnik.put("School","Ucilishte");
        Recnik.put("Book","Kniga");
        Recnik.put("Gym","Teretana");

        //Klucevite
        System.out.println(Recnik.keySet());
        // Vrednostite
        System.out.println(Recnik.values());
        // Kluchevite i Vrednostite

        for (Map.Entry<String,String> entry: Recnik.entrySet()){
            System.out.println(entry.getKey()+ "-" + entry.getValue());
        }

    }
}
