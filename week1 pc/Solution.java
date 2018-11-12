
import java.util.LinkedList;

import java.util.Scanner;

class Node1
{
	
int data;
	
Node1 next;
	
Node1(int a)
	{
		
this.data=a;
		
this.next=null;

}
}
class list
{
	
int size=0;

Node1 Head;
	
list()
	{
		
Head=null;
	
}
	
public void pushFirst(int a)
	{
		
Node1 value=new Node1(a);
		
size++;
		
if(Head==null)
	{
			
Head=value;
		
}
		
else
		
{
			
value.next=Head;
			
Head=value;
	
}
	
}
	
public void add(int a)
	{
		
Node1 value=new Node1(a);
		
size++;
		
if(Head==null)
		
Head=value;
		
else
	{
			
Node1 temp=Head;
			
while(temp.next!=null)
			
{
				
temp=temp.next;
			
}
			
temp.next=value;
		
}
		
//System.out.print(Disp());
	
}
	public int popEnd()
	
{
		
size--;
		
Node1 temp=Head;
		
if(Head==null)
		
{
			
int c=0;
			
return c;
		
}
		
else
		
{
		
if(temp.next==null)
		
{
			
int b=temp.data;
			
Head=null;
			
return b;
		
}
		
else
		
{
			
//Node1 temp=Head;
			
while(temp.next.next!=null)
			
{
				
temp=temp.next;
			
}
			
int a=temp.next.data;
			
temp.next=null;
			
return a;
		
}
		
}
		
		
	
}
	public String Disp()
	
{
		
Node1 temp1=Head;
		
String s="";
		
if(temp1==null)
		
{
			
return null;
		
}
		
else
		
{
		
while(temp1!=null)
		
{
			
s+=temp1.data;
			
temp1=temp1.next;
			
//System.out.println(temp1.data);
		
}
		
}
		
//System.out.println("dis"+s);
		
return s;
	
}
}




class AddLargeNumbers {
    
    
public static LinkedList numberToDigits(String number) {
	
	String s=number;
    	
list n1=new list();
    
	//System.out.println(s);
    	
for(int i=0;i<s.length();i++)
    	
{
    		int a=s.charAt(i);
    		
n1.add(a);
    		
//System.out.println(one.Disp());
    

	}
    	
//System.out.println(one.Disp());
		
return n1;

		

   
 }

   
 public static String digitsToNumber(LinkedList list) {
		
Node1 temp1=result.Head;
	
	String s="";
		
if(temp1==null)
		{

return null;
		
}
		
else
	
{
		
while(temp1!=null)

{
			
s+=temp1.data;
			
temp1=temp1.next;
			
//System.out.println(temp1.data);
		
}
		}
		
//System.out.println("dis"+s);
		
return s;

    }

   
 public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
		
{
		

int l1=pDigits.size;
    	
int l2=qDigits.size;
		
list n2=new list();
       
 int a=pDigits.popEnd;
		

int b=qDigits.popEnd;
		
int x=a+b+carry;


    }
}


public class Solution {
   
 public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);
       
 String input = sc.nextLine();
       
 String p = sc.nextLine();
        
String q = sc.nextLine();
       
 switch(input){
            
case "numberToDigits":
                
LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
               
 LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                
System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                
System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                
break;

            
case "addLargeNumbers":
               
 LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                
LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                
LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                
System.out.println(AddLargeNumbers.digitsToNumber(result));
              
  break;
      

  }
    }
    
}
