/**
 * Created by Сергей on 19.02.2017.
 */
public class Person {
    private final int age;
    private final String name;

    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static Person getPerson(int age, String name) { return new Person(age, name); }
    public int getAge() { return age; }
    public String getName() { return name; }
    public String toString() { return (name + " " + age); }
}
