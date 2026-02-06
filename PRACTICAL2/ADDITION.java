package PRACTICAL2;

public class ADDITION {

    int num1;
    int num2;

    void ad() {
        int res = num1 + num2;
        System.out.println("Result = " + res);
    }

    public static void main(String[] args) {

        ADDITION obj1 = new ADDITION();
        obj1.num1 = 3;
        obj1.num2 = 4;
        obj1.ad();

        ADDITION obj2 = new ADDITION();
        obj2.num1 = 10;
        obj2.num2 = 20;
        obj2.ad();

        ADDITION obj3 = new ADDITION();
        obj3.num1 = 7;
        obj3.num2 = 8;
        obj3.ad();
    }
}



