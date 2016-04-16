package hangman;

import java.awt.*;
import static java.awt.Font.PLAIN;

/**
 *
 * @author julkata
 */
public class HangmanCanvas extends Canvas {
    
    final Font hangManFont = new Font("Helvetica", PLAIN, 50);

    boolean startGame = false;
    boolean makeHead = false;
    boolean makeBody = false;
    boolean makeLArm = false;
    boolean makeRArm = false;
    boolean makeLLeg = false;
    boolean makeRLeg = false;
    char[] word;
    char[] correctLetters = {};

}