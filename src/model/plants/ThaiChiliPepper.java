package model.plants;

import model.soilandpot.PotsAndSoil;

public class ThaiChiliPepper extends ChiliPeppers {

	private String plantName = "Thai Chili";
	private String plantPhoto = "https://i.imgur.com/9qJdZ97.jpg";
	private String plantDescription = "Thai peppers are typically ground from "
			+ "fresh pods to add heat to curry pastes to add both spiciness and "
			+ "alluring color. Discerning chefs and cooks love them for garnishing "
			+ "hot and spicy dishes with them, and cooking them into all manner of "
			+ "foods.";
	private double plantPrice = 150;
	
	private PotsAndSoil potAndSoil;
	
	public ThaiChiliPepper() {
	}

	public ThaiChiliPepper(String plantName, String plantPhoto, String plantDescription, double plantPrice, PotsAndSoil potsAndSoil) {
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
