import java.lang.reflect.Field;

public class WashingMachine {
    private double length;
    private double height;
    private double depth;
    private String manufacterName;
    private String deviceName;
    private String deviceType;
    private double energyConsumption;
    static int deviceCount=0;

    private int washingRPM;
    private int washingProgramsCount;
    private int washingMinTemp;
    private int washingMaxTemp;
    private int washingKilos;

    private int  PeriodicMaintenance(){
        return 0;
    }

    private void resetWashingMachine(){

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
        WashingMachine.deviceCount = deviceCount;
    }

    public int getWashingRPM() {
        return washingRPM;
    }

    public void setWashingRPM(int washingRPM) {
        this.washingRPM = washingRPM;
    }

    public int getWashingProgramsCount() {
        return washingProgramsCount;
    }

    public void setWashingProgramsCount(int washingProgramsCount) {
        this.washingProgramsCount = washingProgramsCount;
    }

    public int getWashingMinTemp() {
        return washingMinTemp;
    }

    public void setWashingMinTemp(int washingMinTemp) {
        this.washingMinTemp = washingMinTemp;
    }

    public int getWashingMaxTemp() {
        return washingMaxTemp;
    }

    public void setWashingMaxTemp(int washingMaxTemp) {
        this.washingMaxTemp = washingMaxTemp;
    }

    public int getWashingKilos() {
        return washingKilos;
    }

    public void setWashingKilos(int washingKilos) {
        this.washingKilos = washingKilos;
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

    public WashingMachine(String manufacterName, String deviceName, String deviceType, int washingRPM) {
        deviceCount++;
        this.manufacterName = manufacterName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.washingRPM = washingRPM;
    }

    public WashingMachine() {
        deviceCount++;
    }
}
