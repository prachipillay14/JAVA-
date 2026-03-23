class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("Splendor is running safely");
    }
}

public class bike {
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
