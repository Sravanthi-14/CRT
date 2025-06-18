import java.io.*;
public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("C://Users//sscha//Desktop//new-java//SE-DSE//student_example.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student student2 = (Student) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Deserialization Successful! Loaded Object:");
            student2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
