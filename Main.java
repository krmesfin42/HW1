/*
Name: Kirubel Negash
CptS 233: MicroAssignment #1
Date: 09/03/2020
gitRepo url: https://github.com/krmesfin42/HW1.git
The program lets the user to enter the dimensions of a room and price per sq.ft of a desired carpet.
Display the cost of the carpet.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the room: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the room: ");
        double width = input.nextDouble();
        System.out.println("Enter the price per square foot of the desired carpet: ");
        double cost =input.nextDouble();
        RoomDimension dim = new RoomDimension(length,width);
        RoomCarpet room = new RoomCarpet(dim,cost);
        System.out.println(dim.toString() + dim.getArea());
        System.out.println(room.toString() + room.getTotalCost());
    }
}
