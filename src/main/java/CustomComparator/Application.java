package CustomComparator;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Box b1 = new Box(1,1,2,3);
        Box b2 = new Box(2,1,4,3);
        Box b3 = new Box(3,2,4,3);
        Box b4 = new Box(4, 3,4,3);
        Box b5 = new Box(5, 4,4,3);

        Box[] boxArr = {b5, b3, b2, b4, b1};

        // sorts as per the compareTo method that was overriden. Hence sorts using volume
        Arrays.sort(boxArr);

        System.out.println(Arrays.toString(boxArr));

        // print comparison of box volume
        System.out.println(b1.compareTo(b2));
    }
}
