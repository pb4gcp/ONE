package com.ci.one;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        String hour = dtf.format(LocalDateTime.now());
        int hr = Integer.parseInt(hour);
        String greet = "Good ??";
        
        if (hr < 12) {
        	greet = "Good Morning";
        } else if (hr < 16) {
        	greet = "Good Afternoon";
        } else if (hr < 20) {
        	greet = "Good Evening";
        } else {
        	greet = "Good Night";
        }
        
        System.out.println(greet);
    }
}