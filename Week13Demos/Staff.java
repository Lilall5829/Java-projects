public class Staff implements Comparable<Staff> {
	 private String id;
     private String lastName;
     private String firstName;
     private String mi;
     private int age;
     private String address;
     private String city;
     private String state;
     private String telephone;
     private String email;

     public Staff(String id, String lastName, String firstName, String mi, int age, String address, String city, String state, String telephone, String email) {
         this.id = id;
         this.lastName = lastName;
         this.firstName = firstName;
         this.mi = mi;
         this.age = age;
         this.address = address;
         this.city = city;
         this.state = state;
         this.telephone = telephone;
         this.email = email;
     }

     @Override
     public int compareTo(Staff other) {
         return Integer.compare(this.age, other.age);
     }

     // Getters and setters for fields
     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getMi() {
         return mi;
     }

     public void setMi(String mi) {
         this.mi = mi;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getState() {
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }

     public String getTelephone() {
         return telephone;
     }

     public void setTelephone(String telephone) {
         this.telephone = telephone;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     @Override
     public String toString() {
         return "ID: " + id +
                 ", Name: " + firstName + " " + mi + " " + lastName + " " + 
                 ", Age: " + age +
                 ", Address: " + address +
                 ", City: " + city +
                 ", State: " + state +
                 ", Telephone: " + telephone +
                 ", Email: " + email;
     }
 }
