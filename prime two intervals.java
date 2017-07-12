# prime-two-intervals
import java.io.*
import java.util.*;
public class prime two intervals
{
public static void main(String args[])throws IOException
{
int a=20,b=50,i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input:");
n=Integer.parseInt(br.readLine());
while(a<b)
{
boolean flag=false;
for(i=2;i<=a/2;i++)
{
if(a%i==0)
{
flag=true;
break;
}
}
if(!flag)
System.out.println(a +" ");
a++;
}
}
}
