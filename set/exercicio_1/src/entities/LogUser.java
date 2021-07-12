package entities;

import java.util.Date;
import java.util.Objects;

public class LogUser {

    private String name;
    private Date dateUser;

    public LogUser(String name, Date dateUser) {
        this.name = name;
        this.dateUser = dateUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateUser() {
        return dateUser;
    }

    public void setDateUser(Date dateUser) {
        this.dateUser = dateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogUser logUser = (LogUser) o;
        return Objects.equals(getName(), logUser.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", date: " + getDateUser();
    }
}
