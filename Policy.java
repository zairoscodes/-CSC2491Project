public class Policy {
   private String policyNumber;
   private String providerName;
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   private static int numberOfPolicies = 0;

   public Policy() {
       // No-arg constructor
   }

   public Policy(String pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w) {
       policyNumber = pNumber;
       providerName = pName;
       FirstName = fName;
       LastName = lName;
       age = a;
       smokingStatus = sStatus;
       height = h;
       weight = w;
       numberOfPolicies++;
   }

   public static int getNumberOfPolicies() {
       return numberOfPolicies;
   }

   public String getPolicyNumber() {
       return policyNumber;
   }

   public String getProviderName() {
       return providerName;
   }

   public String getFirstName() {
       return FirstName;
   }

   public String getLastName() {
       return LastName;
   }

   public int getAge() {
       return age;
   }

   public String getSmokingStatus() {
       return smokingStatus;
   }

   public double getHeight() {
       return height;
   }

   public double getWeight() {
       return weight;
   }

   public double getBMI() {
       final double CONVFACTOR = 703;
       return (weight * CONVFACTOR) / (height * height);
   }

   public double getPrice() {
       final double BASE_PRICE = 600;
       final double ADDITIONAL_FEE_AGE = 75;
       final double ADDITIONAL_FEE_SMOKING = 100;
       final double ADDITIONAL_FEE_PER_BMI = 20;
       final int AGE_THRESHOLD = 50;
       final int BMI_THRESHOLD = 35;
       double price = BASE_PRICE;
       if (age > AGE_THRESHOLD)
           price += ADDITIONAL_FEE_AGE;
       if (smokingStatus.equalsIgnoreCase("smoker"))
           price += ADDITIONAL_FEE_SMOKING;
       if (getBMI() > BMI_THRESHOLD)
           price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
       return price;
   }

   @Override
   public String toString() {
       return "Policy Number: " + policyNumber +
              "\nProvider Name: " + providerName +
              "\nPolicyholder's First Name: " + FirstName +
              "\nPolicyholder's Last Name: " + LastName +
              "\nPolicyholder's Age: " + age +
              "\nPolicyholder's Smoking Status: " + smokingStatus +
              "\nPolicyholder's Height: " + height + " inches" +
              "\nPolicyholder's Weight: " + weight + " pounds" +
              String.format("\nPolicyholder's BMI: %.2f", getBMI()) +
              String.format("\nPolicy Price: $%.2f", getPrice()) + "\n";
   }
}
