package Game.Place;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return x + "," + y;
    }

    public double distanceToTarget(Position target){
        double distance = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return distance;
    }

    public Position getDifference(Position target){
        Position diff = new Position(x - target.x, y - target.y);
        return diff;
    }

    public boolean equals(Position target){
        return x == target.x && y == target.y;
    }

}
