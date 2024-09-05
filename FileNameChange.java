package FileNameChange;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileNameChange {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName = scnr.nextLine();

      FileInputStream fileInputStream = new FileInputStream(fileName);
      
      Scanner fileScanner = new Scanner(fileInputStream);      
      
      while(fileScanner.hasNextLine()){
         String photoName = fileScanner.nextLine();
         String newFileName = photoName.replace("_photo.jpg", "_info.txt");
         System.out.println(newFileName);
      }
      fileScanner.close();
      scnr.close();
   }
}
