public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindorStudents = new Gryffindor[3];
        Hufflepuff[] hufflepuffStudents = new Hufflepuff[3];
        Ravenclaw[] ravenclawStudents = new Ravenclaw[3];
        Slytherin[] slytherinStudents = new Slytherin[3];

        gryffindorStudents[0] = new Gryffindor("Гарри", "Поттер", 100, 100, 100, 100, 100);
        gryffindorStudents[1] = new Gryffindor("Гермиона", "Грейнджер", 85, 90, 98, 92, 100);
        gryffindorStudents[2] = new Gryffindor("Рон", "Уизли", 88, 80, 85, 80, 90);

        hufflepuffStudents[0] = new Hufflepuff("Захария", "Смит", 92, 87, 95, 96, 95);
        hufflepuffStudents[1] = new Hufflepuff("Седрик", "Диггори", 88, 82, 85, 88, 90);
        hufflepuffStudents[2] = new Hufflepuff("Джастин", "Финч-Флетчли", 85, 80, 83, 84, 81);

        ravenclawStudents[0] = new Ravenclaw("Чжоу", "Чанг", 91, 78, 92, 100, 95, 100);
        ravenclawStudents[1] = new Ravenclaw("Падма", "Патил", 88, 84, 100, 88, 92, 83);
        ravenclawStudents[2] = new Ravenclaw("Маркус", "Белби", 82, 100, 89, 84, 98, 79);

        slytherinStudents[0] = new Slytherin("Драко", "Малфой", 0, 0, 0, 0, 0, 0, 0);
        slytherinStudents[1] = new Slytherin("Грэхэм", "Монтегю", 90, 82, 93, 97, 82, 99, 94);
        slytherinStudents[2] = new Slytherin("Грегори", "Гойл", 82, 85, 89, 91, 90, 82, 84);

        printGryffindor(gryffindorStudents);
        System.out.println();
        printHufflepuff(hufflepuffStudents);
        System.out.println();
        printRavenclaw(ravenclawStudents);
        System.out.println();
        printSlytherin(slytherinStudents);
        System.out.println();
        compareGryffindor(gryffindorStudents[1], gryffindorStudents[2]);
        System.out.println();
        compareHufflepuff(hufflepuffStudents[0], hufflepuffStudents[1]);
        System.out.println();
        compareRavenclaw(ravenclawStudents[0], ravenclawStudents[1]);
        System.out.println();
        compareSlytherin(slytherinStudents[1], slytherinStudents[2]);
        System.out.println();
        compareStudent(slytherinStudents[2], gryffindorStudents[1]);


    }
    // write all Students
    public static void printGryffindor(Gryffindor[] students) {
        for (Gryffindor student : students) {
            System.out.println(student.toString());
        }
    }
    public static void printHufflepuff(Hufflepuff[] students) {
        for (Hufflepuff student : students) {
            System.out.println(student.toString());
        }
    }
    public static void printRavenclaw(Ravenclaw[] students) {
        for (Ravenclaw student : students) {
            System.out.println(student.toString());
        }
    }
    public static void printSlytherin(Slytherin[] students) {
        for (Slytherin student : students) {
            System.out.println(student.toString());
        }
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

    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        int score2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Хафлпафец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Хафлпафец, чем " + student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() + " на одинаковом уровне.");
        }
    }

    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.getSmart() + student1.getCreativity() + student1.getWise() + student1.getWitty();
        int score2 = student2.getSmart() + student2.getCreativity() + student2.getWise() + student1.getWitty();

        if (score1 > score2) {
            System.out.println(student1.getSurname() + " лучший Равенкловец, чем " + student2.getSurname());
        } else if (score1 < score2) {
            System.out.println(student2.getSurname() + " лучший Равенкловец, чем " + student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() + " на одинаковом уровне.");
        }
    }

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
    // compare students by magic power and transgression distance
    public static void compareStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagic() + student1.getTransgression() > student2.getMagic() + student2.getTransgression()) {
            System.out.println(student1.getSurname() + " обладает бОльшей мощностью магии, чем " +
                    student2.getSurname());
        } else if (student1.getMagic() < student2.getMagic()) {
            System.out.println(student2.getSurname() + " обладает бОльшей мощностью магии, чем " +
                    student1.getSurname());
        } else {
            System.out.println(student1.getSurname() + " и " + student2.getSurname() +
                    " имеют одинаковую мощность магии. ");
        }
    }
}
