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

    public HangmanCanvas(char[] word) {
        super();
        this.word = word;
    }

    public void setStartGame(boolean startGame) {
        this.startGame = startGame;
    }
    
    public void setMakeHead(boolean makeHead) {
        this.makeHead = makeHead;
    }
    
    public void setMakeBody(boolean makeBody) {
        this.makeBody = makeBody;
    }
    
    public void setMakeLArm(boolean makeLArm) {
        this.makeLArm = makeLArm;
    }
    
    public void setMakeRArm(boolean makeRArm) {
        this.makeRArm = makeRArm;
    }
    
    public void setMakeLLeg(boolean makeLLeg) {
        this.makeLLeg = makeLLeg;
    }
    
    public void setMakeRLeg(boolean makeRLeg) {
        this.makeRLeg = makeRLeg;
    }
    
    public void setCorrectLetters(char [] correctLetters) {
        this.correctLetters = correctLetters;
    } 

}