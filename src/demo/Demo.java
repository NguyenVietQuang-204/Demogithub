/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import DateTime.DateTime;
import Month.Month;
import java.util.Scanner;

/**
 *
 * @author Nguyen Viet Quang
 */
public class Demo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = scanner.nextInt();

        System.out.print("Nhap thang (so hoac ten): ");
        String monthInput = scanner.next();

        System.out.print("Nhap nam ");
        int year = scanner.nextInt();

        Month month = Month.Jan;
        try {
            month = Month.valueOf(monthInput);
        } catch (IllegalArgumentException e) {
            try {
                int monthNumber = Integer.parseInt(monthInput);
                month = Month.values()[monthNumber - 1];
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid month input");
                System.exit(0);
            }
        }

        DateTime dateTime = new DateTime(day, month, year);
        System.out.println("Thoi gian chuan: " + dateTime.toString());
    }
}
    
