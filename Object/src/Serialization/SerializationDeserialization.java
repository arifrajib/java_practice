package Serialization;

import java.io.*;

public class SerializationDeserialization {

    public static void main(String[] args) {

        /*
        Serialization Object
         */
        Person person1 = new Person("Arif", "Islam");
        try {
            FileOutputStream fs = new FileOutputStream("person.obj");
            ObjectOutputStream out = new ObjectOutputStream(fs);

            out.writeObject(person1);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



        /*
        Deserialization Object
         */
        FileInputStream fsin = null;
        try {
            fsin = new FileInputStream("person.obj");
            ObjectInputStream fin = new ObjectInputStream(fsin);

            Person person2 = (Person) fin.readObject();
            fin.close();

            System.out.println("First Name "+person2.getFirstName()+" Last Name "+person2.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }



    }


}
