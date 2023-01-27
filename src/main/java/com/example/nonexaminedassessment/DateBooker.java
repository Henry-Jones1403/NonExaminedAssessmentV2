package com.example.nonexaminedassessment;

import java.util.ArrayList;
import java.time.LocalDate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
public class DateBooker {



    public static void TimeSetter(){
        ArrayList<Integer> allTimes = new ArrayList<>();
        for (int i = 9; i < 17; i++) {
            allTimes.add(i);
        }
    }

    public static void Times(LocalDate Date){
        try{
           // DateFormat formatter1 = DateFormat.
           // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            TimeSetter();

            SQLhandling.print("SELECT * FROM Gym WHERE BookingDate = '" + "28/01/2023" +"'", "", "");

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
