public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   public PolicyHolder() {
       firstName = "";
       lastName = "";
       age = 0;
       smokingStatus = "";
       height = 0;
       weight = 0;
   }

   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.smokingStatus = smokingStatus;
       this.height = height;
       this.weight = weight;
   }

   public PolicyHolder(PolicyHolder obj2) {
       this.firstName = obj2.getFirstName();
       this.lastName = obj2.getLastName();
       this.age = obj2.getAge();
       this.smokingStatus = obj2.getSmokingStatus();
       this.height = obj2.getHeight();
       this.weight = obj2.getWeight();
   }

   public String getFirstName() {
       return firstName;
   }

   public String getLastName() {
       return lastName;
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

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public void setSmokingStatus(String smokingStatus) {
       this.smokingStatus = smokingStatus;
   }

   public void setHeight(double height) {
       this.height = height;
   }

   public void setWeight(double weight) {
       this.weight = weight;
   }

   public double getBMI() {
       final double CONVFACTOR = 703;
       return (weight * CONVFACTOR) / (height * height);
   }


   public String toString() {
       return "Policyholder's First Name: " + firstName +
              "\nPolicyholder's Last Name: " + lastName +
              "\nPolicyholder's Age: " + age +
              "\nPolicyholder's Smoking Status: " + smokingStatus +
              "\nPolicyholder's Height: " + height + " inches" +
              "\nPolicyholder's Weight: " + weight + " pounds" +
              String.format("\nPolicyholder's BMI: %.2f", getBMI());
   }
}

