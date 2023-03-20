package Aufgabe20;


@CSVEntity
public class Person {
    @CSVField("Name")
    private String name;

    @CSVField("Age")
    private int age;

    @CSVField("Height")
    private int height;

    public Person() {
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter und Setter Methoden...



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
