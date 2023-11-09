package ObjectCloning.ShallowCopy;

public class Employee implements Cloneable{
    public int age;
    public String name;
    public String[] titles;

    public Employee(int age, String name, String[] titles) {
        this.age = age;
        this.name = name;
        this.titles = titles;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
