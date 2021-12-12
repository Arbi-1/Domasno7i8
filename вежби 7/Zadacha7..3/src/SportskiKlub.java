import java.lang.*;

public class SportskiKlub {
    private String ImeNaKlubot;
    private final String Sport;
  private int BrojNaClenovi;

    public SportskiKlub(String ImeNaKlubot , String Sport , int BrojNaClenovi) {
     this.ImeNaKlubot = "Real Madrid";
        this.ImeNaKlubot= "Barcelona";
        this.ImeNaKlubot = "Atletico Madrid";
        this.Sport = "Football";
        this.BrojNaClenovi = 50;


    }

    public String getImeNaKlubot(){
        return ImeNaKlubot;
    }

    public void setImeNaKlubot(String imeNaKlubot) {
        ImeNaKlubot = imeNaKlubot;
    }

    public String getSport() {
        return Sport;
    }
    public void setSport(String Sport){
        Sport = Sport;

    }

    public int getBrojNaClenovi() {
        return BrojNaClenovi;
    }
    public void setBrojNaClenovi(int BrojNaClenovi){
        BrojNaClenovi=BrojNaClenovi;
    }
}
