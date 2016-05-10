package jman;
import java.awt.Color;
/**
 * An instance of this class is block.
 * @author Tunya Wittayasiripaiboon 5810546676
 */
public class Block extends Piece{
	/**
	 * Constructor of Block.
	 * @param x is position in x axis.
	 * @param y is position in y axis.
	 * @param m is map.
	 */
	public Block(int x , int y , Map m) {
		super(Piece.BLOCK, m);
		this.setX(x);
		this.setY(y);
		this.setColor(Color.WHITE);
	}
	/**
	 * Act method but this class won't perform any action.
	 */
	@Override
	public void act() {
		// TODO Auto-generated method stub

	}
	/**
	 * @return String of color of block at the position of itself.
	 */
	public String toString() {
		return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
	}

}
