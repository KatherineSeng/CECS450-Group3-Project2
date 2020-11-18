
public class FixPoint {
	
	private int start, len, x, y;
	
	public FixPoint()
	{
		this(0,0,0,0);
	}
	
	public FixPoint(int startTime, int length, int xPos, int yPos)
	{
		start = startTime;
		len = length;
		x = xPos;
		y = yPos;
	}
	
	public int getStart()
	{
		return start;
	}
	
	public int getLength()
	{
		return len;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	
}
