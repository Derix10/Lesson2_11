package com.company;

import java.util.Random;

public class Pet {

    private int age = generateDefauitAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public Shelter getShelter(Shelter shelter) {
        return this.shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefauitAge(){
        Random random = new Random();
        return random.nextInt(10)+1;
    }
    public String getInfo(){
        return "Возраст: "+age+"\nЦвет: "+colorEnum+"\nНазвание приюта "+shelter.getName()+
                "\nАдрес приюта"+ shelter.getAddress();
    }
}
