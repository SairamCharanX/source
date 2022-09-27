//User creates a text file using FileOutputStream
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class WritingToFile
{
	public static void main(String[] args) throws IOException
	{
		//Linking DataInputStream object to System.in (Keyboard)
		DataInputStream dis=new DataInputStream(System.in);

		//Link the file to which the data will be written.
		FileOutputStream fos=new FileOutputStream("E:\\fos.txt");

		
        //BufferedOutputStream uses an object of FileOutputStream
		BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
		System.out.println("Pass '!' after text to terminate reading.");
        System.out.println("Enter text:");
		char c;

        //Reading each character from DataOutputStream object into char c.
        //And, from char c into the BufferedOutputStream object.
		//Looping over every input character until the termination character is read (!)
		while((c=(char)dis.read())!='!')
		{
			bos.write(c);
		}
		//close the file
		bos.close();
	}
}
