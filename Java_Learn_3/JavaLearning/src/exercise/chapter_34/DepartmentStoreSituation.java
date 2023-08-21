package exercise.chapter_34;

public class DepartmentStoreSituation {
    public static void main(String[] args) {
        // 전제상황
        int price = 10000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer = new VIPCustomer("손흥민");

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("이도"),
                customer, new Customer("나희도"), customer,
                new Customer("권은비"), customer, new VIPCustomer("태연"),
                new GolderCustomer("권유리")
        };

        // 시나리오
        for(Customer customerEach: customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();
    }
}
