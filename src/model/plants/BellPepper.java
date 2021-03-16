package model.plants;

import model.soilandpot.PotsAndSoil;

public class BellPepper extends ChiliPeppers{

	private String plantName = "Bell Pepper";
	private String plantPhoto = "https://i.imgur.com/NRwzb2b.jpg";
	private String plantDescription = "Bell peppers are very high in vitamin C, with a single one providing up to 169% of the RDI. Other vitamins and minerals in bell peppers include vitamin K1, vitamin E, vitamin A, folate, and potassium.";
	private double plantPrice = 250;
	
	private PotsAndSoil potAndSoil;
	
	public BellPepper() {
	}

	public BellPepper(String plantName, String plantPhoto, String plantDescription, double plantPrice , PotsAndSoil potAndSoil) {
		this.plantName = plantName;
		this.plantPhoto = plantPhoto;
		this.plantDescription = plantDescription;
		this.plantPrice = plantPrice;
		this.potAndSoil = potAndSoil;
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
