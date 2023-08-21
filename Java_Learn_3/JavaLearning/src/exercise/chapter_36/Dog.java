package exercise.chapter_36;

public class Dog extends Animal {

    @Override
    public void eat(String food) {
        System.out.printf("개는 %s 을 단단한 이빨로 뜯고 있습니다.", food);
    }

    @Override
    public void sleep() {
        System.out.println("Dog.sleep");
    }
}
