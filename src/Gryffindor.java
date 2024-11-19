public class Gryffindor extends Hogwarts {
    private int bravery;
    private int honor;
    private int nobility;

    public Gryffindor(String name, String surname, int transgression, int magic, int bravery, int honor, int
            nobility) {
        super(name, surname, transgression, magic);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    // comparing students of faculties
    public static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.getBravery() + student1.getHonor() + student1.getNobility();
        int score2 = student2.getBravery() + student2.getHonor() + student2.getNobility();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Гриффиндорец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Гриффиндорец, чем " + student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() + " на одинаковом уровне.");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", transgression=" + getTransgression() +
                ", magic=" + getMagic() +
                ", bravery=" + bravery +
                ", honor=" + honor +
                ", nobility=" + nobility +
                '}';
    }
}
