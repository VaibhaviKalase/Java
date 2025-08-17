/* PS :- Given a route containing 4 directions (E,W,N,S).
    Find the shortest path to react destination "WNEENESENNN"*/

public class ShortestPath {
    public static float getPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            // East
            if(dir == 'E'){
                x++;
            }
            // West
            else if(dir == 'W'){
                x--;
            }
            // South
            else if(dir == 'S'){
                y--;
            }
            // North
            else{
                y++;
            }
        }
        float x2 = x*x;
        float y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getPath(path));
    }
}
