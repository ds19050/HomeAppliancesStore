import java.lang.reflect.Field;

public class Fridge extends Device {

    static int deviceCount=0;

    private double fridgeMinTemp;
    private double fridgeMaxTemp;
    private double freezerMinTemp;
    private double freezerMaxTemp;
    private  String fridgeLiquidType;

    private void fridgeDefrost(){

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
        super();
        deviceCount++;
        setManufacterName(manufacterName);
        setDeviceName(deviceName);
        setDeviceType(deviceType);
        setFridgeLiquidType(fridgeLiquidType);
    }
}
