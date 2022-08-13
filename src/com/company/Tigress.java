package com.company;

public class Tigress extends Tiger{
    public Tigress( int age, Teeth teeth, Liar liar,int byteForces) {
        super(age, teeth, liar,byteForces);
    }
    public final void makeVoice(){
        System.out.println("PPPPPP");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public String  getInfo(){
        return  "\nВозраст: "+super.getAge()
                +"\nНазвание логовы: "+super.getLiar().getName()
                +"\nГде находится логово: "+ super.getLiar().getWhereIsLiar()+
                "\nЗубы : "+super.getTeeth()+"\nСила укуса: "+super.getByteForces();
    }
}
