
import java.util.ArrayList;
import java.util.List;

public class Drzhavi {

    public static void main (String[] args){
        List<String> Drzhavi = new ArrayList<>();
        ArrayList<String> Drzhavi2 = new ArrayList<>();

        Drzhavi.add("California");
        Drzhavi.add("Florida");
        Drzhavi.add("Texas");
   Drzhavi2.add("Arizona");
   Drzhavi2.add("Hawaii");
   Drzhavi2.addAll(Drzhavi);
   // Staviv 3 drzhavi i Printirav Size
        System.out.println(Drzhavi+""+Drzhavi.size());
        //Ako bea 3 drzhvavi dodavam ushte 2 drugi i gi primtiram
        System.out.println(Drzhavi2);


}
        }








