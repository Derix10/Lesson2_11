package com.company;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"Лежать", "Сидеть"};
        Shelter shelter = new Shelter(" Ромашка ", " Чуй 1");
        Dog dog = new Dog("Rex", "Овчарка", commands, ColorEnum.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гав гав");

        System.out.println("-------------------------");
        Shelter shelter2 = new Shelter("Оганян"," Ул.Абдыкаимова");
        Dog mydog = new Dog("Азамат", "Бульдог", ColorEnum.GRAY, shelter2);
        System.out.println(mydog.getInfo());
        mydog.makeVoice("РРр");
        mydog.makeVoice();

        System.out.println("--------------------------");
        String[] commands1 = {"Прыгать","Бегать"};
        Shelter shelter3 = new Shelter("Нянька"," Ул.Токтогул");
        Dog myydog = new Dog("Керемет","Пупсик",commands1,ColorEnum.WHITE,shelter3);
        System.out.println(myydog.getInfo());
        mydog.makeVoice("Ав ав");





        System.out.println("----------------------------");// ДЗ
        Liar liar0 = new Liar("Степь","Россия");
        Tigress tigress = new Tigress(9,Teeth.BLUNT,liar0,71);
        System.out.println(tigress.getInfo());
        tigress.makeVoice();

        System.out.println("----------------------------");
        Liar liar = new Liar("Саванна","Африка");
        Baby_Tiger baby_tiger = new Baby_Tiger(3,Teeth.SHARP,liar,23,"Симба");
        System.out.println(baby_tiger.getInfo());
        baby_tiger.makeVoice("Рррууу");

        System.out.println("----------------------------");
        Liar liar1 = new Liar("Джунгли","Амазонка");
        Baby_Tiger baby_tiger2 = new Baby_Tiger(2,Teeth.STRAIGHT,liar1,23,"Сколь");
        System.out.println(baby_tiger2.getInfo());
        baby_tiger2.makeVoice("Мяу рррр");
    }
}
