public class Main {
    public static void main(String...args){
        Automobil auto1=new Automobil("Zastava","101",1980,"st208zt");

        auto1.upali();
        auto1.setTrenutnaBrzina(90);
        //System.out.println(auto1.getTrenutnaBrzina());
        auto1.ubrzaj(20);
        //System.out.println(auto1.getTrenutnaBrzina());
        auto1.uspori(5);
        //System.out.println(auto1.getTrenutnaBrzina());
        auto1.zaustavi();
        auto1.ugasi();

    }
}
