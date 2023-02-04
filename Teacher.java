
public class Teacher {
     String Name;
     int Age;
     int Class;
     Student[] teacherStudents = new Student[3];


    Teacher() {
        Age = 0;
        Name = "noname";
        Class = 0;
    }

    public void students() {
        System.out.println("Teacher's students: ");
        for(int i = 0; i < 3; i++){
            teacherStudents[i] = new Student();
            teacherStudents[i].Name = ("Name" + i);
            teacherStudents[i].Age = 20 + i;
            teacherStudents[i].Class = 1;
        }
        for(int i = 0; i < 3; i++){
            int num = i + 1;
            System.out.println("    Student" + num + ":");
            System.out.println("    Class: " + teacherStudents[i].Class);
            System.out.println("    Age: " + teacherStudents[i].Age);
            System.out.println("    Name: " + teacherStudents[i].Name + "\n");

        }
    }

}
