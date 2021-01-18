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


    }
}