import java.awt.Color;

public class Pillar extends Piece {

	public Pillar(int x, int y, int c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if ( c == 0 ) this.setColor(Color.RED);
		else if ( c == 1 ) this.setColor(Color.GREEN);
		else if ( c == 2 ) this.setColor(Color.YELLOW);
	}
	public Pillar(int x ,int y, Color c, Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}
	  public String toString() {
	        return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	    }

}
