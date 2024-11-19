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

    // compare students by magic power and transgression distance
    public static void compareStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagic() + student1.getTransgression() > student2.getMagic() + student2.getTransgression()) {
            System.out.println(student1.getSurname() + " обладает большей мощностью магии, чем " +
                    student2.getSurname());
        } else if (student1.getMagic() < student2.getMagic()) {
            System.out.println(student2.getSurname() + " обладает большей мощностью магии, чем " +
                    student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() +
                    " имеют одинаковую мощность магии. ");
        }
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

