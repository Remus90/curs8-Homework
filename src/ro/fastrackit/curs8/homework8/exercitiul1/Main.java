package ro.fastrackit.curs8.homework8.exercitiul1;


public class Main {
    public static void main(String[] args) {
        Advertise reduceri = new Facebook();
        reduceri.send("Avem reduceri 50%");
        Advertise promotii = new Email();
        promotii.send("avem promotii");
        Advertise castiguri = new Print();
        castiguri.send("Poti castiga ");


    }
}
