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

}