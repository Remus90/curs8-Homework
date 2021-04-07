package ro.fastrackit.curs8.Homework8.Exercitiul2;

import ro.fastrackit.curs8.Homework8.Exercitiul2.Person;

public class ING implements Person {
    @Override
    public void withdraw(int amount) {
        System.out.println("Suma pe care doriti sa o retrageti este: " + amount + " lei");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Suma pe care doriti sa o depuneti este: " + amount + " lei");

    }


}
