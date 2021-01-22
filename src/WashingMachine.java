import java.lang.reflect.Field;

public class WashingMachine extends Device{
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
        super();
        deviceCount++;
        setManufacterName(manufacterName);
        setDeviceName(deviceName);
        setDeviceType(deviceType);
        this.washingRPM = washingRPM;
    }

    public WashingMachine() {
        deviceCount++;
    }
}
