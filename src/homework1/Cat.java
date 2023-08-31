package homework1;

class Cat extends Owner {
    private String name;
    private Integer age;

    public Cat(String name, Integer age, String ownerName) {
        super(ownerName);
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
        if (getOwnerName() != null){
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getOwnerName() + ".");
        } else {
            System.out.println("Вы не указали имя владельца");
        }
    }
}
