package mavn.calculator;
import java.util.*;
public class calculator {
	
		public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter two numbers to perform operation");
		  Double first_no=sc.nextDouble();
		  Double second_no=sc.nextDouble();
		  System.out.println("Enter the type of operation to perform ");
		  char operation=sc.next().charAt(0);
		  Double result;
		  try {
		  switch(operation)
		  {
		      case '+':
		          {
		          result=first_no+second_no;
		          break;
		          }
		     case '-':
		         {
		             result=first_no-second_no;
		             break;
		         }
		     case '*':
		         {
		             result=first_no*second_no;
		             break;
		         }
		     case '/':
		         {
		             result=first_no/second_no;
		             break;
		         }
		    default:
		        {
		            System.out.println("Error! Please enter the correct operator");
		            return;
		         }
		  }
		  System.out.println(first_no+" "+operation+" "+second_no+" = "+result);
		}
		catch(Exception e)
		{
		    System.out.println("Cannot divide by Zero");
		}
		}
	}






