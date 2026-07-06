public class RelationalOperators
{
    static int num1= 10;
    static int num2 = 20;
    static boolean result;
    public static void main(String[] args)
    {
        result = num1 < num2;
        System.out.println("num1 < num2: " + result);
        result = num1 > num2;
        System.out.println("num1 > num2: " + result);
        result = num1 <= num2;
        System.out.println("num1 <= num2: " + result);
        result = num1 >= num2;
        System.out.println("num1 >= num2: " + result);
        result = num1 == num2;
        System.out.println("num1 == num2: " + result);
        result = num1 != num2;
        System.out.println("num1 != num2: " + result);
    }
}