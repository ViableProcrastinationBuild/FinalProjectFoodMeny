package rick;

public class Salad implements FoodCost
{
    public Salad()
    {
    }
    public double fc()
    {
        return 5.00;
    }
    public void food()
    {
        System.out.println("Add Salad");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}

