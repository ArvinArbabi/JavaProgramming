/* Arvin Arbabi
 * CIS 257
 * This program takes the amount of watts a device consumes
 * and the amount of hours you use it for, then outputs the 
 * total amount of watts with the cost.
 * 
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class utilityArbabi {
    public static void main(String[] args) {
        final int MonthDays = 30;
        final double DollarsPerWH = 0.00005;
        final boolean RunTime = true;

        Scanner sc = new Scanner(System.in);
       
        // defining all of the integers
        int whWattHours = 0;
        int compWattHours = 0;
        int lightWattHours = 0;

        // outer for loop for number of runs
        for (int i = 0; i < 2; i++) {
            System.out.println("Run #: " + (i + 1));
            
            // getting water heater watt from user input
            while (RunTime) {
                System.out.print("How many watts for the Water Heater? (> 0): ");
                whWattHours = sc.nextInt();
                if (whWattHours < 0) {
                    continue;
                }
                else {
                    break;
                }
            }    
           
            // getting water heater hourly usage from user input
            while (RunTime) {
                System.out.print("How many hours/day do you run the Water Heater? (>0): ");
                int hours = sc.nextInt();
                if (hours < 0) {
                    continue;
                }
                else {
                    whWattHours *= hours * MonthDays;
                    System.out.println();
                    break;
                }
            }
            
            // getting computer watt from user input
            while (RunTime) {
                System.out.print("How many watts for the Computer Equipment? (> 0): ");
                compWattHours = sc.nextInt();
                if (compWattHours < 0) {
                    continue;
                }
                else {
                    break;
                }
            }

            // getting computer hourly watt usage from user input
            while (RunTime) {
                System.out.print("How many hours/day do you run the Computer Equipment? (>0): ");
                int hours = sc.nextInt();
                if (hours < 0) {
                    continue;
                }
                else {
                    compWattHours *= hours * MonthDays;
                    System.out.println();
                    break;
                }
            }
            
            // getting light watt from user input
            while (RunTime) {
                System.out.print("How many watts for the Lights? (>0): ");
                lightWattHours = sc.nextInt();
                if (lightWattHours < 0) {
                    continue;
                }
                else {
                    break;
                }
            }

            // getting light hourly watt usage from user input
            while (RunTime) {    
                System.out.print("How many hours/day do you run the Lights? (>0): ");
                int hours = sc.nextInt();
                if (hours < 0) {
                    continue;
                }
                else {
                    lightWattHours *= hours * MonthDays;
                    System.out.println();
                    break;
                }
            }
            
            // calculating the amount of watts used in the month and its cost
            int monthlyWatts = whWattHours + compWattHours + lightWattHours;
            double totalCost = monthlyWatts * DollarsPerWH;
            
            // printing out the watts used this month
            System.out.println("You have used " + monthlyWatts + " Watt-Hours of electricity.");
            
            // formatting the double so that it displays up to 2 decimal places
            NumberFormat formatter = NumberFormat.getCurrencyInstance();

            //printing out the formatted total cost
            System.out.println("Your total bill this month is: " + formatter.format(totalCost));
        }
        sc.close();
    }  
}

//================================================================[test run]========================
// (first run through uses the same numbers as the example in order to check if the code works properly)

//PS C:\work\javaprogramming\lab2>  c:; cd 'c:\work\javaprogramming\lab2'; & 'C:\Users\arvin_5blwkdx\AppData\Local\Programs\Eclipse Foundation\jdk-11.0.12.7-hotspot\bin\java.exe' '-agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:58715' '-cp' 'C:\Users\arvin_5blwkdx\AppData\Roaming\Code\User\workspaceStorage\3eb794a2982564f27b3445241398cb1b\redhat.java\jdt_ws\lab2_45c05263\bin' 'utilityArbabi' 
// Run #: 1
// How many watts for the Water Heater? (> 0): 4000
// How many hours/day do you run the Water Heater? (>0): -11
// How many hours/day do you run the Water Heater? (>0): 12

// How many watts for the Computer Equipment? (> 0): 750
// How many hours/day do you run the Computer Equipment? (>0): 24

// How many watts for the Lights? (>0): 900
// How many hours/day do you run the Lights? (>0): 16

// You have used 2412000 Watt-Hours of electricity.
// Your total bill this month is: $120.60
// Run #: 2
// How many watts for the Water Heater? (> 0): 120
// How many hours/day do you run the Water Heater? (>0): 2

// How many watts for the Computer Equipment? (> 0): 250
// How many hours/day do you run the Computer Equipment? (>0): 1

// How many watts for the Lights? (>0): 10000
// How many hours/day do you run the Lights? (>0): 24

// You have used 7214700 Watt-Hours of electricity.
// Your total bill this month is: $360.74
// PS C:\work\javaprogramming\lab2>
