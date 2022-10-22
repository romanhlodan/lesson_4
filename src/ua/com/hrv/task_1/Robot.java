package ua.com.hrv.task_1;

public class Robot {
    private String name;

    Robot(String name){
        this.name = name;
    }

    public void Work (){
        System.out.println("Я Robot – я просто працюю");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
