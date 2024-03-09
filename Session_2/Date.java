package Session_2;

public class Date {
    private int dd, mm, yy; // instance variable

    public void initDate() {
        dd = mm = yy = 1;
    }

    public void setDate() {
        dd = 29;
        mm = 02;
        yy = 2024;
    }

    public void displayDate() {
        System.out.println("Date = [" + dd + "/" + mm + "/" + yy + "]");
    }

    public static void main(String[] agrs) {

        // Date d ;//reference variable
        // d = newDate ();//object creation
        Date d = new Date();
        // .(dot)operator
        d.initDate();
        d.displayDate();
        d.setDate();
        d.displayDate();

    }

}