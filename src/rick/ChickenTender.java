package rick;
public class ChickenTender implements FoodCost
{
    public ChickenTender()
    {
    }
    public double fc()
    {
        return 4.00;
    }
    public void food()
    {
        System.out.println("Add Chicken Tender");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
