public class Q9ItemPrice {
    public static void main(String[] args){
        int price, quantity, total;
        double amount, dis;
        price = Integer.parseInt(args[0]);
        quantity = Integer.parseInt(args[1]);;
        System.out.println(price);
        System.out.println(quantity);

        total = price * quantity;


        if(quantity >= 10){
            dis = total * 0.1 ;

        }
        else {
            dis = 0;
        }
        amount = total - dis;

        System.out.println("Final Amount is: " + amount);
    }

}
