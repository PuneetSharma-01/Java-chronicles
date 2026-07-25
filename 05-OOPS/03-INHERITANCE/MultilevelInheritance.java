class Animal
    {
        private int legs;
        public void setanimal(int legs)
        {
            this.legs = legs;
        }
        public int getanimal()
        {
            return legs;
        }
    }

class Dog extends Animal
    {
        private String colour;
        public void setcolour(String colour)
        {
            this.colour = colour;
        }
        public String getcolour()
        {
            return colour;
        }
    }

class Cat extends Dog
    { 
     private String breed;
     public void setbreed(String breed)
     {
        this.breed= breed;
     }
     public String getbreed()
     {
        return breed;
     }
    }

public class MultilevelInheritance
     {
        public static void main(String[]args)
        {
            Cat obj1= new Cat();
            obj1.setanimal(4);
            obj1.setcolour("White");
            obj1.setbreed("American");
            System.out.println("legs : " + obj1.getanimal() +"\n"+ "Colour : " +obj1.getcolour() + "\n" + "Breed : " + obj1.getbreed());

        }
     }
