import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;    
        int quantity;
        double price;
        char currency='$';
        double total=0;

        System.out.print("Enter the item name: ");
        item = scanner.nextLine();
        System.out.print("enter the quantity:");
        quantity = scanner.nextInt();
        System.out.print("enter the price:");
        price = scanner.nextDouble();
      
        total = quantity * price;
        System.out.println("you have brought "+quantity+" "+item+"/s");
        System.out.println("The total price is "+currency+total);
        


        scanner.close();
    }
}