package exercise.chapter_29;

public class CoffeeShopSituation {

    public static void main(String[] args){
        //미리 초기화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        // 로직시작
        String coffeeName = "카푸치노";
        Boolean isTakeOut = true;

        customer.askCoffee(cashier, coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 50, 30);
        barista.sayCoffeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        customer.drinkCoffee(coffeeCompleted);
        if(coffeeCompleted.getCoffeeName() == coffeeName && coffeeCompleted.isWrapppedUp() == isTakeOut){
            customer.upgradeMyFeeling();
        }

        customer.showMayInfo();

    }
}
