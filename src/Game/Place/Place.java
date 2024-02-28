package Game.Place;

import java.util.ArrayList;
import java.util.List;

public class Place {
    public int x, y;
    public Place(int x, int y){
        this.x = x;
        this.y = y;
    }

    public List<Integer> getPosition (){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
    /*public int getX() {return x;}

    public int getY() {return y;}

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }*/

    @Override
    public String toString(){
        return x + "," + y;
    }
    public float distanceToTarget(Place target){
        float distance = (float) Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return distance;
    }

    public Place difference(Place target){
        Place diff = new Place(x - target.x, y - target.y);
        return diff;
    }

    public boolean equals(Place target){
        return x == target.x && y == target.y;
    }

}
