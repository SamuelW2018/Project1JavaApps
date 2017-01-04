
class Date
{
	int Month;
	int Day;
	int Year;
	
	public Date(int M, int D, int Y)
	{
		Month = M;
		Day = D;
		Year = Y;
	}
	public void SetMonth(int M)
	{
		Month = M;
	}
	
	public void SetDay(int D)
	{
		Day = D;
	}
	
	public void SetYear(int Y)
	{
		Year = Y;
	}
	
	public int GetMonth()
	{
		return Month;
	}
	
	public int GetDay()
	{
		return Day;
	}
	
	public int GetYear()
	{
		return Year;
	}
	
	public void displayDate()
	{
		System.out.printf("The Date is %d/%d/%d\n", Month, Day, Year);
	}
}
