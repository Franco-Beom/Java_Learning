package exercise.chapter_35;

public class Fish extends Animal{
    private boolean havingPoison;
    private String livingSea;

    @Override
    public void eat(String food){
        System.out.printf("물고기가 %s을 주둥이로 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("Fish.sleep");
    }
}
