package marks;

import java.util.Scanner;
public class Marks {

       public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       String[] name=new String[5];
       int[] mark=new int[5];
       String[] grade=new String[5];
       
       for(int i=0;i<name.length;i++)
       {
         System.out.println("enter the name");
          name[i]=input.next();
       }
       for(int i=0;i<mark.length;i++)
       {
        System.out.println("enter the mark");
         mark[i]=input.nextInt();   
       if((mark[i]<100) && (mark[i]>75))
       {
      grade[i]= "A";
        
       }else if((mark[i]<75) && (mark[i]>60)){
          grade[i]="B";
          
       }else if((mark[i]<60) && (mark[i]>50)){
           grade[i]="C";
       }else if((mark[i]<50) && (mark[i]>40)){
           grade[i]="D";
       }else{
           grade[i]="E";
       }
 
       System.out.println("name\tmark\tgrade");
      System.out.println(name[i]+"\t"+mark[i]+"\t"+grade[i]);

    
       }}
}