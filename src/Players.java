public class Players {

    private int id;
    private String name;
    private String position;
    private int age;
    private double value;

    public Players(int id, String name, String position, int age, double value) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void print(){

        System.out.println(" ID:" + getId()+ " Name: " + getName() + " Position: " + getPosition() + " Age: " + getAge() + " Value:  " + getValue());

    }


}
