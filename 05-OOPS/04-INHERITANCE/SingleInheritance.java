class Vehicle{
    public
     int tyres;
     public void settyres(int tyres)
     {
        this.tyres = tyres;
     }
     public int gettyres()
     {
        return tyres;
     }
   }
   class Car extends Vehicle
  {
   String colour;
   public String getcolour()
   {
    return colour;
   }
  }
  public class SingleInheritance
  {
  public static void main (String []args)
  {
    Car var12= new Car();
    var12.colour ="Red";
    var12.settyres(4);
    System.out.println(var12.gettyres()+ "\n" +var12.getcolour());
  }
}
