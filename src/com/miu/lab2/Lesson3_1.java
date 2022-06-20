package com.miu.lab2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lesson3_1 {
    public static void main(String[] args) {
        Date date = dateFromLocalDate(LocalDate.of(1970, 1, 1));
        //num hours = milliseconds/60 * 60 * 1000

        long numHoursDay1 = date.getTime() / (60 * 60 * 1000);
        //output numHours to the console
        System.out.println(numHoursDay1);

        ///////////////

        date = dateFromLocalDate(LocalDate.of(1970, 1, 2));
        //num hours = milliseconds/60 * 60 * 1000

        long numHoursDay2 = date.getTime() / (60 * 60 * 1000);
        //output numHours to the console
        System.out.println(numHoursDay2);

        System.out.println(numHoursDay2 - numHoursDay1);
    }

    public static Date dateFromLocalDate(LocalDate localDate) {

        Calendar cal = new GregorianCalendar(localDate.getYear(),
                localDate.getMonth().getValue() - 1,
                localDate.getDayOfMonth());
        return cal.getTime();

    }
}
