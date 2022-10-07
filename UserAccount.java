import java.util.Scanner;
public class UserAccount {
long acc_no;
String name;
Scanner sc = new Scanner(System.in);
public void details()
{
System.out.println("Enter the Account no:");
acc_no=sc.nextLong();
System.out.println("Enter Name:");
name=sc.next();
}
public void display()
{
System.out.println("***********************************");
System.out.println("----------------------------------------------");
System.out.println("Account no:"+acc_no+"\n"+"Name:"+name+"\n");
System.out.println("----------------------------------------------");
}
}