import java.awt.Color;

public class Walker extends Piece {

	public Walker(int x, int y , int c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
        this.setY(y);
        if ( c == 0 ) this.setColor(Color.RED);
        else if ( c == 1 ) this.setColor(Color.GREEN);
        else if ( c == 2 ) this.setColor(Color.YELLOW);
	}
	public Walker( int x, int y , Color c , Map m ){
		super(Piece.WALKER,m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}

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
	  public String toString() {
	        return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
	    }
}
