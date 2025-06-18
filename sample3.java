import java.io.file;
import java.util.Scanner;
Scanner sc=new Scanner(new File("data.txt"));
while(sc.hasNextLine()){
    System.out.println(sc.nextLine());
}
sc.close();