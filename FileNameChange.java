package FileNameChange;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileNameChange {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName = scnr.nextLine();
      System.out.println("File name entered: " + fileName);
      
      scnr.close();
   }
}
