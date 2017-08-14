package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class BusinessDetails implements Serializable
{
    private String businessId;
    private String businessName;
    private String businessDescription;
    private PersonDetails personDetails;
    private Products products;


    public BusinessDetails() {
    }


    public String getBusinessId() {
        return businessId;
    }


    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public Products getProducts() {
        return products;
    }

    private BusinessDetails(Builder builder)
    {
        this.businessId = builder.businessID;
        this.businessName = builder.businessName;
        this.businessDescription=builder.businessDescription;
        this.personDetails=builder.personDetails;

    }

    public static class Builder{
        private String businessID;
        private String businessName;
        private String businessDescription;
        private PersonDetails personDetails;
        private Products products;

        public Builder businessID(String value)
        {
            this.businessID = value;
            return this;
        }

        public Builder businessName(String value)
        {
            this.businessName = value;
            return this;
        }

        public Builder businessDescription(String value)
        {
            this.businessDescription=value;
            return this;
        }
        public Builder personDetails(PersonDetails value)
        {
            this.personDetails = value;
            return this;
        }

        public Builder products(Products value) {
            this.products=value;
            return this;
        }

        public BusinessDetails build(){
            return new BusinessDetails(this);
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BusinessDetails businessDetails = (BusinessDetails) o;

            return businessID.equals(businessDetails.businessId);
        }

        @Override
        public int hashCode() {
            return businessID.hashCode();
        }

    }
}
