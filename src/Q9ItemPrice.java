public class Q9ItemPrice {
    public static void main(String args[]) {
        int price, quantity, amount;
        price = Integer.parseInt(args[0]);
        quantity = Integer.parseInt(args[1]);;
        amount = price * quantity;
        if(quantity >= 10){
            amount *= 0.1;

        }
        System.out.println("Final Amount is: " + amount);
    }

}
