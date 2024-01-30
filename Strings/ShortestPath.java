import java.util.Scanner;

public class ShortestPath {

    public static float findShortestPath(String path){   // O(n)
        int x = 0, y = 0;


        for(int i=0; i<path.length(); i++){
            char str = path.charAt(i);

            if(str == 'N'){
                y++;
            } else if (str == 'S') {
                y--;
            } else if (str == 'E') {
                x++;
            }
            else {
                x--;
            }
        }
        int X = x*x;
        int Y = y*y;

        return  (float) Math.sqrt(X + Y);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
      float route = findShortestPath(path);
        System.out.println("The shortest distance to travel is " + route);
    }
}