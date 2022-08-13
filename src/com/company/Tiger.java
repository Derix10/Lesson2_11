package com.company;

public class Tiger {
    private int age;
    private Teeth teeth;
    private Liar liar;
    private int byteForces;

    public Tiger(int age, Teeth teeth, Liar liar,int byteForces) {

        this.age = age;
        this.teeth = teeth;
        this.liar = liar;
        this.byteForces = byteForces;
    }

    public int getAge() {
        return age;
    }

    public Teeth getTeeth() {
        return teeth;
    }

    public Liar getLiar() {
        return liar;
    }

    public int getByteForces() {
        return byteForces;
    }
}
