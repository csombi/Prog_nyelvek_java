public class ReversablePoint extends Point implements Reversable {
  
  private int lastX, lastY;

  public ReversablePoint() {
    super();
    this.lastX = 0;
    this.lastY = 0;
  }

  public ReversablePoint( int x, int y ) {
    super(x, y);
    this.lastX = x;
    this.lastY = y;
  }

  @Override
  public void setX( int x ) {
    this.lastX = getX();
    super.setX( x );
  }

  @Override
  public void setY( int y ) {
    this.lastY = getY();
    super.setY( y );
  }

  @Override
  public void reverse() {
    setX( lastX );
    setY( lastY );
  }

  @Override
  public String toString() {
    return "Reversable " + super.toString();
  }
}
