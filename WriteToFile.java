
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            long l=0;
            int j=2;
            int counter=0;

            for(int i=2;i<2000000;i++)
            {   
                for(j=2;j<=i;j++)
                {
                    if(i%j==0){
                        counter++;
                    }
                }
                if(counter==1)
                myWriter.write(i);
            }
            
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}