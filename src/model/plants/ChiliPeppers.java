package model.plants;

import model.soilandpot.*;

public abstract class ChiliPeppers{
	
	public abstract String getPlantName();
	public abstract String getPlantPhoto();
	public abstract String getPlantDescription();
	public abstract double getPlantPrice();
	
	public abstract void setPotsAndSoil(PotsAndSoil potAndSoil);
	public abstract PotsAndSoil getSoilAndPot();
	

}
