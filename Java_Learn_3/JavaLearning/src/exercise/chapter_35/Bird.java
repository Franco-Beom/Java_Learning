package exercise.chapter_35;

public class Bird extends Animal {
    private long weight;
    private String color;

    @Override
    public void eat(String food){
        System.out.printf("새가 %s을 부리로 쪼아 먹고 있습니다.\n", food);
    }

    @Override
    public void sleep(){
        System.out.println("Bird.sleep");
    }

    public void fly(){
        System.out.println("Bird.fly");
    }
}
