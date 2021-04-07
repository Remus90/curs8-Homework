package ro.fastrackit.curs8.Homework8.Exercitiul3;

public class Cat implements Animal {

    @Override
    public String walk() {
        return "cat walking";
    }

    @Override
    public String talk() {
        return "cat not talking";
    }

    @Override
    public String eat() {
        return "cat eating";
    }
}

