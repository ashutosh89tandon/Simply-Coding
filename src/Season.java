
public enum Season implements SeasonHandle{

	WINTER (10),SUMMER(20),AUTUMN(30);
	
	int value;
	
	private Season(int value)
	{
		this.value=value;
	}

	@Override
	public void action() {
		if(this.equals(AUTUMN))
		{
			System.out.println("Its Autumn");
		}
		
		if(this.equals(SUMMER))
		{
			System.out.println("Its Summer");
		}
		
		if(this.equals(WINTER))
		{
			System.out.println("Its Winter");
		}
	}
}
