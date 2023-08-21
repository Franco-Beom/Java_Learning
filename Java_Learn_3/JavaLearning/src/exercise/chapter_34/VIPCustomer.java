package exercise.chapter_34;

public class VIPCustomer extends Customer {
    static int serialNumber = 1;

    //속성
    private String agentId;
    private double discountRatio;

    //행위
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("담당직원 " + this.agentId + "님 문의드릴게 있어요~");
    }

    public VIPCustomer(String name){
        super();
        this.customerId = "VIP" + serialNumber++;
        //this.customerId = "VIP" + super.serialNumber++; // 선언을 지운 후 이처럼 상속받아도 됨
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    @Override
    void printMyInfo(){
        System.out.print("VIP");
        super.printMyInfo();
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
