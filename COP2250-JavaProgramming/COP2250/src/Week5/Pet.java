package Week5;

public class Pet {
    private String color;
    private String name;
    private int age;


    Pet() {
        this.color = "null";
        this.name = "null";
        this.age = 0;
    }

    Pet(String color, String name, int age){
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Your pet is a " + color + " named " + name + " and they are " + age + " years old";
    }

}
