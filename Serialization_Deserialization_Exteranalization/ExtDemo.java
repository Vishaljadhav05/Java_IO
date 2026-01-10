package Serialization_Deserialization_Exteranalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable
{
    String name;
    int empId;
    String email;
    String phoneNo;

    public Employee(){

    }


    public Employee(String name , int empId, String email, String phoneNo){
        this.name = name;
        this.empId = empId;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        String[] new_email = email.split("@");
        String new_email1 = new_email[0];

        String[] new_phoneNo = phoneNo.split(" ");
        String new_phoneNo1 = new_phoneNo[1];

        out.writeUTF(name);
        out.writeInt(empId);
        out.writeUTF(new_email1);
        out.writeUTF(new_phoneNo1);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException{
        name = in.readUTF();
        empId = in.readInt();
        email = in.readUTF() + "@gmail.com";
        phoneNo = "+91 " + in.readUTF();
    }

    public void show(){
        System.out.println("Name: "+ name);
        System.out.println("Employee ID: "+ empId);
        System.out.println("Email ID: "+ email);
        System.out.println("Phone Number: "+ phoneNo);

    }
    
}

public class ExtDemo {
    public static void main(String[] args) throws Exception
    {
        Employee emp1 = new Employee("Vishal", 101, "Vishal@gmail.com", "+91 8269xxxxx");

        //Serilalization
        FileOutputStream fos = new FileOutputStream("F:\\\\SP Core Java\\\\Code\\\\Java_IO\\\\Serialization_Deserialization_Exteranalization\\\\employeeFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp1);

        //Deserealization
        FileInputStream fis = new FileInputStream("F:\\SP Core Java\\Code\\Java_IO\\Serialization_Deserialization_Exteranalization\\employeeFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e = (Employee)ois.readObject();
        e.show();

        oos.close();
        ois.close();
    
    }
}
