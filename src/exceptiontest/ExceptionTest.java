package exceptiontest;

public class ExceptionTest
{
    public int getFirstValidInt()
    {
        while (true)
        {
            try
            {
                return Test.readInt();
            }
            catch (NumberFormatException e)
            {
                //System.out.println("Number Format Exception!");
            }
        }
    }
    public double getX(double y) throws XLessThanZeroException, XGreaterThanOneException
    {
        double x = Math.log(y);
        if (x < 0)
            throw new XLessThanZeroException(y);
        else if (x > 1)
            throw new XGreaterThanOneException();
        else
            return x;
    }
    public double solve(double y)
    {
        double x;
        try
        {
            x = Test.solve2(y);
        }
        catch (XLessThanZeroException e)
        {
            return -1;
        }
        catch (XGreaterThanOneException e)
        {
            return -2;
        }
        return x;
    }
}
