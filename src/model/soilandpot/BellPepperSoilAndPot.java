package model.soilandpot;

public class BellPepperSoilAndPot extends PotsAndSoil{

	private String preferredSoil = "Easy-moist Soil";
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
