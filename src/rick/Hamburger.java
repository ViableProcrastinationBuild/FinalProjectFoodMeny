package rick;
public class Hamburger implements FoodCost
{
    public Hamburger()
    {
    }
    public double fc()
    {
        return 3.00;
    }
    public void food()
    {
        System.out.println("Add Hamburger");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
