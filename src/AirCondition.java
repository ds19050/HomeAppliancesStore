import java.lang.reflect.Field;

public class AirCondition extends Device {
    static int deviceCount=0;

    private double acMinTemp;
    private double acMaxTemp;
    private int acNumOfModes;
    private String acRemoteType;
    private String acFilterType;

    private int  PeriodicMaintenance(){
        return 0;
    }

    private void ACChangeFilter(){

    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append( this.getClass().getName() );
        result.append( " Object {" );
        result.append(newLine);

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();

        //print field names paired with their values
        for ( Field field : fields  ) {
            result.append("  ");
            try {
                result.append( field.getName() );
                result.append(": ");
                //requires access to private field:
                result.append( field.get(this) );
            } catch ( IllegalAccessException ex ) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }


    public static int getDeviceCount() {
        return deviceCount;
    }

    public static void setDeviceCount(int deviceCount) {
        AirCondition.deviceCount = deviceCount;
    }

    public double getAcMinTemp() {
        return acMinTemp;
    }

    public void setAcMinTemp(double acMinTemp) {
        this.acMinTemp = acMinTemp;
    }

    public double getAcMaxTemp() {
        return acMaxTemp;
    }

    public void setAcMaxTemp(double acMaxTemp) {
        this.acMaxTemp = acMaxTemp;
    }

    public int getAcNumOfModes() {
        return acNumOfModes;
    }

    public void setAcNumOfModes(int acNumOfModes) {
        this.acNumOfModes = acNumOfModes;
    }

    public String getAcRemoteType() {
        return acRemoteType;
    }

    public void setAcRemoteType(String acRemoteType) {
        this.acRemoteType = acRemoteType;
    }

    public String getAcFilterType() {
        return acFilterType;
    }

    public void setAcFilterType(String acFilterType) {
        this.acFilterType = acFilterType;
    }

    public AirCondition(double length) {
        deviceCount++;
        setLength(length);
    }

    public AirCondition(String manufacterName, String acRemoteType) {
        deviceCount++;
        setManufacterName(manufacterName);
        setAcRemoteType(acRemoteType);
    }
}
