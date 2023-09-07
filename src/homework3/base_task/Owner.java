package homework3.base_task;

public class Owner {
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
}
