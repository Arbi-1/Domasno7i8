
public class Fakultet extends Glavna{
    private String name;
    private int smerovi;
    private int VkupnoStudenti;

    String getName(){
        return name;
    }

    int getSmerovi() {
        return smerovi;
    }

    int getVkupnoStudenti() {
        return VkupnoStudenti;
    }

    void setName(String name){
        this.name=name;

    }

    void setSmerovi(int smerovi) {
        this.smerovi = smerovi;
    }

    void setVkupnoStudenti(int vkupnoStudenti) {
        this.VkupnoStudenti =150;
    }


}






