import java.util.Scanner;
public class ATM extends UserAccount implements Transaction
{
double balance=0;
static long amount;
static long amt;
public void deposit()
{

balance=balance+amount;
System.out.println("_____________________");
System.out.println("Deposited :"+amount);
System.out.println("_____________________"); 
}
public void withdrawl()
{
if(balance>=amt&&amt>0)
{
balance=balance-amt;
System.out.println("_____________________");
System.out.println("Withdrawn :"+amt);
System.out.println("_____________________");
} 
else
{ 
System.out.println("_____________________");
System.out.println("INSUFFICIENT BALANCE");
System.out.println("______________________");
} 
}
public void CheckBalance()
{
System.out.println("_____________________");
System.out.println("Balance :"+balance);
System.out.println("_____________________");
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ATM b=new ATM();
b.details();
char ch;
do
{
System.out.println("WElOME TO OUR SERVICES");
System.out.println("A. Display Account Details");
System.out.println("B. Deposit");
System.out.println("C. Withdrawl");
System.out.println("D. Check Balance");
System.out.println("E. Exit");
System.out.println("Enter Your Choice");
ch=sc.next().charAt(0);
switch(ch)
{
case 'A':
{
b.display();
break;
}
case 'B':
{
System.out.println("Enter the Amount to Deposit :");
amount=sc.nextLong();
b.deposit();
System.out.println("______________________");
break;
}
case 'C':
{
System.out.println("Enter the Amount to Withdraw :");
amt=sc.nextLong();
b.withdrawl();
System.out.println("______________________");
break;
}
case 'D':
{
b.CheckBalance();
System.out.println("______________________");
break;
}
case 'E':
{
System.out.println("______________________");
System.out.println("THANK YOU");
System.out.println("______________________");
break;
}
}
} while(ch!='E');
sc.close(); 
}
}
