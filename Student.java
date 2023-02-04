public class Student {
     int Age;
     int Class;
     String Name;

    public void birthday() {
        Age++;
        System.out.println("Happy birthday, " + Name + "!");
    }
    public void newClass() {
        Class++;
        System.out.println("Class of " + Name + " is " + Class + " now!");
    }


    private int Attendance;

    public int getAttendance() {
        return Attendance;
    }

    public void setAttendance (int attendance) {
        this.Attendance = attendance;
        System.out.println("Student's attendance is now " + attendance + "!");
    }
}
