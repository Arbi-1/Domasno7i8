import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class Glavna extends SportskiKlub {

    public Glavna(String ImeNaKlubot, String Sport, int BrojNaClenovi) {
        super(ImeNaKlubot, Sport, BrojNaClenovi);
    }

    public static void main(String[] args){
List<SportskiKlub> Klubovi = new ArrayList<>();
Klubovi.add(new SportskiKlub("PSG","Football",30));
Klubovi.add(new SportskiKlub("Milan","Football" , 30));


    System.out.println(Klubovi);


}


}
