import java.util.Scanner;
public class Gameguessofno {
    public static void main(String[] args) {
    int hiddennumber;
    int maxAttempts = 4;
    int points = 0;
    System.out.print("Enter a number & you have Maximum attempts of " + maxAttempts + ": ");
    int attempt = 1;
    Scanner sc = new Scanner(System.in);
    try {
    hiddennumber = sc.nextInt();
    sc.nextLine();             // to consume newline character
    } catch (Exception e) {
    System.out.println("Invalid input. Please enter an integer number.");
    return;
    }
    int predict;
    do {
    System.out.println("Enter a number of your choice from 1 to 100");
    predict = sc.nextInt();
    if (predict == hiddennumber) {
    System.out.println("You guessed the correct number in " + attempt + " attempt(s)!");
    points = maxAttempts - attempt + 1;
    System.out.println("You earned " + points + " point(s)!");
    break;
    } else if (predict < hiddennumber) {
    System.out.println("The number you guessed is smaller than the hidden number.");
    } else if (predict > hiddennumber) {
    System.out.println("The number you guessed is larger than the hidden number.");
    }
    if (attempt == maxAttempts) {
    System.out.println("You crossed the attempts limit.");
    System.out.println("Incorrect answer. The right answer is: " + hiddennumber);
    break;
    }
    attempt++;
    } while (predict != hiddennumber);
    }
    }
    
       
    