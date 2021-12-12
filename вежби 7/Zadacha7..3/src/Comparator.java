import java.util.Comparator;

class ImeNaKlubotComparator implements Comparator<SportskiKlub> {


    @Override
    public int compare(SportskiKlub o1, SportskiKlub o2) {

        o1.getImeNaKlubot().compareTo(o2.getImeNaKlubot());
        return 0;
    }
}