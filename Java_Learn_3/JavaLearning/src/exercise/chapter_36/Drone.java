package exercise.chapter_36;

public class Drone implements Flyable{

    private String droneId;
    private long remainFuelAmt;
    private long remainingFileStorage;

    public void takePicture(){
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }

}
