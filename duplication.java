class duplication
{
public static void main(String args[])
{

String s="SATHISH";
for(int i=0;i<s.length();i++)
{

boolean flag=false;
for(int j=0;j<i;j++)
{
if(s.charAt(i)==s.charAt(j))
{
 flag=true;

}
}
if(flag==false)
{
int k;int count=0;
for(k=i;k<s.length();k++)
{
if(s.charAt(i)==s.charAt(k))
count++;
}

System.out.print(s.charAt(i)+","+count+"");
}
}
}
}
