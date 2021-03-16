package model.soilandpot;

public class ExplosiveSoilAndPot extends PotsAndSoil{

	private String preferredSoil = "Organic-rich soil";
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
