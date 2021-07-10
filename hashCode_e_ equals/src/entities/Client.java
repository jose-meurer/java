package entities;

import java.util.Objects;

public class Client implements IClient{

    private String name;
    private String email;
    private Integer age;


    public Client(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nome: "
                + getName()
                + "\nEmail: "
                + getEmail()
                + "\nIdade: "
                + getAge();
    }
}
