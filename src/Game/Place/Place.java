package Game.Place;

public class Place {
    int X, Y;
    public Place(int x, int y){
        X = x;
        Y = y;
    }
    int getX() {
        return X;
    }
    int getY() {
        return Y;
    }
    @Override
    public String toString(){
        return X + "," + Y;
    }
    public float distanceToTarget(Place target){
        float distance = (float) Math.sqrt(Math.pow(X - target.X, 2) + Math.pow(Y - target.Y, 2));
        return distance;
    }

}
