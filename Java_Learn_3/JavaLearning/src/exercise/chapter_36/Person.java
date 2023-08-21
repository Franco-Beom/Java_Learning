package exercise.chapter_36;

public class Person extends Animal implements Walkable {
    private String name;
    private String job;
    private int height;

    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s을 젓가락으로 먹는다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("Person.sleep");
    }

    @Override
    public void walk(){
        System.out.println("Person.walk");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
