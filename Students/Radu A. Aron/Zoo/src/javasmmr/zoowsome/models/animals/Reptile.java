package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal
{
	private boolean laysEggs;
	
	public void setLaysEggs(boolean laysEggs)
	{
		this.laysEggs = laysEggs;
	}
	
	public boolean getLaysEggs()
	{
		return this.laysEggs;
	}
}
