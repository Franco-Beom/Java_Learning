package exercise.chapter_34;

public class GolderCustomer extends Customer{
    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
       this.bonusPoint += price * bonusPointRatio;
       price -= price * discountRatio;
       return price;
    }

    GolderCustomer(String name){
        super();
        this.customerId = "Customer" + Customer.serialNumber++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPointRatio = 0.03;
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
    }

    @Override
    void printMyInfo() {
        super.printMyInfo();
    }
}
