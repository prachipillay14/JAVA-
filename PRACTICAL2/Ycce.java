package PRACTICAL2;

public class Ycce {

    String collegeName = "YCCE";
    String department = "Computer Engineering";
    String studentName;
    int year;

    void showDetails() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Department : " + department);
        System.out.println("Student Name : " + studentName);
        System.out.println("Year : " + year);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        // Student 1
        Ycce s1 = new Ycce();
        s1.studentName = "Prachi";
        s1.year = 1;

        // Student 2
        Ycce s2 = new Ycce();
        s2.studentName = "Rahul";
        s2.year = 2;

        // Student 3
        Ycce s3 = new Ycce();
        s3.studentName = "Anjali";
        s3.year = 3;

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}

