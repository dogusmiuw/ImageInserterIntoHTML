/*
*  @author dogusmiuw
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filePath = "";
        String fileName = "";
        
        System.out.println("Enter file path (includes \\) : ");
        filePath = scan.nextLine();
        System.out.println("Enter file(output file) name : ");
        fileName = scan.nextLine();
        fileName += ".html";
        System.out.println("Enter image number : ");
        int pageNumber = scan.nextInt();
        System.out.println("Enter image type(jpeg,png etc.) : ");
        String imgType = scan.next();

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath+fileName));
			bw.write("<center>\n\n");
            for(int i = 0; i < pageNumber; i++){
                bw.write("<img src='"+(i+1)+"."+imgType+"'><br>\n");
			}
			bw.write("\n</center>");
            bw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }






    }


}
