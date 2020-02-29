package pl.stqa.pft.automation_practice.model;

public class CustomerData {
    private String firstname;
    private String lastname;
    private String password;
    private String dayNumber;
    private String monthNumber;
    private String year;
    private String company;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postCode;
    private String phone;
    private String mobilePhone;

    public static Builder newEntity() {
        return new CustomerData().new Builder();
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public String getMonthNumber() {
        return monthNumber;
    }

    public String getYear() {
        return year;
    }

    public String getCompany() {
        return company;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }


    public class Builder {
        public Builder withFirstname(String firstname) {
            CustomerData.this.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            CustomerData.this.lastname = lastname;
            return this;
        }

        public Builder withPassword(String password){
            CustomerData.this.password = password;
            return this;
        }

        public Builder withDayNumber(String dayNumber)
        {
            CustomerData.this.dayNumber = dayNumber;
            return this;
        }

        public Builder withMonthNumber(String monthNumber){
            CustomerData.this.monthNumber = monthNumber;
            return this;
        }

        public Builder withYear(String year) {
            CustomerData.this.year = year;
            return this;
        }

        public Builder withCompany(String company) {
            CustomerData.this.company = company;
            return this;
        }

        public Builder withAddressLine1(String addressLine1) {
            CustomerData.this.addressLine1 = addressLine1;
            return this;
        }

        public Builder withAddressLine2(String addressLine2) {
            CustomerData.this.addressLine2 = addressLine2;
            return this;
        }

        public Builder withCity(String city){
            CustomerData.this.city =city;
            return this;
        }

        public Builder withState(String state){
            CustomerData.this.state=state;
            return this;
        }

        public Builder withPostCode(String postCode) {
            CustomerData.this.postCode = postCode;
            return this;
        }

        public Builder withPhone(String phone) {
            CustomerData.this.phone = phone;
            return this;
        }

        public Builder withMobilePhone(String mobilePhone) {
            CustomerData.this.mobilePhone = mobilePhone;
            return this;
        }

        public CustomerData build(){
            return CustomerData.this;
        }

    }
}
