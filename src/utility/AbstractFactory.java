package utility;

import model.plants.*;
import model.soilandpot.*;

public interface AbstractFactory {
	
	ChiliPeppers getPlant(String plantName) throws Exception;
	PotsAndSoil getPotsAndSoil(String plantName) throws Exception;
}
