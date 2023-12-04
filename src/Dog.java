public class Dog {
    public int age;
    public String specie;
    public String name;

    public Dog (int age, String specie, String name){
        this.age = age;
        this.specie = specie;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecie() {
        return specie;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println("Woof Woof!");
    }

    public String toString(){
        return ("This dog is a " + this.specie + " and is " + this.age + " years old.");
    }

}
