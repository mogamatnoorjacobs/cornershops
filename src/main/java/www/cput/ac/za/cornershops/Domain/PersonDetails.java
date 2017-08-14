package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class PersonDetails implements Serializable{
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private ContactDetails contactDetails= new ContactDetails();
    private BusinessDetails businessDetails;

    private PersonDetails() {
    }


    public String getID() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public Address getAddress() {
        return address;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public PersonDetails(Builder builder)
    {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address=builder.address;
        this.contactDetails=builder.contactDetails;
        this.businessDetails=builder.businessDetails;
    }

    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private Address address;
        private ContactDetails contactDetails= new ContactDetails();
        private BusinessDetails businessDetails;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }

        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        }

        public Builder address(Address value)
        {
            this.address=value;
            return this;
        }

        public Builder contactDetails(ContactDetails value)
       {
            this.contactDetails = value;
            return this;
        }

        public Builder businessDetails(BusinessDetails value)
        {
            this.businessDetails = value;
            return this;
        }

        public PersonDetails build(){
            return new PersonDetails(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersonDetails personDetails = (PersonDetails) o;

            return id.equals(personDetails.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

    }

}
