import java.awt.Color;

public class Block extends Piece {
	
    public Block(int x, int y, Map m){
        super(Piece.BLOCK, m);
        setColor(Color.WHITE);
        this.setX(x);
        this.setY(y);
    }
    
    public String toString() {
        String color= "";
        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
    }

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
}    