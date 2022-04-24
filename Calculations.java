
/**
 * Write a description of class Calculations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculations
{
    private double num1;
    private double num2;
    /**
     * Constructor for objects of class Calculations
     */
    public Calculations()
    {
        this.num1 = -1;
        this.num2 = -1;
    }

    public Calculations(double x, double y)
    {
        this.num1 = x;
        this.num2 = y;
        
        try
        {
            throw new InvalidValueException("Please enter a int or double");
        }
        catch (InvalidValueException e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * Addition method
     *
     * @param x = num1 and y = num2
     * @return    the sum of x and y
     */
    public double additionMethod(double x, double y)
    {
        return x + y;
    }
    
    /**
     * Subtraction method
     * 
     * @param x = num1 and y = num2
     * @return  x minus y
     */
    public double subtractionMethod(double x, double y)
    {
        return x - y;
    }
    
    /**
     * Division method
     * 
     * @param x = num1 or the number being divided and y = num2
     * @return x divided by y
     */
    public double divisionMethod(double x, double y)
    {
        return x / y;
    }
    
    /**
     * Multiplication method
     * 
     * @param x = num1 and y = num2
     * @return x times y
     */
    public double multiplicationMethod(double x, double y)
    {
        return x * y;
    }
    
    /**
     * Power method
     * 
     * @param x = base number and y = the number the base is raised too
     * @return x to the power of y
     */
    public double powerMethod(double x, double y)
    {
        return Math.pow(x,y);
    }
    
    /**
     * Root method
     * 
     * @param x = base number
     * @return the square root of x
     */
    public double rootMethod(double x)
    {
        return Math.sqrt(x);
    }
    
    /**
     * ln method
     * 
     * @param x = num1
     * @return x to the natural log
     */
    public double lnMethod(double x)
    {
        return Math.log(x);
    }
    
    /**
     * log method
     * 
     * @param x = num1
     * @return x to the log
     */
    public double logMethod(double x)
    {
        return Math.log10(x);
    }
    
    /**
     * sin method
     * 
     * @param x = num1
     * @return the sin of x
     */
    public double sinMethod(double x)
    {
        return Math.sin(x);
    }
    
    /**
     * cos method
     * 
     * @param x = num1
     * @return the cos of x
     */
    public double cosMethod(double x)
    {
        return Math.cos(x);
    }
    
    /**
     * tan method
     * 
     * @param x = num1
     * @return the tan of x
     */
    public double tanMethod(double x)
    {
        return Math.tan(x);
    }
    
    /**
     * arc sin method
     * 
     * @param x = num1
     * @return the arc sin of x
     */
    public double arcSinMethod(double x)
    {
        return Math.asin(x);
    }
    
    /**
     * arc cos method
     * 
     * @param x = num1
     * @return the arc cos of x
     */
    public double arcCosMethod(double x)
    {
        return Math.acos(x);
    }
    
    /**
     * arc tan method
     * 
     * @param x = num1
     * @return the arc tan of x
     */
    public double arcTanMethod(double x)
    {
        return Math.atan(x);
    }
    
    /**
     * round method
     * 
     * @param x = num to be rounded
     * @return the rounded version of x
     */
    public double roundMethod(double x)
    {
        return Math.round(x);
    }
}
