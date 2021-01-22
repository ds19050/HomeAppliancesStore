public abstract class Device implements DeviceBasic{
    private double length;
    private double height;
    private double depth;
    private String manufacterName;
    private String deviceName;
    private String deviceType;
    private double energyConsumption;

    private boolean status=false;

    public void powerOn(){
        status=true;
    }
    public void powerOff(){
        status=false;
    }
    public boolean status(){
        return status;
    }

    public int periodicMaintenance(){
        return 0;
    };


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

}
