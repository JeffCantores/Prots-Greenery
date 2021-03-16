package model.soilandpot;

public class HabaneroSoilAndPot extends PotsAndSoil{

	private String preferredSoil = "Sandy Soil";
	private String potDescription= "Terracotta";
	
	@Override
	public String getPreferredSoil() {
		return this.preferredSoil;
	}

	@Override
	public String getPotDescription() {
		return this.potDescription;
	}
	
}
