import java.awt.Color;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
        this.setX(x);
        this.setY(y);
        if(c == 0) {
        	this.setColor(Color.RED);
        }
        else if(c == 1) {
        	this.setColor(Color.GREEN);
        }
        else if(c == 2) {
        	this.setColor(Color.YELLOW);
        }
        // Complete this
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
        // Complete this;
        
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){}
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        int moveX = 0,
        	moveY = 0;
        if(i == 0) {
        	moveY = -1;
        }
        else if(i == 1) {
        	moveY = 1;
        }
        else if (i == 2) {	
        	moveX = -1;
        }
        else if (i == 3) {	
        	moveX = 1;
        }

        if ( map.isInGrid(x + moveX,y + moveY) ){
        	if ( map.isEmpty(x + moveX, y + moveY) ){
        		map.move(x, y, x + moveX, y + moveY);
        	}
        	else if (canEat(moveX , moveY)) {
        		setColor(map.pieceAt(x + moveX,y + moveY).getColor());
        		map.move(x, y, x + moveX, y + moveY);
        	}
        }
        // Complete this
    }
    
    private boolean canEat(int moveX , int moveY) {
    	boolean firstCase 	= getColor() == Color.YELLOW 	&& map.pieceAt(x + moveX, y + moveY).getColor() == Color.GREEN,
    			secondCase 	= getColor() == Color.RED 		&& map.pieceAt(x + moveX, y + moveY).getColor() == Color.YELLOW,
    			thirdCase 	= getColor() == Color.GREEN 	&& map.pieceAt(x + moveX, y + moveY).getColor() == Color.RED;
    	
    	return firstCase || secondCase || thirdCase;
    }
    
    /** = representation of this piece */
    public String toString() {
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
