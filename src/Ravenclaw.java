public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, int transgression, int magic, int smart, int wise, int
            witty, int creativity) {
        super(name, surname, transgression, magic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    // comparing students of faculties
    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.getSmart() + student1.getCreativity() + student1.getWise() + student1.getWitty();
        int score2 = student2.getSmart() + student2.getCreativity() + student2.getWise() + student1.getWitty();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Когтевранец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Когтевранец, чем " + student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() + " на одинаковом уровне.");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", transgression=" + getTransgression() +
                ", magic=" + getMagic() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
