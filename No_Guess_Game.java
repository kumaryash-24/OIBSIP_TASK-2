import java.util.*;
import java.util.Random;
import javax.swing.*;

public class No_Guess_Game {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum attempts you want:");
             int maxAttempts=sc.nextInt();
        System.out.println("Enter the no.of rounds you want to play :");
             int Rounds=sc.nextInt();
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int Totalscore=0;
        JFrame f;
        f=new JFrame();
        for (int round = 1; round <= Rounds; round++) {
        int NoToGuess = random.nextInt(maxRange - minRange);
        int NoOfAttempts = 0;
        int Roundscore = 0;


        while (NoOfAttempts < maxAttempts) {
            int NoOfguessed = Integer.parseInt(JOptionPane.showInputDialog(f,
                "Round_No : " + round + "Guess the number between " + minRange + " and " + maxRange + ": "));
            NoOfAttempts++;

            if (NoOfguessed == NoToGuess) {
                Roundscore = maxAttempts - NoOfAttempts + 1;
                Totalscore+=Roundscore;
                JOptionPane.showMessageDialog(f,
                    "Congrats! You guessed the number in " + NoOfAttempts + " attempts. Your score is " + Roundscore + ".");
                break;
            } else if (NoOfguessed < NoToGuess) {
                JOptionPane.showMessageDialog(f, "Your guessed number is lower than generated random number. Try again.");
            } else {
                JOptionPane.showMessageDialog(f, "Your guessed number  is higher than generated random number. Try again.");
            }
        }

        if (NoOfAttempts == maxAttempts) {
            JOptionPane.showMessageDialog(f,
                "Attention!!!, you have reached the maximum number of attempts. The number was " + NoToGuess + ".");
        }
    }
    JOptionPane.showMessageDialog(f, "Game over!! Your total score is " + Totalscore +":");
     }
}