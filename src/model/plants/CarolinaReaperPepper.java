package model.plants;

import model.soilandpot.PotsAndSoil;

public class CarolinaReaperPepper extends ChiliPeppers {

	private String plantName = "Carolina Reaper";
	private String plantPhoto = "https://i.imgur.com/agEu6Dv.jpg";
	private String plantDescription = "The Carolina Reaper is a cultivar of the Capsicum "
			+ "chinese plant. Developed by South Carolina breeder Ed Currie, the pepper is "
			+ "red and gnarled, with a bumpy texture and small pointed tail.";
	private double plantPrice = 200;
	
	private PotsAndSoil potAndSoil;
	
	public CarolinaReaperPepper() {
	}

	public CarolinaReaperPepper(String plantName, String plantPhoto, String plantDescription, double plantPrice, PotsAndSoil potsAndSoil) {
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
