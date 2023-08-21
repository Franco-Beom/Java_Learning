package exercise.chapter_29;

public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantitiy; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private  boolean isWrapppedUp; // 포장됨 여부

    //  행위
    void beWrapppedUp(){
        this.isWrapppedUp = true;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantitiy, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantitiy = waterQuantitiy;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrapppedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrapppedUp() {
        return isWrapppedUp;
    }
}
