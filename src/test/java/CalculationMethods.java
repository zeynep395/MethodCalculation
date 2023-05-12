public class CalculationMethods {

    public static float Add(float x, float y)
    {
        System.out.println("Adding x plus y " + x + y);


        return x + y;
    }


    public static float Subtract(float x, float y)
    {
        System.out.println("Subtracting x minus y " + x + y);
        return x - y;
    }


    public static float Multiply(float x, float y)
    {
        System.out.println("Multiplying x times y " + x + y);
        return x * y;
    }


    public static float Divide(float x, float y)
    {
        System.out.println("Dividing x divided y " + x + y);
        if (y != 0)
        {
            return x / y;
        }
        else
        {
            return 0;
        }
    }
}

