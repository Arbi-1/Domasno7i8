import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MetodiZaListaNiza {
    public void listToArrays (List<String> List){
        String[] Array= new String[List.size()];
        List.toArray(Array);

        System.out.println("Lista pretvorena vo niza:");
        for (String a : Array){
            System.out.println(a);
        }


    }

    }


