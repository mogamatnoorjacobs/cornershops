package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class ContactDetails implements Serializable
{
    private String cellNumber;
    private String homeNumber;
    private String emailAddress;

    public ContactDetails() {
    }


    public String getCellNumber() {
        return cellNumber;
    }


    public String getHomeNumber() {
        return homeNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public ContactDetails(Builder builder)
    {
        cellNumber = builder.cellNumber;
        homeNumber = builder.homeNumber;
        emailAddress= builder.emailAddress;
    }

    public static class Builder{
        private String cellNumber;
        private String homeNumber;
        private String emailAddress;


        public Builder cellNumber(String value)
        {
            this.cellNumber = value;
            return this;
        }

        public Builder homeNumber(String value)
        {
            this.homeNumber = value;
            return this;
        }

        public Builder emailAddress(String value)
        {
            this.emailAddress= value;
            return this;
        }


        public ContactDetails build(){
            return new ContactDetails(this);
        }

    }
}
