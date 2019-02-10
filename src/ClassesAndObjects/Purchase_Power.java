package ClassesAndObjects;

public class Purchase_Power {
    private static int MAX_SALES = 100;
    private static int sales = 0;
    private static Manager jim = new Manager("Jim");
    private static Manager bob = new Manager("Bob");
    private static Stock_Item beans = new Stock_Item(jim, "beans");
    private static Stock_Item franks = new Stock_Item(bob, "franks");

    public static void main(String[] args) {
        while (sales < MAX_SALES) {
            if (beans.buy(2))
                sales = sales+1;
            if (franks.buy(5))
                sales = sales + 1;
        }
    }
}

class Manager {
    private String name;

    public Manager(String id) {
        name = id;
    }

    public void order_stock(Stock_Item out_of_stock_item) {
        System.out.println("Manager " +name+ " is ordering more " + out_of_stock_item.brand());

    }
}

class Stock_Item {
    private static int inventory = 0;
    private String name;
    private Manager product_buyer;

    public Stock_Item (Manager controller, String product_name) {
        name = product_name;
        product_buyer = controller;
    }

    public String brand() {
        return name;
    }

    public boolean buy( int amount) {
        boolean success = false;
        if (amount <= inventory) {
            inventory = inventory - amount;
            success = true;
        }
        else
            product_buyer.order_stock(this);
        return success;
    }

    public void replenish(int amount) {
        inventory = inventory+amount;
    }
}
