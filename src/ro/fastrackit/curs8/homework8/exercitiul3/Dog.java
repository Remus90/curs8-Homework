package ro.fastrackit.curs8.homework8.exercitiul3;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "Dog walking";
    }

    @Override
    public String talk() {
        return "Dog not talking";
    }

    @Override
    public String eat() {
        return "Dog eating";
    }
}
