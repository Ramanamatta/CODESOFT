import java.util.Scanner;

public class studentgradeconverter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of subjects");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i< marks.length;i++)
        {
            System.out.println("enter the marks of subject "+(i+1)+":");
            marks[i]=sc.nextInt();
            while(marks[i]<0|| marks[i]>100)
            {
                System.out.println("please enter the correct value for subject "+(i+1)+":");
                marks[i]=sc.nextInt();
            }
        }
        int total =0;
        double avgmark=0.0;
        String grade="";

        for(int i=0;i<marks.length;i++)
        {
            total+=marks[i];
        }

        avgmark=total/n;
        if(avgmark>=80)
        {
            grade="A";
        }
        else if(  avgmark>=70 && avgmark<80)
        {
            grade="B";
        }
        else if(avgmark>=60 && avgmark<70)
        {
            grade="C";
        }
        else if(avgmark>=50 && avgmark<60)
        {
            grade="D";
        }
        else if(avgmark>=40 && avgmark<50)
        {
            grade="E";
        }
        else  if(avgmark>=30 && avgmark<40)
        {
            grade="F";
        }
        else {
            grade="Fail";
        }
        System.out.println("Total Subjects:"+n);
        System.out.println("Total Mark:"+total);
        System.out.println("Average Mark:"+avgmark);


    }
}
