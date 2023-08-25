import java.util.Scanner;

public class PizzaFactory {
    //to create a pizza object(return pizza)
    public static Pizza getPizza(int choice){
        Scanner scanner=new Scanner(System.in);
        Pizza p = null;
        if(choice==1){
            System.out.println("Please enter the size of the pizza:");
            int size = scanner.nextInt();
            System.out.println("Please enter the price of the pizza:");
            int price = scanner.nextInt();
            System.out.println("Please enter the weight of the bacon:");
            int baconWeight = scanner.nextInt();
            BaconPizza bp=new BaconPizza("Bacon pizza",price,size,baconWeight);
            p=bp;
        } else if (choice==2) {
            System.out.println("Please enter the size of the pizza:");
            int size = scanner.nextInt();
            System.out.println("Please enter the price of the pizza:");
            int price = scanner.nextInt();
            System.out.println("Please enter the topping of the pizza:");
            String topping= scanner.next()+scanner.nextLine();
            FruitPizza fp=new FruitPizza("Fruit pizza",price,size,topping);
            p=fp;
        }else if(choice==3){
            System.out.println("Exit");
        }else{
            System.out.println("Please enter number 1-3");
        }
        return p;
    }
}
