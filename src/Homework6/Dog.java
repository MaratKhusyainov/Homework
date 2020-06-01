package Homework6;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гавкает");
    }

    @Override
    public void run(int a) {
        if (a > 500) {
            System.out.println("Лежит высунув язык");
        } else {
            System.out.println("Собажка пробежала " + a + " m");
        }

    }

    @Override
    public void swim(int b) {
        if (b > 10) {
            System.out.println("Собака тонет");
        } else {
            System.out.println("Собака проплыла " + b + " m");
        }
    }

    public void nameInfo() {
        System.out.println("Имя собаки: " + name);
    }
}
