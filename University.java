public class University {
    public static void main(String[] args){
        Teacher Teacher1 = new Teacher();
        Teacher Teacher2 = new Teacher();
        Teacher Teacher3 = new Teacher();

        Teacher1.Name = "Name1";
        Teacher1.Age = 35;
        Teacher1.Class = 1;

        Teacher2.Name = "Name1";
        Teacher2.Age = 35;
        Teacher2.Class = 1;

        Teacher3.Name = "Name1";
        Teacher3.Age = 35;
        Teacher3.Class = 1;

        Teacher1.students();
        Teacher2.students();
        Teacher3.students();

        Teacher1.teacherStudents[1].birthday();
        System.out.println(Teacher2.teacherStudents[1].getAttendance());
        Teacher3.teacherStudents[2].newClass();
        Teacher2.teacherStudents[1].setAttendance(1);


    }
}
