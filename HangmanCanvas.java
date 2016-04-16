package hangman;

import java.awt.*;
import static java.awt.Font.PLAIN;

/**
 *
 * @author julkata
 */
public class HangmanCanvas extends Canvas {
    
    final Font hangManFont = new Font("Helvetica", PLAIN, 50);

    protected boolean startGame = false;
    protected boolean makeHead = false;
    protected boolean makeBody = false;
    protected boolean makeLArm = false;
    protected boolean makeRArm = false;
    protected boolean makeLLeg = false;
    protected boolean makeRLeg = false;
    protected char[] word;
    protected char[] correctLetters = {};

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

    @Override
    public void paint (Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.WHITE);
        
        if(this.startGame) {
            drawGallows(g);
            dashOrLetter(g);
            if(makeHead) {
                drawHead(g);
                if(makeBody) {
                    drawBody(g);
                    if(makeLArm) {
                        drawLeftArm(g);
                        if(makeRArm) {
                            drawRightArm(g);
                            if(makeLLeg) {
                                drawLeftLeg(g);
                                if(makeRLeg) {
                                    drawRightLeg(g);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}