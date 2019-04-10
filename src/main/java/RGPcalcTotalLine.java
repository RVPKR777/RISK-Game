import java.io.File;
import java.util.Scanner;
/**
 * This class is to calculate total lines of map  file
 * @author pavan
 * @version 1.0.0
 */
public class RGPcalcTotalLine {

	main o_main = new main();

    /**
	 * This method is to return total lines of map file
	 * @return returns count of lines
	 * @throws Exception
	 */
    public int totallines(File file1) throws Exception{
    	File file = file1;
        Scanner sc = new Scanner(file);
        int count = 0;
        while (sc.hasNextLine()) {
            count++;
            sc.nextLine();
        }
        return count;
    }

    /**
     * This method is to return no of territory lines of map file
     * @return returns count of territories
     * @throws Exception
     */
    public int countrylines(File file1) throws Exception{
        int a = 0;
    	File file = file1;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            a++;
            if(sc.next().equals("[Territories]")){
                break;
            }
        }
        return a;
    }

    /**
     * This method is to return no of continent lines in map file
     * @return returns count of continents
     * @throws Exception
     */
    public int continentlines(File file1) throws Exception{
        int b = 0;
    	File file = file1;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            b++;
            if(sc.next().equals("[Continents]")){
                break;
            }
        }
        return b;
    }
}