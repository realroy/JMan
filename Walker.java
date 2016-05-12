import java.awt.Color;

public class Walker extends Piece {

	public Walker(int x , int y, int c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		this.setColor((c == 0 ? Color.RED : (c ==1 ? Color.GREEN : 
            Color.YELLOW)));
	}
	
	public Walker(int x, int y, Color c, Map m) {
        super(Piece.WALKER, m);
        this.setX(x);
		this.setY(y);
        this.setColor(c);
    }
	
	public String toString() {
        String color= "";
        return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
    }

	@Override
	public void act() {
		return;
	}

}
