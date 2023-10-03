package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        Order order = new Order(OrderStatus.valueOf(orderStatus), new Client(clientName,clientEmail,clientBirthDate));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.println("Enter #" + i + 1 +" item data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quant = sc.nextInt();
            OrderItem orderItem = new OrderItem(quant,productPrice,productName);
            
        }

        sc.close();
    }

}
