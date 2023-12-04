public class Person {

    public String name;
    public String lastName;
    public int age;
    public String address;

    public Person(){
        this.address = "Center of the world";
    }

    public Person(String name, String lastName, int age, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void describe(){
        System.out.println(this.name+ " " + this.lastName + " is " + this.age + " years old and leaves in:"+this.address);
    }
}
