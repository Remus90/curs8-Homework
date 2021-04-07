package ro.fastrackit.curs8.Homework8.Exercitiul3;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "Duck walking";
    }

    @Override
    public String talk() {
        return "Duck not talking";
    }

    @Override
    public String eat() {
        return "Duck eating";
    }
}
