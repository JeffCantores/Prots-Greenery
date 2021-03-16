package model.soilandpot;

public class ThaiChiliSoilAndPot extends PotsAndSoil{

	private String preferredSoil = "soil with Vermiculite";
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
