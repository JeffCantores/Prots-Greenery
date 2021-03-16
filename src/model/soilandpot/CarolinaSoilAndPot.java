package model.soilandpot;

public class CarolinaSoilAndPot extends PotsAndSoil{

	private String preferredSoil = "Organic-rich and well-drained soil";
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
