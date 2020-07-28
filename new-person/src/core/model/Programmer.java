package core.model;

public class Programmer extends BasePerson {
    private String companyName;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void code() {
        System.out.println("I can code.");
    }
}
