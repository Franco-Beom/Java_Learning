package exercise.chapter_36;

public class Airplane implements Flyable{

    //속성
    private String airplaneId;
    private long remainFuelAmt;
    private long maximumCapacity;

    @Override
    public void fly() {
        System.out.println("비행기 ID(" + airplaneId + ")가 납니다.");
    }

    public void refillFuel(long fuel){
        remainFuelAmt += fuel;
    }

    public Airplane(String airplaneId) {
        this.airplaneId = airplaneId;
    }
}
