package exercise.chapter_34;

public class Customer {
    //속성
    static int serialNumber = 1;

    protected String customerId;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){};

    Customer(String name){
        this.customerId = "Customer" + serialNumber++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("CustomerId(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                            this.customerId, this.name, this.customerGrade, this.bonusPoint);
    }

}
