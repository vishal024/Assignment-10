import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Copy
{
   public static void main(String[] args)throws IOException
   {
      File fi=new File("E:\\abc.txt");
      File fw=new File("E:\\xyz.txt");
      FileInputStream input=new FileInputStream(fi);
      FileOutputStream output=new FileOutputStream(fw);
      try
      {
         int r;
         while((r=input.read())!=-1)
        { 
           output.write(r);
         }
       System.out.println("File copied successfuly");
       }
       catch(IOException e)
       {
          e.printStackTrace();
        }
     FileInputStream in=new FileInputStream(fw);
      int c;
      System.out.print("content of File xyz is:");
       while((c=in.read())!=-1)
       {
         System.out.print((char)c);
    }
}
}
           
           