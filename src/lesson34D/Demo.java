package lesson34D;

import java.*;
import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
     //   Solution.copyFileContent("C:\\Users\\Администратор\\Desktop\\From.txt", "C:\\Users\\Администратор\\Desktop\\To.txt");

        File source=new File("C:\\Users\\Администратор\\Desktop\\From.txt");
        File dest=new File("C:\\Users\\Администратор\\Desktop\\To.txt");
        Solution.copyFileUsingApacheCommonsIO(source,dest);
    }
}
