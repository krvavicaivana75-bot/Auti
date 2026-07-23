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
        this.trenutnaBrzina+=novaBrzina;

    }
    public void uspori(int novaBrzina){
        this.trenutnaBrzina-=novaBrzina;

    }
    public void upali(){
        System.out.println("Automobil je upaljen");

    }
    public void ugasi(){
        if(trenutnaBrzina!=0){
        System.out.println("Automobil je ugašen");}
        else{
            System.out.println("Zaustavi auto prije gašenja");
            //može ovdje biti metoda zaustavi()
        }

    }
    public void zaustavi(){
        while(trenutnaBrzina!=0){
            uspori(10);
        }
        ugasi();

    }



}
