package ro.fastrackit.curs8.homework8.exercitiul3;

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

