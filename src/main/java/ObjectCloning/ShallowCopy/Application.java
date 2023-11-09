package ObjectCloning.ShallowCopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(34, "Rahul Sanghania", new String[]{"Dev", "QA"});
        Employee copy = (Employee)e1.clone();

        copy.titles[0] = "Manager";

        /*
         Show that only a Shallow copy is made.
         titles for both original and copy gets updated.
         */
        System.out.println(Arrays.toString(e1.titles));
        System.out.println(Arrays.toString(copy.titles));
    }
}
