import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        Fakultet Fax = new Fakultet();
        List<String> Fax1 =new ArrayList<>();


        Fax.setName("FIKT");
        Fax.setSmerovi(2);
        Fax.setVkupnoStudenti(150);
        // IDK what to add for objectes so i will do Random1 ,Random2 etc
        Fax1.add("Random1");
        Fax1.add("Random2");
        Fax1.add("Random3");
        Fax1.add("Random4");
        Fax1.add("Random5");


        System.out.println(Fax.getName());
        System.out.println(Fax.getSmerovi());
        System.out.println(Fax.getVkupnoStudenti());
        System.out.println(Fax1);

    }
    }


