import java.util.Scanner;  
public class AmicableNumberExample1  
{  
public static void main (String args[])  
{  
int firstDivisorSum = 0, secondDivisorSum = 0, firstNumber, secondNumber;   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
//reading the first number  
firstNumber = sc.nextInt();  
System.out.print("Enter the second number: ");  
//reading the second number  
secondNumber = sc.nextInt();  
for(int i=1;i<firstNumber;i++)  
{  
//finds the divisors of the first number      
if(firstNumber % i == 0)  
{  
//finds the sum of divisors of the first number  
firstDivisorSum = firstDivisorSum + i;  
}  
}  
for(int i=1;i<secondNumber;i++)  
{  
//finds the divisors of the second number          
if(secondNumber % i == 0)  
{  
//finds the sum of divisors of the second number      
secondDivisorSum = secondDivisorSum + i;  
}  
}  
//comparing the sum of divisors with the given numbers   
//returns true if both conditions are true  
if((firstNumber == secondDivisorSum) && (secondNumber == firstDivisorSum))  
{  
System.out.println(firstNumber+", "+ secondNumber +" are amicable numbers.");  
}  
else  
{  
System.out.println(firstNumber+", "+ secondNumber +" are not amicable numbers.");  
}  
}  
}  
