package oefbooks;

public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, char gender, String email) {
        this.name = name;
        this.gender = gender;
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@"))
        {
            this.email = email;
        }
        else
        {
            this.email = null;
        }

    }

    @Override
    public String toString() {
        return String.format("%s \t gender is: %c \t e-mail: %s",getName(),getGender(),getEmail());
    }
}
