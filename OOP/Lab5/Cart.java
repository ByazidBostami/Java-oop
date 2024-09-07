public class Cart {
    public int cartNumber;
    public String[] items;
    public double[] prices;
    public int itemCount;
    public double discount;

   
    public Cart() {
        this.items = new String[3];
        this.prices = new double[3];
        this.itemCount = 0;
        this.discount = 0.0;
    }

    
    public void create_cart(int cartNumber) {
        this.cartNumber = cartNumber;
    }

    
    public void addItem(String item, double price) {
        if (itemCount < 3) {
            items[itemCount] = item;
            prices[itemCount] = price;
            itemCount++;
            System.out.println(item + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items in your cart");
        }
    }

   
    public void giveDiscount(double discount) {
        this.discount = discount;
    }

   
    public void cartDetails() {
        System.out.println("Your cart(c" + cartNumber + ") :");
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            total += prices[i];
        }
        System.out.println("Discount Applied: " + discount + "%");
        total = total - (total * (discount / 100));
        System.out.println("Total price: " + total);
    }
}
