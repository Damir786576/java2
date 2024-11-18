public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindorStudents = new Gryffindor[3];

        gryffindorStudents[0] = new Gryffindor("Гарри", "Поттер", 90, 85, 95, 90, 100);
        gryffindorStudents[1] = new Gryffindor("Гермиона", "Грейнджер", 85, 90, 98, 92, 100);
        gryffindorStudents[2] = new Gryffindor("Рон", "Уизли", 88, 80, 85, 80, 90);

        printStudentDescriptions(gryffindorStudents);
    }

    public static void printStudentDescriptions(Gryffindor[] students) {
        for (Gryffindor student : students) {
            System.out.println(student.toString());
        }
    }
}