public class Hogwarts {
    private String name;
    private String surname;
    private int transgression;
    private int magic;

    public Hogwarts(String name, String surname, int transgression, int magic) {
        this.name = name;
        this.surname = surname;
        this.transgression = transgression;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", transgression=" + transgression +
                ", magic=" + magic +
                '}';
    }
}

