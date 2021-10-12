package Task7;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(){
        this(" ", " ", 0, " ");
    }

    public User(final String firstName, final String lastName, final int age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final User user = (User) obj;
        return Objects.equals(this.email, user.email) && Objects.equals(this.firstName, user.firstName) &&
                Objects.equals(this.lastName, user.lastName) && Objects.equals(this.age, user.age);
    }

    @Override
    public int hashCode() {
        return 7 * this.getEmail().hashCode() +
                7 * this.getFirstName().hashCode() +
                7 * this.getLastName().hashCode() +
                 7 * this.getAge();
    }
}

