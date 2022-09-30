package individualProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aaron Tsatsu Tamakloe
 * The DataManipulation class represents the object that reads from files and stores the data in structures.
 */
public class DataManipulation {
    //airportHolder, routesHolder and airlinesHolder hold the records in the Airport, Airlines, and Routes file respectively
    private List<String[]> airportHolder = Airport.readAirportData();
    private List<String[]> routesHolder = Routes.readRoutesData();
    private List<String[]> airlinesHolder = Airlines.readAirlineData();


    /**
     * Constructor:
     * builds the DataManipulation object
     * @throws IOException
     */
    public DataManipulation() throws IOException {}

    //read airport data into a hashmap with airportID as key and the airport object as value
    public HashMap<Integer, Airport> loadAirportData(){
        //create hashmap to hold airport details as key-value pair
        HashMap<Integer, Airport> airportKeyValHolder = new HashMap<Integer, Airport>();

        for(String[] data:airportHolder)
        {
            //use try/catch block to handle any exceptions due to data inconsistency
            try{
                Airport airportInst = new Airport(Integer.parseInt(data[0]),data[1], data[2], data[3], data[4],
                        data[5], Double.parseDouble(data[6]),Double.parseDouble(data[7]),Double.parseDouble(data[8]),
                        Double.parseDouble(data[9]), data[10], data[11], data[12], data[13]);
                airportKeyValHolder.put(airportInst.getAirportID(), airportInst);
            }
            catch(NumberFormatException nfe) {
                System.out.println("Type exception thrown");
            }
            catch(NullPointerException npe){
                System.out.println("Null Pointer Exception thrown");
            }
        }
        return airportKeyValHolder;
    }

    /**
     * reads all the possible routes into a linked list
     * @return List<Routes>
     */
    public List<Routes> genRouteList(){
        List<Routes> routesList= new LinkedList<Routes>();
        for(String[] data:routesHolder)
        {
            try
            {
                Routes routeInst = new Routes(data[0], Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]),
                        data[4],Integer.parseInt(data[5]),data[6],Integer.parseInt(data[7]),data[8]);
                routesList.add(routeInst);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("Null pointer exception thrown");
            }
        }
        return routesList;
    }

    /**
     * reads all the airlines data and stores it into a hashmap
     * with the airlineID as key and the airlines object as values
     * @return HashMap<Integer, Airlines>
     */
    public HashMap<Integer, Airlines> loadAirlinesData(){
        HashMap<Integer, Airlines> airlinesKeyValue = new HashMap<Integer, Airlines>();
        for(String[] data: routesHolder)
        {
            try
            {
                Airlines airlineInst = new Airlines(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4],data[5],data[6],
                        data[7]);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("Number format exception thrown.");
            }
        }
        return airlinesKeyValue;
    }



}
