import java.util.*;


class program362
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str = sobj.nextLine();

        StringX obj = new StringX();
        String sret = obj.RemoveWhiteSpace(str);
        System.out.println(" the updated string is :"+sret);
    }
}

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
       return str.replaceAll("\\s","");
    }
}

