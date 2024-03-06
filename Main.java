import java.util.Objects;
import java.util.Scanner;

class Person{
    private int age;
    public String FIO;
    public String phone;

    Person(int age, String FIO, String phone){
        this.age = age;
        this.FIO = FIO;
        this.phone = phone;
    }

    public int getAge(){
        return this.age;
    }
}

class Student extends Person{
    public int course;
    public String facult;
    private int date;

    Student(int age, String FIO, String phone, int course, String facult, int date){
        super(age, FIO, phone);
        this.course = course;
        this.facult = facult;
        this.date = date;
    }

    public int getDate(){
        return this.date;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        students[0] = new Student(17, "Иванов И. И.", "+7(937)435-75-76", 1, "1", 2023);
        students[1] = new Student(19, "Петров П. П.", "+7(900)975-75-76", 2, "1", 2022);
        students[2] = new Student(19, "Сидоров Н. А.", "+7(637)455-78-96", 2, "3", 2022);

        for (Student student : students) {
            System.out.println(student.FIO);
            System.out.println(student.getAge());
        }

        System.out.println("Введите факультет: ");
        String facult = scanner.nextLine();
        for (Student student : students) {
            if (Objects.equals(student.facult, facult))
                System.out.println(student.FIO);
        }

        System.out.println("Введите год обучения: ");
        int date = scanner.nextInt();
        for (Student student : students) {
            if (student.getDate() > date)
                System.out.println(student.FIO);
        }
    }
}