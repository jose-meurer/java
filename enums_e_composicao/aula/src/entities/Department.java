package entities;

public class Department {

    private String name;
    private String responsible;

    public Department() {
    }

    public Department(String name, String responsible) {
        this.name = name;
        this.responsible = responsible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
}
