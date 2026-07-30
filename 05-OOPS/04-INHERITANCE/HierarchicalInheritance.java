class school {
    private 
    String name;
    int userid;
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    public void setuserid(int userid)
    {
        this . userid= userid;
    }
    public int getuserid()
    {
        return userid;
    }
}
class students extends school 
{
 private int rollno;
 public int getrollno()
 {
    return 056;
 }
}
class teachers extends school
{
 private int age;
 public int getage()
 {
    return 27;
 } 
}
public class HierarchicalInheritance {
    public static void main(String[] args)
    {
        students person1= new students();
        person1.setname("Puneet Sharma");
        person1.setuserid(143117);
        teachers person2= new teachers();
        person2.setuserid(146223);
        person2.setname( "Ridhita Sharma");
        System.out.println(person1.getname()+ "....." + person1.getuserid()+ "...."+person1.getrollno()+ "\n" + person2.getname() + "....." + person2.getuserid()+ "..."+person2.getage());
    }
}