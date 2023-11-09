package ObjectCloning.DeepCopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(34, "Surya Shekhar", new String[]{"Dev", "QA"});
        Employee copy = (Employee) e1.clone();

        copy.name = "Surya Shekhar Rao";
        copy.titles[0] = "Manager";

        System.out.println(e1.name + " " + Arrays.toString(e1.titles));
        System.out.println(copy.name + " " + Arrays.toString(copy.titles));

    }
}
