package genericType;

public class Animal {
    private String name;
    private int foot;

    public Animal(String name, int foot) {
        this.name = name;
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", foot=" + foot +
                '}';
    }
}

