import java.io.file;
File myFile =newFile("example.txt");
    if(myFile.exists()){
    System.out.println("File exists:"myFile.getName());
}else{
    System.out.println("File does not exist");
}