class Animal 
{
    public void getsound()
    {
        System.out.println("Animal is Barking");
    }
}
class Dog extends Animal
{
     public void getsound()
    {
      System.out.println("Dog is Barking");
    }

}
public class Animalsoundoverriding {
    public static void main(String[]args)
    {
     Animal A1= new Animal();
     Dog D1= new Dog();
     A1.getsound();
     D1.getsound();
    }    
}
