import java.awt.Color;

public class Pillar extends Piece {
    
    public Pillar(int x, int y, int c , Map m) {
        super(Piece.PILLAR, m);
        this.setX(x);
		this.setY(y);
        this.setColor((c == 0 ? Color.RED : (c ==1 ? Color.GREEN : Color.YELLOW)));
    }
    
    public Pillar(int x, int y, Color c, Map m) {
        super(Piece.PILLAR, m);
        this.setX(x);
		this.setY(y);
        this.setColor(c);
    }
    
    public String toString() {
        String color= "";
        return getColorWord() + " Pillars at (" + getX() + ", " + getY() + ")";
    }
    
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
    }