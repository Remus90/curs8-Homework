package ro.fastrackit.curs8.Homework8.Exercitiul2;

public class BRD implements Person {


    @Override
    public void withdraw(int amount) {

        System.out.println("Felicitari ai retras suma de: " + amount + " lei");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Felicitari ai depus suma de: " + amount + " lei");
    }
}
