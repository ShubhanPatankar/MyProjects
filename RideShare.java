import java.util.Scanner;
import java.lang.Math;

public class RideShare {
    // All x, y, coordinates are in miles from the origin 0, 0.

    public static int minimumDistance(int userX, int userY, int d1X, int d1Y, int d2X, int d2Y, int d3X, int d3Y){
        int distance1 = (Math.abs(userY-d1Y) + Math.abs(userX-d1X));
        int distance2 = (Math.abs(userY-d2Y) + Math.abs(userX-d2X));
        int distance3 = (Math.abs(userY-d3Y) + Math.abs(userX-d3X));

        int min;
        if (distance1>distance2 && distance3>distance2){
            min = distance2;
        }
        else if(distance1>distance3 && distance2>distance3){
            min = distance3;
        }
        else {
            min = distance1;
        }
        return min;
    }

    public static int pickupMinutes(int userX, int userY, int d1X, int d1Y, int d2X, int d2Y, int d3X, int d3Y) {
        int x = minimumDistance(userX, userY, d1X, d1Y, d2X, d2Y, d3X, d3Y);
        int minutes = 2 * x;
        return minutes;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userX, userY;
        int d1X, d1Y;
        int d2X, d2Y;
        int d3X, d3Y;

        userX = scnr.nextInt();
        userY = scnr.nextInt();
        d1X = scnr.nextInt();
        d1Y = scnr.nextInt();
        d2X = scnr.nextInt();
        d2Y = scnr.nextInt();
        d3X = scnr.nextInt();
        d3Y = scnr.nextInt();

        System.out.println(pickupMinutes(userX, userY, d1X, d1Y, d2X, d2Y, d3X, d3Y));
    }
}