package ua.com.hrv.task_1;

public class RobotCoocker extends Robot {
    RobotCoocker(String name) {
        super(name);
    }

    @Override
    public void Work() {
        System.out.println("Я RobotCoocker – я просто готую");
    }


}
