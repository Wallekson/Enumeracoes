package application;

import entities.Client;
import entities.Order;
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
        Order order = new Order(OrderStatus.valueOf("orderStatus"), new Client(clientName,clientEmail,clientBirthDate));

        sc.close();
    }

}
