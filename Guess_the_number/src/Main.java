import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int numberOfAttemptsMade=0;
        int numberOfGuess=10;
        int numberToBeGuessed=random.nextInt(100);
        Boolean attempt=false;
    while(attempt!=true){
        System.out.print("--------------------------\n");
        System.out.print("Enter the number: ");
        int answer=sc.nextInt();
        if(answer==numberToBeGuessed){
            attempt=true;
            break;
        }
        else if(numberOfGuess<numberOfAttemptsMade){
            System.out.print("Out of chances\n");
            System.out.print("--------------------------\n");
            break;
        }
        else{
            numberOfAttemptsMade++;
            System.out.print("Wrong Choice\n");
            if(answer<numberToBeGuessed)
                System.out.println("The number you guessed is less than the number to be guessed\n");
            else
                System.out.println("The number you guessed is more than the number to be guessed\n");
            attempt=false;
            System.out.print("--------------------------\n");
        }
        }
    if(attempt==true)
        System.out.println("You have guessed the correct answer! Congratulations!!!");
    else
        System.out.println("Better Luck next time!!!");
    }
}