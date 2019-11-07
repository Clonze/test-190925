package exceptiontest;

public class XLessThanZeroException extends Exception
{
    public double y;
    public XLessThanZeroException(double y0)
    {
        y = y0;
    }
    public String getInfo()
    {
        return y + " is too small";
    }
}
