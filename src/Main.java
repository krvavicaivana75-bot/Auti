public class Main {
    public static void main(String...args){
        Automobil auto1=new Automobil("Zastava","101",1980,"st208zt");

        auto1.upali();
        auto1.setTrenutnaBrzina(10);
        auto1.ubrzaj(20);
        auto1.uspori(5);
        auto1.ugasi();

    }
}
