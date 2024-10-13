class Students{
  int roll_no;
  String name;
  int marks;
}

public class Array_Of_Objects {
  public static void main(String[] args) {
    Students s1 = new Students();
    s1.roll_no = 1;
    s1.name = "Rishit";
    s1.marks = 92;

    Students s2 = new Students();
    s2.roll_no = 2;
    s2.name = "Rishi";
    s2.marks = 90;

    Students s3 = new Students();
    s3.roll_no = 3;
    s3.name = "Ram";
    s3.marks = 97;

    Students student[] = new Students[3];

    student[0] = s1;
    student[1] = s2;
    student[2] = s3;

    System.out.println(s1); //prints the address

    System.out.println(s1.name + " : " + s1.marks);
    System.out.println("");
    System.out.println("Roll Number -> Name : Marks");

    for (int i = 0 ; i<student.length ; i++ ) {
      System.out.println("    " + student[i].roll_no + "       -> " + student[i].name + " : " + student[i].marks);
    }
  }
}
