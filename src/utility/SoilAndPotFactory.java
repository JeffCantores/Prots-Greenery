package utility;

import model.plants.ChiliPeppers;
import model.soilandpot.*;

public class SoilAndPotFactory implements AbstractFactory {
	
	public PotsAndSoil getPotsAndSoil(String plantName) throws Exception {
		PotsAndSoil potAndSoil = null;
		
		switch (plantName) {
		case "BELL PEPPER":
			potAndSoil = new BellPepperSoilAndPot();
		break;
		case "CAROLINA REAPER":
			potAndSoil = new CarolinaSoilAndPot();
		break;
		case "EXPLOSIVE EMBER":
			potAndSoil = new ExplosiveSoilAndPot();
		break;
		case "THAI CHILI":
			potAndSoil = new ThaiChiliSoilAndPot();
		break;
		case "HABANERO PEPPER":
			potAndSoil = new HabaneroSoilAndPot();
		break;
		default:
			throw new Exception();
		}
		
		return potAndSoil;
	}

	@Override
	public ChiliPeppers getPlant(String plantName) throws Exception {
		return null;
	}



	
}
