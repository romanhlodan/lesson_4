package ua.com.hrv.task_1;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("Robot");
        robot.Work();

        CoffeRobot coffeRobot = new CoffeRobot("CoffeRobot");
        coffeRobot.Work();

        RobotDancer robotDancer = new RobotDancer("RobotDancer");
        robotDancer.Work();

        RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker");
        robotCoocker.Work();

        Robot [] arr = {robot, coffeRobot, robotDancer, robotCoocker};
        for (int i =0 ; i < arr.length; i++){
            arr[i].Work();
        }
    }
}
