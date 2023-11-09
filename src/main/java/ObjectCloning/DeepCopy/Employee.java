package ObjectCloning.DeepCopy;

public class Employee implements Cloneable{
    int age;
    String name;
    String[] titles;

    public Employee(){

    }

    public Employee(int age, String name, String[] titles) {
        this.age = age;
        this.name = name;
        this.titles = titles;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone(); //creates a shallow copy
        copy.name = new String(copy.name);
        String[] titles = new String[copy.titles.length];

        for(int i=0; i<copy.titles.length; i++){
            titles[i] = new String(copy.titles[i]);
        }
        copy.titles = titles;
        return copy;

    }
}
