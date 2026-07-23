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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegOznaka() {
        return regOznaka;
    }

    public void setRegOznaka(String regOznaka) {
        this.regOznaka = regOznaka;
    }

    public int getTrenutnaBrzina() {
        return trenutnaBrzina;
    }

    public void setTrenutnaBrzina(int trenutnaBrzina) {
        this.trenutnaBrzina = trenutnaBrzina;
    }

    public boolean isUpaljen() {
        return upaljen;
    }

    public void setUpaljen(boolean upaljen) {
        this.upaljen = upaljen;
    }

    public void ubrzaj(int novaBrzina){
        this.trenutnaBrzina+=novaBrzina;

    }
    public void uspori(int novaBrzina){
        this.trenutnaBrzina-=novaBrzina;

    }
    public void upali(){
        this.upaljen=true;
        System.out.println("Automobil je upaljen");
        System.out.println("Upalio si auto, postavi brzinu");

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
    public void ispisi(){
        System.out.println("marka: "+getMarka());
        System.out.println("model: "+getModel());
        System.out.println("godina proizvodnje: "+getGodinaProizvodnje());
        System.out.println("Reg oznaka "+getRegOznaka());
        if(upaljen){
            System.out.println("Status "+"upaljen");
        }else{
            System.out.println("Status "+"ugašen");
        }

    }



}
