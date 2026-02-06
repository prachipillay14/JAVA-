package PRACTICAL2;

public class BATCH {

    int batchno;
    String course;
    String teacher;
    String studentName;
    int rollNo;

    void displayDetails() {
        System.out.println("Batch No : " + batchno);
        System.out.println("Course : " + course);
        System.out.println("Trainer : " + teacher);
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        // Object 1
        BATCH obj1 = new BATCH();
        obj1.batchno = 1;
        obj1.course = "Java";
        obj1.teacher = "Puja ma'am";
        obj1.studentName = "Prachi";
        obj1.rollNo = 14;

        // Object 2
        BATCH obj2 = new BATCH();
        obj2.batchno = 1;
        obj2.course = "Java";
        obj2.teacher = "Puja ma'am";
        obj2.studentName = "Rahul";
        obj2.rollNo = 15;

        // Object 3
        BATCH obj3 = new BATCH();
        obj3.batchno = 1;
        obj3.course = "Java";
        obj3.teacher = "Puja ma'am";
        obj3.studentName = "Anjali";
        obj3.rollNo = 16;

        // Display details
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
}
