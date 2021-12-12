import java.util.List;
import java.util.ArrayList;

public class Glavna {
    public static void main(String[] args){
        List<String> Glavna =new ArrayList<>();
        Glavna.add("Random1");
        Glavna.add("Random2");
        Glavna.add("Random3");
        Glavna.add("Random4");

List<String> Glavna2=new ArrayList<>();
Glavna2.add("Random5");
        Glavna2.add("Random6");
        Glavna2.add("Random7");


Glavna.addAll(Glavna2);

System.out.println(Glavna);

    }

}
