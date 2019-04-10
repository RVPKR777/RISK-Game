import java.io.File;

/**
 * This class is to calculate lines in map text file
 * @author pavan
 * @version 1.0.0
 */
public class RGPcalcLine{

    /**
	 * This method is to calculate continent lines in text file
	 * @return number of continent lines
	 * @throws Exception
	 */
    public int line1(File file) throws Exception{
    	//File file = file1;
        RGPcalcTotalLine c = new RGPcalcTotalLine();
        int a=c.countrylines(file);
        int b=c.continentlines(file);
        int d=c.totallines(file);
        int continentline = a - b;
        int countryline = (d-a)-2;
        return continentline;
    }
  
    /**
     * This method is to calculate country lines in text file
     * @return number of country lines
     * @throws Exception
     */
    public int line2(File file) throws Exception{
        RGPcalcTotalLine c = new RGPcalcTotalLine();
        int a=c.countrylines(file);
        int b=c.continentlines(file);
        int d=c.totallines(file);
        int continentline = a - b;
        int countryline = (d-a)-3;
        return countryline;
    }
}