import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        File myFile = new File("FileOne.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("FileOne.txt created successfully.");
            }
        }
        catch(IOException e){
            System.out.println("IOException occurred.");
        }
    }
}
