class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println("Name is : "+this.name);
        System.out.println("Age is : "+this.age);
    }
    //Default Constructor
    Student(){
        System.out.println("Default Constructor");
    }
    //Parameterized Constructor
    Student(String name, int age){
        System.out.println("Parameterized Constructor");
        this.name=name;
        this.age=age;
    }
    //Copy Constructor
    Student(Student s2){
        System.out.println("Copy Constructor");
        this.name=s2.name;
        this.age=s2.age;
    }
}

public class constructor{
    public static void main(String args[]){

        Student s=new Student("Abc", 19);
        s.printinfo();

        Student s2=new Student(s);
        s2.name="Stu2";
        s2.age=20;
        s2.printinfo();
    }
}