import java.lang.reflect.Field;

public class Oven {
    private double length;
    private double height;
    private double depth;
    private String manufacterName;
    private String deviceName;
    private String deviceType;
    private double energyConsumption;
    static int deviceCount;

    private double ovenMinTemp;
    private double ovenMaxTemp;
    private double grillMinTemp;
    private double grillMaxTemp;
    private int ovenProgramsCount;

    private void ovenClean(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getManufacterName() {
        return manufacterName;
    }

    public void setManufacterName(String manufacterName) {
        this.manufacterName = manufacterName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public static int getDeviceCount() {
        return deviceCount;
    }

    public static void setDeviceCount(int deviceCount) {
        Oven.deviceCount = deviceCount;
    }

    public double getOvenMinTemp() {
        return ovenMinTemp;
    }

    public void setOvenMinTemp(double ovenMinTemp) {
        this.ovenMinTemp = ovenMinTemp;
    }

    public double getOvenMaxTemp() {
        return ovenMaxTemp;
    }

    public void setOvenMaxTemp(double ovenMaxTemp) {
        this.ovenMaxTemp = ovenMaxTemp;
    }

    public double getGrillMinTemp() {
        return grillMinTemp;
    }

    public void setGrillMinTemp(double grillMinTemp) {
        this.grillMinTemp = grillMinTemp;
    }

    public double getGrillMaxTemp() {
        return grillMaxTemp;
    }

    public void setGrillMaxTemp(double grillMaxTemp) {
        this.grillMaxTemp = grillMaxTemp;
    }

    public int getOvenProgramsCount() {
        return ovenProgramsCount;
    }

    public void setOvenProgramsCount(int ovenProgramsCount) {
        this.ovenProgramsCount = ovenProgramsCount;
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
    private int  PeriodicMaintenance(){
        return 0;
    }

    public Oven() {
        deviceCount++;
    }

    public Oven(String manufacterName, String deviceName, String deviceType, int ovenProgramsCount) {
        deviceCount++;
        this.manufacterName = manufacterName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.ovenProgramsCount = ovenProgramsCount;
    }
}
