package jman;
import java.awt.Color;
/**
 * An instance of this class is Walker.
 * @author Tunya Wittayasiripaiboon 5810546676
 */
public class Walker extends Piece {
	/**
	 * Constructor of walker class.
	 * @param x is position in x axis.
	 * @param y is position in y axis.
	 * @param c is number which will use to determine what color to use.
	 * @param m is map.
	 */
	public Walker(int x, int y , int c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		if ( c == 0 ) this.setColor(Color.RED);
		else if ( c == 1 ) this.setColor(Color.GREEN);
		else if ( c == 2 ) this.setColor(Color.YELLOW);
	}
	/**
	 * Constructor of walker class.
	 * @param x is position in x axis.
	 * @param y is position in y axis.
	 * @param c is color.
	 * @param m is map.
	 */
	public Walker( int x, int y , Color c , Map m ){
		super(Piece.WALKER,m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Perform action with 1/3 walker will randomly move in either one direction of four .
	 */
	@Override
	public void act() {
		if ( Piece.rand(0, 2) == 0){
			int random = Piece.rand(0, 3);
			if ( random == 0 && this.getMap().isInGrid(this.getX(), this.getY()-1) && this.getMap().isEmpty(this.getX(), this.getY()-1)) {
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()-1);
			}
			else if ( random == 1 && this.getMap().isInGrid(this.getX(), this.getY()+1) && this.getMap().isEmpty(this.getX(), this.getY()+1)) {
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()+1);
			}
			else if ( random == 2 && this.getMap().isInGrid(this.getX()-1, this.getY()) && this.getMap().isEmpty(this.getX()-1, this.getY())){
				this.getMap().move(this.getX(), this.getY(), this.getX()-1, this.getY());
			}
			else if ( random == 3 && this.getMap().isInGrid(this.getX()+1, this.getY()) && this.getMap().isEmpty(this.getX()+1, this.getY())){
				this.getMap().move(this.getX(), this.getY(), this.getX()+1,this.getY() );
			}
		}	
	}
	/**
	 * @return String of color of walker at the position of itself.
	 */
	public String toString() {
		return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
	}
}
