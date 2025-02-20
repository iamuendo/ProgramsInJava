package shape;
public class SHAPE 
{
    int base,height;
    void initialize()
    {
     base=4;
     height=5;   
    }
}
class TRIANGLE extends SHAPE
{
  void Area()
  {
   initialize();
   System.out.printf("Area=%.2f \n",(0.5*base*height));
  }
}
class RECTANGLE extends SHAPE
{
  void Area()
  {
   initialize();
   System.out.printf("Area=%d \n",(base*height));
  }
      
    public static void main(String[] args) 
    {
        // TODO code application logic here
    TRIANGLE figure1=new TRIANGLE();
    RECTANGLE figure2=new RECTANGLE();
    figure1.Area();
    figure2.Area();
    } 
}