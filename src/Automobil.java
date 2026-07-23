public class Automobil {
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private String regOznaka;
    private int trenutnaBrzina;
    private boolean upaljen;

    public Automobil(String marka,String model,int godinaProizvodnje,String regOznaka){
        this.marka=marka;
        this.model=model;
        this.godinaProizvodnje=godinaProizvodnje;
        this.regOznaka=regOznaka;
        this.trenutnaBrzina=0;
        this.upaljen=false;
    }
    public void ubrzaj(int novaBrzina){
        this.trenutnaBrzina=novaBrzina;

    }
    public void uspori(int novaBrzina){
        this.trenutnaBrzina=novaBrzina;

    }
    public void stani(){
        this.trenutnaBrzina=0;

    }



}
