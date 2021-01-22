public interface DeviceBasic {
    public void powerOn();
    public void powerOff();
    public int periodicMaintenance();
    public boolean status();

    public double getLength();
    public void setLength(double length);
    public double getHeight();
    public void setHeight(double height);
    public double getDepth();
    public void setDepth(double depth);
    public String getManufacterName();
    public void setManufacterName(String manufacterName);
    public String getDeviceName();
    public void setDeviceName(String deviceName);
    public String getDeviceType();
    public void setDeviceType(String deviceType);
    public double getEnergyConsumption();
    public void setEnergyConsumption(double energyConsumption);
}


