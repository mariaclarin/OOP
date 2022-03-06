package ForumWeek3;

import java.util.Scanner;

public class Drill14 {
    public static void main(String[] args){
        System.out.println("Hello ! I shall convert seconds into hours, minutes, and seconds."+"\n"+"-----------------------------------------------------------------");
        Scanner secInput = new Scanner(System.in);//new scanner named secInput
        int sec = secInput.nextInt(); //stores the user input in variable sec 
        while(sec<=0){
            System.out.print("Invalid input. Minimum input is 1, please reinput : ");
            int reSec = secInput.nextInt();
            sec = reSec;
        }

        //formula for convertion
        int hr = sec/3600;
        int min = (sec % 3600) / 60;
        int s = (sec % 3600) % 60;

        System.out.println("------------------------------------------------------");

        if(sec>1){
            System.out.println("The converted time from " + sec + " seconds are :"+"\n"+"Hour(s) : " + hr + "\n" + "Minute(s) : " + min + "\n" + "Second(s) : " + s);
        } else if(sec == 1){ 
            System.out.println("The converted time from " + sec + " second are :"+"\n"+"Hour(s) : " + hr + "\n" + "Minute(s) : " + min + "\n" + "Second(s) : " + s);
        } 

        secInput.close();
    }
}
