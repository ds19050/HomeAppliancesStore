public class HomeAppliancesStore {


    static String getCompanyName() {
        return CompanyName;
    }

    public static void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public static String getCompanyAddress() {
        return CompanyAddress;
    }

    public static void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }

    public static int getNumberOfEmployees() {
        return NumberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        NumberOfEmployees = numberOfEmployees;
    }

    static String CompanyName;
    static String CompanyAddress;
    static int NumberOfEmployees;


    public static void deviceStatus(Device device){
        if(device instanceof AirCondition) {
            AirCondition ac = (AirCondition) device;
            System.out.println("Device is AC. Status "+ac.status());
        }else if(device instanceof Fridge){
            Fridge fridge = (Fridge) device;
            System.out.println("Device is fridge. Status "+fridge.status());
        }else if(device instanceof Oven){
            Oven oven = (Oven) device;
            System.out.println("Device is Oven. Status "+oven.status());
        }else if(device instanceof WashingMachine){
            WashingMachine washingMachine = (WashingMachine) device;
            System.out.println("Device is WashingMachine. Status "+washingMachine.status());
        }else{
            System.out.println("unknown device type");
        }
    }


    public static void main(String[] args) {
        try {
            CompanyName = (args[0]);
            CompanyAddress = args[1];
            NumberOfEmployees = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.out.println("Πρόβλημα στις παραμέτρους");
        }

        System.out.println("Ονομα εταιρείας: " + CompanyName
                + " Διεύθυνση εταιρείας: " + CompanyAddress +
                " Αριθμός Υπαλλήλων: " + NumberOfEmployees);

        Fridge fridge1=new Fridge("LG","LG wid9","fridge","freon");
        Fridge fridge2=new Fridge("SONY","sonya22","fridge","freon");
        Fridge fridge3=new Fridge();
        AirCondition ac1=new AirCondition("Whirlpool","infrared");
        AirCondition ac2=new AirCondition("Samsung","wifi");
        AirCondition ac3=new AirCondition("LG","infrared");
        AirCondition ac4=new AirCondition("LG","wifi");
        Oven oven1=new Oven("Pitsos","Pitsos1234","oven fast",7);
        WashingMachine washingMachine1=new WashingMachine();
        WashingMachine washingMachine2=new WashingMachine();
        WashingMachine washingMachine3=new WashingMachine("Logitech","LG Wash plus",
                "wash machine",92000);

        System.out.println(ac1.toString());
        System.out.println(ac2.toString());
        System.out.println(fridge1.toString());
        System.out.println("Fridges:"+Fridge.getDeviceCount());
        System.out.println("AirCondition:"+AirCondition.getDeviceCount());
        System.out.println("Oven:"+Oven.getDeviceCount());
        System.out.println("WashingMAchine:"+WashingMachine.getDeviceCount());

        deviceStatus(ac1);
    }
}