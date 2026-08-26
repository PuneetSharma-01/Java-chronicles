class person {
   public  void getName()
   {
    System.out.println("Virat Kohli");
   }

}
public class NormalClassBasedAnonymousInnerClass {
    public static void main(String[] args) {
        person a=new person() {
            @Override
            public void getName()
            {
                System.out.println("MS Dhoni");
            }
        };
        a.getName();
    }
    
}
