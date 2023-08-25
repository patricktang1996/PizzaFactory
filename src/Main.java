import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("==================================================");
            System.out.println("Welcome to Pizza Factory! Please choose your pizza!");
            System.out.println("1 > Bacon Pizza; 2 > Fruit Pizza; 3 > Exit" );
            Scanner sc =new Scanner(System.in);
            int choice = sc.nextInt();
            Pizza pizza = PizzaFactory.getPizza(choice);
            if(choice==3){
                break;
            }
            System.out.println(pizza.showPizza());
        }
    }
}