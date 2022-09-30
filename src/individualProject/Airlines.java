package individualProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Airlines {
    private int airlineID;
    private String airlineName;
    private String airlineAlias;
    private String IATACode;
    private String ICAOCode;
    private String callSign;
    private String country;
    private String active;

    public Airlines(int airlineID, String airlineName, String airlineAlias, String IATACode, String ICAOCode, String callSign, String country, String active) {
        this.airlineID = airlineID;
        this.airlineName = airlineName;
        this.airlineAlias = airlineAlias;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
        this.callSign = callSign;
        this.country = country;
        this.active = active;
    }


    public static List<String[]> readAirlineData() throws IOException {
        List<String[]> dataHolder = new LinkedList<String[]>();
        BufferedReader readAirlineFile = null;
        String line = "";
        String[] lineHolder;
        try{
            readAirlineFile = new BufferedReader(new FileReader("airlines.csv"));
            while((line=readAirlineFile.readLine())!= null){
                lineHolder = line.split(",");
                dataHolder.add(lineHolder);
            }
        }
        catch(FileNotFoundException fnf){
            System.out.println("File Not Find Exception thrown.");
        }
        catch(IOException io){
            System.out.println("IOException thrown.");
        }
        readAirlineFile.close();
        return dataHolder;
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineAlias() {
        return airlineAlias;
    }

    public void setAirlineAlias(String airlineAlias) {
        this.airlineAlias = airlineAlias;
    }

    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public String getICAOCode() {
        return ICAOCode;
    }

    public void setICAOCode(String ICAOCode) {
        this.ICAOCode = ICAOCode;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return ("Airline ID=" + airlineID +
                ", Airline Name='" + airlineName + '\'' +
                ", Airline Alias='" + airlineAlias + '\'' +
                ", IATA Code='" + IATACode + '\'' +
                ", ICAO Code='" + ICAOCode + '\'' +
                ", Call sign='" + callSign + '\'' +
                ", Country='" + country + '\'' +
                ", Active=" + active);
    }
}
