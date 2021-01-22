import java.lang.reflect.Field;

public class Fridge {
    private double length;
    private double height;
    private double depth;
    private String manufacterName;
    private String deviceName;
    private String deviceType;
    private double energyConsumption;
    static int deviceCount=0;

    private double fridgeMinTemp;
    private double fridgeMaxTemp;
    private double freezerMinTemp;
    private double freezerMaxTemp;
    private  String fridgeLiquidType;

    private void fridgeDefrost(){

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



    public double getFridgeMinTemp() {
        return fridgeMinTemp;
    }

    public void setFridgeMinTemp(double fridgeMinTemp) {
        this.fridgeMinTemp = fridgeMinTemp;
    }

    public double getFridgeMaxTemp() {
        return fridgeMaxTemp;
    }

    public void setFridgeMaxTemp(double fridgeMaxTemp) {
        this.fridgeMaxTemp = fridgeMaxTemp;
    }

    public double getFreezerMinTemp() {
        return freezerMinTemp;
    }

    public void setFreezerMinTemp(double freezerMinTemp) {
        this.freezerMinTemp = freezerMinTemp;
    }

    public double getFreezerMaxTemp() {
        return freezerMaxTemp;
    }

    public void setFreezerMaxTemp(double freezerMaxTemp) {
        this.freezerMaxTemp = freezerMaxTemp;
    }

    public String getFridgeLiquidType() {
        return fridgeLiquidType;
    }

    public void setFridgeLiquidType(String fridgeLiquidType) {
        this.fridgeLiquidType = fridgeLiquidType;
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


    public Fridge() {
        deviceCount++;
    }

    public Fridge(String manufacterName, String deviceName, String deviceType, String fridgeLiquidType) {
        deviceCount++;
        this.manufacterName = manufacterName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.fridgeLiquidType = fridgeLiquidType;
    }
}
