package individualProject;

public class Airport {
    private int airportID;
    private String airportName;
    private String cityName;
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


    public Airport(int airportID, String airportName, String cityName, String countryName, String IATACode,
                   String ICAOCode, float latitude, float longitude, float altitude, float timeZone,
                   char dayLightSaving, String tzDBTimeZone, String type, String dataSource) {
        this.airportID = airportID;
        this.airportName = airportName;
        this.cityName = cityName;
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

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(float timeZone) {
        this.timeZone = timeZone;
    }

    public char getDayLightSaving() {
        return dayLightSaving;
    }

    public void setDayLightSaving(char dayLightSaving) {
        this.dayLightSaving = dayLightSaving;
    }

    public String getTzDBTimeZone() {
        return tzDBTimeZone;
    }

    public void setTzDBTimeZone(String tzDBTimeZone) {
        this.tzDBTimeZone = tzDBTimeZone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return ("Airport ID =" + airportID +
                ", Airport Name='" + airportName + '\'' +
                ", City='" + cityName + '\'' +
                ", Country='" + countryName + '\'' +
                ", IATA Code='" + IATACode + '\'' +
                ", ICAO Code='" + ICAOCode + '\'' +
                ", Latitude=" + latitude +
                ", Longitude=" + longitude +
                ", Altitude=" + altitude +
                ", Timezone=" + timeZone +
                ", Day Light Saving (DST)=" + dayLightSaving +
                ", Database Timezone='" + tzDBTimeZone + '\'' +
                ", Type='" + type + '\'' +
                ", Data Source='" + dataSource + '\'');
    }
}
