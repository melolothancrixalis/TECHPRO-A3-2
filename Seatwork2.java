class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }

class Person {
   
    private String name;
    private int age;

  
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; 
        }
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Student extends Person {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

 
    public void displayInfo() {
        System.out.println("--- Student Information ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
        System.out.println("---------------------------");
    }
}


public class MainProgram {
    public static void main(String[] args) {
        
        Student s = new Student();

        
        s.setName("Ton");
        s.setAge(16);

       
        s.setCourse("ICT");

        
        s.displayInfo();
    }
}
