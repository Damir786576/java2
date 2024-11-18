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
