public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aruzhan");
        Student s2 = new Student(2, "Dias");


        Teacher t1 = new Teacher("Mr. Ivanov", "Java Programming");


        AttendanceRecord r1 = new AttendanceRecord(s1, true);
        AttendanceRecord r2 = new AttendanceRecord(s2, false);


        System.out.println(t1);
        System.out.println(r1);
        System.out.println(r2);


        System.out.println("Attendance equal? " + r1.equals(r2));
    }
}

