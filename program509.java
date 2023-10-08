import java.util.*;
import java.io.*;

class program509
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        try
        {
            boolean bRet = fobj.isDirectory();
            if(bRet == true)
            {
                File list[] = fobj.listFiles();
              for(int iCnt = 0; iCnt < list.length; iCnt++)
              {
                System.out.println("Number of files in that directory are : "+list[i].length+" list name"+list[i].getName);
              }
            }            
        }
        catch(Exception iobj)
        {
            System.out.println("Exception occured : "+iobj);
        }
    }
}