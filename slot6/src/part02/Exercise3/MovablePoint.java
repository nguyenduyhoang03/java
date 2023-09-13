package part02.Exercise3;

public class MovablePoint implements Movable {
     int x;
     int y;
     int xSpeed;
     int ySpeed;
    public MovablePoint (int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "x: " + x  + ",y: " + " ,xSpeed: " +xSpeed + " ,ySpeed: " + ySpeed;
    }
    @Override
    public void moveUp(){
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft(){
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}
