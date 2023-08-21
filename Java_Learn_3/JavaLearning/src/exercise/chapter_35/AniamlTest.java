package exercise.chapter_35;

public class AniamlTest {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Animal aniaml2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal aniaml5 = new Dog();

//        feed(animal, "빼빼로");
        feed(aniaml2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(aniaml5, "고기");
    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}
