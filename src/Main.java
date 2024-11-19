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
        Gryffindor.compareGryffindor(gryffindorStudents[1], gryffindorStudents[2]);
        System.out.println();
        Hufflepuff.compareHufflepuff(hufflepuffStudents[0], hufflepuffStudents[1]);
        System.out.println();
        Ravenclaw.compareRavenclaw(ravenclawStudents[0], ravenclawStudents[1]);
        System.out.println();
        Slytherin.compareSlytherin(slytherinStudents[1], slytherinStudents[2]);
        System.out.println();
        Hogwarts.compareStudent(slytherinStudents[2], gryffindorStudents[1]);


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

}
