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


    public void drawGallows(Graphics g) {
        g.fillRect(150,100,1,500);
        g.fillRect(150,100,200,1);
        g.fillRect(350,100,1,100);
    }
    
    public void drawHead(Graphics g) {
        g.drawOval(305,200,100,100);
    }
    
    public void drawBody(Graphics g) {
        g.fillRect(350,300,1,200);
    }
    
    public void drawLeftArm(Graphics g) {
        g.fillRect(350,350,50,1);
    }
    
    public void drawRightArm(Graphics g) {
        g.fillRect(300,350,50,1);
    }
    
    public void drawLeftLeg(Graphics g) {
        g.drawLine(350,500,310,550);
    }
    
    public void drawRightLeg(Graphics g) {
        g.drawLine(350,500,390,550);
    }

}