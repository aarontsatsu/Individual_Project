package individualProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aaron Tsatsu Tamakloe
 * The Routes class represents the features of a route that an airline can take
 */
public class Routes {
    //instance variables
    private String airlineCode;
    private int airlineID;
    private String SRCairportCode;
    private int SRCairportID;
    private String DESairportCode;
    private int DESairportID;
    private String codeShare;
    private int stops;
    private String equipment;

    /**
     * Constructor:
     * building the routes object
     * @param airlineCode
     * @param airlineID
     * @param SRCairportCode
     * @param SRCairportID
     * @param DESairportCode
     * @param DESairportID
     * @param codeShare
     * @param stops
     * @param equipment
     */
    public Routes(String airlineCode, int airlineID, String SRCairportCode, int SRCairportID,
                  String DESairportCode, int DESairportID, String codeShare, int stops, String equipment) {
        this.airlineCode = airlineCode;
        this.airlineID = airlineID;
        this.SRCairportCode = SRCairportCode;
        this.SRCairportID = SRCairportID;
        this.DESairportCode = DESairportCode;
        this.DESairportID = DESairportID;
        this.codeShare = codeShare;
        this.stops = stops;
        this.equipment = equipment;
    }

    //read data from the routes.csv file and store it in linked list.
    public static List<String[]> readRoutesData() throws IOException {
        List<String[]> dataHolder = new LinkedList<String[]>();
        BufferedReader readRoutesFile = null;
        String line = "";
        String[] lineHolder;
        try{
            readRoutesFile = new BufferedReader(new FileReader("routes.csv"));
            while((line=readRoutesFile.readLine())!= null){
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
        readRoutesFile.close();
        return dataHolder;
    }

    //getters and setters
    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }

    public String getSRCairportCode() {
        return SRCairportCode;
    }

    public void setSRCairportCode(String SRCairportCode) {
        this.SRCairportCode = SRCairportCode;
    }

    public int getSRCairportID() {
        return SRCairportID;
    }

    public void setSRCairportID(int SRCairportID) {
        this.SRCairportID = SRCairportID;
    }

    public String getDESairportCode() {
        return DESairportCode;
    }

    public void setDESairportCode(String DESairportCode) {
        this.DESairportCode = DESairportCode;
    }

    public int getDESairportID() {
        return DESairportID;
    }

    public void setDESairportID(int DESairportID) {
        this.DESairportID = DESairportID;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public void setCodeShare(String codeShare) {
        this.codeShare = codeShare;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    //toString method to override how the routes object is returned
    @Override
    public String toString() {
        return ("Airline Code='" + airlineCode + '\'' +
                ", Airline ID=" + airlineID +
                ", Source Airport Code='" + SRCairportCode + '\'' +
                ", Source Airport ID=" + SRCairportID +
                ", Destination Airport Code='" + DESairportCode + '\'' +
                ", Destination Airport ID=" + DESairportID +
                ", Codeshare=" + codeShare +
                ", Stops=" + stops +
                ", Equipment='" + equipment + '\'');
    }
}
