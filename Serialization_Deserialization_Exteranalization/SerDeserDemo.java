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
    int rollNo;
    transient String school; //If we dont want any variable to serialize then we can create that object as transientString name.

    public Student(String name, int rollNo, String school){
        this.name = name;
        this.rollNo = rollNo;
        this.school = school;
    
    }

    void show(){
        System.out.println("-----------Student Details---------");
        System.out.println("Name : "+ name);
        System.out.println("Roll No : "+ rollNo);
        System.out.println("School : "+ school);

    }
}

public class SerDeserDemo {
    
    public static void main(String[] args) throws Exception
    {
        //---------------Serialization------------
        FileOutputStream fos = new FileOutputStream("F:\\SP Core Java\\Code\\Java_IO\\Serialization_Deserialization_Exteranalization\\SD.txt");
    
        Student s1 = new Student("Vishal", 101, "KVS");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        //--------------Deserialization------------
        FileInputStream fis = new FileInputStream("F:\\\\SP Core Java\\\\Code\\\\Java_IO\\\\Serialization_Deserialization_Exteranalization\\\\SD.txt");
        
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student)ois.readObject();
        s.show();

        oos.close();
        ois.close();

    }
}
