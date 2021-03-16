package model.plants;

import model.soilandpot.PotsAndSoil;

public class ExplosiveEmberPepper extends ChiliPeppers {

	private String plantName = "Explosive Ember";
	private String plantPhoto = "https://i.imgur.com/wpC9naq.jpg";
	private String plantDescription = "The one-inch conical chili pods stand upright "
			+ "in bunches on the plant and age from a near-metallic purple to an "
			+ "ember-like orange-red.";
	private double plantPrice = 100;
	
	private PotsAndSoil potAndSoil;

	public ExplosiveEmberPepper() {
	}

	public ExplosiveEmberPepper(String plantName, String plantPhoto, String plantDescription, double plantPrice, PotsAndSoil potsAndSoil) {
		this.plantName = plantName;
		this.plantPhoto = plantPhoto;
		this.plantDescription = plantDescription;
		this.plantPrice = plantPrice;
		this.potAndSoil = potsAndSoil;
	}

	@Override
	public String getPlantName() {
		return this.plantName;
	}

	@Override
	public String getPlantPhoto() {
		return this.plantPhoto;
	}

	@Override
	public String getPlantDescription() {
		return this.plantDescription;
	}

	@Override
	public double getPlantPrice() {
		return this.plantPrice;
	}

	@Override
	public void setPotsAndSoil(PotsAndSoil potAndSoil) {
		this.potAndSoil = potAndSoil;
		
	}

	@Override
	public PotsAndSoil getSoilAndPot() {
		return potAndSoil;
	}

}
