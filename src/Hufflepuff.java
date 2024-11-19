public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int transgression, int magic, int hardworking, int loyal,
                      int honest) {
        super(name, surname, transgression, magic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    // comparing students of faculties
    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        int score2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Пуфендуец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Пуфендуец, чем " + student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() + " на одинаковом уровне.");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", transgression=" + getTransgression() +
                ", magic=" + getMagic() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
