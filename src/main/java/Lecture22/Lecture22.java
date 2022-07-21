package Lecture22;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void move();
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void move() {
        System.out.println("Собака " + name + " пошла по дороге");
    }
}

class Duck extends Animal {

    Duck(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Утка " + name + " пошла по дороге");
    }
}

class Fish extends Animal {

    Fish(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Рыба " + name + " поплыла по реке");
    }
}

public class Lecture22 {
    //Абстрактный класс для животного и наследники типа Собака, Утка и Рыба.
    // Для каждого вида сделать переопределяемый метод для движения и поле “кличка”.
    // Написать внятное описание для каждого обьекта и в цикле вывести в мейне.
    // Можете усложнить себе задачу на свое усмотрение.

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Барсик", "Немец");
        animals[1] = new Duck("Кряква");
        animals[2] = new Fish("Заяц");

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
