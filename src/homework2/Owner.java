package homework2;

public class Owner implements SoundMarker {
    private String ownerName;

    public Owner(String name) {
        this.ownerName = name;
    }

    public Owner() {
        this(null);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void makeSound() {
        System.out.println(getOwnerName() + " calls the animal.");
    }
}

