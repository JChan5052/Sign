public class Sign
{
  private String message;
  private int width;
  public Sign(String m, int w) 
  {
    message=m;
    width=w;
  }
  public int numberOfLines()
  {
    if (message.length()%width==0)
    {
      return message.length()/width;
    }
    return message.length()/width+1;
  }
  
  public String getLines()
  {
    String temp="";
    int temp2;
    int temp3;
    for (int i=0; i<=this.numberOfLines(); i++)
    {
    temp2 =i*width;
    temp3= i* width + width;
     if (temp3>=message.length())  
     {
       temp3=message.length();
       temp+=message.substring(temp2,temp3);
       i=this.numberOfLines()+1;
       break;
     }
     else temp+=message.substring(temp2,temp3)+";";
    }
    return temp;
  }
}