import java.util.ArrayList;

public class Glavna {
    public static void main(String[] args){
        ArrayList<String > FaxPrvSimestar = new ArrayList<>();
        FaxPrvSimestar.add("MAT1");
        FaxPrvSimestar.add("Strukturno Programiranje");
        FaxPrvSimestar.add("Osnovni Veshtini Na Anglsiki");

        ArrayList<String> FaxVtorSimestar = new ArrayList<>();

        FaxVtorSimestar.add("MAT2");
        FaxVtorSimestar.add("Napredno Programiranje");
        FaxVtorSimestar.add("Napredni Veshtini Na Anglsiki");
        FaxVtorSimestar.add("MAT1");
        FaxVtorSimestar.add("Strukturno Programiranje");



        //Print Both Lists
        System.out.println("Prv Simestar" +FaxPrvSimestar);
        System.out.println("Vtor Simestar" + FaxVtorSimestar);



        //Retain both Lists
        FaxPrvSimestar.retainAll(FaxVtorSimestar);

        System.out.println("Dopolnitelni predmeti od Prv Semestar vo Vtoriot Semestar" + FaxPrvSimestar);


    }

}
