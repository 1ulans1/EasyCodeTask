package Lecture23;

//Напишите фабрику разработчиков. У вас должен быть абстрактный работник с запрлатой и опытом и 3 уровня работников –
// Junior, Middle, Senior реализации. Написать фабрику в которой определить по опыту или зарплате какой нужно
// предоставить обьект работника. А еще можно сделать метод который принимает аргументом какое-то количество
// технологий которые должны знать работники и в зависимости от количества выбирается уровень работника.
abstract class Developer {
    String name;
    int salary;
    int experience;

    public Developer(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    abstract void work();
}

class JuniorDeveloper extends Developer {
    public JuniorDeveloper(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    @Override
    void work() {
        System.out.println("Новичок " + name + " работает");
    }
}

class MiddleDeveloper extends Developer {
    public MiddleDeveloper(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    @Override
    void work() {
        System.out.println("Миддл " + name + " работает");
    }
}

class SeniorDeveloper extends Developer {
    public SeniorDeveloper(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    @Override
    void work() {
        System.out.println("Профессионал " + name + " работает");
    }
}

class DeveloperFactory {
    public static Developer getDeveloper(int experience) {
        if (experience > 3) {
            return new SeniorDeveloper("Слава", 100000, experience);
        } else if (experience > 1) {
            return new MiddleDeveloper("Макс", 50000, experience);
        } else if (experience > 0) {
            return new JuniorDeveloper("Жора", 10000, experience);
        } else {
            throw new IllegalArgumentException("Неверный опыт");
        }
    }
}

public class Lecture23 {
    public static void main(String[] args) {
        Developer developer = DeveloperFactory.getDeveloper(3);
        developer.work();
    }
}
