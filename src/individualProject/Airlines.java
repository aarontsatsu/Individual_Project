package individualProject;

public class Airlines {
    private int airlineID;
    private String airlineName;
    private String airlineAlias;
    private String IATACode;
    private String ICAOCode;
    private String callSign;
    private String country;
    private char active;

    public Airlines(int airlineID, String airlineName, String airlineAlias, String IATACode, String ICAOCode, String callSign, String country, char active) {
        this.airlineID = airlineID;
        this.airlineName = airlineName;
        this.airlineAlias = airlineAlias;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
        this.callSign = callSign;
        this.country = country;
        this.active = active;
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

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
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
