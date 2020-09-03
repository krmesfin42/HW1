/*
Name: Kirubel Negash
CptS 233: MicroAssignment #1
Date: 09/03/2020
gitRepo url:
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
