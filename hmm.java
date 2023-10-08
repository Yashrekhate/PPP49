// JAVA PROGRAM 380 NANTAR KARAYCH AHE

import java.util.*;           

class hmm
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of array :");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize); 
        aobj.Accept();
        aobj.Display();
         
        int iRet = aobj.CheckNo();
        System.out.println("Product of all the odd numbers are :"+iRet);
        
    }
}

class ArrayX
{
    public int Arr[];
 
    public ArrayX(int iSize)
    {
         Arr = new int[iSize];
    }
 
    public void Accept()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number of elements :");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
        
    }

    public void Display()
    {
        System.out.println("Number of Elements in the array are :");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]); 
        }
    }
     
    public int CheckNo()
    {
        int iSum = 1;
      for(int iCnt = 0; iCnt < Arr.length; iCnt++)
      {
        if((Arr[iCnt] % 2)!= 0)
        {
           iSum = iSum * Arr[iCnt];
        }
      }
     return iSum;
    }
}