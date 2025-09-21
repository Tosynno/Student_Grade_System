// Abstract class (Day 20: Abstraction)
abstract class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract String getRole();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}