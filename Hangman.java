package hangman;

import java.util.Scanner;
import javax.swing.JFrame;
import java.util.Random;
import java.io.CharArrayWriter;

/**
 *
 * @author julkata
 */
public class Hangman {

    protected char[] word = null;
    protected CharArrayWriter correctLetters;
    protected int lives = 6;
    protected HangmanCanvas canvas;

    public char[] getWord() {
        return this.word;
    }

    public static void main(String[] args) {

        Boolean quit = false;

        System.out.println("Welcome to hangman!");
        System.out.println("Rules of the game:");
        System.out.println("Your job is to try to find out the secret word, by guessing one letter at\n" +
                            "a time. But beware! If you incorrectly select a letter that is not in\n" +
                            "the secret word, you will be one step closer to hanging on the gallows!\n" +
                            "The secret word is made up of letters a-z. ");
        System.out.println("Do you want to play? Enter ‘q’ to quit, ‘p’ to play");

        Scanner scan = new Scanner(System.in);
        String play = scan.nextLine();


        if(play.equals("q")) {
            quit = true;
            System.out.println("K, thanks, bye!");
        }
        else if(play.equals("p")) {
            Hangman game = new Hangman();
            game.playGame();
        }
        else {
            System.out.println("Selection error");
        }
    }

    public Hangman() {
        this.correctLetters = new CharArrayWriter();
    }

    public static JFrame hangmanFrame(HangmanCanvas canvas) {
        JFrame frame = new JFrame("Hangman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
        return frame;
    }
}