package core.model;

public class Dancer extends BasePerson {
    private String groupName;

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    public Dancer(String groupName, String name, String designation) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void dance() {
        System.out.println("I can dance.");
    }
}
