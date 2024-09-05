package FileNameChange;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileNameChange {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName = scnr.nextLine();
      System.out.println("File name entered: " + fileName);

      FileInputStream fileInputStream = new FileInputStream(fileName);
      Scanner fileScanner = new Scanner(fileInputStream);      
      
      while(fileScanner.hasNextLine()){
         String photoName = fileScanner.nextLine();
         System.out.println("Original photo name: " + photoName);
         
         String newFileName = photoName.replace("_photo.jpg", "_info.txt");
         System.out.println("New file name: " + newFileName);
         

      }
      
      fileScanner.close();
      scnr.close();
   }
}
