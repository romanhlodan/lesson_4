package ua.com.hrv.task_1;

public class RobotDancer extends Robot {
    RobotDancer(String name) {
        super(name);
    }

    @Override
    public void Work() {
        System.out.println("Я RobotDancer – я просто танцюю");
    }
}
