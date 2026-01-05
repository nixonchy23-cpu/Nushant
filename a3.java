import java.util.Scanner;
public class a3{
    
public static void main(String[] args){
String[] students={"Saroj","Sushant","mukul","leon","kushal"};
System.out.println("Initial student lists");
for(String student:students){
System.out.println(student);
 
}
System.out.println("Second element" +""+students[2]);
 students[4]="prasannata";
 System.out.println("updating element in index"+students[4]);
 Scanner sc=new Scanner(System.in);
 System.out.println("\n Enter a new student name to update to index 1");
 String newname=sc.nextLine();
 students[1]=newname;
 System.out.println("\n Final Updated Student Lists");
 for(int i=0;i<students.length;i++){
 System.out.println(students[i]);

 }
 
 
 
}
}