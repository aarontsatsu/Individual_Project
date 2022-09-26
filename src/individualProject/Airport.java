package individualProject;

public class Airport {
    private int airportID;
    private String airportName;
    private String countryName;
    private String IATACode;
    private String ICAOCode;
    private float latitude;
    private float longitude;
    private float altitude;
    private float timeZone;
    private char dayLightSaving;
    private String tzDBTimeZone;
    private String type;
    private String dataSource;

    public Airport(int airportID, String airportName, String countryName, String IATACode,
                   String ICAOCode, float latitude, float longitude, float altitude, float timeZone,
                   char dayLightSaving, String tzDBTimeZone, String type, String dataSource) {
        this.airportID = airportID;
        this.airportName = airportName;
        this.countryName = countryName;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timeZone = timeZone;
        this.dayLightSaving = dayLightSaving;
        this.tzDBTimeZone = tzDBTimeZone;
        this.type = type;
        this.dataSource = dataSource;
    }
}
