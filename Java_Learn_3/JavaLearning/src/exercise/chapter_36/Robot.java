package exercise.chapter_36;

public class Robot implements Walkable {

    private String RobotId;
    private String modelName;
    private String color;

    @Override
    public void walk() {
        System.out.println(this.RobotId + " : Robot.walk");
    }

    public void helpPerson(Person person){
        String name = person.getName();
        System.out.println(this.RobotId + "가 "+ name +"을 돕습니다.");
    }

    public Robot(String robotId) {
        RobotId = robotId;
    }
}
