import java.io.File;

public class Test {
    public static void main(String[] args) {
        ReadFileExample file;
        File example;
        try {
            file = new ReadFileExample();
            example = file.createFile("C:\\Gin\\module 2\\IO Text File\\tinh tong cac so trong file\\src\\example.txt");
            file.readFileText(example);
        }catch (Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
