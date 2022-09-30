package individualProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DataManipulation {
    //airportHolder holds the records in the Airport file as arrays
    private List<String[]> airportHolder = Airport.readAirportData();
    private List<String[]> routesHolder = Routes.readRoutesData();
    private List<String[]> airlinesHolder = Airlines.readAirlineData();


    public DataManipulation() throws IOException {}

    public HashMap<int, Airport> loadAirportData(){
        //create hashmap to hold airport details as key-value pair
        HashMap<int, Airport> airportKeyValHolder = new HashMap<int, Airport>();

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


    public HashMap<int, Airlines> loadAirlinesData(){
        HashMap<int, Airlines> airlinesKeyValue = new HashMap<int, Airlines>();
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
