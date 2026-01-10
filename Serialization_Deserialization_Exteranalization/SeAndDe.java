package Serialization_Deserialization_Exteranalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{

    //If we dont want to serialize any variable then we can create that variable as transient or static.
    String name;
    int rollno;
    transient String school; //If we dont want any variable to serialize then we can create that object as transient.

    public Student(String name, int rollno, String school){
        System.out.println("Constructor of an object is not called when an object is deserialized..");
        this.name = name; 
        this.rollno = rollno;
        this.school = school;
    }

    public void show(){
        System.out.println("-------------Student details: --------------- ");
        System.out.println("Name : "+ name);
        System.out.println("RollNo : "+ rollno);
        System.out.println("School : "+ school);

    }
}

public class SeAndDe{
    public static void main(String[] args) throws Exception
    {
        //-----------------------------------Serialization-------------------------------------------------------
        FileOutputStream fos = new FileOutputStream("F:\\SP Core Java\\Code\\Java_IO\\Serialization_Deserialization_Exteranalization\\studentFile.txt");
        Student s1 = new Student("Vishal", 101,"KVS");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        //-----------------------------------Deserialization------------------------------------------------------
        FileInputStream fis = new FileInputStream("F:\\SP Core Java\\Code\\Java_IO\\Serialization_Deserialization_Exteranalization\\studentFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        s.show();

        oos.close();
        ois.close();


    }
}
