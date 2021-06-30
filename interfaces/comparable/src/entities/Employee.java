package entities;

public class Employee implements Comparable<Employee> { // Passar o objeto a ser comparado dentro dos <>

    private String name;
    private Double salary;
    private String order;


    public Employee(String name, Double salary, String order) {
        this.name = name;
        this.salary = salary;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - salary: " + getSalary();
    }

    @Override
    public int compareTo(Employee employee) {
        if (order.equals("NAME")) { //toUpperCase pq order recebe assim
            return getName().compareTo(employee.getName());
        }
        if (order.equals("SALARY")) {
            return getSalary().compareTo(employee.getSalary());
        }

        throw new RuntimeException("Invalid value.");
    }
}
