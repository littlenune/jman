package jman;
import java.awt.Color;
/**
 * An instance of this class is pillar.
 * @author Tunya Wittayasiripaiboon 5810546676
 */
public class Pillar extends Piece {
	/**
	 * Constructor of Pillar class.
	 * @param x is position in x axis.
	 * @param y is position in y axis.
	 * @param c is number which will use to determine what color to use.
	 * @param m is map.
	 */
	public Pillar(int x, int y, int c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if ( c == 0 ) this.setColor(Color.RED);
		else if ( c == 1 ) this.setColor(Color.GREEN);
		else if ( c == 2 ) this.setColor(Color.YELLOW);
	}
	/**
	 * Constructor of Pillar class.
	 * @param x is position in x axis.
	 * @param y is position in y axis.
	 * @param c is number which will use to determine what color to use.
	 * @param m is map.
	 */
	public Pillar(int x ,int y, Color c, Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Perform action when 1/3, it will random the color of pillar and set to one another.
	 */
	@Override
	public void act() {
		if ( Piece.rand(0, 2) == 0){
			int random = Piece.rand(0, 2);
			if ( random == 0){
				this.setColor(Color.RED);
			}
			else if ( random == 1){
				this.setColor(Color.GREEN);
			}
			else this.setColor(Color.YELLOW);
		}
	}
	/**
	 *  @return String of color of pillar at the position of itself.
	 */
	public String toString() {
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}

}
