package utility;

import model.plants.*;
import model.soilandpot.*;

public class PlantFactory implements AbstractFactory{
	
	@Override
	public ChiliPeppers getPlant(String searchWord) throws Exception {
		
		ChiliPeppers chiliPepper = null;
		
		switch (searchWord) {
		
		case "BELL PEPPER":
			chiliPepper = new BellPepper();	
		break;
		case "CAROLINA REAPER":
			chiliPepper = new CarolinaReaperPepper();
		break;
		case "EXPLOSIVE EMBER":
			chiliPepper = new ExplosiveEmberPepper();
		break;
		case "THAI CHILI":
			chiliPepper = new ThaiChiliPepper();
		break;
		case "HABANERO PEPPER":
			chiliPepper = new HabaneroPepper();
		break;
		default:
			throw new Exception();
			
		}
		
		return chiliPepper;
	}

	@Override
	public PotsAndSoil getPotsAndSoil(String plantName) throws Exception {
		return null;
	}
	
	// this is for the display of all the products in the JSP that will be used by the servlet
	public ChiliPeppers[] getProducts(){
		
		ChiliPeppers plants[] = {new BellPepper(), new CarolinaReaperPepper(), 
				new ExplosiveEmberPepper(), new ThaiChiliPepper(), new HabaneroPepper()};
		
		return plants;
	}
	
}