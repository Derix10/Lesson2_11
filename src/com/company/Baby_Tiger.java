package com.company;

public final class Baby_Tiger extends Tigress{
    private String name;

    public Baby_Tiger(int age,Teeth teeth, Liar liar,int byteForces, String name) {
        super(age, teeth, liar,byteForces);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nИмя: "+name;
    }
}
