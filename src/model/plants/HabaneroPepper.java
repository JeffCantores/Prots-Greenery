package model.plants;

import model.soilandpot.PotsAndSoil;

public class HabaneroPepper extends ChiliPeppers {

	private String plantName = "Habanero Pepper";
	private String plantPhoto = "https://i.imgur.com/91IyeOT.jpg";
	private String plantDescription = "The common orange habanero pepper has a tropical, "
			+ "fruity flavor that make these peppers very popular among chefs, both "
			+ "amateur and professional. And underneath the sweetness, there is a "
			+ "subtle smokiness as well. There is a lot to love in the flavor, "
			+ "and it pairs well with many fruits.";
	private double plantPrice = 300;
	
	private PotsAndSoil potAndSoil;
	
	public HabaneroPepper() {
	}

	public HabaneroPepper(String plantName, String plantPhoto, String plantDescription, double plantPrice, PotsAndSoil potsAndSoil) {
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
