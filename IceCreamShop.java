package corejava2;

import java.util.Scanner;

public class IceCreamShop {
	
	public static void main(String[] args) {
		int counter = 0;
		int total = 0;
		System.out.println("Ice Cream Shop");
		System.out.println("====================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello...What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "! How are you today?" );
		System.out.println("Are you ready to order?" );
		int conti;
        String bill = "====================\nIce Cream Shop\n"
                + "Sl.no\tName\t\trate\tqty\tprice";
        do {
            System.out.println("1. Scoops");
            System.out.println("2. Exquisite");
            System.out.print("What would you like? ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            String scoop_ex = null;
            int rate = 0;
            int qty = 0;
            
            switch(choice) {
                case 1:
                    System.out.println("Scoop Menu");
                    System.out.println("1. Mango($2) \n2. Chilly($2) \n3. Taro($3) \n4. Strawberry($3)");
                    System.out.println("Enter your choice");
                    String scoop_choice = scanner.nextLine();
                    switch(scoop_choice) {
                        case "Mango":
                            scoop_ex = "Mango";
                            rate = 2;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Chilly":
                            scoop_ex = "Chilly";
                            rate = 2;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Taro":
                            scoop_ex = "Taro";
                            rate = 3;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Strawberry":
                            scoop_ex = "Strawberry";
                            rate = 3;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Exquisite Menu ($5 for all)");
                    System.out.println("1. Chocolate \n2. Milk \n3. Sesame \n4. Vanilla");
                    System.out.println("Enter your choice");
                    String ex_choice = scanner.nextLine();
                    switch(ex_choice) {
                        case "Chocolate":
                            scoop_ex = "Chocolate";
                            rate = 5;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Milk":
                            scoop_ex = "Milk";
                            rate = 5;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Sesame":
                            scoop_ex = "Sesame";
                            rate = 5;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        case "Vanilla":
                            scoop_ex = "Vanilla";
                            rate = 5;
                            System.out.print("How many would you like? ");
                            qty = scanner.nextInt();
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            counter++;
            total += rate * qty;
            bill += "\n" + counter+ ".\t" + scoop_ex + "\t\t" + rate + "\t" + qty + "\t" + (rate * qty);
            System.out.println(bill);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Your total amount is \t\t" + total);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Want to buy more? 0. Yes 1. No");
            conti = scanner.nextInt();
        } while(conti != 1);
    }

}
