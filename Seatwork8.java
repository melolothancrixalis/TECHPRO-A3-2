import java.util.ArrayList;
class Student {
private int id;
private String name;
Student(int id, String name) {
this = id;
this.name = name;
System.out.println("Student Created: " + name);
}

 void displayinfo() {
  
   System.out.println("ID: "+ id "NAME: * + name);
}

@Override
protected void finalize() throws throwable {
  System.out.println("Garbage Collector Destroying Students Object: " + name);
  }
}

public class Seatwork8 {
  public static void main(String[] args) {

    System.out.println("\n=== STUDENT RECORD SYSTEM ===");

    ArrayList<Student> student = new ArrayList<>();

    student.add(new Student(1. "Evernight"));

    student.add(new Student(2. "Robin"));

    student.add(new Student(3. "Lycaon"));

    System.out.println("\n--- DISPLAYING STUDENT RECORDS ---");

    for (Student s: student) {
      s.displayInfo();
    }

    System.out.println("\n--- REMOVING STUDENT RECORDS ---");

    Student.remove(0);

    Student.remove(0);

    System.out.printl("\n--- REQUESTING GARBAGE COLLECTION ---");

    System.ge();

    System.out.println("\n--- CREATING TEMPORARY STUDENT OBJECTS ---");

    for (int i= 4; i <= 20; i++) {

    Student temp = new Student(1, "TEMPSTUDENT" + 1);

  }

   System.out.println("\n--- CLEARING REMAZNING REFERENCE---");

   Student = null;

   System.out.println("\n--- REQUESTING GARBAGE COLLECTION AGAIN ---");
   System.ge();

   try {

   Thread.sleep(2000);
   } catch (InterruptedException e) {
   System.out.println(e);
   }
    System.out.println("\n=== PROGRAM ENDED ===");
  }
}
