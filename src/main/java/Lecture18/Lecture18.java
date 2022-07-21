package Lecture18;

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}

//Написать класс для хранения некоего айди числового и строки с информацией
class Id {
    private int id;
    private String info;

    public Id(int id, String info) {
        this.id = id;
        this.info = info;
    }
}

//Написать класс для урока. В нем должен быть номер урока и флаг – завершен или нет.
class Lesson {
    private int number;
    private boolean isDone;

    public Lesson(int number, boolean isDone) {
        this.number = number;
        this.isDone = isDone;
    }
}

public class Lecture18 {
}
