public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, String surname, int transgression, int magic, int cunning, int determination, int
            ambition, int resourcefulness, int power) {
        super(name, surname, transgression, magic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // comparing students of faculties
    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        int score1 = student1.getCunning() + student1.getAmbition() + student1.getResourcefulness() +
                student1.getPower() + student1.getDetermination();
        int score2 = student2.getCunning() + student2.getAmbition() + student2.getResourcefulness() +
                student1.getPower() + student1.getDetermination();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Слизериниец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Слизериниец, чем " + student1.getSurname());
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
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }
}
