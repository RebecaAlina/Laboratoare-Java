package ex1;
//un numar de secunde dat, il transforma in ore,minute si secunde
import java.util.Scanner;

public class seconds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int seconds=-1;
        while(seconds<0) {
            System.out.print("Insert a number of seconds: ");
            seconds = scanner.nextInt();
        }
        int hours, minutes, secondsLeft=seconds;
        hours=seconds/3600;
        if(hours>0) {
            secondsLeft = seconds - 3600 * hours;
            minutes = secondsLeft / 60;
            if (minutes > 0)
                secondsLeft = secondsLeft - 60 * minutes;
            System.out.println(seconds + " seconds are equivalent to: " + hours + " hours, " + minutes + " minutes and " + secondsLeft + " seconds");
        }
        else {
            minutes = secondsLeft / 60;
            if (minutes > 0) {
                secondsLeft = secondsLeft - 60 * minutes;
                System.out.println(seconds + " seconds are equivalent to: " + minutes + " minutes and " + secondsLeft + " seconds");
            }
            else System.out.println(seconds + " seconds cannot form a minute");

        }
    }
}

