import java.util.ArrayList;
import java.util.List;
public class Glavna {
    public static void main(String[] args) {
MetodiZaListaNiza G1= new MetodiZaListaNiza();
List<String> List = new ArrayList<>();
List.add("R1");
        List.add("R2");
        List.add("R3");
        List.add("R4");

        G1.listToArrays(List);

    }
}