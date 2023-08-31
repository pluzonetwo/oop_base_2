package homework2;

import java.net.Inet4Address;

class Cat extends Owner implements SoundMarker {
    private String name;
    private Integer age;

    public Cat(String name, Integer age, String ownerName) {
        super(ownerName);
        this.name = name;
        this.age = age;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void greet() {
        System.out.println("Meow! My name is " + name + ". I am " + age + " years old. My owner is " + getOwnerName() + ".");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
