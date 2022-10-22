package ua.com.hrv.task_2;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Леопард", 70, 3);
        System.out.println("Назва тварини = " + animal.getName() + ", " + "Швидкість тварни = " + animal.getSpeed() + "км/год, " + "Вік тварини = " + animal.getAge() + "р.");
        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);
        System.out.println("Назва тварини = " + animal.getName() + ", " + "Швидкість тварни = " + animal.getSpeed() + "км/год, " + "Вік тварини = " + animal.getAge() + "р.");

    }
}
