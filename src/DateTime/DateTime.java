/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import Month.Month;

/**
 *
 * @author Nguyen Viet Quang
 */
public class DateTime {
    private int day;
    private Month month;
    private int year;

    public DateTime(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = Month.values()[month - 1];
        } else {
            throw new IllegalArgumentException("Invalid month value");
        }
    }

    public void setMonth(String month) {
        try {
            this.month = Month.valueOf(month);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid month value");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%02d %s %04d", day, month.name(), year);
    }
 
}
