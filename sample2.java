import java.io.*;
FileWriter Write=new file Write("out put.txt");
writer.writer("Hello,java FileWriter!");
writer.close();
FileReader reader=new FileReader("output.txt");
int ch;
while((ch=reader.read())!=-1){
System.out.print((char)ch);
}
reader.close()