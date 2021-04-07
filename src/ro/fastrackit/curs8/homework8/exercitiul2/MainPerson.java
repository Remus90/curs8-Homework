package ro.fastrackit.curs8.homework8.exercitiul2;

public class MainPerson {
    public static void main(String[] args) {
        Person Andrei = new ING();
        Andrei.withdraw(300);
        Andrei.deposit(200);
        Person Marian = new BT();
        Marian.withdraw(100);
        Marian.deposit(550);
        Person Ovidiu = new BRD();
        Ovidiu.deposit(7000);
        Ovidiu.withdraw(3200);

    }
}
